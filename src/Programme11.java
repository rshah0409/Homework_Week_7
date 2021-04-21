import java.util.Scanner;

public class Programme11 {

    //Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
    public static void main(String[] args) {
        Programme11 obj = new Programme11();   //constructor created
        obj.divisible();
    }
    public  void divisible(){

        System.out.println("Numbers from 1 to 100 which can be ");
        System.out.println("\nDivided by 3: ");
        for (int i=1; i<100; i++) {              //for loop
            if (i%3==0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<100; i++) {                    //for loop
            if (i%5==0) System.out.print(i +", ");
        }
        System.out.println("\n");                    //print statement
    }

    }











