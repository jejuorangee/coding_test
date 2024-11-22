package coding_test;

import java.util.Scanner;
import java.util.Stack;

public class Test02 {
	public static void main(String[] args) {
		// codeUp 3117 : 0은 빼!
		
		// N 크기 만큼의 스택 공간 형성
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		Stack<Integer> stack=new Stack<Integer>();
		
		// ※ ctrl C,V ===>> 반복문
		// ※ while VS for
		// N개의 데이터를 입력받을것임
		for(int i=0; i<N; i++) {
			int data=sc.nextInt();
			//   0이 아니면 그냥 스택에 저장저장
			if(data != 0) {
				stack.push(data);
			}
			//   0이면 데이터 제거
			else {
				stack.pop();
			}
		}
		
		// 마지막에 스택에 남아있는 모든 데이터 총합
		int total=0;
		for(int v:stack) {
			total+=v;
		}
		System.out.println(total);
	}
}
