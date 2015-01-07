package PAT1014;

import java.util.Scanner;

/**
 * Created by xiny on 2015/1/7.
 */
public class PAT1014 {
    public static void main(String[] args){
        String a,b,c,d;
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        b = in.nextLine();
        c = in.nextLine();
        d = in.nextLine();
        char[] chars = new char[2];
        char charA,charB,charC,charD;
        int num=0;
        int count=0;
        for(int i=0;i<(a.length()>b.length()?b.length():a.length());i++){
            charA = a.charAt(i);
            charB = b.charAt(i);
            if((int)charA>=65&&(int)charA<=71){
                if (charA == charB && count == 0) {
                    chars[0] = charA;
                    count++;
                    continue;
                }
            }
            if(((int)charA>=48&&(int)charA<=57)||((int)charA>=65&&(int)charA<=78))
            if (charA == charB && count == 1) {
                chars[1] = charA;
                break;
            }
        }
        for(int i=0;i<(c.length()>d.length()?d.length():c.length());i++){
            charC = c.charAt(i);
            charD = d.charAt(i);
            if(((int)charC>=65&&(int)charC<=90)||((int)charC>=97&&(int)charC<=122)) {
                if (charC == charD) {
                    num = i;
                    break;
                }
            }
        }
        switch (chars[0]){
            case 'A':
                System.out.print("MON ");
                break;
            case 'B':
                System.out.print("TUE ");
                break;
            case 'C':
                System.out.print("WED ");
                break;
            case 'D':
                System.out.print("THU ");
                break;
            case 'E':
                System.out.print("FRI ");
                break;
            case 'F':
                System.out.print("SAT ");
                break;
            case 'G':
                System.out.print("SUN ");
                break;
            default:
                break;
        }
        int hour = (int)chars[1]<=57?(int)chars[1]-48:(int)chars[1]-55;
        System.out.printf("%02d:",hour);
        System.out.printf("%02d",num);
    }
}
