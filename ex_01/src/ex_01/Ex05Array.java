package ex_01;

import java.util.*;

public class Ex05Array {

	public static void main(String[] args) {

		ArrayList<String> pitches = new ArrayList<String>();
		pitches.add("140");
		pitches.add("150");

		System.out.println(pitches.get(0));

		pitches.set(1, "130");

		System.out.println(pitches.get(1));

		System.out.println(pitches.size());
		
		// 1. 배열 만들기
		int[] arr = new int[10]; // int 데이터 10개를 관리하는 배열

		// 2. 배열 요소 사용
		System.out.printf("%d-%d\n", arr[0], arr[1]);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 900) + 100;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 데이터 : %d\n", i, arr[i]);
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.printf("배열의 합 : %d", sum);

		// 3. 배열 초기화
//		int x; // 선언
//		x = 10; // 대입
//		int y = 10; // 선언 + 대입 -> 초기화

		int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
//		int[] arr3 = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("%d번째 데이터 : %d\n", i, arr3[i]);
		}

		// 4. 다차원 배열
		int[][] arr4 = new int[5][7];
		for (int row = 0; row < arr4.length; row++) {
			for (int col = 0; col < arr4[row].length; col++) {
				arr4[row][col] = (int) (Math.random() * 900) + 100;
			}
		}
		for (int row = 0; row < arr4.length; row++) {
			for (int col = 0; col < arr4[row].length; col++) {
				System.out.printf("[%5d]", arr4[row][col]);
			}
			System.out.println();
		}
	}
}
