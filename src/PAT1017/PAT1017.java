package PAT1017;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by xiny on 2015/1/8.
 */
public class PAT1017 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        System.out.print(a1.divide(b1).toString()+" "+a1.mod(b1).toString());
    }
}
