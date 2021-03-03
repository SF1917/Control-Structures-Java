import java.util.*;

public class Project011 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float x;
        String ans;
        
        while(true) {
            System.out.print("Enter a number: ");
            x = input.nextFloat();
            System.out.format("%f\t%f\t%f\n", x, Math.pow(x, 2), Math.pow(x, 3));
            
            System.out.print("Do you want to continue [Y/N]? ");
            ans = input.next();
            if (!ans.toLowerCase().startsWith("y")) break;
        }
        
    }
}
