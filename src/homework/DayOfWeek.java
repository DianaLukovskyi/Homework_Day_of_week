package homework;


public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static boolean isWeekend(DayOfWeek dayOfWeek) {
        return dayOfWeek == SATURDAY || dayOfWeek == SUNDAY;

    }
}







