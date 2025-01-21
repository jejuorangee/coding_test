package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 1. 정수 배열 arr이 매개변수로 주어집니다. 
// arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다. 
// arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int[] solution(int[] arr) {
//        int n = arr.length;
//        
//        // 가장 가까운 2의 거듭제곱 구하기
//        int targetLength = 1;
//        while (targetLength < n) {
//            targetLength *= 2;
//        }
//        
//        // 배열 길이를 targetLength에 맞추기 위해 0을 추가
//        int[] answer = new int[targetLength];
//        for (int i = 0; i < n; i++) {
//            answer[i] = arr[i];
//        }
//        return answer;
//    }
//}

// 2. 이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
//두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
//배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
//두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int solution(int[] arr1, int[] arr2) {
//        // 길이 비교
//        if (arr1.length > arr2.length) {
//            return 1;
//        } else if (arr1.length < arr2.length) {
//            return -1;
//        }
//        
//        // 2. 길이가 같다면 합 비교
//        int sum1 = 0;
//        int sum2 = 0;
//        
//        for (int num : arr1) {
//            sum1 += num;
//        }
//        
//        for (int num : arr2) {
//            sum2 += num;
//        }
//        
//        // 3. 합 비교
//        if (sum1 > sum2) {
//            return 1;
//        } else if (sum1 < sum2) {
//            return -1;
//        }
//        
//        // 4. 둘 다 같으면
//        return 0;
//    }
//}

// 3. 문자열 배열 strArr이 주어집니다. 
// strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public int solution(String[] strArr) {
//        Map<Integer, Integer> lengthCountMap = new HashMap<>();
//        
//        // 각 문자열의 길이를 기준으로 개수 확인
//        for (String str : strArr) {
//            int length = str.length();
//            lengthCountMap.put(length, lengthCountMap.getOrDefault(length, 0) + 1);
//        }
//        
//        // 가장 큰 그룹의 크기 찾기
//        int maxCount = 0;
//        for (int count : lengthCountMap.values()) {
//            maxCount = Math.max(maxCount, count);
//        }
//        
//        return maxCount;
//    }
//}

// 4. 정수 배열 arr과 정수 n이 매개변수로 주어집니다. 
// arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, 
// arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int[] solution(int[] arr, int n) {
//        // 배열 길이가 홀수라면
//        if (arr.length % 2 == 1) {
//            // 짝수 인덱스 위치에 n을 더함
//            for (int i = 0; i < arr.length; i += 2) {
//                arr[i] += n;
//            }
//        } else {
//            // 배열 길이가 짝수면 
//            // 홀수 인덱스 위치에 n을 더함
//            for (int i = 1; i < arr.length; i += 2) {
//                arr[i] += n;
//            }
//        }
//        return arr;
//    }
//}

// 5. 정수로 이루어진 리스트 num_list가 주어집니다. 
// num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int[] solution(int[] num_list) {
//        // num_list를 오름차순으로 정렬
//        Arrays.sort(num_list);
//        
//        // 가장 작은 5개의 수를 추출
//        return Arrays.copyOfRange(num_list, 0, 5);
//    }
//}

public class Day20 {
	public static void main(String[] args) {
//		Solution sol = new Solution();
		
		// 1.
//		int[] arr1 = {1, 2, 3, 4, 5, 6};
//		int[] arr2 = {58, 172, 746, 89};
//		
//		System.out.println(Arrays.toString(sol.solution(arr1)));
//		System.out.println(Arrays.toString(sol.solution(arr2)));
		
		// 2.
//		int[] arr1_1 = {49, 13};
//		int[] arr2_1 = {100, 17, 84, 1};
//		int[] arr3_1 = {1, 2, 3, 4, 5};
//		
//		int[] arr1_2 = {70, 11, 2};
//		int[] arr2_2 = {55, 12, 65, 36};
//		int[] arr3_2 = {3, 3, 3, 3, 3};
//		
//		System.out.println(sol.solution(arr1_1, arr1_2));
//		System.out.println(sol.solution(arr2_1, arr2_2));
//		System.out.println(sol.solution(arr3_1, arr3_2));
		
		// 3.
//		String[] strArr = {"a","bc","d","efg","hi"};
//		
//		System.out.println(sol.solution(strArr));
		
		// 4.
//		int[] arr1 = {49, 12, 100, 276, 33};
//		int[] arr2 = {444, 555, 666, 777};
//		
//		System.out.println(Arrays.toString(sol.solution(arr1, 27)));
//		System.out.println(Arrays.toString(sol.solution(arr2, 100)));
		
		// 5.
//		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
//		System.out.println(Arrays.toString(sol.solution(num_list)));
		
	}
}
