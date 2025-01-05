package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 1. 문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
//배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다. 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
//        List<Integer> answer = new ArrayList<Integer>();
//        for(String str : intStrs){
//            String temp = "";
//            for(int i=0; i<l; i++){
//                temp += str.charAt(i+s);
//                if(k < (Integer.parseInt(temp))){
//                    answer.add(Integer.parseInt(temp));
//                }
//            }
//        }
//        return answer;
//    }
//}

// 2. 길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다. 
//parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다. 
//각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String solution(String[] my_strings, int[][] parts) {
//        StringBuilder result = new StringBuilder();
//        
//        for (int i = 0; i < my_strings.length; i++) {
//            int s = parts[i][0];
//            int e = parts[i][1];
//            result.append(my_strings[i].substring(s, e + 1));
//        }
//        return result.toString();
//    }
//}

// 3. 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String solution(String my_string, int n) {
//        return my_string.substring(my_string.length() - n);
//    }
//}

// 4. 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
//문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String[] solution(String my_string) {
//        List<String> suffixes = new ArrayList<>();
//        
//        // 모든 접미사 구하기
//        for (int i = 0; i < my_string.length(); i++) {
//            suffixes.add(my_string.substring(i));
//        }
//        
//        // 접미사 리스트를 사전순으로 정렬
//        Collections.sort(suffixes);
//        
//        // 리스트를 배열로 변환하여 반환
//        return suffixes.toArray(new String[0]);
//    }
//}

// 5. 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
//문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int solution(String my_string, String is_suffix) {
//        // endWith() ~로 끝나는지 확인
//        if (my_string.endsWith(is_suffix)) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
//}

public class Day09 {
	public static void main(String[] args) {
//		Solution sol = new Solution();
		
		// 1.
//		String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
//		int k = 50000;
//		int s = 5;
//		int l = 5;
//		List<Integer> strs = sol.solution(intStrs, k, s, l);
//		for(int str : strs) {
//			System.out.println(str);
//		}
		
		// 2.
//		String[] my_strings = {"progressive", "hamburger"," hammer", "ahocorasick"};
//		int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
//		
//		System.out.println(sol.solution(my_strings, parts));
		
		// 3.
//		System.out.println(sol.solution("programmerS123", 11));
//		System.out.println(sol.solution("He110W0r1d", 5));
		
		// 4.
//		String myString1 = "banana";
//		String myString2 = "programmers";
//		System.out.println(Arrays.toString(sol.solution(myString1)));
//		System.out.println(Arrays.toString(sol.solution(myString2)));
		
		// 5.
//		String myString1 = "banana";
//		String isSuffix1 = "ana";
//		System.out.println(sol.solution(myString1, isSuffix1));  // 1
//		
//		String myString2 = "banana";
//		String isSuffix2 = "nan";
//		System.out.println(sol.solution(myString2, isSuffix2));  // 0
//		
//		String myString3 = "banana";
//		String isSuffix3 = "wxyz";
//		System.out.println(sol.solution(myString3, isSuffix3));  // 0
//		
//		String myString4 = "banana";
//		String isSuffix4 = "abanana";
//		System.out.println(sol.solution(myString4, isSuffix4));  // 0
	}
}
