package PAT1005;
import java.util.*;

public class PAT1005{
	static int[] result = new int[50];

	public static void main(String[] args){
		int k,i;
		Scanner in = new Scanner(System.in);
		k=in.nextInt();
		int[][] num = new int[3][k];
		for(i=0;i<k;i++){
			num[0][i] = in.nextInt();
		}//input numbers
		for(i=0;i<k;i++){
			num[1][i]=counting(num[0][i]);
		}//calculate count
		int remaining=k;
		int max_count=0,max_i=0,max_num=0;
		while(remaining!=0){
			max_count=0;max_i=0;max_num=0;
			for(i=0;i<k;i++){
				if(num[2][i]==1)
					continue;
				else
				if(num[1][i]>max_count){
					max_count=num[1][i];
					max_i=i;
					max_num=num[0][i];
				}
			}//find the max count
			gotoresult(max_num);
			for(i=0;i<k;i++){
				if(num[2][i]==1)
					continue;
				else
				if(num[0][i]==max_num){
					num[2][i]=1;
					remaining--;
				}
			}
			while(max_num!=1){
				max_num=slash(max_num);
				for(i=0;i<k;i++){
					if(num[2][i]==1)
						continue;
					else
					if(num[0][i]==max_num){
						num[2][i]=1;
						remaining--;
					}	
				}
			}
		}
		System.out.print(result[0]);
		for(int q=1;q<50;q++){
			if(result[q]!=0)
			System.out.print(" "+result[q]);
		}

	}

	static int counting(int p){
		int q=0;
		while(p!=1){
			p=slash(p);
			q++;
		}
		return q;
	}

	static int slash(int n){
		if(n%2==0)
			n/=2;
		else 
			n=(3*n+1)/2;
		return n;
	}

	static void gotoresult(int n){
		for(int i=0;i<50;i++){
			if(n>result[i]){
				for(int p=48;p>=i;p--){
					result[p+1]=result[p];
				}
				result[i]=n;
				return;	
			}
		}
	}

}