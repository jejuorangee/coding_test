package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// 1. 정수로 이루어진 문자열 n_str이 주어질 때, 
// n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public String solution(String n_str) {
//        return n_str.replaceFirst("^0+", "");
//    }
//}

// 2. 0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String solution(String a, String b) {
//        // BigInteger로 문자열을 변환하여 더함
//        BigInteger numA = new BigInteger(a);
//        BigInteger numB = new BigInteger(b);
//        BigInteger sum = numA.add(numB);
//        return sum.toString();
//    }
//}

// 3. 정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public String solution(int n) {
//        return Integer.toString(n);
//    }
//}

// 4. 정수 배열 arr과 delete_list가 있습니다. 
// arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int[] solution(int[] arr, int[] delete_list) {
//        // delete_list를 HashSet으로 변환하여 빠르게 검색
//        HashSet<Integer> deleteSet = new HashSet<>();
//        for (int num : delete_list) {
//            deleteSet.add(num);
//        }
//        
//        // arr에서 deleteSet에 포함되지 않는 원소만 결과 리스트에 추가
//        ArrayList<Integer> resultList = new ArrayList<>();
//        for (int num : arr) {
//            if (!deleteSet.contains(num)) {
//                resultList.add(num);
//            }
//        }
//        
//        // ArrayList를 int[] 배열로 변환
//        int[] result = new int[resultList.size()];
//        for (int i = 0; i < resultList.size(); i++) {
//            result[i] = resultList.get(i);
//        }
//        
//        return result;
//    }
//}

// 5. 부분 문자열이란 문자열에서 연속된 일부분에 해당하는 문자열을 의미합니다. 예를 들어, 
// 문자열 "ana", "ban", "anana", "banana", "n"는 모두 문자열 "banana"의 부분 문자열이지만, "aaa", "bnana", "wxyz"는 모두 "banana"의 부분 문자열이 아닙니다.
// 문자열 my_string과 target이 매개변수로 주어질 때, target이 문자열 my_string의 부분 문자열이라면 1을, 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
class Solution {
    public int solution(String my_string, String target) {
       // my_string이 target을 포함하고 있으면 1 아니면 0 반환
        if (my_string.contains(target)) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class Day22 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		// 1.
//		System.out.println(sol.solution("0010"));
//		System.out.println(sol.solution("854020"));
		
		// 2.
//		System.out.println(sol.solution("582", "734"));
//		System.out.println(sol.solution("18446744073709551615", "287346502836570928366"));
//		System.out.println(sol.solution("0", "0"));
		
		// 3.
//		System.out.println(sol.solution(123).equals("123"));
//		System.out.println(sol.solution(2573).equals("2573"));
		
		// 4.
//		int[] arr1 = {293, 1000, 395, 678, 94};
//		int[] delete_list1 = {94, 777, 104, 1000, 1, 12};
//		
//		int[] arr2 = {110, 66, 439, 785, 1};
//		int[] delete_list2 = {377, 823, 119, 43};
//		
//		System.out.println(Arrays.toString(sol.solution(arr1, delete_list1)));
//		System.out.println(Arrays.toString(sol.solution(arr2, delete_list2)));
		
		// 5.
		System.out.println(sol.solution("banana", "ana"));
		System.out.println(sol.solution("banana", "wxyz"));
		
	}
}
