import java.util.Scanner;
    public class Q7{
        public static void main(String[] args){
            int positive = 0, negative = 0, zero = 0;
    System.out.println("Enter numbers (Enter 999 to stop):");

        while (true) {
            int N3 = scanner.nextInt();
            if (N3 == 999) { 
                break;
            }
            if (N3 > 0) {
                positive++;
            } else if (N3 < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zero Numbers: " + zero);
        
        }
    }