package programmers;

import java.util.Arrays;

// 1. 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
//n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
//n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
//n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
//n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
//올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public List<Integer> solution(int n, int[] slicer, int[] numList) {
//        List<Integer> answer = new ArrayList<>();
//        
//        int a = slicer[0];
//        int b = slicer[1];
//        int c = slicer[2];
//        
//        // 배열을 List로 변환
//        List<Integer> numListAsList = new ArrayList<>();
//        for (int num : numList) {
//            numListAsList.add(num);
//        }
//        
//        // subList() : 원본 리스트의 지정된 범위에 해당하는 부분 리스트를 반환
//        // subList(int fromIndex, int toIndex)
//        // fromIndex부터 toIndex - 1까지
//        
//        if (n == 1) {
//            // n = 1: numList의 0번 인덱스부터 b번 인덱스까지
//            answer = numListAsList.subList(0, b + 1);
//        } else if (n == 2) {
//            // n = 2: numList의 a번 인덱스부터 끝까지
//            answer = numListAsList.subList(a, numListAsList.size());
//        } else if (n == 3) {
//            // n = 3: numList의 a번 인덱스부터 b번 인덱스까지
//            answer = numListAsList.subList(a, b + 1);
//        } else if (n == 4) {
//            // n = 4: numList의 a번 인덱스부터 b번 인덱스까지 c 간격으로
//            for (int i = a; i <= b; i += c) {
//                answer.add(numListAsList.get(i));
//            }
//        }
//        
//        return answer;
//    }
//}

// 2. 정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.
//class Solution {
//    public int solution(int[] num_list) {
//       for (int i = 0; i < num_list.length; i++) {
//            if (num_list[i] < 0) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}

// 3. 정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다.
//intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간입니다. 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.
//이때 배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 만들어 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public int[] solution(int[] arr, int[][] intervals) {
//        // 첫 번째 구간 추출
//        int start1 = intervals[0][0];
//        int end1 = intervals[0][1];
//        
//        // 두 번째 구간 추출
//        int start2 = intervals[1][0];
//        int end2 = intervals[1][1];
//        
//        // 배열 복사 메서드
//        // System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//        // src: 복사할 원본 배열
//        // srcPos: 원본 배열에서 복사를 시작할 위치(인덱스)
//        // dest: 복사한 데이터를 저장할 대상 배열
//        // destPos: 대상 배열에 데이터를 저장할 시작 위치(인덱스)
//        // length: 복사할 배열의 길이(복사할 요소의 개수)
//        
//        // 첫 번째 구간을 arr의 일부로 추출
//        int[] part1 = new int[end1 - start1 + 1];
//        System.arraycopy(arr, start1, part1, 0, end1 - start1 + 1);
//        
//        // 두 번째 구간을 arr의 일부로 추출
//        int[] part2 = new int[end2 - start2 + 1];
//        System.arraycopy(arr, start2, part2, 0, end2 - start2 + 1);
//        
//        // 두 구간을 합친 새로운 배열 생성
//        int[] answer = new int[part1.length + part2.length];
//        System.arraycopy(part1, 0, answer, 0, part1.length);
//        System.arraycopy(part2, 0, answer, part1.length, part2.length);
//        
//        return answer;
//    }
//}

// 4. 정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
//단, arr에 2가 없는 경우 [-1]을 return 합니다.
//class Solution {
//    public int[] solution(int[] arr) {
//        int firstIndex = -1;  // 첫 번째 2의 인덱스를 저장
//        int secondIndex = -1; // 두 번째 2의 인덱스를 저장
//        
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 2) {
//                if (firstIndex == -1) {
//                    firstIndex = i; // 첫 번째 2의 위치 저장
//                } else {
//                    secondIndex = i; // 두 번째 2의 위치 저장
//                }
//            }
//        }
//        
//        // 2가 없으면 [-1]을 반환
//        if (firstIndex == -1) {
//            return new int[]{-1};
//        }
//        
//        // 2가 하나만 있으면 [2]를 반환
//        if (secondIndex == -1) {
//            return new int[]{2};
//        }
//
//        // 마지막 2를 찾기 위한 처리
//        int lastIndex = secondIndex;
//        for (int i = secondIndex + 1; i < arr.length; i++) {
//            if (arr[i] == 2) {
//                lastIndex = i; // 마지막 2의 위치 업데이트
//            }
//        }
//
//        // 첫 번째 2부터 마지막 2까지 포함하는 부분 배열을 반환
//        int[] result = new int[lastIndex - firstIndex + 1];
//        System.arraycopy(arr, firstIndex, result, 0, result.length);
//        return result;
//    }
//}

// 5. 정수 배열 arr와 query가 주어집니다.
//query를 순회하면서 다음 작업을 반복합니다.
//짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
//홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
//위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public int[] solution(int[] arr, int[] query) {
//        // copyOfRange(int[] original, int from, int to)
//        // original: 복사할 원본 배열
//        // from: 복사를 시작할 인덱스(포함o)
//        // to: 복사를 끝낼 인덱스(포함x)
//        
//        for (int i = 0; i < query.length; i++) {
//            int q = query[i];
//            if (i % 2 == 0) {  // 짝수 인덱스
//                arr = Arrays.copyOfRange(arr, 0, q + 1);  // arr의 앞부분을 잘라냄
//            } else {  // 홀수 인덱스
//                arr = Arrays.copyOfRange(arr, q, arr.length);  // 제일 앞부분 하나만 잘라냄
//            }
//        }
//        return arr;
//    }
//}

public class Day12 {
	public static void main(String[] args) {
//		Solution sol = new Solution();
		
		// 1.
//		int[] slicer = {1, 5, 2};
//		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		
//		for(int i : sol.solution(3, slicer, num_list)) {
//			System.out.print(i);
//		}
//		System.out.println();
//		for(int j : sol.solution(4, slicer, num_list)) {
//			System.out.print(j);
//		}
		
		// 2.
//		int[] num_list1 = {12, 4, 15, 46, 38, -2, 15};
//		int[] num_list2 = {13, 22, 53, 24, 15, 6};
//		System.out.println(sol.solution(num_list1));
//		System.out.println(sol.solution(num_list2));
		
		// 3.
//		int[] arr = {1, 2, 3, 4, 5};
//		int[][] intervals = {{1, 3}, {0, 4}};
//		System.out.println(Arrays.toString(sol.solution(arr, intervals)));
		
		// 4.
//		int[] arr1 = {1, 2, 1, 4, 5, 2, 9};
//		int[] arr2 = {1, 2, 1};
//		int[] arr3 = {1, 1, 1};
//		int[] arr4 = {1, 2, 1, 2, 1, 10, 2, 1};
//		System.out.println(Arrays.toString(sol.solution(arr1)));
//		System.out.println(Arrays.toString(sol.solution(arr2)));
//		System.out.println(Arrays.toString(sol.solution(arr3)));
//		System.out.println(Arrays.toString(sol.solution(arr4)));
		
		// 5.
//		int[] arr = {0, 1, 2, 3, 4, 5};
//		int[] query = {4, 1, 2};
//		System.out.println(Arrays.toString(sol.solution(arr, query)));
	}
}
