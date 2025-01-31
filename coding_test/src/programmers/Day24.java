package programmers;

import java.util.Arrays;

// 1. 팀의 막내인 철수는 아메리카노와 카페 라테만 판매하는 카페에서 팀원들의 커피를 사려고 합니다. 
// 아메리카노와 카페 라테의 가격은 차가운 것과 뜨거운 것 상관없이 각각 4500, 5000원입니다. 
// 각 팀원에게 마실 메뉴를 적어달라고 하였고, 그 중에서 메뉴만 적은 팀원의 것은 차가운 것으로 통일하고 "아무거나"를 적은 팀원의 것은 차가운 아메리카노로 통일하기로 하였습니다.
// 각 직원이 적은 메뉴가 문자열 배열 order로 주어질 때,
// 카페에서 결제하게 될 금액을 return 하는 solution 함수를 작성해주세요. order의 원소는 아래의 것들만 들어오고, 각각의 의미는 다음과 같습니다.
//class Solution {
//    public int solution(String[] order) {
//        int answer = 0;
//        
//         for (String menu : order) {
//            if (menu.equals("anything")) {
//                answer += 4500; // "anything"은 차가운 아메리카노
//            } else if (menu.equals("iceamericano") || menu.equals("americanoice")) {
//                answer += 4500; // 차가운 아메리카노
//            } else if (menu.equals("hotamericano") || menu.equals("americanohot")) {
//                answer += 4500; // 뜨거운 아메리카노
//            } else if (menu.equals("icecafelatte") || menu.equals("cafelatteice")) {
//                answer += 5000; // 차가운 카페 라테
//            } else if (menu.equals("hotcafelatte") || menu.equals("cafelattehot")) {
//                answer += 5000; // 뜨거운 카페 라테
//            } else if (menu.equals("americano")) {
//                answer += 4500; // 아메리카노
//            } else if (menu.equals("cafelatte")) {
//                answer += 5000; // 카페 라테
//            }
//        }
//        
//        return answer;
//    }
//}

// 2. 직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다. 
// 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때, 
// 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public String[] solution(String[] picture, int k) {
//        String[] answer = new String[picture.length * k];
//        
//        // 각 행을 k배 확장
//        for (int i = 0; i < picture.length; i++) {
//            String expandedRow = "";
//            // 각 문자를 k배로 확장
//            for (char c : picture[i].toCharArray()) {
//                expandedRow += String.valueOf(c).repeat(k);  // 각 문자 k번 반복
//            }
//            // 확장된 행을 k번 반복해서 result에 저장
//            for (int j = 0; j < k; j++) {
//                answer[i * k + j] = expandedRow;  // i * k + j는 각 확장된 행의 인덱스
//            }
//        }
//        
//        return answer;
//    }
//}

// 3. 정수 배열 arr와 자연수 k가 주어집니다.
// 만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
// 이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public int[] solution(int[] arr, int k) {
//        int[] answer = new int[arr.length];
//        
//        if (k % 2 == 1) {  // k가 홀수라면
//            for (int i = 0; i < arr.length; i++) {
//                answer[i] = arr[i] * k;
//            }
//        } else {  // k가 짝수라면
//            for (int i = 0; i < arr.length; i++) {
//                answer[i] = arr[i] + k;
//            }
//        }
//        
//        return answer;
//    }
//}

// 4. 알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
// 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
//class Solution {
//    public String solution(String myString) {
//        StringBuilder answer = new StringBuilder();
//        
//        for (char c : myString.toCharArray()) {
//            if (c < 'l') {
//                answer.append('l');  // 'l'보다 작은 문자는 'l'로 변경
//            } else {
//                answer.append(c);  // 'l' 이상인 문자는 그대로 추가
//            }
//        }
//        
//        return answer.toString();
//    }
//}

// 5. 정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
// arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.
//class Solution {
//    public int[][] solution(int n) {
//         // n × n 크기의 배열을 생성
//        int[][] answer = new int[n][n];
//        
//        // 이차원 배열을 순회하면서 주대각선에 1을 할당
//        for (int i = 0; i < n; i++) {
//            answer[i][i] = 1;  // 주대각선에 1 할당
//        }
//        
//        return answer;
//    }
//    public static void printMatrix(int[][] matrix) {
//    	for (int[] row : matrix) {
//    		for (int value : row) {
//    			System.out.print(value + " ");
//    		}
//    		System.out.println();
//    	}
//    }
//}

public class Day24 {
	public static void main(String[] args) {
//		Solution sol = new Solution();
		
		// 1.
//		String[] order1 = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
//		String[] order2 = {"americanoice", "americano", "iceamericano"};
//		
//		System.out.println(sol.solution(order1));
//		System.out.println(sol.solution(order2));
		
		// 2.
//		String[] picture1 = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
//		String[] picture2 = {"x.x", ".x.", "x.x"};
//		
//		for(String s:sol.solution(picture1, 2)) {
//			//System.out.println(Arrays.toString(sol.solution(picture1, 2)));
//			System.out.println(s);
//		}
//		for(String s:sol.solution(picture1, 2)) {
//			//System.out.println(Arrays.toString(sol.solution(picture2, 3)));
//			System.out.println(s);
//		}
		
		// 3.
//		int[] arr1 = {1, 2, 3, 100, 99, 98};
//		int[] arr2 = {1, 2, 3, 100, 99, 98};
//		
//		System.out.println(Arrays.toString(sol.solution(arr1, 3)));
//		System.out.println(Arrays.toString(sol.solution(arr2, 2)));
		
		// 4.
//		System.out.println(sol.solution("abcdevwxyz"));
//		System.out.println(sol.solution("jjnnllkkmm"));
		
		// 5.
//		sol.printMatrix(sol.solution(3));
//		System.out.println();
//		sol.printMatrix(sol.solution(6));
//		System.out.println();
//		sol.printMatrix(sol.solution(1));
	}
}
