package Data.model;

import java.time.LocalDate;

public class Ovulation {
    private LocalDate ovulationDate;

    public Ovulation() {
        ovulationDate = null;
    }

    public LocalDate getOvulationDate(LocalDate lastPeriodDate) {
       ovulationDate = lastPeriodDate.plusDays(14);
        return ovulationDate;
    }
}
