public class constantfinalvariable {
    public static void main(String[] args) {


// final int myNum = 15;
// myNum = 20;  // Error: cannot assign a value to final variable 'myNum'

//By convention, final variables in Java are usually written in upper case (e.g. BIRTHYEAR). It is not required, but useful for code readability and common for many programmers.



        final int DAYS_IN_WEEK = 7;
        final String BIRTHDAY = "01/01/2000";

        System.out.println("Days in a week: " + DAYS_IN_WEEK);
        System.out.println("Birthday: " + BIRTHDAY);

        // DAYS_IN_WEEK = 8; // This will cause a compilation error
    }
}
