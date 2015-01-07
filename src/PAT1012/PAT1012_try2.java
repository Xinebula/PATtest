package PAT1012;

import java.util.Scanner;

/**
 * Created by xiny on 2015/1/7.
 */
public class PAT1012_try2 {
    static int n,x;
    static int number;
    static int[] A1,A2,A3,A4,A5;
    static int num1=0,num2=0,num3=0,num4=0,num5=0;
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        A1 = new int[1000];
        A2 = new int[1000];
        A3 = new int[1000];
        A4 = new int[1000];
        A5 = new int[1000];
        for(int i=0;i<n;i++){
            number = in.nextInt();
            x=number%5;
            switch(x){
                case 0:
                    A1[num1]=number;
                    num1++;
                    break;
                case 1:
                    A2[num3]=number;
                    num2++;
                    break;
                case 2:
                    A3[num3]=number;
                    num3++;
                    break;
                case 3:
                    A4[num4]=number;
                    num4++;
                    break;
                case 4:
                    A5[num5]=number;
                    num5++;
                    break;
                default:
                    break;
            }
        }
        int A1_O = 0;
        for(int i=0;i<num1;i++){
            if(A1[i]%2==0)
                A1_O+=A1[i];
        }
        int A2_O = 0;
        int flag = 1;
        for(int i=0;i<num2;i++){
            A2_O+=A2[i]*flag;
            flag*=-1;
        }
        int A3_O = num3;
        double A4_S = 0;
        double A4_O = 0;
        for(int i=0;i<num4;i++)
            A4_S+=A4[i];
        if(num4!=0)
            A4_O = A4_S/num4;
        int A5_O = -1;
        for(int i=0;i<num5;i++)
            if(A5[i]>A5_O)
                A5_O = A5[i];
        if(A1_O==0)
            System.out.print("N");
        else
            System.out.print(""+A1_O);
        if(num2==0)
            System.out.print(" N");
        else
            System.out.print(" "+A2_O);
        if(num3==0)
            System.out.print(" N");
        else
            System.out.print(" "+A3_O);
        if(num4==0)
            System.out.print(" N");
        else
            System.out.printf(" %.1f",A4_O);
        if(num5==0)
            System.out.print(" N");
        else
            System.out.print(" "+A5_O);
    }
}
