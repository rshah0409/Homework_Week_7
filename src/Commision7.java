
/*Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
*/

import java.util.Scanner;


public class Commision7 {
    public static void main(String[] args) {
        Commision7 obj = new Commision7();
        obj.com1();
    }
        void com1(){
            Scanner scan = new Scanner( System.in );  //scanner called
            System.out.println("Sales ID : 28");
            System.out.println("Seller's Name : James Smith"); /*varibales defined using double*/
            System.out.println("Basic Salary : 30000");
            double comRate = 0;
            double salesAmt,comissionamt;
            System.out.println("Enter sales amount :" );
            salesAmt = scan.nextDouble();

           //if else statement

            if (salesAmt >=50000){
                comRate = 0.35;
                System.out.println( "Comission is 35%" );
            } else if (salesAmt >=30000){
                comRate = 0.20;
                System.out.println("Commision is 20%");
            }else if (salesAmt >= 20000){
                comRate = 0.10;
                System.out.println("Commision is 10%");
            }else if(salesAmt >=10000){
                comRate = 0.05;
                System.out.println("Commision is 5%");
            }else {
                comRate = 0.02;
                System.out.println("Commision is 2%");
            }

            comissionamt = comRate * salesAmt;  //method for commision amount
            System.out.println("Commision amount is "  +comissionamt);


        }






}
