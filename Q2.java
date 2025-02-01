import java.util.Scanner;
    public class Q2{
        public static void main(String[] args){

System.out.print("Enter a number to check the palindrome : ");
    int num = scanner.nextInt();
      int  reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        while( num != 0 ){
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
        }
    }