package programmers;

// 1. 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int solution(int num, int n) {
//        int answer = 0;
//        if(num%n == 0){
//            answer = 1;
//        }
//        return answer;
//    }
//}

// 2. 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int solution(int number, int n, int m) {
//        int answer = 0;
//        if(number%n == 0){
//            if(number%m == 0){
//                answer = 1;
//            }
//        }
//        return answer;
//    }
//}

// 3. 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        if(n%2 == 0){
//            for(int i=1; i<=n; i++){
//                answer += i%2==0 ? i*i : 0;    
//            }    
//        }
//        else {
//            for(int j=1; j<=n; j++){
//                answer += j%2!=0 ? j : 0;
//            }
//        }
//        return answer;
//    }
//}

// 4. 문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.
// 두 수가 n과 m이라면
// ">", "=" : n >= m
// "<", "=" : n <= m
// ">", "!" : n > m
// "<", "!" : n < m
// 두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int solution(String ineq, String eq, int n, int m) {
//        if (ineq.equals("<") && eq.equals("=")) {
//            return (n <= m) ? 1 : 0;
//        } 
//        else if (ineq.equals("<") && eq.equals("!")) {
//            return (n < m) ? 1 : 0;
//        } 
//        else if (ineq.equals(">") && eq.equals("=")) {
//            return (n >= m) ? 1 : 0;
//        } 
//        else if (ineq.equals(">") && eq.equals("!")) {
//            return (n > m) ? 1 : 0;
//        }
//        return 0;
//    }
//}

// 5. 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag){
            answer = a + b;
        }
        else {
            answer = a - b;
        }
        return answer;
    }
}

public class Day04 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		// 1.
//		int num1 = sol.solution(98, 2);
//		int num2 = sol.solution(34, 3);
//		System.out.println(num1);
//		System.out.println(num2);
		
		// 2.
//		int num3 = sol.solution(60, 2, 3);
//		int num4 = sol.solution(55, 10, 5);
//		System.out.println(num3);
//		System.out.println(num4);
		
		// 3.
//		int num5 = sol.solution(7);
//		int num6 = sol.solution(10);
//		System.out.println(num5);
//		System.out.println(num6);
		
		// 4.
//		int num7 = sol.solution("<", "=", 20, 50);
//		int num8 = sol.solution(">", "!", 41, 78);
//		System.out.println(num7);
//		System.out.println(num8);
		
		// 5.
		int num9 = sol.solution(-4, 7, true);
		int num10 = sol.solution(-4, 7, false);
		System.out.println(num9);
		System.out.println(num10);
		
	}
}
