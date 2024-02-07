package MS1;
import java.util.*;
import java.util.ArrayList;
public class ArrayListExampl {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add(10);
        arr.add(50);
        arr.add("Sai");
        arr.add(2,"Vardhan");
        arr.add(1,78);

       
        ArrayList arr1= new ArrayList();
        arr1.add(35);
        arr1.add(0,55);
        System.out.println(arr.addAll(arr1));
        System.out.println(arr1.indexOf(35));
        System.out.println(arr1.contains(40));
        
        
        for(Object n:arr){
            System.out.println(n);
        }
        System.out.println("new"+arr1);
        System.out.println(arr1.get(1));
    }

    
}
