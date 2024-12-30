package programmers;

// 1. 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 
// 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int[] solution(int[] num_list) {
//        int[] answer = {};
//             // 마지막 두 요소를 비교하여 조건에 맞는 값을 계산한다.
//        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
//            // 새로운 배열을 생성하고 기존 배열을 복사
//            answer = new int[num_list.length + 1];
//            System.arraycopy(num_list, 0, answer, 0, num_list.length); // 기존 배열 복사
//            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2]; // 계산된 값을 추가
//        } 
//        else {
//            // 새로운 배열을 생성하고 기존 배열을 복사
//            answer = new int[num_list.length + 1];
//            System.arraycopy(num_list, 0, answer, 0, num_list.length); // 기존 배열 복사
//            answer[num_list.length] = num_list[num_list.length - 1] * 2; // 계산된 값을 추가
//        }
//        return answer;
//    }
//}

// 2. 정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
//"w" : n이 1 커집니다.
//"s" : n이 1 작아집니다.
//"d" : n이 10 커집니다.
//"a" : n이 10 작아집니다.
//위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public int solution(int n, String control) {
//        int answer = 0;
//        for(int i=0; i<control.length(); i++){
//            if(control.charAt(i) == 'w'){
//                n += 1;
//            }
//            else if(control.charAt(i) == 's') {
//                n -= 1;
//            }
//            else if(control.charAt(i) == 'd') {
//                n += 10;
//            }
//            else if(control.charAt(i) == 'a') {
//                n -= 10;
//            }
//        }
//        answer = n;
//        return answer;
//    }
//}

// 3. 정수 배열 numLog가 주어집니다. 처음에 numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.
//"w" : 수에 1을 더한다.
//"s" : 수에 1을 뺀다.
//"d" : 수에 10을 더한다.
//"a" : 수에 10을 뺀다.
//그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 numLog입니다. 즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한 결과가 저장되어 있습니다.
//주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public String solution(int[] numLog) {
//        StringBuilder answer = new StringBuilder();
//        for (int i = 1; i < numLog.length; i++) {
//            int pivot = numLog[i] - numLog[i - 1]; // 현재 값과 이전 값의 차이
//            
//            if (pivot == 1) {
//                answer.append("w");
//            } else if (pivot == -1) {
//                answer.append("s");
//            } else if (pivot == 10) {
//                answer.append("d");
//            } else if (pivot == -10) {
//                answer.append("a");
//            }
//        }
//        return answer.toString();
//    }
//}

// 4. 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
//각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
//위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public int[] solution(int[] arr, int[][] queries) {
//        // queries 배열을 순회하며 각각의 쿼리에서 두 값을 교환
//        for (int[] query : queries) {
//            int i = query[0];
//            int j = query[1];
//            
//            // arr[i]와 arr[j] 값을 교환
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        return arr;
//    }
//}

// 5. 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
//각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
//단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            
            int result = -1; // 기본값은 -1로 설정 (찾지 못할 경우)
            
            // s부터 e까지의 범위에서 k보다 큰 값 중 가장 작은 값
            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    if (result == -1 || arr[i] < result) {
                        result = arr[i]; // 현재 값이 더 작으면 갱신
                    }
                }
            }
            
            answer[q] = result; // 결과에 답을 저장
        }
        return answer;
    }
}

public class Day06 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		// 1.
//		int[] num_list1 = {2,1,6};
//		int[] num_list2 = {5,2,1,7,5};
//		
//		int[] num1 = sol.solution(num_list1);
//		int[] num2 = sol.solution(num_list2);
//		
//		for (int i = 0; i < num1.length; i++) {
//			System.out.print(num1[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < num2.length; i++) {
//			System.out.print(num2[i]);
//		}
		
		// 2.
//		int n = 0;
//		String control = "wsdawsdassw";
//		int num3 = sol.solution(n, control);
//		System.out.println(num3);

		// 3.
//		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
//		String num5 = sol.solution(numLog);
//		System.out.println(num5);
		
		// 4.
//		int[] arr = {0, 1, 2, 3, 4};
//		int[][] queries = {{0,3},{1,2},{1,4}};
//		int[] num6 = sol.solution(arr, queries);
//		for(int i=0; i<num6.length; i++) {
//			System.out.print(num6[i]);
//		}
				
		// 5.
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};
		
		int[] num7 = sol.solution(arr, queries);
		for (int i = 0; i < num7.length; i++) {
			System.out.print(num7[i]);
		}
		
	}
}
