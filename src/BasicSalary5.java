import java.util.Scanner;

public class BasicSalary5 {

    /* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|
*/
    public static void main(String[] args) {
        BasicSalary5 obj = new BasicSalary5();
        obj.salaryGross();
    }

    void salaryGross(){
        Scanner scan = new Scanner(System.in  );   //scanner from util class
        System.out.println("Enter Basic Salary Here : ");
        long basicSalary;
        basicSalary = scan.nextLong();
        double hra=0,ta=0,da = 0,pf=0,grossSalary;
        System.out.println("Enter Employee Name here :");
        String employeeName= scan.next();
        System.out.println("Enter Employee Id here: ");
        int employeeId = scan.nextInt();

        hra = (basicSalary* 10)/100;   // HRA 10  % of basic salary
        da = (basicSalary *  8) / 100;  //DA 8% of basic salary
        ta = (basicSalary * 9) /100;    //TA 9 % of basic salary
        pf = (basicSalary * 20)/100;     //PF 20 % of basic salary
        grossSalary = ((basicSalary + hra + da + ta )- (pf)); //gross salary
        System.out.println("-----------------------------------");
        System.out.println("|Salary Slip                       |");
        System.out.println("|----------------------------------|");
        System.out.println("|Employee Id:"+employeeId+"        |");
        System.out.println("|Employee Name:"+employeeName+"    |");
        System.out.println("|----------------------------------|");
        System.out.println("|Basic Salary " + basicSalary+"    |");
        System.out.println("|HRA " +hra+ "                      ");
        System.out.println("|DA " +da+ "                        ");
        System.out.println("|TA " +ta+"                         ");
        System.out.println("|PF " +pf+"                         ");
        System.out.println("|----------------------------------|");
        System.out.println("|GROSS SALARY " +grossSalary+"      ");
        System.out.println("|==================================|");

    }











}
