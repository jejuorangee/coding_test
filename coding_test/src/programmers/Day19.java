package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 1. 임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를 구분자로 사용해 문자열을 나누고자 합니다.
//예를 들어 주어진 문자열이 "baconlettucetomato"라면 나눠진 문자열 목록은 ["onlettu", "etom", "to"] 가 됩니다.
//문자열 myStr이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, return할 배열이 빈 배열이라면 ["EMPTY"]를 return 합니다.
//class Solution {
//    public String[] solution(String myStr) {
//       String[] parts = myStr.split("[abc]");
//
//        List<String> answer = new ArrayList<>();
//
//        // 빈 문자열이 아닌 부분만 추가
//        for (String part : parts) {
//            if (!part.isEmpty()) {
//                answer.add(part);
//            }
//        }
//
//        // 결과가 비어 있으면 ["EMPTY"] 반환
//        if (answer.isEmpty()) {
//            answer.add("EMPTY");
//        }
//
//         return answer.toArray(new String[0]);
//    }
//}

// 2. 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때, 
// arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int[] solution(int[] arr) {
//         List<Integer> result = new ArrayList<>();
//        
//        for (int num : arr) {
//            // num만큼 num을 리스트에 추가
//            for (int i = 0; i < num; i++) {
//                result.add(num);
//            }
//        }
//        
//        // List<Integer>를 int[]로 변환
//        int[] answer = new int[result.size()];
//        for (int i = 0; i < result.size(); i++) {
//            answer[i] = result.get(i);
//        }
//
//        return answer;
//    }
//}

// 3. 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때, 
//flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고, 
//flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int[] solution(int[] arr, boolean[] flag) {
//         List<Integer> X = new ArrayList<>();
//        
//        // arr과 flag를 차례대로 순회
//        for (int i = 0; i < arr.length; i++) {
//            if (flag[i]) {
//                // flag[i]가 true이면 arr[i]를 arr[i] * 2 번 추가
//                for (int j = 0; j < arr[i] * 2; j++) {
//                    X.add(arr[i]);
//                }
//            } else {
//                // flag[i]가 false이면 X에서 마지막 arr[i]개의 원소를 제거
//                for (int j = 0; j < arr[i]; j++) {
//                    if (!X.isEmpty()) {
//                        X.remove(X.size() - 1);
//                    }
//                }
//            }
//        }
//        
//        // 결과를 int[]로 변환하여 반환
//        int[] answer = new int[X.size()];
//        for (int i = 0; i < X.size(); i++) {
//            answer[i] = X.get(i);
//        }
//        
//        return answer;
//    }
//}

// 4. 0과 1로만 이루어진 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk을 만드려고 합니다.
//i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복합니다.
//만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
//stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
//stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
//위 작업을 마친 후 만들어진 stk을 return 하는 solution 함수를 완성해 주세요.
//단, 만약 빈 배열을 return 해야한다면 [-1]을 return 합니다.
//class Solution {
//    public int[] solution(int[] arr) {
//         Stack<Integer> stk = new Stack<>();
//        
//        for (int i = 0; i < arr.length; i++) {
//            // 스택이 비었다면 arr[i] 추가
//            if (stk.isEmpty()) {
//                stk.push(arr[i]);
//            }
//            // 스택의 마지막 원소와 arr[i]가 같으면 마지막 원소 제거
//            else if (stk.peek() == arr[i]) {
//                stk.pop();
//            }
//            // 스택의 마지막 원소와 arr[i]가 다르면 arr[i] 추가
//            else {
//                stk.push(arr[i]);
//            }
//        }
//        
//        // 스택이 비었다면 [-1]을 반환
//        if (stk.isEmpty()) {
//            return new int[] {-1};
//        }
//        
//        // 스택을 배열로 변환
//        int[] answer = new int[stk.size()];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = stk.get(i);
//        }
//        
//        return answer;
//    }
//}

// 5. 랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다. 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후, 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.
//이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.
//정수 배열 arr가 주어집니다. 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때, 완성될 배열을 return 하는 solution 함수를 완성해 주세요.
//단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.
//class Solution {
//    public int[] solution(int[] arr, int k) {
//        Set<Integer> seen = new HashSet<>();
//        List<Integer> resultList = new ArrayList<>();
//        
//        for (int num : arr) {
//            if (!seen.contains(num)) {
//                seen.add(num);
//                resultList.add(num);
//            }
//        }
//        
//        // 결과 배열의 길이가 k보다 작으면 -1
//        while (resultList.size() < k) {
//            resultList.add(-1);
//        }
//        
//        // 리스트를 배열로 변환
//        int[] answer = new int[k];
//        for (int i = 0; i < k; i++) {
//            answer[i] = resultList.get(i);
//        }
//        
//        return answer;
//    }
//}

public class Day19 {
	public static void main(String[] args) {
//		Solution sol = new Solution();
		
		// 1.
//		System.out.println(Arrays.toString(sol.solution("baconlettucetomato")));
//		System.out.println(Arrays.toString(sol.solution("abcd")));
//		System.out.println(Arrays.toString(sol.solution("cabab")));
		
		// 2.
//		int[] arr1 = {5, 1, 4};
//		int[] arr2 = {6, 6};
//		int[] arr3 = {1};
//
//		System.out.println(Arrays.toString(sol.solution(arr1)));
//		System.out.println(Arrays.toString(sol.solution(arr2)));
//		System.out.println(Arrays.toString(sol.solution(arr3)));
		
		// 3.
//		int[] arr = {3, 2, 4, 1, 3};
//		boolean[] flag = {true, false, true, false, false};
//		
//		System.out.println(Arrays.toString(sol.solution(arr, flag)));
		
		// 4.
//		int[] arr1 = {0, 1, 1, 1, 0};
//		int[] arr2 = {0, 1, 0, 1, 0};
//		int[] arr3 = {0, 1, 1, 0};
//		
//		System.out.println(Arrays.toString(sol.solution(arr1)));
//		System.out.println(Arrays.toString(sol.solution(arr2)));
//		System.out.println(Arrays.toString(sol.solution(arr3)));
		
		// 5.
//		int[] arr1 = {0, 1, 1, 2, 2, 3};
//		int[] arr2 = {0, 1, 1, 1, 1};
//		
//		System.out.println(Arrays.toString(sol.solution(arr1, 3)));
//		System.out.println(Arrays.toString(sol.solution(arr2, 4)));
	}
}
