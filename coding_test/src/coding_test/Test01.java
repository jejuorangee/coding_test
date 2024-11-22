package coding_test;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// codeUp 4891 : 행복
		
		//배열이 주어졌을 때
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] datas=new int[N];
		for(int i=0;i<datas.length;i++) {
			datas[i]=sc.nextInt();
		}
		// 가장 큰 점수를 찾고
		int max=Arrays.stream(datas).max().getAsInt();
		// 가장 작은 점수를 찾는다
		int min=Arrays.stream(datas).min().getAsInt();
		// 큰 수 - 작은 수 = 정답
		int res=max-min;
		System.out.println(res);		
		
	}
}
