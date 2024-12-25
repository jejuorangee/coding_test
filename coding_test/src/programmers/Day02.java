package programmers;

import java.util.Scanner;

//class Solution {
//    public String solution(String my_string, String overwrite_string, int s) {
//        String answer = "";
//        
//        answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s + overwrite_string.length());
//
//        return answer;
//    }
//}

public class Day02 {
	public static void main(String[] args) {
		// 1. 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int result = a+b;
//		System.out.println(a + " + " + b +" = " + result);
		
		// 2. 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
		// 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
//		String a = sc.next();
//      String b = sc.next();
//        
//      System.out.print(a+b);
		
		// 3. 문자열 str이 주어집니다.
		// 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
//		String a = sc.next();
//        
//      for(int i=0; i<a.length(); i++){
//          System.out.println(a.charAt(i));
//      }
        
        // 4. 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
//		int n = sc.nextInt();
//	        
//	    if(n%2==0){
//	        System.out.print(n+" is even");
//	    }
//	    else {
//	        System.out.print(n+" is odd");
//	    }
		
		// 5. 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
		// 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		String my_string = sc.next();
		String overwrite_string = sc.next();
		int s = sc.nextInt();
		Solution sol = new Solution();
		//String answer = sol.solution(my_string,overwrite_string,s);
		//System.out.println(answer);
	}
}
