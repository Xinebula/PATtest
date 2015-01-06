package PAT1011;

import java.util.Scanner;

/**
 * Created by xiny on 2015/1/1.
 */
public class PAT1011_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextLong();
            b[i]=in.nextLong();
            c[i]=in.nextLong();
        }
        for(int i=0;i<n;i++){
            if(a[i]+b[i]>c[i])
                System.out.println("Case #"+(i+1)+": true");
            else
                System.out.println("Case #"+(i+1)+": false");
        }
    }
}
