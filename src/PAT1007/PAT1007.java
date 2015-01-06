package PAT1007;

import java.util.Scanner;

/**
 * Created by xiny on 2014/12/29.
 */
public class PAT1007 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int aNum=in.nextInt();
        int count=0;
        Prime a = new Prime();
        for(int i=2;i<aNum-1;i++){
            if(a.checkPrime(i)&&a.checkPrime(i+2)) {
                count++;
            }
        }
            System.out.println(count);
    }
}
