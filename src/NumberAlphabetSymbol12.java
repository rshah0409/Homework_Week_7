import java.util.Scanner;
public class NumberAlphabetSymbol12 {

    //Write a program that tells us input value is number or an alphabet or symbol.
    void symbol(){
        Scanner scan = new Scanner(System.in); //scanner called from util package

        System.out.println("Enter any character:");
        char ch = scan.next().charAt(0);
        //if else statement
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch<= 'Z'))
        {
            System.out.println("This is an Alphabet" );
        }
        else if (ch >= '0' && ch <= '9')
        {
            System.out.println("This is a Number" );
        }
        else{
            System.out.println("This is a symbol" );
        }


    }

    public static void main(String[] args) {
        NumberAlphabetSymbol12 obj = new NumberAlphabetSymbol12();//constructor created
        obj.symbol();
    }









}
