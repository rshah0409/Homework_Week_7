import java.util.Scanner;

public class PositiveNegativeZero16 {
// Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
public static void main(String[] args) {
    PositiveNegativeZero16 obj =new PositiveNegativeZero16();
    obj.getPositiveNegative();
}
    void getPositiveNegative(){
        Scanner scan = new Scanner( System.in );//scanner called from util class
        int number;
        System.out.println("Enter a number :");
        number = scan.nextInt();
        //if statement
        if(number >0){
            System.out.println("This number is POSITIVE number");//if else statement
        } else if(number<0 ){
            System.out.println("This is a NEGATIVE nember");
        }else{
            System.out.println("This number is ZERO");
        }
    }
}
