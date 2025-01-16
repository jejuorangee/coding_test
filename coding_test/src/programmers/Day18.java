package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 1. 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public int[] solution(String myString) {
//         String[] parts = myString.split("x");
//        
//        // "x"가 문자열의 끝에 있을 경우 빈 문자열을 마지막에 추가
//        if (myString.endsWith("x")) {
//            String[] temp = new String[parts.length + 1];
//            System.arraycopy(parts, 0, temp, 0, parts.length);
//            temp[parts.length] = "";
//            parts = temp;
//        }
//        
//        // 각 부분의 길이를 계산하여 결과 배열에 저장
//        int[] answer = new int[parts.length];
//        for (int i = 0; i < parts.length; i++) {
//            answer[i] = parts[i].length();
//        }
//        
//        return answer;
//    }
//}

// 2. 문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
//단, 빈 문자열은 반환할 배열에 넣지 않습니다.
//class Solution {
//    public String[] solution(String myString) {
//        String[] parts = myString.split("x");
//        
//        // 빈 문자열을 제외한 유효한 부분만 필터링
//        List<String> resultList = new ArrayList<>();
//        for (String part : parts) {
//            if (!part.isEmpty()) {
//                resultList.add(part);
//            }
//        }
//        
//        // 사전순으로 정렬
//        Collections.sort(resultList);
//        
//        // 리스트를 배열로 변환하여 반환
//        return resultList.toArray(new String[0]);
//    }
//}

// 3. 문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, 
// op는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int solution(String binomial) {
//        String[] parts = binomial.split(" ");
//        
//        // a, b는 문자열로 들어오므로 정수로 변환
//        int a = Integer.parseInt(parts[0]);
//        int b = Integer.parseInt(parts[2]);
//        String op = parts[1];
//        
//        // 연산자에 따라 계산 수행
//        if (op.equals("+")) {
//            return a + b;
//        } else if (op.equals("-")) {
//            return a - b;
//        } else if (op.equals("*")) {
//            return a * b;
//        }
//        
//        // 유효한 연산자가 아닐 경우
//        return 0;
//    }
//}

// 4. 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. 
// myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
//class Solution {
//    public int solution(String myString, String pat) {
//       StringBuilder swappedString = new StringBuilder();
//        
//        for (char c : myString.toCharArray()) {
//            if (c == 'A') {
//                swappedString.append('B');
//            } else if (c == 'B') {
//                swappedString.append('A');
//            }
//        }
//        
//        // 치환된 문자열에서 pat이 부분 문자열로 존재하는지 확인
//        if (swappedString.toString().contains(pat)) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
//}

// 5. 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 rny_string이 주어질 때, 
// rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
class Solution {
    public String solution(String rny_string) {
       return rny_string.replace("m", "rn");
    }
}

public class Day18 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		// 1.
//		System.out.println(Arrays.toString(sol.solution("oxooxoxxox")));
//		System.out.println(Arrays.toString(sol.solution("xabcxdefxghi")));
		
		// 2.
//		System.out.println(Arrays.toString(sol.solution("axbxcxdx")));
//		System.out.println(Arrays.toString(sol.solution("dxccxbbbxaaaa")));
		
		// 3.
//		System.out.println(sol.solution("43 + 12"));
//		System.out.println(sol.solution("0 - 7777"));
//		System.out.println(sol.solution("40000 * 40000"));
		
		// 4.
//		System.out.println(sol.solution("ABBAA", "AABB"));
//		System.out.println(sol.solution("ABAB", "ABAB"));
		
		// 5.
		System.out.println(sol.solution("masterpiece"));
		System.out.println(sol.solution("programmers"));
		System.out.println(sol.solution("jerry"));
		System.out.println(sol.solution("burn"));
	}
}
