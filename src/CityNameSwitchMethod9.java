import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class CityNameSwitchMethod9 {
    //Input any alphabet from “A" to “F” and print their city name accordingly (use SWITCH METHOD)) if  any other alphabet should be invalid entry


    public static void main(String[] args) {
        CityNameSwitchMethod9 obj = new CityNameSwitchMethod9();//cns method called in main method with object
        obj.cns();                                             //constructor
    }
  //cns method created
    void cns(){
        Scanner scan = new Scanner( System.in );   //scanner called from util package
        int alphabet;
        System.out.println("Enter case number :");
        alphabet = scan.nextInt();

     //switch statement
        switch (alphabet){

            case 1 :
                System.out.println("Alahabad");
                 break;
            case 2:
                System.out.println("Baroda");
                 break;
            case 3:
                System.out.println("Champaner");
                break;
            case 4 :
                System.out.println("Darjiling");
                break;
            case 5  :
                System.out.println("Eloha");
                break;
            case 6 :
                System.out.println("Faziabad");
                break;
            default:
                 System.out.println("Invalid input");



        }



    }






}
