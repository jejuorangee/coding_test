package programmers;

import java.util.ArrayList;
import java.util.List;

// 1. 정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 
// 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.
//class Solution {
//    public int solution(int[] num_list) {
//        int oddSum = 0;  // 홀수 번째 원소들의 합
//        int evenSum = 0; // 짝수 번째 원소들의 합
//        
//        for (int i = 0; i < num_list.length; i++) {
//            if (i % 2 == 0) {
//                evenSum += num_list[i]; // 짝수 번째 원소 합
//            } else {
//                oddSum += num_list[i]; // 홀수 번째 원소 합
//            }
//        }
//        
//        // 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 더 큰 값 반환
//        return Math.max(oddSum, evenSum);
//    }
//}

// 2. 최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때, 
//앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요. 
//마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
//class Solution {
//    public List<String> solution(String[] names) {
//        List<String> answer = new ArrayList<>();
//        
//        for (int i = 0; i < names.length; i += 5) {
//            answer.add(names[i]);
//        }
//        
//        return answer;
//    }
//}

// 3. 오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때, 
// todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//   public String[] solution(String[] todo_list, boolean[] finished) {
//        List<String> answer = new ArrayList<>();
//        
//        for (int i = 0; i < todo_list.length; i++) {
//            if (!finished[i]) {
//                answer.add(todo_list[i]);
//            }
//        }
//        
//        return answer.toArray(new String[0]);
//    }
//}

// 4. 정수 배열 numbers와 정수 n이 매개변수로 주어집니다. numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int solution(int[] numbers, int n) {
//        int sum = 0;
//        // numbers 배열을 순차적으로 더함
//        for (int number : numbers) {
//            sum += number;  // 현재 원소를 더함
//            if (sum > n) {  // 누적합이 n을 초과하는지 확인
//                return sum;  // 초과하면 그 합을 반환
//            }
//        }
//        return sum;
//    }
//}

// 5. 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
//위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public int[] solution(int[] arr, int[][] queries) {
//       for (int[] query : queries) {
//            int s = query[0];
//            int e = query[1];
//            // 범위 [s, e]에 대해 arr[i]에 1을 더함
//            for (int i = s; i <= e; i++) {
//                arr[i] += 1;
//            }
//        }
//        return arr;
//    }
//}

public class Day14 {
	public static void main(String[] args) {
//		Solution sol = new Solution();
		
		// 1.
//		int[] num_list1 = {4, 2, 6, 1, 7, 6};
//		int[] num_list2 = {-1, 2, 5, 6, 3};
//		
//		System.out.println(sol.solution(num_list1));
//		System.out.println(sol.solution(num_list2));
		
		// 2.
//		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
//		for(String s : sol.solution(names)) {
//			System.out.println(s);
//		}
		
		// 3.
//		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
//		boolean[] finished = {true, false, true, false};
//		
//		for(String s : sol.solution(todo_list, finished)) {
//			System.out.println(s);
//		}
		
		// 4.
//		int[] numbers1 = {34, 5, 71, 29, 100, 34};
//		int[] numbers2 = {58, 44, 27, 10, 100};
//		System.out.println(sol.solution(numbers1, 123));
//		System.out.println(sol.solution(numbers2, 139));
		
		// 5.
//		int[] arr = {0, 1, 2, 3, 4};
//		int[][] queries = {{0 ,1}, {1, 2}, {2, 3}};
//		
//		for(int i : sol.solution(arr, queries)) {
//			System.out.println(i);
//		}
	}
}
