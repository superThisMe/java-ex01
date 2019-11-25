package ex_01;

public class Ex04ControlStatement5 {

	public static void main(String[] args) {

		// 1. 0 ~ 100 사이의 3개의 난수(정수)를 만들어서 변수에 저장
		// 2. 세개의 숫자 중 가장 큰 숫자를 찾아서 다른 변수에 저장
		// 3. 찾은 변수를 출력 [MAX : 78]

//		double x = Math.random();
//		int a = (int) (x * 100);
//		double y = Math.random();
//		int b = (int) (y * 100);
//		double z = Math.random();
//		int c = (int) (z * 100);
//		System.out.printf("[%s][%s][%s]\n", a, b, c);
//		if (a > b && a > c) {
//			System.out.printf("[MAX : %d]", a);
//		} else if (b > a && b > c) {
//			System.out.printf("[MAX : %d]", b);
//		} else {
//			System.out.printf("[MAX : %d]", c);
//		}

		// 1. 0 ~ 10 사이의 3개의 난수(정수)를 만들어서 변수에 저장
		// 2. 각 데이터의 중복 여부(true / false)를 변수에 저장
		// 3. 결과 출력 [중복된 데이터가 있습니다/없습니다]

		double x = Math.random();
		int a = (int) (x * 10);
		double y = Math.random();
		int b = (int) (y * 10);
		double z = Math.random();
		int c = (int) (z * 10);

		System.out.printf("[%d][%d][%d]\n", a, b, c);
		
		boolean isDup = false;
		if (a == b || b == c || c == a) {
			isDup = true;
		}
		if (isDup == true) {
			System.out.println("[중복된 데이터가 있습니다]");
		}	else {
			System.out.println("[중복된 데이터가 없습니다]");
		}
	}
}