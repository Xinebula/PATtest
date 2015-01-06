package PAT1004;

import java.util.*;
class Students{
		String name;
		String number;
		int score;

	}

public class PAT1004{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int max_i=0,max_score=0,min_i=0,min_score=100;
		int n = in.nextInt();
		Students[] table1 = new Students[n];
		for(int i=0;i<n;i++){
			table1[i] = new Students();
			table1[i].name=in.next();
			table1[i].number=in.next();
			table1[i].score=in.nextInt();
			if(table1[i].score>max_score){
				max_score=table1[i].score;
				max_i=i;
			}
			if(table1[i].score<min_score){
				min_score=table1[i].score;
				min_i=i;
			}
		}
		System.out.println(table1[max_i].name+" "+table1[max_i].number);
		System.out.println(table1[min_i].name+" "+table1[min_i].number);

	}
}