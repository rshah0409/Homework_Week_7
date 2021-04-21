public class SumOfArrays18 {

    //Write a Java program to sum values of an array.

    public static void main(String[] args) {
        SumOfArrays18 obj = new SumOfArrays18(); //object created
        obj.sumArrays();
    }

    void sumArrays(){

        int num1[] = {100,200,300,400,500,600,700,800,900,1000}; //variable identified.
        int sum =0;

        for (int i : num1)  //total of two arrays
            sum += i;
        System.out.println("The sum is " + sum);

    }



}
