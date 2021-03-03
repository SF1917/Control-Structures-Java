import java.util.*;

public class Project006 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an integer [1 to 7]: ");
        int n = input.nextInt();
        
        String day;
        if (n == 1) 
            day = "Saturday";
        else if (n == 2)
            day = "Sunday";
        else if (n == 3)
            day = "Monday";
        else if (n == 4)
            day = "Tuesday";
        else if (n == 5)
            day = "Wednesday";
        else if (n == 6)
            day = "Thursday";
        else if (n == 7)
            day = "Friday";
        else
            day = "";
        
        if (day != "") {
            System.out.format("The day #%d in week is: %s.\n", n, day);
        } else {
            System.out.println("You have entered an invalid number.");
        }
        
    }
}
