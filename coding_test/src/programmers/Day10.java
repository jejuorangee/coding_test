package programmers;

// 1. 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String solution(String my_string, int n) {
//        String answer = "";
//        for(int i=0; i<n; i++){
//            answer += my_string.charAt(i);
//        }
//        return answer;
//    }
//}

// 2. 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
//문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int solution(String my_string, String is_prefix) {
//        // startsWith() ~ 로 시작하는지
//        if (my_string.startsWith(is_prefix)) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
//}

// 3. 문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String solution(String my_string, int s, int e) {
//        // 1. s부터 e까지의 부분 문자열을 추출
//        String prefix = my_string.substring(0, s); // s 이전 부분
//        String middle = my_string.substring(s, e + 1); // s부터 e까지의 부분
//        String suffix = my_string.substring(e + 1); // e 이후 부분
//        
//        // 2. middle 부분을 뒤집기
//        String reversedMiddle = new StringBuilder(middle).reverse().toString();
//        
//        // 3. 결과 문자열을 결합
//        return prefix + reversedMiddle + suffix;
//    }
//}

// 4. 문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String solution(String my_string, int m, int c) {
//        StringBuilder result = new StringBuilder();
//        
//        // my_string을 m글자씩 나누어 c번째 열의 글자들을 추출
//        for (int i = c - 1; i < my_string.length(); i += m) {
//            result.append(my_string.charAt(i));
//        }
//        
//        return result.toString();
//    }
//}

// 5. 두 정수 q, r과 문자열 code가 주어질 때, code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String solution(int q, int r, String code) {
//        StringBuilder result = new StringBuilder();
//        
//        // code의 각 인덱스를 q로 나누었을 때 나머지가 r인 문자를 찾기
//        for (int i = 0; i < code.length(); i++) {
//            if (i % q == r) {  // 나머지가 r인 인덱스 찾기
//                result.append(code.charAt(i));  // 해당 문자 추가
//            }
//        }
//        
//        return result.toString();  // 결과 문자열 반환
//    }
//}

public class Day10 {
	public static void main(String[] args) {
//		Solution sol = new Solution();
		
		// 1.
//		System.out.println(sol.solution("ProgrammerS123", 11));
//		System.out.println(sol.solution("He110W0r1d", 5));
		
		// 2.
//		System.out.println(sol.solution("banana", "ban"));
//		System.out.println(sol.solution("banana", "nan"));
//		System.out.println(sol.solution("banana", "abcd"));
//		System.out.println(sol.solution("banana", "bananan"));
		
		// 3.
//		System.out.println(sol.solution("Progra21Sremm3", 6, 12));
//		System.out.println(sol.solution("Stanley1yelnatS", 4, 10));
		
		// 4.
//		System.out.println(sol.solution("ihrhbakrfpndopljhygc", 4, 2));
//		System.out.println(sol.solution("programmers", 1, 1));
		
		// 5.
//		System.out.println(sol.solution(3, 1, "qjnwezgrpirldywt"));
//		System.out.println(sol.solution(1, 0, "programmers"));
	}
}
