package MS1;
import java.util.Scanner;

public class EqualMatrix {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        boolean flag= true;
        int n1= s.nextInt();
        int n2=s.nextInt();
        int m1=s.nextInt();
        int m2=s.nextInt();
        int arr1[][]=new int[n1][m1];
        int arr2[][]=new int[n2][m2];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr1[i][j]=s.nextInt();
          }   
        }
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                arr2[i][j]=s.nextInt();
          }   
        }System.out.println();

        if(n1!=n2 || m1!=m2){
            System.out.println("Not equal");
        }
        else{
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    if(arr1[i][j]!= arr2[i][j]){
                        flag= false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("equal");
            }
            else{
                System.out.println("not equal");
            }
        }
        
        
        


       
    s.close(); 
    }
    
}
