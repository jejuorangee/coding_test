package programmers;

// 1. 문자열 code가 주어집니다.
//code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
//mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
//mode가 0일 때
//code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
//code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
//mode가 1일 때
//code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
//code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
//문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.
//단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
//class Solution {
//    public String solution(String code) {
//        String answer = "";
//        //코드를 코드의 길이만큼 반복
//            //mode가 0이면서 코드[i]가 1이 아니고 i가 짝수면 추가
//            //mode가 1이면서 코드[i]가 1이 아니고 i가 홀수면 추가
//            //빈문자열이면 EMPTY
//        boolean mode = false;    
//        for(int i=0; i<code.length(); i++){
//            if(code.charAt(i) == '1'){
//                mode = !mode;
//            }
//            else if(mode == false && i%2 == 0){
//                answer += code.charAt(i);
//            }
//            else if(mode == true && i%2 != 0) {
//                answer += code.charAt(i);
//            }
//        }
//        if(answer.equals("")){
//            answer = "EMPTY";
//        }
//        return answer;
//    }
//}

// 2. 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 
// 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
// 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int solution(int a, int d, boolean[] included) {
//        int answer = 0;
//        // included 배열을 순회하면서 true인 인덱스에 해당하는 항을 더함
//        for (int i = 0; i < included.length; i++) {
//            if (included[i]) {  // included[i]가 true일 때
//                answer += a + i * d;  // 해당 항을 더함
//            }
//        }
//        return answer;
//    }
//}

// 3. 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
//세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
//세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
//세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
//세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int solution(int a, int b, int c) {
//        int answer = 0;
//        // 세 숫자가 모두 같은 경우
//        if (a == b && b == c) {
//            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
//        }
//        // 두 숫자가 같은 경우
//        else if (a == b || b == c || a == c) {
//            answer = (a + b + c) * (a * a + b * b + c * c);
//        }
//        // 세 숫자가 모두 다른 경우
//        else {
//            answer = a+b+c;    
//        }
//        return answer;
//    }
//}

// 4. 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int solution(int[] num_list) {
//        int answer = 0;
//        int c = 0;
//        int b = 1;
//        for(int i=0; i<num_list.length; i++){
//            c += num_list[i];
//            b *= num_list[i];
//        }
//        if(c*c > b){
//            answer = 1;
//        }
//        else {
//            answer = 0;
//        }
//        return answer;
//    }
//}

// 5. 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
//class Solution {
//    public int solution(int[] num_list) {
//        int answer = 0;
//        String a = "";
//        String b = "";
//        for(int i=0; i<num_list.length; i++){
//            if(num_list[i]%2 == 0){
//                a += num_list[i];
//            }
//            else {
//                b += num_list[i];
//            }
//        }
//        answer = Integer.parseInt(a)+Integer.parseInt(b);
//        return answer;
//    }
//}

public class Day05 {
	public static void main(String[] args) {
//		Solution sol = new Solution();
		// 1.
//		String num1 = sol.solution("abc1abc1abc");
//		System.out.println(num1);
		
		// 2.
//		int a1 = 3;
//		int d1 = 4;
//		boolean[] included1 = {true, false, false, true, true};
//		
//		int a2 = 7;
//		int d2 = 1;
//		boolean[] included2 = {false, false, false, true, false, false, false};
//		
//		int num2 = sol.solution(a1, d1, included1);
//		int num3 = sol.solution(a2, d2, included2);
//		System.out.println(num2);
//		System.out.println(num3);
		
		// 3.
//		int num4 = sol.solution(2, 6, 1);
//		int num5 = sol.solution(5, 3, 3);
//		int num6 = sol.solution(4, 4, 4);
//		System.out.println(num4);
//		System.out.println(num5);
//		System.out.println(num6);
		
		// 4.
//		int[] num_list1 = {3,4,5,2,1};
//		int[] num_list2 = {5,7,8,3};
//		
//		int num7 = sol.solution(num_list1);
//		int num8 = sol.solution(num_list2);
//		System.out.println(num7);
//		System.out.println(num8);
		
		// 5.
//		int[] num_list1 = {3,4,5,2,1};
//		int[] num_list2 = {5,7,8,3};
//		
//		int num9 = sol.solution(num_list1);
//		int num10 = sol.solution(num_list2);
//		System.out.println(num9);
//		System.out.println(num10);
	}
}
