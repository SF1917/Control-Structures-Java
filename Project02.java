import java.util.*;

public class Project007 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an integer [1 to 7]: ");
        int n = input.nextInt();
        
        String day = "";
        String type = "";
        
        switch(n){
            case 1:
                day = "Saturday";
                break;
                
            case 2:
                day = "Sunday";
                break;
                
            case 3:
                day = "Monday";
                break;
                
            case 4:
                day = "Tuesday";
                break;
                
            case 5:
                day = "Wednesday";
                break;
                
            case 6:
                day = "Thursday";
                break;
                
            case 7:
                day = "Friday";
                break;
        }
        
        switch(n){
            case 1:
            case 3:
            case 5:
                type = "Even";
                break;
                
            case 2:
            case 4:
            case 6:
                type = "Odd";
                break;
        }
        
        if (!day.isEmpty()) {
            System.out.format("The day #%d in week is: %s.\n", n, day);
            if (!day.isEmpty()) {
                System.out.format("%s is an %s day.\n", day, type);
            } else {
                System.out.format("%s is not Even or Odd day.\n", day);
            }
        } else {
            System.out.println("You have entered an invalid number.");
        }
        
    }
}
