package PAT1001;
import java.util.*;

public class PAT1001{
	public static void main(String[] args){
		int p,count=0;
		Scanner in = new Scanner(System.in);
		p=in.nextInt();
		while(p!=1){
			p=slash(p);
			count++;
		}
		System.out.println(count);
	}

	static int slash(int n){
		int m;
		m=n%2;
		if(m==0)
			n/=2;
		else 
			n=(3*n+1)/2;
		return n;
	}
}