package MS1;
/*class Arithmatic{
    static int add(int n, int m){
        return n+m;
    }
    static int add(int x,int y,int z){
        return x+y+z;
    }
}
public class Main2 {
    public static void main(String[] args) {
        System.out.println(Arithmatic.add(8,8,8));
        System.out.println(Arithmatic.add(8,8));
        
    }
    
}*/
class Arithmatic{
    public int add(int n, int m){
        return n+m;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
}
public class Main2 {
    public static void main(String[] args) {
        Arithmatic a=new Arithmatic();
        System.out.println(a.add(8,8,8));
        System.out.println(a.add(8,8));
        
    }
    
}

