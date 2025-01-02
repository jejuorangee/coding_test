package programmers;

import java.util.Arrays;

// 1. boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
//(x1 ∨ x2) ∧ (x3 ∨ x4)
//class Solution {
//    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
//         return (x1 || x2) && (x3 || x4);
//    }
//}

// 2. 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
//네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
//주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
//네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
//네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//	public int solution(int a, int b, int c, int d) {
//		int[] dice = {a, b, c, d};
//		Arrays.sort(dice);  // 주사위 값을 정렬하여 처리하기 쉽게 만듭니다.
//
//		// 1. 네 주사위가 모두 같으면 1111 * p
//		if (dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[3]) {
//			return 1111 * dice[0];
//		}
//
//		// 2. 세 주사위가 같고 나머지 하나가 다르면 (10 * p + q)²
//		if (dice[0] == dice[1] && dice[1] == dice[2]) {
//			return (10 * dice[0] + dice[3]) * (10 * dice[0] + dice[3]);
//		}
//		if (dice[1] == dice[2] && dice[2] == dice[3]) {
//			return (10 * dice[3] + dice[0]) * (10 * dice[3] + dice[0]);
//		}
//
//		// 3. 두 개씩 같은 값이 나오면 (p + q) * |p - q|
//		if (dice[0] == dice[1] && dice[2] == dice[3]) {
//			return (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
//		}
//
//		// 4. 두 주사위가 같고 나머지 두 주사위가 각각 q, r일 경우 q * r
//		if (dice[0] == dice[1]) {
//			return dice[2] * dice[3];
//		}
//		if (dice[1] == dice[2]) {
//			return dice[0] * dice[3];
//		}
//		if (dice[2] == dice[3]) {
//			return dice[0] * dice[1];
//		}
//
//		// 5. 모두 다른 숫자일 경우, 가장 작은 숫자만큼 점수
//		return dice[0];
//	}
//}

// 3. 문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다. my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String solution(String my_string, int[] index_list) {
//        String answer = "";
//        for(int i=0; i<index_list.length; i++){
//            answer += my_string.charAt(index_list[i]);
//        }
//        return answer;
//    }
//}

// 4. 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
//이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
//class Solution {
//    public int solution(String number) {
//        int answer = 0;
//        for (int i = 0; i < number.length(); i++) {
//            answer += number.charAt(i) - '0';
//        }
//        return answer % 9;
//    }
//}

// 5. 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 [s, e] 형태로,
//my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);

        // 각 쿼리에 대해 해당 부분 문자열을 뒤집기
        for (int[] query : queries) {
            int s = query[0];  // 시작 인덱스
            int e = query[1];  // 끝 인덱스
            
            // 해당 범위의 부분 문자열을 뒤집기
            while (s < e) {
                // 인덱스 s와 e 문자를 교환
                char temp = answer.charAt(s);
                answer.setCharAt(s, answer.charAt(e));
                answer.setCharAt(e, temp);
                
                s++;
                e--;
            }
        }
        return answer.toString();
    }
}

public class Day08 {
	public static void main(String[] args) {
		Solution sol = new Solution();

		// 1.
//      System.out.println(sol.solution(false, true, true, true));  // true
//      System.out.println(sol.solution(true, false, false, false));  // false

		// 2.
//		System.out.println(sol.solution(2, 2, 2, 2));  // 2222
//		System.out.println(sol.solution(4, 1, 4, 4));  // 1681
//		System.out.println(sol.solution(6, 3, 3, 6));  // 27
//		System.out.println(sol.solution(2, 5, 2, 6));  // 30
//		System.out.println(sol.solution(6, 4, 2, 5));  // 2
		
		// 3.
//		int[] index_list1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
//		int[] index_list2 = {1, 2, 0, 0, 3};
//		System.out.println(sol.solution("cvsgiorszzzmrpaqpe", index_list1));
//		System.out.println(sol.solution("zpiaz", index_list2));
		
		// 4.
//		System.out.println(sol.solution("123"));  // 출력: 6
//	    System.out.println(sol.solution("78720646226947352489"));
		
		// 5.
		String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(sol.solution(my_string, queries));  // "programmers"

	}
}
