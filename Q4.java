import java.util.Scanner;
    public class Q4{
        public static void main(String[] args){
            System.out.print("Enter a number: ");
            int N = scanner.nextInt();
            int sum1 = 0;
               while (N > 0) {
                   sum1 = sum1 + (N * N);
                   N--;
               }
            System.out.println("Sum of squares of first " + N + " natural numbers is: " + sum1);
        }
    }