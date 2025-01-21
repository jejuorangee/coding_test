package programmers;

import java.util.ArrayList;
import java.util.List;

// 1. 정수로 이루어진 리스트 num_list가 주어집니다. 
// num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int[] solution(int[] num_list) {
//        // num_list를 오름차순으로 정렬
//        Arrays.sort(num_list);
//        
//        // 가장 작은 5개의 수를 제외하고 나머지 수들만 남김
//        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
//        
//        return answer;
//    }
//}

// 2. 0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다. 등수가 높은 3명을 선발해야 하지만, 
// 개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.
//각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance가 매개변수로 주어집니다.
//전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c를 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int solution(int[] rank, boolean[] attendance) {
//        // 참석 가능한 학생들의 (등수, 인덱스) 정보를 저장
//        List<int[]> list = new ArrayList<>();
//        
//        // 참석 가능한 학생만 필터링하여 리스트에 추가
//        for (int i = 0; i < rank.length; i++) {
//            if (attendance[i]) {
//                list.add(new int[]{rank[i], i});
//            }
//        }
//        
//        // 학생들을 등수를 기준으로 오름차순 정렬
//            // Comparator는 Java에서 객체를 비교할 때 사용되는 인터페이스로 주로 컬렉션을 정렬하는 데 활용
//            // int compare(T o1, T o2);
//        list.sort((a, b) -> Integer.compare(a[0], b[0]));
//        
//        // 상위 3명 학생의 번호를 구함
//        int a = list.get(0)[1];
//        int b = list.get(1)[1];
//        int c = list.get(2)[1];
//        
//        // 결과 계산 후 반환
//        return 10000 * a + 100 * b + c;
//    }
//}

// 3. 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int solution(double flo) {
//        return (int) flo;
//    }
//}

// 4. 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int solution(String num_str) {
//        int answer = 0;
//        for (char c : num_str.toCharArray()) {
//            answer += c - '0';  // 문자 '0'의 아스키 코드 값인 48을 빼서 숫자로 변환
//        }
//        return answer;
//    }
//}

// 5. 숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(String n_str) {
        return Integer.parseInt(n_str);
    }
}

public class Day21 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		// 1.
//		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
//		
//		System.out.println(Arrays.toString(sol.solution(num_list)));
		
		// 2.
//		int[] rank1 = {3, 7, 2, 5, 4, 6, 1};
//		boolean[] attendance1 = {false, true, true, true, true, false, false};
//		
//		int[] rank2 = {1, 2, 3};
//		boolean[] attendance2 = {true, true, true};
//		
//		int[] rank3 = {6, 1, 5, 2, 3, 4};
//		boolean[] attendance3 = {true, false, true, false, false, true};
//		
//		System.out.println(sol.solution(rank1, attendance1));
//		System.out.println(sol.solution(rank2, attendance2));
//		System.out.println(sol.solution(rank3, attendance3));
		
		// 3.
//		System.out.println(sol.solution(1.42));
//		System.out.println(sol.solution(69.32));
		
		// 4.
//		System.out.println(sol.solution("123456789"));
//		System.out.println(sol.solution("1000000"));
		
		// 5.
		System.out.println("10");
		System.out.println("8542");
	}
}
