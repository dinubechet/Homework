public class Day {
    private String dayOfWeek;
    private String workingHours;

    public Day(String dayOfWeek, String workingHours) {
        this.dayOfWeek = dayOfWeek;
        this.workingHours = workingHours;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getWorkingHours() {
        return workingHours;
    }
}
