package ex_01;

public class Ex04ControlStatement9 {

	public static void main(String[] args) {

		// 1.
		System.out.println("1번");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 2.
		System.out.println("2번");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < (10 - i - 1); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 3.
		System.out.println("3번");
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 4.
		System.out.println("4번");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (10 - i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 5.
		System.out.println("5번");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if ((j > 0 && j < 10 - 1) && (i > 0 && i < 10 - 1)) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}

		// 5-2.
		System.out.println("5-2번");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if ((i == 0 || i == 10 - 1) || (j == 0 || j == 10 - 1)) {
					System.out.print(" *");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}