package services;

import Data.model.Menstruation;
import Data.model.Ovulation;
import Data.model.SafePeriod;
import controller.GUIController;;
import java.time.LocalDate;
import java.util.Date;

public class MenstrualCycle {
    public final GUIController gui = new GUIController();
    public String userName;
    public int age;
    private final Menstruation menstruation = new Menstruation();
    private final Ovulation ovulation = new Ovulation();
    private final SafePeriod safePeriod = new SafePeriod();



    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        try {
            this.userName = userName;
            gui.info(userName.toUpperCase()+" SUCCESSFULLY UPDATED As NEW USERNAME ", "UPDATE REPORT");
        }
        catch (Exception e){
            gui.error("ERROR DETECTED!! USERNAME UPDATION FAILED", "SYSTEM ERROR");}
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {if (age > 0){
            this.age = age;
            gui.info("NEW AGE SUCCESSFULLY UPDATED", "UPDATE REPORT");}
            else gui.error("Age Cant Be Negative","INPUT ERROR");
        }
        catch (Exception e){
            gui.error("ERROR DETECTED!! AGE UPDATION FAILED", "SYSTEM ERROR");}
    }

    public LocalDate getMentstrualFlowStartDate(String stringDate) {
        LocalDate localDate = null;
        try {
        if (dateVerification(stringDate) && this.age >= 12 && age <= 21){
            localDate = LocalDate.parse(stringDate).plusDays(3);
            return menstruation.getMenstruationStartDate(localDate);}
        if (dateVerification(stringDate) && this.age >= 22 && age <= 45) {
            localDate = LocalDate.parse(stringDate);
            return menstruation.getMenstruationStartDate(localDate);}}
        catch (Exception e){ gui.error("Please Verify Input Again","ERROR");}
        return localDate;
    }
    private boolean dateVerification(String stringDate){
        boolean verification = false;
        try {
        LocalDate localDate = LocalDate.parse(stringDate);
        LocalDate localDate1 = localDate.plusDays(1);
        verification = true;
        }
        catch (Exception e){
            gui.error("ERROR IN DATE PATTERN\nPLEASE INPUT DATE THIS WAY \"YYYY-MM-DD\"","SYSTEM ERROR");}
        return verification;}

    public LocalDate getMentstrualFlowEndDate(String previousBleedingStartDate,int numberOfBleedingDays) {
        LocalDate localDate = null;
        if (dateVerification(previousBleedingStartDate) && this.age >= 12 && age <= 21){
            localDate = LocalDate.parse(previousBleedingStartDate).plusDays(3);
            return menstruation.getMenstruationEndDate(localDate,numberOfBleedingDays);}
        if (dateVerification(previousBleedingStartDate) && this.age >= 22 && age <= 45) {
            localDate = LocalDate.parse(previousBleedingStartDate);
            return menstruation.getMenstruationEndDate(localDate,numberOfBleedingDays);}
        return localDate;
    }

    public LocalDate getOvulationDate(String lastPeriodDate) {
        if (dateVerification(lastPeriodDate)){
            LocalDate localDate = LocalDate.parse(lastPeriodDate);
            return ovulation.getOvulationDate(localDate);}
        return null;}

    public LocalDate getSafePeriodStartDate(String date) {
        LocalDate localDate = null;
        if (dateVerification(date) && this.age >= 12 && age <= 21){
            localDate = LocalDate.parse(date).plusDays(4);
            return safePeriod.getSafePeriodStartDate(localDate);}
        if (dateVerification(date) && age >= 22 && age <= 45){
            return safePeriod.getSafePeriodStartDate(LocalDate.parse(date));
        }
        return localDate;
    }

    public LocalDate getSafePeriodEndDate(String date) {
        LocalDate localDate = null;
        if (dateVerification(date) && this.age >= 12 && age <= 21){
            localDate = LocalDate.parse(date).plusDays(4);
            return safePeriod.getSafePeriodEndDate(localDate);}
        if (dateVerification(date) && age >= 22 && age <= 45){
            return safePeriod.getSafePeriodEndDate(LocalDate.parse(date));
        }
        return localDate;
    }
    public String follicularPhase(){
        return """
                You Are Currently In Your Follicular Phase

                This phase of the menstrual cycle occurs from approximately day 1-14.
                Day 1 is the first day of bright red bleeding, and the end of this phase is marked by ovulation.
                While menstrual bleeding does happen in the early part of this phase,
                the ovaries are simultaneously preparing to ovulate again.
                The pituitary gland (located at the base of the brain)
                releases a hormone called FSH – follicle stimulating hormone.
                This hormone causes several ‘follicles’ to rise on the surface of the ovary.\s
                These fluid filled “bumps” each contain an egg. Eventually
                one of these follicle becomes dominant and within it develops a single mature egg;\s
                the other follicles shrink back. If more than one follicle reaches maturity,
                this can lead to twins or more.
                The maturing follicle produces the hormone estrogen,\s
                which increases over the follicular phase and peaks in the day or two prior to ovulation.
                The lining of the uterus (endometrium) becomes thicker and more enriched with blood\s
                in the second part of this phase (after menstruation is over), in response to increasing levels of estrogen.
                High levels of estrogen stimulate the production
                of gonadotropin-releasing hormone (GnRH), which in turn stimulates
                the pituitary gland to secrete luteinizing hormone (LH).
                On about day 12, surges in LH and FSH cause the egg to be released from the follicle.
                The surge in LH also causes a brief surge in testosterone,
                which increases sex drive, right at the most fertile time of the cycle.""";}
    public String ovulatoryPhase(){
        return """
                You Are On OvulatoryPhase
                The release of the mature egg happens on about day 14\s
                as a result of a surge in LH and FSH over the previous day. After release,
                the egg enters the fallopian tube where fertilization may take place
                if sperm are present. If the egg is not fertilized,
                it disintegrates after about 24 hours. Once the egg is released
                the follicle seals over and this is called the corpus luteum.""";}
    public String lutealPhase(){
        return """
                You Are On LutealPhase
                After the release of the egg, levels of FSH and LH decrease.
                The corpus luteum produces progesterone.
                If fertilization has occurred, the corpus luteum continues to produce
                progesterone which prevents the endometrial lining from being shed.
                If fertilization has not occurred, the corpus luteum\s
                disintegrates, which causes progesterone levels to drop and signals the\s
                endometrial lining to begin shedding.""";}
    public int date(String stringDate){
        LocalDate date = LocalDate.parse(stringDate);
        LocalDate dateNow = LocalDate.now();
        int counter = 0;
        boolean checker = true;
        LocalDate date1 = date;
        while (checker){
            counter+=1;
            if (date1.toString().equals(dateNow.toString())){
                checker = false;}
            if (counter == 30){ counter = 0;}
            date1 = date1.plusDays(1);
        }
        return counter;}
    public void menstrualCycleStatus(String lastPeriodDate){
        int command = 0;
        if (dateVerification(lastPeriodDate)){
            command = date(lastPeriodDate);
        if (command >= 0 && command < 14) gui.info(follicularPhase(),"FollicularPhase");
        if (command == 14 || command == 15) gui.info(ovulatoryPhase(),"OvulatoryPhase");
        if (command >=16) gui.info(lutealPhase(),"LutealPhase");}
    }
}
