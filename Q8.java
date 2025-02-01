import java.util.Scanner;
    public class Q8{
        public static void main(String[] args){
            int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    System.out.println("Enter numbers (Enter 999 to stop):");
    
    while (true) {
        int num3 = scanner.nextInt();
        
        if (num3 == 999) {
            break;
        }
        
        if (num3 > max) {
            max = num3;
        }
        
        if (num3 < min) {
            min = num3;
        }
    }
    
    System.out.println("Largest number: " + max);
    System.out.println("Smallest number: " + min);
    
        }
    }