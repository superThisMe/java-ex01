package ex_01;

public class Ex06Method {

	public static void main(String[] args) {

		// Method 호출
		drawSqr(10, 12);

		// 영역
//		{
//			int y = 30;
//			{
//				int x = 10;
//			}
//			{
//				x = 20;	// Error - 다른 영역의 변수 사용 X
//				y = 31;	// 상위 영역의 변수는 사용 가능
//				int z = 40;
//			}
//			z = 50; // Error - 하위 영역의 변수 사용 X
//		}
	}

	// Method 정의
	public static void drawSqr(int x, int y) {
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (i == 0 || i == y - 1 || j == 0 || j == x - 1) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}