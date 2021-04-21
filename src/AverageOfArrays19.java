public class AverageOfArrays19 {

    // Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        AverageOfArrays19 obj = new AverageOfArrays19();
        obj.averageOfArrays();
    }

    void averageOfArrays(){

        int num1[] = {100,200,300,400,500,600,700,800,900,1000};
        int avg =0;

        for (int i : num1) //for statement for average of two arrays
            avg += i/10;
        System.out.println("The avg is " + avg);

    }



}

