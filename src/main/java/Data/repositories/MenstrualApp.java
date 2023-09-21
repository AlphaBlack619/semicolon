package Data.repositories;

import services.MenstrualCycle;

public class MenstrualApp extends MenstrualCycle {

    int x = 0;

    public void accountCreation() {
            try {
                this.userName = gui.input("Enter UserName");
                int age = Integer.parseInt(gui.input("Enter Age"));
                if (age > 0){
                    this.age = age;}
                else gui.error("Age Cant Be Negative","INPUT ERROR");
                gui.info("USER CREATION SUCCESSFUL\n USERNAME IS " + getUserName().toUpperCase(),"ACCOUNT STATUS");
            }
            catch (NumberFormatException e){
                gui.error("ERROR DETECTED ACCOUNT CREATION FAILED", "SYSTEM ERROR");}}
    public void welcome(){
        String [] command = {"Create Account","Logging", "Close Application"};
        int command1 = gui.options("WELCOME",command,"MENSTRUAL-CYCLE ANALYSIS APPLICATION");
        if (command1 == 0){accountCreation(); welcome();}
        if (command1 == 1){
            String userName = gui.input("Enter UserName");
            if (userName.equalsIgnoreCase(getUserName())){logging();}
            else{ gui.error(userName + " Account Not Found!!","ERROR 406");welcome();}}
        if (command1 == 2) {
           int x =  gui.question1("Confirm Application Exit?","System Prompt");
            if (x == 0){System.exit(619);}
           else {
                welcome();}}
    }

    private void logging() {
        String [] command = {"Track Your FlowPeriod","Track Your SafePeriod","Check Current Menstrual_Cycle Status", "Check Ovulation Date","Account Setting","Back"};
            int command1 = gui.options("Logging Successful",command,getUserName().toUpperCase()  + " MCA2 ACCOUNT");
            if (command1 == 0){
                knowYourFlowPeriod();
                logging();
            }if (command1 == 1){
                knowYourSafePeriod();
                logging();}
            if (command1 == 2){
                checkCurrentMenstrualStatus();
                logging();
            }
            if (command1 == 3){
                checkNextOvulationDate();
                logging();
            }if (command1 == 5){
                welcome();}
            if (command1 == 4){
                accountSetting();
                welcome();
            }


    }

    private void checkCurrentMenstrualStatus() {
        try {
            errorHandler();
            String date1 = gui.input("Enter Your Last Start Flow Date In This Format(YYYY-MM-DD)\n");
            menstrualCycleStatus(date1);
        } catch (Exception e){gui.error("Please Verify Input Again","ERROR"); x+=1; checkCurrentMenstrualStatus();}}

    private void errorHandler(){
        if (x == 1) {gui.warning("TWO WARNING REMAINING","ERROR WARNING");}
        if (x == 2) gui.warning("ONE WARNING REMAINING","ERROR WARNING");
        if (x == 3){gui.warning("Last WARNING REMAINING","ERROR WARNING");}
        if (x > 3){gui.warning("APPLICATION FORCE CLOSE","ERROR WARNING"); x = 0;
            System.exit(404);}
    }
    private void knowYourFlowPeriod(){
        try {errorHandler();
        String date1 = gui.input("Enter Your Last Start Flow Date In This Format(YYYY-MM-DD)\n");
        int bleedingDays = Integer.parseInt(gui.input("How Many Days Does Bleeding Last?(ENTER IN NUMBER->Eg(3)"));
        gui.info("Menstruation is the technical term for getting your period. About once a month," +
                "\nfemales who have gone through puberty will experience menstrual bleeding.\n" +
                "This happens because the lining of the uterus has prepared itself for a possible pregnancy " +
                "\nby becoming thicker and richer in blood vessels. " +
                "If pregnancy does not occur, this thickened\nlining is shed, accompanied by bleeding." +
                "\nBleeding usually lasts for 3-8 days\nYour Next Flow Start Date Is " + getMentstrualFlowStartDate(date1).toString() +
                "\nAnd End On " + getMentstrualFlowEndDate(date1,bleedingDays).toString()+
                "\nThere is a range of normal bleeding – " +
                "some women have short, light periods and others have longer, heavy periods. Your period may also change over time.","Flow Period");}
         catch (Exception e){gui.error("Please Verify Input Again","ERROR"); x+=1; knowYourFlowPeriod();}}

    private void knowYourSafePeriod(){
        try {errorHandler();
            String date1 = gui.input("Enter Your Last Start Flow Date In This Format(YYYY-MM-DD)\n");
            gui.info("Your Safe Period Being On " + getSafePeriodStartDate(date1) + " And End's On " + getSafePeriodEndDate(date1) +
                    "\nTracking your fertile window is a way to determine your “optimal” " +
                    "\ntime to get pregnant. It can also help prevent pregnancy " +
                    "\nif you aren’t trying to conceive. As a method of reliable birth control, " +
                    "\nit can take several months of recording your monthly cycle to figure out your fertile window","Track Your Fertile Window\n" +
                    "Unprotected IS Not Advisable!!");}
        catch (Exception e){gui.error("Please Verify Input Again","ERROR"); x+=1; knowYourSafePeriod();}
    }
    private void checkNextOvulationDate(){
        try {
            errorHandler();
            String date1 = gui.input("Enter Your Last Start Flow Date In This Format(YYYY-MM-DD)\n");
            gui.info("If you have very consistent cycles, knowing your fertile window" +
                    "\ncan help prevent pregnancy. But keep in mind that your cycle days can still change each month." +
                    "\nFactors like stress, diet, or heavy exercise can affect the number of days in your cycle." +
                    "\nThe day of ovulation can also change every month.\n" + getOvulationDate(date1) + " IS Your Ovulation Date","Ovulation Data");
        }catch (Exception e){gui.error("Please Verify Input Again","ERROR"); x+=1; checkNextOvulationDate();}
    }
    private void accountSetting(){
        String [] commands = {"View Name","View Age","Update Age", "Update UserName", "Back"};
        int prompt= gui.options("Logged In As " + getUserName().toUpperCase(),commands,"ACCOUNT SETTING");
        if (prompt == 0){gui.display(getUserName().toUpperCase()); accountSetting();}
        if (prompt == 1){gui.display("User Age is " + getAge()); accountSetting();}
        if (prompt == 2){setAge(Integer.parseInt(gui.input("Enter New Age")));accountSetting();}
        if (prompt == 3){setUserName(gui.input("Enter New UserName")); accountSetting();}
        if (prompt == 4){logging();}
    }

}

