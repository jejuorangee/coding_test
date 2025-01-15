package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. 문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public String solution(String myString, String pat) {
//         for (int i = myString.length(); i >= pat.length(); i--) {
//            if (myString.substring(i - pat.length(), i).equals(pat)) {
//                return myString.substring(0, i);  // 찾은 부분까지 잘라서 반환
//            }
//        }
//        return "";
//    }
//}

// 2. 문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public int solution(String myString, String pat) {
//        int answer = 0;
//        int index = 0;
//
//        // pat이 등장하는 위치를 계속 찾아서 카운트
//        while ((index = myString.indexOf(pat, index)) != -1) {
//            answer++;
//            index += 1;  // 다음 위치부터 다시 검색 (겹치는 부분을 중복으로 카운트 방지)
//        }
//
//        return answer;
//    }
//}

// 3. 문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public String[] solution(String[] strArr) {
//        List<String> resultList = new ArrayList<>();
//        
//        // 배열을 순회하며 "ad"가 포함되지 않은 문자열만 resultList에 추가
//        for (String str : strArr) {
//            if (!str.contains("ad")) {
//                resultList.add(str);
//            }
//        }
//        
//        // 결과 리스트를 배열로 변환하여 반환
//        return resultList.toArray(new String[0]);
//    }
//}

// 4. 단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String[] solution(String my_string) {
//        return my_string.split(" ");
//    }
//}

// 5. 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
class Solution {
    public String[] solution(String my_string) {
        // trim() 앞뒤 공백 제거 
        // split("\\s+") 연속된 공백을 하나의 구분자로 처리 단어 분리
        return my_string.trim().split("\\s+");
    }
}

public class Day17 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		// 1.
//		System.out.println(sol.solution("AbCdEFG", "dE"));
//		System.out.println(sol.solution("AAAAaaaa", "AAAAaaaa"));
		
		// 2.
//		System.out.println(sol.solution("banana", "ana"));
//		System.out.println(sol.solution("aaaa", "aa"));
		
		// 3.
//		String[] strArr1 = {"and","notad","abcd"};
//		String[] strArr2 = {"there","are","no","a","ds"};
//		
//		System.out.println(Arrays.toString(sol.solution(strArr1)));
//		System.out.println(Arrays.toString(sol.solution(strArr2)));
		
		// 4.
//		System.out.println(Arrays.toString(sol.solution("i love you")));
//		System.out.println(Arrays.toString(sol.solution("programmers")));
		
		// 5.
		System.out.println(Arrays.toString(sol.solution("  i love you")));
		System.out.println(Arrays.toString(sol.solution(" programmers ")));

	}
}
