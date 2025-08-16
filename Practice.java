import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     //   byte b=sc.nextByte();
//        String s=sc.nextLine();
//        System.out.println(b);
//        System.out.println(s);
        float f=sc.nextFloat();
        System.out.println(f);
        int a=3;
        int l=10;
        int ans=1;
        for(int i=0;i<l;i++){
            ans*=a;
        }
        System.out.println(ans);

    }
}
