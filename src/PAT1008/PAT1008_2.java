package PAT1008;

import java.util.Scanner;

/**
 * Created by xiny on 2014/12/31.
 */
public class PAT1008_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] s = new int[N];
        for(int j=0;j<N;j++)
            s[j]=in.nextInt();

        int first = 0;
        int count=0;
        while(count<N) {
            int next = s[first];
            int temp;
            int n = M+first;
            n%=N;
            for (; n != first; count++) {
                temp = s[n];
                s[n] = next;
                next = temp;
                n += M;
                n%=N;
            }
            s[first] = next;
            count++;
            first++;
        }
        System.out.print(s[0]);
        for (int p=1;p<N;p++)
            System.out.print(" "+s[p]);
    }



}


