import java.util.Locale;

public class StringMethods21 {
/* ("String length() - length of the string");
   ("String charAt() - returns a char value at the given index number");
   ("String concat() - combines specified string at the end of this string");
   ("String contains() - returns true if chars are found in the string");
   ("String startsWith() - checks if this string starts with given prefix");
   ("String endsWith() - check if this string ends with the given suffix");
   ("String equals() - compares the contents of two given strings");
   ("String indexOF() - returns index of given character value or substring");
   ("String isEmpty() - checks if this string is empty");
   ("String replace() - returns a string replacing all the old char to new char");
   ("String substring() - returns a part of the string");
   ("String toCharArray() - converts this string into character array");
   ("String toLowercase() - returns the string in lowercase letter");
   ("String toUppercase() - returns the string in uppercase letter");
   ("String trim() - eliminates leading and trailing spaces");

*/
public static void main(String[] args) {
//string methods with characters defined

    String str1 = "God";
    String str2 = "Great";

    System.out.println ("String length() - length of the string   " + str2.length());
    System.out.println ("String charAt() - returns a char value at the given index number    "+ str2.charAt(3));
    System.out.println("String concat() - combines specified string at the end of this string   "+str1.concat(str2));
    System.out.println("String contains() - returns true if chars are found in the string   "+ str1.contains(str1));;
    System.out.println("String startsWith() - checks if this string starts with given prefix   "+ str2.startsWith(str1));
    System.out.println("String endsWith() - check if this string ends with the given suffix    "+ str1.endsWith(str2));
    System.out.println("String equals() - compares the contents of two given strings   "+ str1.equals(str2));
    System.out.println("String indexOF() - returns index of given character value or substring   "+ str1.indexOf(str2));
    System.out.println("String isEmpty() - checks if this string is empty     "+ str1.isEmpty());
    System.out.println("String replace() - returns a string replacing all the old char to new char   "+ str1.replace("r","d"));
    System.out.println("String substring() - returns a part of the string     "+ str2.substring(0,2));
    System.out.println("String toCharArray() - converts this string into character array    "+ str1.toCharArray());
    System.out.println("String toLowercase() - returns the string in lowercase letter   "+ str1.toLowerCase( Locale.ROOT));
    System.out.println("String toUppercase() - returns the string in uppercase letter    " + str2.toUpperCase(Locale.ROOT));
    System.out.println("String trim() - eliminates leading and trailing spaces       "+ str1.trim());


}

}
