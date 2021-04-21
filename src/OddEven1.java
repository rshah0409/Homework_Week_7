import java.util.Scanner;
//Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)
public class OddEven1 {

//main method
    public static void main(String[] args) {


        OddEven1 obj = new OddEven1();//method calling in main method
        obj.call();

    }
    //call method
    void call(){
        Scanner sc = new Scanner( System.in );  //scanner called

        System.out.println( "Enter number to check" );
        int num = sc.nextInt();
        String result = num % 2 == 0 ? "Even" : "Odd";//trenary operator
        System.out.println( num + " is " + result );
        sc.close();
    }


}






