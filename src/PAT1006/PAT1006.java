package PAT1006;
import java.util.*;
public class PAT1006{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		int a,b,c;
		a=num/100;
		b=num%100/10;
		c=num%10;
		for(int i=0;i<a;i++){
			System.out.print("B");//print B
		}
		for(int j=0;j<b;j++){
			System.out.print("S");//print S
		}
		for(int k=1;k<=c;k++){
			System.out.print(k);
		}
	}
}