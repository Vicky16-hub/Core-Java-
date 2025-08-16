package Practice;

public class Logical_Operators {
public static String booleanOperations(boolean a, boolean b){
    boolean s1=a && b;
    boolean s2=a||b;
    boolean s3=!a;
    String and=String.valueOf(s1);
    String or=String.valueOf(s2);
    String not=String.valueOf(s3);
    System.out.println(and);
    System.out.println(or);
    return not;
}

    public static void main(String[] args) {
        booleanOperations(true,false);
    }
    }

