package tdd;

public class MyClock {
    private int second;
    private int minute;
    private int hour;

    public int getSeconds(){
        return second;
    }
    public int getMinutes(){
        return minute;
    }
    public int hour(){
        return hour;
    }
    public void setTime(int seconds) {
        if (seconds > 0 && seconds <= 86400){
        this.hour = seconds / 3600;
        this.minute = (seconds % 3600) / 60;
        this.second = seconds % 60;
    }
    }
    public String getTime(){
        String time;
        time = String.format("Sec: %02d Min: %02d Hours: %02d", second, minute, hour);
        return time;
    }

    public void setMinute(int minutes) {
        if (minutes > 0 && minutes <=1440){
        this.hour = minutes / 60;
        this.second = 0;
        this.minute = minutes % 60;
    }
    }
    public void setHour(int hours){
        if (hours > 0 && hours <= 24){
        this.hour = hours;
        this.minute = (hours * 60) / 24;
        this.second = (hours * 3600) % 3600;
    }
        else {
            hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }
}
