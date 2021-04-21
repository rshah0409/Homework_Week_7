import java.util.Arrays;

public class NumericArrayStringArray17 {

    //Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        NumericArrayStringArray17 obj = new NumericArrayStringArray17();
        obj.numericString();
    }
    void numericString(){


        int num[] = {12,11,16,19,18,14}; //int values
        Arrays.sort(num);
        System.out.println(Arrays.toString( num));  //sorting value with .tostring
        String name[] = {"My","Name","Is","Bond","James","bond"}; //string values
        Arrays.sort(name );
        System.out.println( Arrays.toString(name));

    }
}
