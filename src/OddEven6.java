import java.util.Scanner;
//Write a java program to input any number and find out if it’s odd or even
public class OddEven6 {
    public static void main(String[] args) {
        OddEven6 obj = new OddEven6();  //object created
        obj.oddeven();                    //constructor
    }

    public void oddeven() {
        Scanner scan = new Scanner( System.in );
        int num;
        System.out.println( "Enter a number:" );
        num = scan.nextInt();

       //if else statement used for defining even or odd number

        if (num % 2 == 0) {
            System.out.println( "This number is Even" );

        } else {
            System.out.println( "This number is Odd" );
        }


    }
}










