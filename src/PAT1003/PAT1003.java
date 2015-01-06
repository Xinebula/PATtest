package PAT1003;
import java.util.*;
public class PAT1003{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int k=in.nextInt();
		String s="";
		for(int i=0;i<k;i++){
			s=in.next();//get word
			if(judge(s))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}


	static boolean judge(String s){
		if(!check_1(s))
			return false;
		else{
			if(check_2(s))
				return true;
			else{
				if(check_3(s))
					return true;
				else
					return false;
			}
		}
	}

	static boolean check_1(String s){
		char n;
		for(int j=0;j<s.length();j++){
			n=s.charAt(j);
			if(n!='P'&&n!='A'&&n!='T')
				return false;
			else
				continue;	
		}
		return true;
	}

	static boolean check_2(String s){
		int n=s.indexOf("PAT");
		if(n==-1)
			return false;
		else{
			int count_p=0,count_t=0;
			for(int i=0;i<s.length();i++){
				n=s.charAt(i);
				if(n=='P'){
					count_p++;
				}
				if(n=='T'){
					count_t++;
				}
			}//check the number of 'P' and 'T'
			if(count_p!=1||count_t!=1)
				return false;
			else
				return true;
		}
	}

	static boolean check_3(String s){
		char n;
		int count_p=0,count_t=0;
		int i_p=0,i_t=0;
		for(int i=0;i<s.length();i++){
			n=s.charAt(i);
			if(n=='P'){
				count_p++;
				i_p=i;
			}
			if(n=='T'){
				count_t++;
				i_t=i;
			}
		}//check the number of 'P' and 'T'
		if(count_p!=1||count_t!=1)
			return false;
		else{
			if(i_p>=i_t||i_t-i_p==1||i_t>=s.length()-i_p)
				return false;
			else{
				String check_this;
				check_this=s.substring(0,i_t-1)+s.substring(i_t,s.length()-i_p);
				return judge(check_this);
			}
		}
	}
}