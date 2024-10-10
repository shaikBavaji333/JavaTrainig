public class ExampleOnSwitchCase {
    public static void main(String[] args) {

        String day="Wednesday";
        switch (day) {
            case "Sunday": System.out.println("WeekendDay"); break;

            case "Monday": System.out.println("WeekDay");
            break;
            case "Tuesday": System.out.println("WeekDay");
            break;
            case "Wednesday": System.out.println("Wednesday");
            break;


            case "Saturday": day="Sunday";
            break;


        }
    }
}
