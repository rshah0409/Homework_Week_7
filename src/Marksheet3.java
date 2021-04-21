/*Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks
(marks is between 0 to 100 and if it is out of range print error message “Invalid  Input, Marks should between 0 to 100”)
and find out total, percentage and result.
        If he is pass or fail on basis of percentage (pass>=35)
       and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
        _______________________________
        | |
        | Mark Sheet |
        |_______________________________|
        | Name : Jay |
        | Roll No: 08 |
        |_______________________________|
        | Subjects : Marks |
        |_______________________________|
        | Math : 98 |
        | Science : 90 |
        | English : 85 |
        |_______________________________|
        | Total : 273 |
        |_______________________________|
        | Percentage : 91.0 |
        | Result : Pass |
        | Grade : A+ |
        |_______________________________|

*/

import java.util.Scanner;

public class Marksheet3 {
    public static void main(String[] args) {
        Marksheet3 obj = new Marksheet3();
        obj.studentResult();
    }



    public void studentResult() {
        Scanner scan = new Scanner(System.in);       //scanner called
        System.out.println("Enter Student Name : ");
        String name = scan.next();
        System.out.println("Enter Student Roll Number Here : ");
            int rollNmuber = scan.nextInt();
        System.out.println("Enter Marks for Maths here : ");
            int maths = scan.nextInt();
        System.out.println("Enter Marks for Science here: ");
        int science = scan.nextInt();
        System.out.println("Enter Marks for English here:  ");
        int english = scan.nextInt();
        int total = maths + science +english;
        double percentage =( total * 100) /300;
        String result = null;
        String grade = null;

        //if else statement

         if ( percentage >= 80){
            result = "PASS";
            grade = "A+";
         }else if(percentage>=60 ){
            result="PASS";
            grade= "A";
        }else if(percentage>=50){
            result="PASS";
            grade = "B";
           }else if(percentage>=35) {
             result = "PASS";
             grade = "C";
            } else if(maths< 0 || maths < 100){
                 System.out.println("INVALID INPUT");
             }else if(science <0 || science<100) {
                 System.out.println("INVALID INPUT");
             }else if(english<0 || english<100){
                 System.out.println("INVALID INPUT");
             } else{
            result="FAIL";
             }

        System.out.println("---------------------------");
        System.out.println("|                          |");
        System.out.println("|       MARKSHEET          |");
        System.out.println("|                          |");
        System.out.println("|--------------------------|");
        System.out.println("|   Name :" +name+ "       |");
        System.out.println("|   Roll No:"+rollNmuber+" |");
        System.out.println("|                          |");
        System.out.println("|Subject: Marks:           |");
        System.out.println("|Maths:"+maths+"           |");
        System.out.println("|Science:"+science+"       |");
        System.out.println("|English:"+english+"       |");
        System.out.println("|                          |");
        System.out.println("|Total:"+total+"           |");
        System.out.println("---------------------------|");
        System.out.println("|Percentage:"+percentage+" |");
        System.out.println("|Result:"+result+"         |");
        System.out.println("|Grade:"+grade+"           |");
        System.out.println("--------------------------");
    }



}











