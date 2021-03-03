import java.util.*;

public class Project013 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        System.out.format("\nDivisors of %d:\n", n);
        
        int d = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.format("%d\n", i);
                d++;
            }
        }
        
        System.out.format("\nNumber of divisors: %d\n", d);
        
        if(d == 2) {
            System.out.format("The number %d is a Prime number.\n", n);
        } else {
            System.out.format("The number %d is NOT a Prime number.\n", n);
        }
        
        System.out.println("");
        
    }
}
