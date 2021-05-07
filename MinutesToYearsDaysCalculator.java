
public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        //Calling the method to get the result
        printYearsAndDays(-525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }


    public static final String INVALID_VALUE = "Invalid Value";

    //Creating a method
    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
        } else {
            long hours = minutes / 60;          //calculating the hours
            long days = hours / 24;             //calculating the days
            long years = days / 365;            //calculating the years
            days = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}

