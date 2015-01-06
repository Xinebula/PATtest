package PAT1002;
import java.util.*;
public class PAT1002{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s;
		s=in.nextLine();
		int i,sum=0;
		char m;
		for(i=0;i<s.length();i++){
			m=s.charAt(i);
			switch(m){
				case '0' : sum+=0; break;
				case '1' : sum+=1; break;
				case '2' : sum+=2; break;
				case '3' : sum+=3; break;
				case '4' : sum+=4; break;
				case '5' : sum+=5; break;
				case '6' : sum+=6; break;
				case '7' : sum+=7; break;
				case '8' : sum+=8; break;
				case '9' : sum+=9; break;
				default : break;
			}
		}//set sum
		int sum_1,sum_2,sum_3;
		sum_1=sum/100;
		sum_2=sum/10-sum_1*10;
		sum_3=sum-sum_1*100-sum_2*10;
		if(sum_1==0){
			if(sum_2==0){
				pinyin(sum_3);
			}
			else{
				pinyin(sum_2);
				System.out.print(" ");
				pinyin(sum_3);
			}

		}
		else{
			pinyin(sum_1);
			System.out.print(" ");
			pinyin(sum_2);
			System.out.print(" ");
			pinyin(sum_3);
		}


	}

	static void pinyin(int toprint){
		switch(toprint){
			case 0 : System.out.print("ling"); break;
			case 1 : System.out.print("yi"); break;
			case 2 : System.out.print("er"); break;
			case 3 : System.out.print("san"); break;
			case 4 : System.out.print("si"); break;
			case 5 : System.out.print("wu"); break;
			case 6 : System.out.print("liu"); break;
			case 7 : System.out.print("qi"); break;
			case 8 : System.out.print("ba"); break;
			case 9 : System.out.print("jiu"); break;
			default : break;
		}
	}
}