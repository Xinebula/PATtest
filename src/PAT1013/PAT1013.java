package PAT1013;

import java.util.Scanner;

/**
 * Created by xiny on 2015/1/7.
 */
public class PAT1013 {
    public static void main(String[] args){
        int M,N;
        int count = 0;
        int outCount = 1;
        Scanner in = new Scanner(System.in);
        M = in.nextInt();
        N = in.nextInt();
        for(int i=2;i<1000000000;i++){
            if(checkPrime(i)){
                count++;
                if(count>N)
                    break;
                else if(count>=M){
                    if(outCount==10) {
                        System.out.print(" "+i);
                        System.out.println();
                        outCount=1;
                    }
                    else if(outCount==1) {
                        System.out.print(i);
                        outCount++;
                    }
                    else{
                        System.out.print(" "+i);
                        outCount++;
                    }
                }
            }
        }
    }
    public static boolean checkPrime(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0)
            return false;
    }
    return true;
}
}
