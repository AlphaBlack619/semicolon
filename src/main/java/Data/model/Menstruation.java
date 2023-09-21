package Data.model;

import controller.GUIController;

import java.time.LocalDate;

public class Menstruation {
    private LocalDate startDate;
    public final GUIController gui = new GUIController();
    private LocalDate endDate;

    public Menstruation() {
        startDate = null;
        endDate = null;
    }

    public LocalDate getMenstruationStartDate(LocalDate previousBleedingStartDate) {
        this.startDate = previousBleedingStartDate.plusDays(28);
        return this.startDate;
    }
    public LocalDate getMenstruationEndDate(LocalDate localDate,int bleedingDays){
        try {
            this.endDate = localDate.plusDays(28 + bleedingDays);
            return this.endDate;
        }
        catch (Exception e){ gui.error("Please Verify Input Again","ERROR");
        }
        return null;}
}
