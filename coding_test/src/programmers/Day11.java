package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, 
//my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, 
//my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int[] solution(String my_string) {
//        int[] answer = new int[52];
//        
//          for (char c : my_string.toCharArray()) {
//            if (c >= 'A' && c <= 'Z') {
//                // 대문자 'A'의 위치는 0, 'B'는 1, ..., 'Z'는 25
//                answer[c - 'A']++;
//            } else if (c >= 'a' && c <= 'z') {
//                // 소문자 'a'의 위치는 26, 'b'는 27, ..., 'z'는 51
//                answer[c - 'a' + 26]++;
//            }
//        }
//        return answer;
//    }
//}

// 2. 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public List<Integer> solution(int n, int k) {
//        List<Integer> answer = new ArrayList<Integer>();
//        for(int i=1; i<=n; i++){
//            if(i%k==0){
//                answer.add(i);
//            }
//        }
//        return answer;
//    }
//}

// 3. 문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String solution(String my_string, int[] indices) {
//        // StringBuilder를 사용하여 새로운 문자열을 만들기 위해 초기화
//        StringBuilder result = new StringBuilder();
//        
//        // 인덱스를 배열로 변환하여 빠른 확인을 위해 체크할 수 있는 배열 생성
//        boolean[] toRemove = new boolean[my_string.length()];
//        
//        // 주어진 인덱스 배열에 해당하는 인덱스를 true로 표시
//        for (int idx : indices) {
//            toRemove[idx] = true;
//        }
//        
//        // 문자열을 순차적으로 확인하여 인덱스가 제거 대상이면 추가하지 않음
//        for (int i = 0; i < my_string.length(); i++) {
//            if (!toRemove[i]) {  // 제거하지 않은 문자는 StringBuilder에 추가
//                result.append(my_string.charAt(i));
//            }
//        }
//        
//        // 최종 결과 문자열을 반환
//        return result.toString();
//    }
//}

// 4. 정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public List<Integer> solution(int start_num, int end_num) {
//        List<Integer> answer = new ArrayList<Integer>();
//        for(int i=start_num; i>=end_num; i--){
//            answer.add(i);
//        }
//        return answer;
//    }
//}

// 5.정수 배열 arr가 주어집니다. 이때 arr의 원소는 1 또는 0입니다. 정수 idx가 주어졌을 때, idx보다 크면서 배열의 값이 1인 가장 작은 인덱스를 찾아서 반환하는 solution 함수를 완성해 주세요.
//단, 만약 그러한 인덱스가 없다면 -1을 반환합니다.
class Solution {
    public int solution(int[] arr, int idx) {
        // idx부터 배열 끝까지 탐색
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;  // 첫 번째 1을 찾으면 해당 인덱스를 반환
            }
        }
        return -1;  // 조건에 맞는 1을 찾지 못하면 -1 반환
    }
}

public class Day11 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		// 1.
//		String my_string = "Programmers";
//		System.out.println(Arrays.toString(sol.solution(my_string)));
		
		// 2.
//		for(int i : sol.solution(10, 3)) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for(int i : sol.solution(15, 5)) {
//			System.out.print(i);
//		}
		
		// 3.
//		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
//		System.out.println(sol.solution("apporoograpemmemprs", indices));
		
		// 4.
//		for(int i : sol.solution(10, 3)) {
//			System.out.print(i);
//		}
		
		// 5.
		int[] arr1 = {0, 0, 0, 1};
		int[] arr2 = {1, 0, 0, 1, 0, 0};
		int[] arr3 = {1, 1, 1, 1, 0};
		System.out.println(sol.solution(arr1, 1));
		System.out.println(sol.solution(arr2, 4));
		System.out.println(sol.solution(arr3, 3));
		
	}
}
