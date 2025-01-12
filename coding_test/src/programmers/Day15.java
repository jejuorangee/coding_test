package programmers;

import java.util.Arrays;

// 1. 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public int[] solution(int[] arr) {
//        int n = arr.length;
//        int[] answer = new int[n];
//        
//        for (int i = 0; i < n; i++) {
//            int value = arr[i];
//            
//            if (value >= 50 && value % 2 == 0) {
//                // 50 이상이고 짝수인 경우 2로 나눔
//                answer[i] = value / 2;
//            } else if (value < 50 && value % 2 != 0) {
//                // 50 미만이고 홀수인 경우 2를 곱함
//                answer[i] = value * 2;
//            } else {
//                // 그 외의 경우 그대로 저장
//                answer[i] = value;
//            }
//        }
//        return answer;
//    }
//}

// 2. 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.
//이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때, arr(x) = arr(x + 1)인 x가 항상 존재합니다. 이러한 x 중 가장 작은 값을 return 하는 solution 함수를 완성해 주세요.
//단, 두 배열에 대한 "="는 두 배열의 크기가 서로 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미합니다.
//class Solution {
//    public int solution(int[] arr) {
//         int[] current = arr;
//        int count = 0;
//
//        while (true) {
//            int[] next = new int[current.length];
//
//            // 배열 변형
//            for (int i = 0; i < current.length; i++) {
//                int value = current[i];
//
//                if (value >= 50 && value % 2 == 0) {
//                    next[i] = value / 2;  // 50 이상이고 짝수일 경우 2로 나눔
//                } else if (value < 50 && value % 2 != 0) {
//                    next[i] = value * 2 + 1;  // 50 미만이고 홀수일 경우 2를 곱하고 1을 더함
//                } else {
//                    next[i] = value;  // 그 외의 경우 그대로 둠
//                }
//            }
//
//            count++;
//
//            // 변형된 배열이 원래 배열과 같으면 반복 종료
//            if (Arrays.equals(current, next)) {
//                return count-1;
//            }
//
//            // 변형된 배열을 현재 배열로 설정
//            current = next;
//        }
//    }
//}

// 3. 정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다. 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.
//10 / 2 = 5
//(5 - 1) / 2 = 2
//2 / 2 = 1
//위와 같이 3번의 나누기 연산으로 1이 되었습니다.
//정수들이 담긴 리스트 num_list가 주어질 때, num_list의 모든 원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int solution(int[] num_list) {
//        int total = 0;
//
//        // 각 숫자에 대해 연산 횟수를 구하고 합산
//        for (int num : num_list) {
//            int sum = 0;
//            
//            // 숫자가 1이 될 때까지 반복
//            while (num != 1) {
//                if (num % 2 == 0) {
//                    // 짝수일 경우
//                    num /= 2;
//                } else {
//                    // 홀수일 경우
//                    num = (num - 1) / 2;
//                }
//                sum++;  // 연산 횟수 증가
//            }
//            
//            // 해당 숫자의 연산 횟수 합산
//            total += sum;
//        }
//        
//        return total;
//    }
//}

// 4. 정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int solution(int[] num_list) {
//        // 리스트의 길이가 11 이상이면 합을 반환
//        if (num_list.length >= 11) {
//            int sum = 0;
//            for (int num : num_list) {
//                sum += num;
//            }
//            return sum;
//        }
//        
//        // 리스트의 길이가 10 이하이면 곱을 반환
//        int product = 1;
//        for (int num : num_list) {
//            product *= num;
//        }
//        return product;
//    }
//}

// 5. 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
//단, 알파벳 대문자와 소문자는 구분하지 않습니다.
class Solution {
    public int solution(String myString, String pat) {
         // 대소문자 구분 없이 비교하기 위해 모두 소문자로 변환
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        // myString에 pat이 포함되어 있으면 1 그렇지 않으면 0 반환
        if (myString.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class Day15 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		// 1.
//		int[] arr = {1, 2, 3, 100, 99, 98};
//        int[] result = sol.solution(arr);
//        
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
        
        // 2.
//		int[] arr = {1, 2, 3, 100, 99, 98};
//        int result = sol.solution(arr);
//        
//        System.out.println(result);
		
		// 3.
//		int[] num_list = {12, 4, 15, 1, 14};
//        int result = sol.solution(num_list);
//        
//        System.out.println(result);
		
		// 4.
//        int[] numList1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
//        System.out.println(sol.solution(numList1));
//        
//        int[] numList2 = {2, 3, 4, 5};
//        System.out.println(sol.solution(numList2));
		
		// 5.
		System.out.println(sol.solution("AbCdEfG", "aBc"));
        System.out.println(sol.solution("aaAA", "aaaaa"));
		
	}
}
