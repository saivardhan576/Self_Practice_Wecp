public class ArrayCopy {
    public static void main(String[] args) {
        String [] cArray={ "j","a","v","a","p","y","t","h","o","n"};
        String[] pArray=new String[7];
        System.arraycopy(cArray,0,pArray,0,6);
        System.out.println(cArray);
        System.out.println(pArray);
        
    }
    
    
}
