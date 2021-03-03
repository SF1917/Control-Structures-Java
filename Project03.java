import java.util.*;

public class Project008 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a float number: ");
        double x = input.nextFloat();
        
        int counter = 0;
        int counter_max = 3;
        
        while((x >= 1) && (counter < counter_max)) {
            System.out.format("%f\n", x);
            x /= 2;
            counter++;
        }
        
    }
}
