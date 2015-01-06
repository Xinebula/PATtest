package PAT1011;

import java.util.Scanner;

/**
 * Created by xiny on 2015/1/1.
 */
public class PAT1011 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        long a,b,c;
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            a=in.nextLong();
            b=in.nextLong();
            c=in.nextLong();
            if(a+b>c)
                System.out.println("Case #"+i+": true");
            else
                System.out.println("Case #"+i+": false");
        }
    }
}
