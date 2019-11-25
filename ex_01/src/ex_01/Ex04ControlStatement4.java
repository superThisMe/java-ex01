package ex_01;

public class Ex04ControlStatement4 {

	public static void main(String[] args) {

		// 1. 정수 3개 입력 (정수)
		// 2. 입력된 정수의 합과 평균 계산 (합 : 정수, 평균 : 실수)
		// 3. 등급 계산 (평균 기준)
		// 90 ~ 100 : A, 80 ~ 89 : B, 70 ~ 79 :C.....
		// 4. 출력: 형식 -> [총점 : 100][평균 : 40점][등급 : A]

		java.util.Scanner sc = new java.util.Scanner(System.in);

//		System.out.println("첫번째 숫자를 입력하세요.");
//		int num1 = sc.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.");
//		int num2 = sc.nextInt();
//		System.out.println("세번째 숫자를 입력하세요.");
//		int num3 = sc.nextInt();
//		
//		int sum = num1 + num2 + num3;
//		double avg = (double) sum / 3;
//		String grd;
//		if (avg >= 90) {
//			grd = "A";
//		} else if (avg >= 80) {
//			grd = "B";
//		} else if (avg >= 70) {
//			grd = "C";
//		} else if (avg >= 60) {
//			grd = "D";
//		} else {
//			grd = "F";
//		}
//
//		System.out.printf("[총점 : %d][평균 : %.2f][등급 : %s]", sum, avg, grd);

		// for문과 Array를 이용해서 만들기
		int[] scores = new int[3];
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i+1 + "번째 숫자를 입력하세요.");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}

		double avg = (double) sum / 3;
		String grd;
		if (avg >= 90) {
			grd = "A";
		} else if (avg >= 80) {
			grd = "B";
		} else if (avg >= 70) {
			grd = "C";
		} else if (avg >= 60) {
			grd = "D";
		} else {
			grd = "F";
		}

		System.out.printf("[총점 : %d][평균 : %.2f][등급 : %s]", sum, avg, grd);

		sc.close();
	}

}