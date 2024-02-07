package MS1;
import java.util.Scanner;

public class Main1 {

    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        String mail=s.nextLine();
        String loc=s.nextLine();
        int id=s.nextInt();
        System.out.println();
        ExConstructor c = new ExConstructor(name,mail,loc,id);
        System.out.println(c.getCname()); 
        System.out.println(c.getLocation());
        System.out.println(c.getEmail());
        System.out.println(c.getId());
    }
    
}
