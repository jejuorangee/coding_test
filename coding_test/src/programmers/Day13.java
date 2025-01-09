package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. 정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public List<Integer> solution(int[] num_list, int n) {
//        List<Integer> list = new ArrayList<>();
//        for (int num : num_list) {
//            list.add(num);
//        }
//        
//        // n 번째 원소부터 마지막까지 자르기
//        return list.subList(n - 1, list.size());
//    }
//}

// 2. 정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public List<Integer> solution(int[] num_list, int n) {
//        List<Integer> list = new ArrayList<>();
//        for (int num : num_list) {
//            list.add(num);
//        }
//        
//        // n번째 원소 이후의 원소들을 firstPart로 가져오기
//        List<Integer> firstPart = list.subList(n, list.size());  // n번째 원소 이후의 부분
//        // n번째 원소까지의 원소들을 secondPart로 가져오기
//        List<Integer> secondPart = list.subList(0, n);           // n번째 원소까지의 부분
//        
//        // firstPart와 secondPart를 합쳐서 반환
//        List<Integer> answer = new ArrayList<>();
//        answer.addAll(firstPart);  // n번째 원소 이후의 원소들을 먼저 추가
//        answer.addAll(secondPart); // n번째 원소까지의 원소들을 그 뒤에 추가
//        
//        return answer;
//    }
//}

// 3. 문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다. str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를, 
// 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요. "l"이나 "r"이 없다면 빈 리스트를 return합니다.
//class Solution {
//    public List<String> solution(String[] str_list) {
//    
//    	// Arrays.asList() : List로 변환 메서드 (ArrayList 아님주의)
//        List<String> list = Arrays.asList(str_list);
//        
//        // 'l'과 'r'의 인덱스를 찾기
//        int leftIndex = list.indexOf("l");
//        int rightIndex = list.indexOf("r");
//
//        // 'l'과 'r'이 모두 없다면 빈 리스트 반환
//        if (leftIndex == -1 && rightIndex == -1) {
//            return new ArrayList<>();
//        }
//
//        // 'l'과 'r' 중 먼저 나오는 인덱스를 기준으로 결과 리스트 반환
//        if (leftIndex != -1 && (rightIndex == -1 || leftIndex < rightIndex)) {
//            return new ArrayList<>(list.subList(0, leftIndex));
//        } else if (rightIndex != -1) {
//            return new ArrayList<>(list.subList(rightIndex + 1, list.size()));
//        }
//
//        // 기본적으로 빈 리스트 반환
//        return new ArrayList<>();
//    }
//}

// 4. 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public List<Integer> solution(int[] num_list, int n) {
//        List<Integer> list = new ArrayList<>();
//        for (int num : num_list) {
//            list.add(num);
//        }
//
//        // 첫 번째 원소부터 n 번째 원소까지 잘라서 반환
//        return list.subList(0, n);  // 인덱스 0부터 n 직전까지
//    }
//}

// 5. 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public List<Integer> solution(int[] num_list, int n) {
//       List<Integer> answer = new ArrayList<>();
//       
//       // 인덱스를 n 간격으로 선택하여 리스트에 추가
//       for (int i = 0; i < num_list.length; i++) {
//           if (i % n == 0) {
//               answer.add(num_list[i]);
//           }
//       }
//       
//       return answer;
//   }
//}


public class Day13 {
	public static void main(String[] args) {
//		Solution sol = new Solution();
		
		// 1.
//		int[] num_list1 = {2, 1, 6};
//		int[] num_list2 = {5, 2, 1, 7, 5};
//		
//		for(int i : sol.solution(num_list1, 3)) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for(int j : sol.solution(num_list2, 2)) {
//			System.out.print(j);
//		}
		
		// 2.
//		int[] num_list1 = {2, 1, 6};
//		int[] num_list2 = {5, 2, 1, 7, 5};
//		
//		for(int i : sol.solution(num_list1, 1)) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for(int j : sol.solution(num_list2, 3)) {
//			System.out.print(j);
//		}
		
		// 3.
//		String[] str_list1 = {"u", "u", "l", "r"};
//		String[] str_list2 = {"l"};
//		
//		for(String i : sol.solution(str_list1)) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for(String j : sol.solution(str_list2)) {
//			System.out.print(j);
//		}
		
		// 4.
//		int[] num_list1 = {2, 1, 6};
//		int[] num_list2 = {5, 2, 1, 7, 5};
//		
//		for(int i : sol.solution(num_list1, 1)) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for(int j : sol.solution(num_list2, 3)) {
//			System.out.print(j);
//		}
		
		// 5.
//		int[] num_list = {4, 2, 6, 1, 7, 6};
//		
//		for(int i : sol.solution(num_list, 2)) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for(int j : sol.solution(num_list, 4)) {
//			System.out.print(j);
//		}
	}
}
