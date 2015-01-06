package PAT1008;

import java.util.Scanner;

/**
 * Created by xiny on 2014/12/31.
 */
public class PAT1008 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] s = new int[N];
        for(int j=0;j<N;j++)
            s[j]=in.nextInt();
   /*     if(M!=0) {
              if (N % M != 0) {
                int next = s[0];
                int temp;
                int n = M;
                for (int i = 0; i < N; i++) {
                    temp = s[n];
                    s[n] = next;
                    next = temp;
                    n += M;
                    if (n >= N)
                        n -= N;
                }
            } else {    */
                for (int k = 0; k < M; k++) {
                    int next = s[0];
                    int temp;
                    int n = 1;
                    for (int i = 0; i < N; i++) {
                        temp = s[n];
                        s[n] = next;
                        next = temp;
                        n++;
                        if (n >= N)
                            n -= N;
                    }
                }
    //      }
    //  }
        System.out.print(s[0]);
        for (int p=1;p<N;p++)
            System.out.print(" "+s[p]);
    }



}


