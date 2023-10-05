package J05033;

public class Time {
    private int hour, min, sec;
    public Time(int hour, int min, int sec)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    public int getHour()
    {
        return hour;
    }
    public int getMin()
    {
        return min;
    }
    public int getSec()
    {
        return sec;
    }
    public String toString()
    {
        return String.valueOf(hour) + " " + String.valueOf(min) + " " + String.valueOf(sec);
    }
}
