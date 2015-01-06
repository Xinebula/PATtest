package PAT1012;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xiny on 2015/1/6.
 */
public class PAT1012 {
    static int n,x;
    static int[] numbers;
    static ArrayList<Integer> A1,A2,A3,A4,A5;
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        A1 = new ArrayList<Integer>();
        A2 = new ArrayList<Integer>();
        A3 = new ArrayList<Integer>();
        A4 = new ArrayList<Integer>();
        A5 = new ArrayList<Integer>();
        numbers =new int[n];
        for(int i=0;i<n;i++){
            numbers[i] = in.nextInt();
            x=numbers[i]%5;
            switch(x){
                case 0:
                    A1.add(numbers[i]);
                    break;
                case 1:
                    A2.add(numbers[i]);
                    break;
                case 2:
                    A3.add(numbers[i]);
                    break;
                case 3:
                    A4.add(numbers[i]);
                    break;
                case 4:
                    A5.add(numbers[i]);
                    break;
                default:
                    break;
            }
        }
        int A1_O = 0;
        for(int a:A1){
            if(a%2==0)
                A1_O+=a;
        }
        int A2_O = 0;
        int flag = 1;
        for(int a:A2){
            A2_O+=a*flag;
            flag*=-1;
        }
        int A3_O = A3.size();
        double A4_S = 0;
        double A4_O = 0;
        for(int a:A4)
            A4_S+=a;
        if(A4.size()!=0)
            A4_O = A4_S/A4.size();
        int A5_O = -1;
        for(int a:A5)
            if(a>A5_O)
                A5_O = a;
        if(A1_O==0)
            System.out.print("N");
        else
            System.out.print(""+A1_O);
        if(A2.size()==0)
            System.out.print(" N");
        else
            System.out.print(" "+A2_O);
        if(A3.size()==0)
            System.out.print(" N");
        else
            System.out.print(" "+A3_O);
        if(A4.size()==0)
            System.out.print(" N");
        else
            System.out.printf(" %.1f",A4_O);
        if(A5.size()==0)
            System.out.print(" N");
        else
            System.out.print(" "+A5_O);
    }
}
