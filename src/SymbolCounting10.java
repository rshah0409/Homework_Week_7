import java.util.Scanner;
/*Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
 find addition, Subtraction, multiplication and division according to their symbol  (using if else) */
public class SymbolCounting10 {
    public static void main(String[] args) {
        SymbolCounting10 obj = new SymbolCounting10();  //constructtor created.
        obj.number();

    }
    void number(){

        Scanner scan = new Scanner( System.in );   //scanner called from util package
         double num1,num2,simbol,result;
        System.out.println("Enter first number");
          num1 = scan.nextDouble();
          System.out.println("Enter Second number");
          num2 = scan.nextDouble();
          System.out.println("Enter Symbol");
         simbol = scan.next().charAt(0);

          // if else statement created
          if ((simbol == '+') ) {
              result = num1 + num2;
              System.out.println("Addition of two numbers is " +result);

          }else if(simbol == '-'){
              result = num1 - num2;
              System.out.println("Subtraction of two numbers is "+result);
          }else if(simbol == '/'){
              result = num1/num2;
              System.out.println("Division of two numbers is " +result);
          }else if(simbol =='*'){
              result = num1 *num2;
              System.out.println("Multiplication of two numbers is " +result);
          } else {
              System.out.println("Invalid Input");
          }

    }


}
