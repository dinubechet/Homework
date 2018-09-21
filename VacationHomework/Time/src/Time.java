public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {

        setTime(hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" +
                hour +
                ":" + minute +
                ":" + second +
                '}';
    }

    public void setTime(int hour, int minute, int second) {
        int minutesToAdd = 0;
        int hoursToAdd = 0;

        if (second > 59) {
            minutesToAdd = second / 60;
            this.second = second % 60;
        } else if (second < 0) {
            throw new IllegalArgumentException("Invalid second parameter");
        } else {
            this.second = second;
        }
        if (minute + minutesToAdd > 59) {
            hoursToAdd = (minute + minutesToAdd) / 60;
            this.minute = (minute + minutesToAdd) % 60;
        } else if (minute < 0) {
            throw new IllegalArgumentException("Invalid minute parameter");
        } else {
            this.minute = (minute + minutesToAdd);
        }
        if (hour + hoursToAdd > 23) {
            this.hour = (hour + hoursToAdd) % 24;
        } else if (hour < 0) {
            throw new IllegalArgumentException("Invalid hour parameter");
        } else {
            this.hour = (hour + hoursToAdd);
        }
    }

    public Time nextSecond() {
        int totalSeconds = getCurrentTotalSeconds();
        if (totalSeconds == computeTotalSeconds(new Time(23, 59, 59))) {
            this.setTime(0, 0, 0);
            return this;
        }
        totalSeconds++;
        return getTimeFromTotalSeconds(totalSeconds);
    }


    public Time previousSecond() {
        int totalSeconds = getCurrentTotalSeconds();
        if (totalSeconds == 0) {
            this.setTime(23, 59, 59);
            return this;
        }
        totalSeconds--;
        return getTimeFromTotalSeconds(totalSeconds);
    }

    public int getCurrentTotalSeconds() {
        return computeTotalSeconds(this);
    }

    public int computeTotalSeconds(Time t) {
        return t.getSecond() + t.getMinute() * 60 + t.getHour() * 3600;
    }

    private Time getTimeFromTotalSeconds(int totalSeconds) {
        this.setHour(totalSeconds / 3600);
        this.setMinute((totalSeconds % 3600) / 60);
        this.setSecond(totalSeconds % 60);

        return this;
    }

}
