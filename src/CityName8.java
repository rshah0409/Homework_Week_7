import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if  any other alphabet should be invalid entry

public class CityName8 {
    public static void main(String[] args) {
        CityName8 name = new CityName8();  //constructor created
        name.citynm();
    }


    public void citynm() {
        Scanner scan = new Scanner( System.in );  //scanner called from util package
        String alphabet;
        System.out.println( "Enter an alphabet" );
        alphabet = scan.next();
        scan.close();
     //if else statement

        if (alphabet.startsWith("A")){

            System.out.println( "Ahmedabad" );
        }
        else if (alphabet.startsWith("B")){
            System.out.println( "Bombay" );

        }
        else if (alphabet.startsWith( "C" )){
            System.out.println("Chandighar");
        }
        else if(alphabet.startsWith( "D" )){
            System.out.println("Delhi");
        }
        else if (alphabet.startsWith( "E" )){
            System.out.println("Edalabad");
        }
        else if(alphabet.startsWith( "F" )){
            System.out.println("Faridabad");
        }
        else {
            System.out.println( "Invalid entry" );

        }


    }
}