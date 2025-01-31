package programmers;

import java.util.Arrays;

// 1. 양의 정수 n이 매개변수로 주어집니다.
// n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int[][] solution(int n) {
//        int[][] answer = new int[n][n];
//        int num = 1;
//        
//        // 초기 방향 설정: 오른쪽, 아래, 왼쪽, 위
//        int[] dx = {0, 1, 0, -1};
//        int[] dy = {1, 0, -1, 0};
//        
//        int x = 0, y = 0, direction = 0; // 초기 위치 (0, 0)에서 시작, 방향은 오른쪽
//        while (num <= n * n) {
//            answer[x][y] = num++; // 현재 위치에 숫자 배치
//            int nextX = x + dx[direction];
//            int nextY = y + dy[direction];
//            
//            // 배열의 경계를 벗어나거나 이미 값이 채워진 곳으로 가려하면 방향을 바꿔줌
//            if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= n || answer[nextX][nextY] != 0) {
//                // 방향을 시계방향으로 변경
//                direction = (direction + 1) % 4;
//                nextX = x + dx[direction];
//                nextY = y + dy[direction];
//            }
//            
//            x = nextX;
//            y = nextY;
//        }
//        
//        return answer;
//    }
//}

// 2. n × n 크기의 이차원 배열 arr이 매개변수로 주어질 때, arr이 다음을 만족하면 1을 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int solution(int[][] arr) {
//       int n = arr.length;  // 배열의 크기 n x n
//        
//        // 대칭행렬인지 확인
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] != arr[j][i]) {
//                    return 0;  // 대칭이 아니라면 0을 반환
//                }
//            }
//        }
//        
//        return 1;  // 모든 요소가 대칭이라면 1을 반환
//    }
//}

// 3. 이차원 정수 배열 arr이 매개변수로 주어집니다. 
// arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고, 
// 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.
//class Solution {
//    public int[][] solution(int[][] arr) {
//        int rows = arr.length;        // 행의 수
//        int cols = arr[0].length;     // 열의 수
//        
//        // 행의 수가 열의 수보다 많다면 열을 맞추기 위해 각 행에 0을 추가
//        if (rows > cols) {
//            for (int i = 0; i < rows; i++) {
//                // 각 행의 끝에 0을 추가
//                int[] newRow = new int[rows]; // 열 수를 행의 수로 맞춤
//                System.arraycopy(arr[i], 0, newRow, 0, cols);  // 기존 값 복사
//                arr[i] = newRow;  // 새 행으로 교체
//            }
//        } 
//        // 열의 수가 행의 수보다 많다면 행을 맞추기 위해 각 열에 0을 추가
//        else if (cols > rows) {
//            // 행을 추가하여 열의 수를 맞춤
//            int[][] newArr = new int[cols][cols]; // 열의 수로 행의 수 맞춤
//            for (int i = 0; i < rows; i++) {
//                System.arraycopy(arr[i], 0, newArr[i], 0, cols);  // 기존 값 복사
//            }
//            // 나머지 행은 0으로 채워짐
//            arr = newArr;
//        }
//
//        return arr;
//    }
//}

// 4. 2차원 정수 배열 board와 정수 k가 주어집니다.
// i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution 함수를 완성해 주세요.
class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;  // 결과를 저장할 변수
        
        // 모든 (i, j)에 대해 확인
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    sum += board[i][j];  // 조건을 만족하면 합산
                }
            }
        }
        
        return sum;
    }
}

public class Day25 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		// 1.
//		System.out.println(Arrays.deepToString(sol.solution(4)));
//		System.out.println(Arrays.deepToString(sol.solution(5)));
		
		// 2.
//		int[][] arr1 = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
//		int[][] arr2 = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
//		
//		System.out.println(sol.solution(arr1));
//		System.out.println(sol.solution(arr2));
		
//		int[][] arr1 = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
//		int[][] arr2 = {{57, 192, 534, 2}, {9, 345, 192, 999}};
//		int[][] arr3 = {{1, 2}, {3, 4}};
//		
//		System.out.println(Arrays.deepToString(sol.solution(arr1)));
//		System.out.println(Arrays.deepToString(sol.solution(arr2)));
//		System.out.println(Arrays.deepToString(sol.solution(arr3)));
		
		// 4.
		int[][] arr = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
		
		System.out.println(sol.solution(arr, 2));
		
		
	}
}
