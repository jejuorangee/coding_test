package programmers;

//1. 길이가 같은 두 문자열 str1과 str2가 주어집니다.
// 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public String solution(String str1, String str2) {
//        StringBuilder answer = new StringBuilder();
//        for(int i=0; i<str1.length(); i++){
//            answer.append(str1.charAt(i));
//            answer.append(str2.charAt(i));
//        }
//        return answer.toString();
//    }
//}

// 2. 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
//class Solution {
//    public String solution(String[] arr) {
//        String answer = "";
//        for(String a : arr){
//            answer += a;
//        }
//        return answer;
//    }
//}

// 3. 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String solution(String my_string, int k) {
//        String answer = "";
//        for(int i=0; i<k; i++){
//            answer += my_string;
//        }
//        return answer;
//    }
//}

// 4. 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
// 12 ⊕ 3 = 123
// 3 ⊕ 12 = 312
// 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
// 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
//class Solution {
//    public int solution(int a, int b) {
//        String ab = String.valueOf(a) + String.valueOf(b);
//        String ba = String.valueOf(b) + String.valueOf(a);
//        
//        if (ab.compareTo(ba) >= 0) {
//            return Integer.parseInt(ab);
//        } else {
//            return Integer.parseInt(ba);
//        }
//    }
//}

// 5. 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

// 12 ⊕ 3 = 123
// 3 ⊕ 12 = 312
// 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
// 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
//class Solution {
//    public int solution(int a, int b) {
//        String ab = String.valueOf(a) + String.valueOf(b);
//        int abValue = Integer.parseInt(ab);
//        
//        int abResult = 2 * a * b;
//        
//         if (abValue >= abResult) {
//            return abValue;
//        } else {
//            return abResult;
//        }
//    }
//}

public class Day03 {
	public static void main(String[] args) {
		//Solution sol = new Solution();
		// 1.
//		String num1 = sol.solution("aaaaa", "bbbbb");
//		System.out.println(num1);
		
		// 2.
//		String[] arr = {"a","b","c"};
//		String num2 = sol.solution(arr);
//		System.out.println(num2);
		
		// 3.
//		String num3 = sol.solution("String", 3);
//		System.out.println(num3);
		
		// 4.
		//int num4 = sol.solution(91, 9);
//		int num4 = sol.solution(8, 89);
//		System.out.println(num4);
		
		// 5.
//		int num5 = sol.solution(2, 91);
//		int num5 = sol.solution(91, 2);
//		System.out.println(num5);
	}
}
