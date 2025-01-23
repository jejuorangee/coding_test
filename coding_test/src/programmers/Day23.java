package programmers;

// 1. 어떤 문자열 A가 다른 문자열 B안에 속하면 A를 B의 부분 문자열이라고 합니다. 예를 들어 문자열 "abc"는 문자열 "aabcc"의 부분 문자열입니다.
// 문자열 str1과 str2가 주어질 때, str1이 str2의 부분 문자열이라면 1을 부분 문자열이 아니라면 0을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int solution(String str1, String str2) {
//        if (str2.contains(str1)) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
//}

// 2. 문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열이라고 합니다.
// 꼬리 문자열을 만들 때 특정 문자열을 포함한 문자열은 제외시키려고 합니다. 예를 들어 문자열 리스트 ["abc", "def", "ghi"]가 있고 문자열 "ef"를 포함한 문자열은 제외하고 꼬리 문자열을 만들면 "abcghi"가 됩니다.
// 문자열 리스트 str_list와 제외하려는 문자열 ex가 주어질 때, str_list에서 ex를 포함한 문자열을 제외하고 만든 꼬리 문자열을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public String solution(String[] str_list, String ex) {
//        StringBuilder result = new StringBuilder();
//        
//        // str_list의 각 문자열에 대해 처리
//        for (String str : str_list) {
//            // 해당 문자열에 ex가 포함되지 않으면 결과에 추가
//            if (!str.contains(ex)) {
//                result.append(str);
//            }
//        }
//        
//        // StringBuilder 객체를 String으로 반환
//        return result.toString();
//    }
//}

// 3. 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int solution(int[] num_list, int n) {
//        for (int num : num_list) {
//            if (num == n) {
//                return 1; // n이 num_list에 존재하면 1 반환
//            }
//        }
//        // n이 num_list에 없으면 0 반환
//        return 0;
//    }
//}

// 4. 1부터 6까지 숫자가 적힌 주사위가 두 개 있습니다. 두 주사위를 굴렸을 때 나온 숫자를 각각 a, b라고 했을 때 얻는 점수는 다음과 같습니다.
//a와 b가 모두 홀수라면 a2 + b2 점을 얻습니다.
//a와 b 중 하나만 홀수라면 2 × (a + b) 점을 얻습니다.
//a와 b 모두 홀수가 아니라면 |a - b| 점을 얻습니다.
//두 정수 a와 b가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int solution(int a, int b) {
//        // a와 b가 모두 홀수인 경우
//        if (a % 2 != 0 && b % 2 != 0) {
//            return (a * a) + (b * b);
//        }
//        // a와 b 중 하나만 홀수인 경우
//        else if (a % 2 != 0 || b % 2 != 0) {
//            return 2 * (a + b);
//        }
//        // a와 b 모두 짝수인 경우
//        else {
//            return Math.abs(a - b);
//        }
//    }
//}

// 5. 정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
// 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
class Solution {
    public int solution(int[] date1, int[] date2) {
         // year 비교
        if (date1[0] < date2[0]) {
            return 1;
        } else if (date1[0] > date2[0]) {
            return 0;
        }
        
        // year가 같으면 month 비교
        if (date1[1] < date2[1]) {
            return 1;
        } else if (date1[1] > date2[1]) {
            return 0;
        }
        
        // year와 month가 같으면 day 비교
        if (date1[2] < date2[2]) {
            return 1;
        }
        
        // 모든 비교가 같다면 date1은 date2와 같거나 뒤에 있음
        return 0;
    }
}

public class Day23 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		// 1.
//		System.out.println(sol.solution("abc", "aabcc"));
//		System.out.println(sol.solution("tbt", "tbbttb"));
		
		// 2.
//		String[] str_list1 = {"abc", "def", "ghi"};
//		String[] str_list2 = {"abc", "bbc", "cbc"};
//		
//		System.out.println(sol.solution(str_list1, "ef"));
//		System.out.println(sol.solution(str_list2, "c"));
		
		// 3.
//		int[] num_list1 = {1, 2, 3, 4, 5};
//		int[] num_list2 = {15, 98, 23, 2, 15};
//		
//		System.out.println(sol.solution(num_list1, 3));
//		System.out.println(sol.solution(num_list2, 20));
	
		// 4.
//		System.out.println(sol.solution(3, 5));
//		System.out.println(sol.solution(6, 1));
//		System.out.println(sol.solution(2, 4));
		
		// 5.
		int[] date1_1 = {2021, 12, 28};
		int[] date1_2 = {1024, 10, 24};
		
		int[] date2_1 = {2021, 12, 29};
		int[] date2_2 = {1024, 10, 24};
		
		System.out.println(sol.solution(date1_1, date2_1));
		System.out.println(sol.solution(date2_1, date2_2));
	}
}
