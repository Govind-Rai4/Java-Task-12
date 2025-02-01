import java.util.Scanner;
    public class Q3{
        public static void main(String[] args){

         System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        int  sum = 0;
        while(num1 > 0) {
            sum = sum + num1 % 10;
            num1 = num1 / 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }
}