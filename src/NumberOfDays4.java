
/*Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,  otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400. Example of input/Output:
● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999) ● isLeapYear(1600);
 should return true since 1600 is a leap year
● isLeapYear(2017);  should return false since 2017 is not a leap year
● isLeapYear(2000); should return true because 2000 is a leap year
Write another method getDaysInMonth with two parameter month and year. Both of type int.
If parameter month is < 1 or >12 return -1.
If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month. Be careful about leap years  they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above.
Example of input/Output:
● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap   year.
● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and   2018 is not a leap year.
● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to   9999
HINT: Use the switch statement.
NOTE: Methods isLeapYear and getDaysInMonth need to be public static */


import java.util.Scanner;

public class NumberOfDays4 {
    public static void main(String[] args) {
        isLeapYear( 2020 );
        getDaysInMonth(2,2020  ) ; //both static methods called in main method direct

    }

   //isleapyear method with parameters

    static boolean isLeapYear(int year) {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter year here:" );
       year = scan.nextInt();

        boolean resultLy ;
        //getdaysinmoth method with parameters
        if ((year < 1 && year > 9999)&&(year % 4 == 0 && year % 100 != 0)||year % 400 != 0) {
            resultLy = true;
            System.out.println( "This is a Leap year" );

        } else {
            resultLy = false;
            System.out.println( "This is not aLeap year");
        } return resultLy;
    }
    static int getDaysInMonth(int month, int year) {
        boolean a;
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter number of Month" );
        month = scan.nextInt();
        // year = scan.nextInt();
        int days =0;

        //if else method
        if ((month < 1 || month > 12 || year < 1 || year > 9999)) {
            days = -1;
           System.out.println( "-1" );
        } else {
            switch (month) {   //switch statement
                case 1:
                    days = 31;
                    System.out.println( "January-31 days" );
                    break;
                case 2:
                    //isLeapYear( year );
                    if (isLeapYear( year )) {
                        days = 29;
                        System.out.println( "February-29 days as it is a leapyear" );   //february month if leap year
                        break;
                    } else {
                        days = 28;
                       System.out.println( "February-28 days as it is not a leap year" ); //february month if not a leap year
                        break;
                    }
                case 3:
                    days = 31;
                    System.out.println( "March -31 days" );
                    break;
                case 4:
                    System.out.println( "April-30 days" );
                    break;
                case 5:
                    System.out.println( "May -31 days" );
                    break;
                case 6:
                    System.out.println( "June - 30 days" );
                    break;
                case 7:
                    System.out.println( "July-0 31 days" );
                    break;
                case 8:
                    System.out.println( "August-31 days" );
                    break;
                case 9:
                    System.out.println( "September-30 days" );
                    break;
                case 10:
                    System.out.println( "October-31 days" );
                    break;
                case 11:
                    System.out.println( "November-30 days" );
                    break;
                case 12:
                    System.out.println( "December-31 days" );
                    break;
                default:
                    System.out.println( "-1" );


            }
        }

        return days;
    }
}