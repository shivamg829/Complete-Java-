enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);
        System.out.println("Ordinal of " + today + " is: " + today.ordinal());
        // Loop through all enum constants
        System.out.println("All days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        switch (today) {
            case SUNDAY:
                System.out.println("It's a weekend!");
                break;
            case MONDAY:
                System.out.println("Back to work!");
                break;
            case TUESDAY:
                System.out.println("Second day of the week.");
                break;
            case WEDNESDAY:
                System.out.println("Midweek day.");
                break;
            case THURSDAY:
                System.out.println("Almost there!");
                break;
            case FRIDAY:
                System.out.println("Last workday of the week!");
                break;
            case SATURDAY:
                System.out.println("It's a weekend!");
                break;
        }
    }
}
