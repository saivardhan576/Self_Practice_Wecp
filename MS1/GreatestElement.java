package MS1;
import java.util.Scanner;

public class GreatestElement{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
              
            }

        }
        System.out.println(max);
        


       
        
    }
}
