package MS1;
public class ExConstructor {
    private String cName;
    private String cEmail;
    private String cLocation;
    private int cId;
    public ExConstructor(String a, String b, String c, int d){
        cName=a;
        cEmail=b;
        cLocation=c;
        cId=d;
    }
    public String getCname(){
        return cName;
    }
    public String getEmail(){
        return cEmail;
    }
    public String getLocation(){
        return cLocation;
    }
    public int getId(){
        return cId;
    }

    
}
