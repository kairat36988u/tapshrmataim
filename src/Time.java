public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        StringBuffer time = new StringBuffer();
        if (hour < 10) time.append('0');
        time.append(hour);
        time.append(':');
        if (minute < 10) time.append('0');
        time.append(minute);
        time.append(':');
        if (second < 10) time.append('0');
        time.append(second);
        return time.toString();
    }

    public String nextSecond() {
        if (second == 59) {
            if (minute == 59) {
                if (hour == 23) {
                    hour = 0;
                    minute = 0;
                    second = 0;
                } else {
                    ++hour;
                    minute = 0;
                    second = 0;
                }
            } else {
                ++minute;
                second = 0;
            }
        } else
            ++second;
        return toString();
    }

    public String previousSecond() {
        if (second == 0) {
            if (minute == 0) {
                if (hour == 0) {
                    hour = 23;
                    minute = 59;
                    second = 59;
                } else {
                    --hour;
                    minute = 0;
                    second = 0;
                }
            } else {
                --minute;
                second = 0;
            }
        } else
            --second;
        return toString();

    }
}