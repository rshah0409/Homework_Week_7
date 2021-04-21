public class ArraySpecificValue20 {
    // Write a Java program to test if an array contains a specific value.

    public static void main(String[] args) {

        int firstArray[] = {1985,1986,1987,1988,1999,2000}; //int defined
        int value =0;
        System.out.println(specificValue(firstArray,1985));//arrays for specific value
        System.out.println(specificValue(firstArray,2021));//arrays for specific value
    }

    public static boolean specificValue(int firstArray[],int value){
//if else statement
        for(int n : firstArray)
      if (value == n){

          return true;

      }else{
          return false;
      }

      return false;
    }



}
