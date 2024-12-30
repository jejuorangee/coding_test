package programmers;

import java.util.Stack;

// 1. 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
//위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요. 
//class Solution {
//	public int[] solution(int[] arr, int[][] queries) {
//		//int[] answer;
//		for (int[] query : queries) {
//			int s = query[0]; // 시작 인덱스
//			int e = query[1]; // 끝 인덱스
//			int k = query[2]; // 배수
//
//			// s부터 e까지의 인덱스 중에서 i가 k의 배수인 경우 arr[i]에 1을 더함
//			for (int i = s; i <= e; i++) {
//				if (k != 0 && i % k == 0) {  // k가 0이 아니고, i가 k의 배수일 때만
//					arr[i] += 1;
//				}
//			}
//		}
//		return arr;
//	}
//}

//2.정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
//class Solution {
//    public static List<Integer> solution(int l, int r) {
//        // "0"과 "5"로 이루어진 숫자를 중복 없이 저장하기 위한 Set
//        Set<Integer> validNums = new HashSet<>();
//        
//        // "0"과 "5"로 이루어진 숫자들을 생성하여 Set에 저장
//        make0Or5("", validNums);
//        
//        // Set을 List로 변환하고, l 이상 r 이하인 숫자들만 필터링
//        List<Integer> result = new ArrayList<>();
//        for (int num : validNums) {
//            if (num >= l && num <= r) {
//                result.add(num);
//            }
//        }
//
//        // 결과가 없으면 [-1] 반환
//        if (result.isEmpty()) {
//            result.add(-1);
//        } else {
//            // 결과를 오름차순으로 정렬
//            Collections.sort(result);
//        }
//        
//        return result;
//    }
//
//    // "0"과 "5"로 이루어진 숫자를 재귀적으로 생성하는 함수
//    private static void make0Or5(String current, Set<Integer> validNums) {
//        // 숫자 길이가 6자리 이상이면 더 이상 생성하지 않음
//        if (current.length() > 6) {
//            return;
//        }
//        
//        // 빈 문자열이 아니면 숫자로 변환하여 Set에 추가
//        if (!current.isEmpty()) {
//            validNums.add(Integer.parseInt(current));
//        }
//
//        // "0"과 "5"를 추가하여 재귀 호출
//        make0Or5(current + "0", validNums);
//        make0Or5(current + "5", validNums);
//    }
//}

// 3. 정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int[] solution(int start_num, int end_num) {
//        int[] answer = new int[(end_num-start_num)+1];
//        for(int i=0; i<answer.length; i++){
//            answer[i] = start_num;
//            start_num+=1;
//        }
//        return answer;
//    }
//}

// 4. 모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고, x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.
//그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.
//계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.
//임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public List<Integer> solution(int n) {
//        List<Integer> answer = new ArrayList<Integer>();
//        answer.add(n);
//        while(true){
//            if(n == 1){
//                break;
//            }
//
//            if(n%2 == 0){
//                n /= 2;
//                answer.add(n);
//            }
//            else {
//                n = 3*n+1;
//                answer.add(n);
//            }
//        }
//        return answer;
//    }
//}

// 5. 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
//변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
//만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
//stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
//stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
//위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.
class Solution {
    public int[] solution(int[] arr) {
        // 스택을 사용하여 처리할 배열 생성
        Stack<Integer> stk = new Stack<>();
        
        // i는 배열 arr의 인덱스를 추적하는 변수
        int i = 0;
        
        // arr 배열을 순차적으로 처리
        while (i < arr.length) {
            // 1. 스택이 비어있거나, 스택의 마지막 원소가 현재 arr[i]보다 작은 경우
            //    arr[i]를 스택에 추가
            if (stk.isEmpty() || stk.peek() < arr[i]) { // stk.peek() 마지막 원소
                stk.push(arr[i]);  // arr[i]를 스택에 추가
                i++;  // 인덱스 i를 증가시켜서 다음 원소로 이동
            } else {
                // 2. 스택의 마지막 원소가 arr[i]보다 크거나 같은 경우
                //    스택의 마지막 원소를 제거
                stk.pop();
            }
        }
        
        // 스택에 담긴 값을 배열로 반환하기 위해 배열 크기만큼 새로운 배열 생성
        int[] answer = new int[stk.size()];
        
        // 스택의 원소를 배열에 담기
        // 스택의 마지막 원소부터 배열에 넣기 위해서 뒤에서부터 순차적으로 넣음
        for (int j = stk.size() - 1; j >= 0; j--) {
            answer[j] = stk.pop();  // 스택에서 하나씩 꺼내 배열에 저장
        }
        
        return answer;  // 결과 배열 반환
    }
}

public class Day07 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		// 1.
//		int[] arr = {0, 1, 2, 4, 3};
//		int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
//		int[] test1 = sol.solution(arr, queries);
//		for(int i : test1) {
//			System.out.print(i);
//		}
		
		// 2.
//		int l1 = 5;
//		int r1 = 555;
//		List<Integer> test1 = sol.solution(l1, r1);
//		System.out.println(result1);
//
//		int l2 = 10;
//		int r2 = 20;
//		List<Integer> test2 = sol.solution(l2, r2);
//		System.out.println(result2);
		
		// 3.
//		int start_num = 3;
//		int end_num = 10;
//		int[] test1 = sol.solution(start_num, end_num);
//		for(int i : test1) {
//			System.out.print(i);
//		}
		
		// 4.
//		int n = 10;
//		List<Integer> test1 = sol.solution(n);
//		for(int i : test1) {
//			System.out.print(i);
//			System.out.print(", ");
//		}
		
		// 5.
		int[] arr = {1, 4, 2, 5, 3};
		int[] test1 = sol.solution(arr);
		for(int i : test1) {
			System.out.print(i);
		}
	}
}
