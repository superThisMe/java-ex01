package ex_01;

public class Ex06Method2 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.printf("박스 그리기에 사용할 문자 : ");
		String s = sc.nextLine();

		System.out.printf("박스의 너비 : ");
		int a = sc.nextInt();
		System.out.printf("박스의 높이 : ");
		int b = sc.nextInt();		
		
		drawSqr(a, b, s);

		sc.close();

	}

	static void drawSqr(int x, int y, String z) {
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (i == 0 || i == y - 1 || j == 0 || j == x - 1) {
					System.out.printf(" %s", z);
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}