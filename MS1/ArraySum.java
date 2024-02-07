package MS1;
import java.util.Scanner;

public class ArraySum{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
        
        System.out.println(sum);
        
    }
}