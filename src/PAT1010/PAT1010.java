package PAT1010;

import java.util.Scanner;

/**
 * Created by xiny on 2014/12/31.
 */
public class PAT1010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[50];
        int[] n = new int[50];
        int i;
        for(i=0;in.hasNextInt();i++){
            a[i] = in.nextInt();
            n[i] = in.nextInt();
        }
        for(int j=0;j<i;j++){
            if(n[j]==0){
                a[j]=0;
                continue;
            }
            a[j]*=n[j];
            n[j]--;
        }
        int k=0;
        for(;a[k]==0&&k<i;k++){
        }
        System.out.print(a[k]);
        System.out.print(" " + n[k]);
        k++;
        for(;k<i;k++){
            if(a[k]==0)
                continue;
            System.out.print(" "+a[k]);
            System.out.print(" "+n[k]);

        }
    }
}
