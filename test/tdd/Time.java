package tdd;

public class Time {
    private int seconds;
    private double minutes;
    private double hours;
    private double days;
    private double weeks;
    private long years;

    public void inputSecondConverter(double inputSeconds) {
        if (inputSeconds > 0) {
            minutes = inputSeconds / 60;
        } else {
            minutes = 0;
        }
    }

    public double getMinutes() {
        return minutes;
    }

    public void inputMinutes(double inputMinutes) {
        if (inputMinutes > 0) {
            hours = inputMinutes / 60;
        } else {
            hours = 0;
        }
    }

    public double getHours() {
        return hours;
    }

    public void inputHours(double inputHours) {
        days =  inputHours / 24;
    }

    public double getDays() {
        return days;
    }

    public void inputDays(double inputDays) {
        weeks = inputDays / 7;
    }

    public double getWeeks() {
        return weeks;
    }

    public void inputConvertMinutesToSeconds(int inputMinutes) {
        if (inputMinutes > 0) {
        seconds = inputMinutes * 60;
    } else {
            seconds = 0;
        }
        }

    public double getSeconds() {
        return seconds;
    }

    public double getYears() {
        return years;
    }

    public void canConvertMinutesToYears(double inputMinutes) {
        if (inputMinutes > 0){
            double years1  = 60 * 24 * 365;
        years = (long)(inputMinutes / years1);
    }
    }
}