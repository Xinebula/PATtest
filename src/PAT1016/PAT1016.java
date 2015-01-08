package PAT1016;

import java.util.Scanner;

/**
 * Created by xiny on 2015/1/8.
 */
public class PAT1016 {
    public static void main(String[] args){
        String a,b = new String();
        int a1,b1;
        int counta=0,countb=0;
        int inta=0,intb=0;
        int expa=1,expb=1;
        Scanner in = new Scanner(System.in);
        a = in.next();
        a1 = in.nextInt();
        b = in.next();
        b1 = in.nextInt();
        for(int i=0;i<a.length();i++){
            if((int)a.charAt(i)==(a1+48))
                counta++;
        }
        for(int i=0;i<b.length();i++){
            if((int)b.charAt(i)==(b1+48))
                countb++;
        }
        expa=a1;
        for(int i=0;i<counta;i++){
            inta+=expa;
            expa*=10;
        }
        expb=b1;
        for(int i=0;i<countb;i++){
            intb+=expb;
            expb*=10;
        }
        System.out.print(inta+intb);
    }
}
