package ex_01;

public class Ex04ControlStatement8 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

//		int n1 = 0, n2 = 0, total = 0, mean = 0;
//		String yn = "y";
//
//		n1 = (int) (Math.random() * 100) + 50;
//		n2 = (int) (Math.random() * 100) + 50;
//		total = n1 + n2;
//		mean = total / 2;
//		System.out.printf("[TOTAL : %d][MEAN : %d]\n", total, mean);

		//1. while 연습
//		while (yn.equals("y")) {
//		while (yn.equals("y") || yn.equals("Y")) {
//		while (yn.equalsIgnoreCase("y")) {	// 대소문자 구분x 비교
//		while (yn.toLowerCase().equals("y")) {	// 변수 yn을 소문자로 변경한 뒤 비교
//			n1 = (int) (Math.random() * 100) + 50;
//			n2 = (int) (Math.random() * 100) + 50;
//			total = n1 + n2;
//			mean = total / 2;
//			System.out.printf("[TOTAL : %d][MEAN : %d]\n", total, mean);
//			System.out.println("계속할까요? (y/n) : ");
//			yn = sc.nextLine();
//		}
//		System.out.println("프로그램이 종료됩니다.");
		
		//2. do while 연습
		// 1번의 조건
		// 두 숫자는 각각 100을 넘어서는 안 됨(다시 입력)
//		while (yn.toLowerCase().equals("y")) {
//			do {
//			n1 = (int) (Math.random() * 100) + 50;
//			} while (n1 > 100);
//			do {
//			n2 = (int) (Math.random() * 100) + 50;
//			} while (n2 > 100);
//			total = n1 + n2;
//			mean = total / 2;
//			System.out.printf("[%d,%d][TOTAL : %d][MEAN : %d]\n", n1, n2, total, mean);
//			System.out.println("계속할까요? (y/n) : ");
//			yn = sc.nextLine();
//		}
//	System.out.println("프로그램이 종료됩니다.");		
				
		//3. for 연습
		// 구구단 5단 출력
		
//		for (int i = 1; i < 10; i++) {
////			System.out.println("5" + "*" + i +"=" + (i*5));
//			System.out.printf("5 x %d = %2d\n", i, (i*5));
//		}
		
		//4. for 연습
		// 구구단 전체 출력
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.printf("%d x %d = %2d| ", i, j, (i*j));
			}
			System.out.println();
		}
		sc.close();
	}
}