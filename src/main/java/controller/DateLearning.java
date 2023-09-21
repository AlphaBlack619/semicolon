package controller;

import java.time.LocalDate;
import java.util.Calendar;

public class DateLearning {

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));

        // add days to current date using Calendar.add method
        now.add(Calendar.DATE, 1);

        System.out.println("date after one day : " + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));
        LocalDate date = LocalDate.parse("2019" +
                "-07-15");

//add 5 days
        LocalDate date2 = date.plusDays(5);
        System.out.println("Date "+date+" plus 5 days is "+date2);


    }
}
