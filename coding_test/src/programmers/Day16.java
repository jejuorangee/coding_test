package programmers;

import java.util.Arrays;

// 1. 알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public String solution(String myString) {
//        return myString.toUpperCase();
//    }
//}

// 2. 알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public String solution(String myString) {
//        return myString.toLowerCase();
//    }
//}

// 3. 문자열 배열 strArr가 주어집니다. 모든 원소가 알파벳으로만 이루어져 있을 때, 
//배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
//class Solution {
//    public String[] solution(String[] strArr) {
//        for (int i = 0; i < strArr.length; i++) {
//            if (i % 2 == 0) {
//                // 짝수 번째 인덱스는 소문자로 변환
//                strArr[i] = strArr[i].toLowerCase();
//            } else {
//                // 홀수 번째 인덱스는 대문자로 변환
//                strArr[i] = strArr[i].toUpperCase();
//            }
//        }
//        return strArr;
//    }
//}

// 4. 문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, 
// "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
//class Solution {
//    public String solution(String myString) {
//        StringBuilder result = new StringBuilder();
//        
//        for (int i = 0; i < myString.length(); i++) {
//            char ch = myString.charAt(i);  // 문자열의 각 문자 확인
//            
//            if (ch == 'a') {
//                result.append('A');  // 'a'는 'A'로 변환
//            } else if (ch == 'A') {
//                result.append('A');  // 'A'는 그대로 'A'로 변환 (변경할 필요 없음)
//            } else if (ch >= 'B' && ch <= 'Z') {
//                result.append(Character.toLowerCase(ch));  // 'A' 제외한 대문자는 소문자로 변환
//            } else {
//                result.append(ch);  // 다른 문자는 그대로
//            }
//        }
//        return result.toString();  // 결과 문자열 반환
//    }
//}

// 5. 영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때,
// my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String solution(String my_string, String alp) {
//        StringBuilder result = new StringBuilder();
//        
//        for (int i = 0; i < my_string.length(); i++) {
//            char ch = my_string.charAt(i);
//            
//            // alp와 일치하는 문자가 있으면 대문자로 변환하여 추가
//            if (ch == alp.charAt(0)) {
//                result.append(Character.toUpperCase(ch));
//            } else {
//                result.append(ch);  // 일치하지 않으면 그대로 추가
//            }
//        }
//        
//        return result.toString();
//    }
//}

public class Day16 {
	public static void main(String[] args) {
//		Solution sol = new Solution();
		
		// 1.
//		System.out.println(sol.solution("aBcDeFg"));
//		System.out.println(sol.solution("AAA"));
		
		// 2.
//		System.out.println(sol.solution("aBcDeFg"));
//		System.out.println(sol.solution("aaa"));
		
		// 3.
//		String[] strArr1 = {"AAA","BBB","CCC","DDD"};
//		String[] strArr2 = {"aBc","AbC"};
//		
//		System.out.println(Arrays.toString(sol.solution(strArr1)));
//		System.out.println(Arrays.toString(sol.solution(strArr2)));
		
		// 4.
//		System.out.println(sol.solution("abstract algebra"));
//		System.out.println(sol.solution("PrOgRaMmErS"));
		
		// 5.
//		System.out.println(sol.solution("programmers", "p"));
//		System.out.println(sol.solution("lowercase", "x"));
	}
}
