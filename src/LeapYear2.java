import java.util.Scanner;
//Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?

public class LeapYear2 {
    public static void main(String[] args) {
        LeapYear2 lp = new LeapYear2();
        lp.ly();


    }

    public void ly(){
      Scanner scn = new Scanner(System.in );
      int year;
      System.out.println("Enter any Year:");
      year = scn.nextInt();
      scn.close();
      boolean isLeap ;
     //if else syntax used
      if(year % 4 == 0)
      {
          if( year % 100 == 0)
          {
              if ( year % 400 == 0)
                  isLeap = true;
              else
                  isLeap = false;
          }
          else
              isLeap = true;
      }
      else {
          isLeap = false;
      }

      if(isLeap==true)
          System.out.println(year + " is a Leap Year.");
      else
          System.out.println(year + " is not a Leap Year.");



  }


}
