package programmers;

import java.util.Scanner;

public class Day01 {
	public static void main(String[] args) {
		// 1. 문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		System.out.print(a);
		
		// 2. 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
//		int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);
		
		// 3. 문자열 str과 정수 n이 주어집니다.
		// 	str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
//		String str = sc.next();
//		int n = sc.nextInt();
//    
//		for(int i=0; i < n; i++){
//			System.out.print(str);
//		}
		
		// 4. 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
//		String a = sc.next();
//        
//        StringBuilder changeLowOrupper = new StringBuilder();
//        for (int i = 0; i < a.length(); i++) {
//            char c = a.charAt(i); // i번째 문자가
//            if (Character.isUpperCase(c)) { // 대문자라면
//            	//소문자로 이어 붙이기
//            	changeLowOrupper.append(Character.toLowerCase(c));
//            } else { // 아니면
//            	// 대문자로 이어 붙이기
//            	changeLowOrupper.append(Character.toUpperCase(c));
//            }
//        }
//        System.out.print(changeLowOrupper);
		
		// 5. 다음과 같이 출력하도록 코드를 작성해 주세요.
		// 출력 예 - !@#$%^&*(\'"<>?:;
		
		// 이스케이프 문자 활용
		// 특별한 의미를 가진 문자를 일반 문자로 취급하거나, 일반 문자로는 표현할 수 없는 문자를 표현하기 위해 사용
		System.out.print("!@#$%^&*(\\'\"<>?:;");
	}	
}
