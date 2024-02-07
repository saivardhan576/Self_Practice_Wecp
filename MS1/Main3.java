package MS1;
import java.io.*;
import java.util.*;
import java.lang.Math;

class Employee{
    private int empId;
    private String empName;
    private float empBasicSalary;

    public int getempId(){
        return empId;
    }
    public void setempId(int empId){
        this.empId=empId;
    }
    public String getempName(){
        return empName;
    }
    public void setempName(String empName){
        this.empName=empName;
    }
    public float getempBasicSalary(){
        return empBasicSalary;
    }
    public void setempBasicSalary(float empBasicSalary){
        this.empBasicSalary=empBasicSalary;
    }

    public double calculateNetSalary(){
        double netSalary= empBasicSalary + empBasicSalary*0.12;
        return netSalary;



    }


}
class TemperoryEmpl extends Employee{
    int noOfDaysWorked;
    public double calculateNetSalary(empBasicSalary,noOfDaysWorked){
        double salary= getempBasicSalary()/noOfDaysWorked;
        return salary;

    }
}
public class Main3{
    public static void main(String[] args) {
        TemperoryEmpl e= new TemperoryEmpl();
        Scanner s=new Scanner(System.in);
        int noOfDaysWorked= s.nextInt();
        
        float empBasicSalary=s.nextFloat();
        System.out.println(e.calculateNetSalary(empBasicSalary,noOfDaysWorked));
        s.close();
    }
}