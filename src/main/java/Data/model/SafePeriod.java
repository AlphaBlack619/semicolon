package Data.model;

import java.time.LocalDate;

public class SafePeriod {
    private LocalDate safePeriodStartDate;
    private LocalDate safePeriodEndDate;

    public SafePeriod() {
        this.safePeriodStartDate = null;
        this.safePeriodEndDate = null;
    }

    public LocalDate getSafePeriodStartDate(LocalDate localDate) {

        safePeriodStartDate = localDate.plusDays(18);
        return safePeriodStartDate;
    }

    public LocalDate getSafePeriodEndDate(LocalDate parse) {
        safePeriodEndDate = parse.plusDays(24);
        return safePeriodEndDate;
    }
}
