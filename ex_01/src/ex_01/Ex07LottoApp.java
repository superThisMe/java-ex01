package ex_01;

import java.util.*;

public class Ex07LottoApp {

	static java.util.Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

//		String menuNum = selectMenu();
//		System.out.println(menuNum);

		String menuNum = "";
		while (menuNum.equals("9") != true) { // 9가 아니라면
			menuNum = selectMenu();
			switch (menuNum) {
			case "1":
				getLotto();
				break;
			case "9":
				System.out.println("행운을 빕니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("지원하지 않는 명령입니다.");
				break;
			}

		}

	}

	// 작업 1
	static String selectMenu() {
		System.out.println();
		System.out.println("******************************");
		System.out.println("* 1. 당첨 예상 번호 뽑기");
		System.out.println("* 9. 종료");
		System.out.println("******************************");
		System.out.println("작업 정호를 입력하세요 : ");
		// 작업 2
		String menuNum = sc.nextLine();
		return menuNum;

	}

	static void getLotto() {
		int[] nums = new int[6];
		double avr = 0.0;
		int count = 0;
		boolean bl = true;
		while (bl) {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (nums[i] == nums[j]) {
						i--;
						break;
					}
				}
			}
			int sum = 0;
			count++;
			for (int k = 0; k < nums.length; k++) {
				sum += nums[k];
			}
			avr = (double) sum / 6;

			if (avr >= 20 && avr <= 26) {
				Arrays.sort(nums);
				System.out.println("선택된 번호는 : ");
				for (int l = 0; l < nums.length; l++) {
					System.out.printf("[%d]", nums[l]);
				}
				System.out.println();
				System.out.printf("[합계 : %d]\n", sum);
				System.out.printf("[평균 : %.4s]\n", avr);
				System.out.printf("[카운터 : %d]\n", count);
				bl = false;
			}
		}

	}

}

//작업 1. 다음과 같이 출력하는 함수(selectMenu)를 만드세요
//
//  ***************************
//	* 1. 당첨 예상번호 뽑기
//	* 9. 종료
//  ***************************
//	원하는 작업 번호를 입력하세요 : 

//작업 2. selectMenu 함수에서 작업 번호를 문자열 형식으로 입력받고 
//      입력된 번호를 문자열로 반환하도록 함수를 수정하세요