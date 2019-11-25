package ex_01;

public class Ex04ControlStatement7 {

	public static void main(String[] args) {
		// 난수 발생기(0~1, double)
//		double d = Math.random();
//		d = d * 10 + 10;
//		int n = (int) d;
//
//		//while statement
//		int x = 0;
//		while (x < n) {
//			System.out.printf("%d번째 데이터\n", (x + 1));
//			x++;
//		}

		// 무한루프
//		double d = Math.random();
//		d = d * 10 + 10;
//		int n = (int) d;
//
//		int x = 0;
//		while (true) {
//			System.out.printf("%d번째 데이터\n", (x + 1));
//			x++;
//
//			// 중첩 if문으로 중단조건 추가하는 법
//			if (x >= n) {
//				break;
//			}
//		}

		// 조건을 추가한 반복문
//		double d = Math.random();
//		d = d * 10 + 10;
//		int n = (int) d;
//
//		int x = 0;
//		while (x < n) {
//
//			x++;
//			// 홀수만 출력하기 위한 조건
//			if (x % 2 == 0) {
//				continue;
//			}
//
//			System.out.printf("%d번째 데이터\n", x);
//		}

		// do while statement: do{}을 최소한 1번은 실행하고 싶을때
//		double d = Math.random();
//		d = d * 10 + 10;
//		int n = (int) d;
//
//		int x = 0;
//		do {
//			System.out.printf("%d번째 데이터\n", (x + 1));
//			x++;
//		} while (x < n);

		// for statement

//		for (int idx = 0; idx < 10; idx++) {
		for (int idx = 0; idx < 10; idx += 2) {
			System.out.println(idx);
		}
	}
}