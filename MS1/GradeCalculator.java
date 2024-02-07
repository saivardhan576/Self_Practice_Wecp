package MS1;
import java.util.Scanner;

public class GradeCalculator {
    static Scanner s=new Scanner(System.in);
    
    public static void gradeUsingIfelse(){
        
        System.out.println("Enter your exam score (out of 100): ");
        int marks=s.nextInt();
        if(marks>=90){
            System.out.println("Grade: A");
        }
        else if(marks>=80 && marks<90){
            System.out.println("Grade: B");
        }
        else if(marks>=70 && marks<80){
            System.out.println("Grade: C");
        }
        else if(marks>=60 && marks<70){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
    }
    public static void gradeUsingSwitch(){
        System.out.println("Enter your assignment score (out of 50): ");
        int m1=s.nextInt();
        switch(m1/10)
        {
            case 1: System.out.println("Grade: D");
            break;
            case 2: System.out.println("Grade: C");
            break;
            case 3: System.out.println("Grade: B");
            break;
            case 4: System.out.println("Grade: A");
            break;
            default: System.out.println("Grade: F");
            break;
        }
        

    }
    public static void CalculateGpa(){
        System.out.println("Enter the number of courses: ");
        int courses=s.nextInt();
        double totalGpa=0;
        for(int i=0;i<courses;i++) {
            System.out.println("Enter the grade for Course "+(i+1)+" (A, B, C, D, F): ");
            char grade=s.next().charAt(0);
            switch (grade) {
                case 'A': totalGpa+=4.0;
                    
                    break;
                case 'B': totalGpa+=3.0;
                    
                    break;
                case 'C': totalGpa+=2.0;
                    
                    break;
                case 'D': totalGpa+=1.0;
                    
                    break;
                case 'F': totalGpa+=0.0;
                    
                    break;
            
                default:System.out.println("Enter Valid Grade");
                    break;
            }
            
            
        }
        System.out.println("GPA for the semester: "+totalGpa/courses);
    } 

    public static void main(String[] args) {
        
        System.out.println("Welcome to the Grade Calculator System!");
        gradeUsingIfelse();
        gradeUsingSwitch();
        CalculateGpa();
        System.out.println("Goodbye!");
    }

    
    
}
