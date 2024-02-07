package MS1;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        float basicsalary=s.nextFloat();
        float dailywages=s.nextFloat();
        int noOfDays=s.nextInt();
        /*Address obj= new Address();
        Scanner s= new Scanner(System.in);
        obj.street= s.nextLine();
        obj.displayAddress();*/

        Employee e=new Employee();
        System.out.println(e.calcBonus(basicsalary));
        System.out.println(e.calcBonus(dailywages, noOfDays));
        
        
        
        
    }
        
}
    

