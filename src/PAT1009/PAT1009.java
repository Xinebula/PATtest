package PAT1009;

import java.util.Scanner;

/**
 * Created by xiny on 2014/12/31.
 */
public class PAT1009 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] s = new String[80];
        int i;
        for(i=0;in.hasNext();i++){
            s[i] = new String();
            s[i] = in.next();
        }
        System.out.print(s[i-1]);
        for(int j = i-2;j>=0;j--){
            System.out.print(" "+s[j]);
        }
    }
}
