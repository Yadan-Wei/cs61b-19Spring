/** Class that determines whether or not a year is a leap year.
 *  @author YOUR NAME HERE
 */
public class LeapYear {

    /** Calls isLeapYear to print correct statement.
     *  @param  year to be analyzed
     */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java Year 2000");
        }
        for (int i = 0; i < args.length; i++) {
            try {
                int year = Integer.parseInt(args[i]);
                checkLeapYear(year);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", args[i]);
            }
        }
    }
    /** determin if a year is leap year. A leap year is either:
        1)divisible by 400 or
        2)divisible by 4 and not by 100.
    For example, 2000 and 2004 are leap years. 1900, 2003, and 2100 are not leap years.*/
    public static boolean isLeapYear(int year) {
        if (year % 400 = 0) {
            return True;
        }
        else if (year % 4 = 0 and year % 100 != 0){
            return True;
        }
        else {
            return False;
        }
    }
}

