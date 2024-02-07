package MS1;

import java.util.*;
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> hs1=new HashSet<Integer>();
        hs1.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(hs1);

        HashSet<Integer> hs2=new HashSet<Integer>();
        hs2.addAll(Arrays.asList(new Integer[]{1,2,3,4,5}));
        System.out.println(hs2);

        HashSet UHash=new HashSet(hs1);

        UHash.addAll(hs2);

        System.out.println("Union Set: "+UHash);

        HashSet IHash=new HashSet(hs1);
        IHash.retainAll(hs2);
        System.out.println("Intesection Elements: "+IHash);

        HashSet DHash=new HashSet(hs1);
        DHash.removeAll(hs2);
        System.out.println("Difference Elements: "+DHash);







        /*Set<String> name=new HashSet<String>();
        name.add("sai");
        name.add("mani");
        name.add("sai");
        name.add("dinesh");

        HashSet hs=new HashSet();
        hs.add(29);
        hs.add("dhoni");
        hs.add(39);
        System.out.println(hs);
        
        LinkedHashSet ls=new LinkedHashSet(hs);
        System.out.println(ls);

        

        System.out.println(name);*/
    }
    
}
