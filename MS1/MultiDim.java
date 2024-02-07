package MS1;
import java.util.Scanner;

public class MultiDim{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=s.nextInt();

            }   
        }System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        
        


       
        
    }
}
