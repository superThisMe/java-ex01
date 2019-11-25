package ex_01;

public class Ex07SimpleGame {

	static java.util.Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		// 가위(1) 바위(2) 보(3) 게임
		// 1. 컴퓨터의 선택 - Random (1 or 2 or 3)
		// 2. 사용자 입력 (1 or 2 or 3)
		// 3. 비교
		// 4. 결과 출력
		// 5. 메뉴를 통해서 반복
		String menuNum = "";
//		while (menuNum.equals("9") == false) {
		while (true) {
			menuNum = selectMenu();
			switch (menuNum) {
			case "1":
				int com = (int) (Math.random() * 3) + 1;
				System.out.println("가위(1) or 바위(2) or 보(3) : ");
				int pl = sc.nextInt(); // enter는 buffer에 남겨진
//				sc.nextLine(); // enter 제거(nextLine()으로 입력을 받으려면)
				int result = getResult(com, pl);
				String comPrint = getPrint(com);
				String plPrint = getPrint(pl);
				showResult(comPrint, plPrint, result);
				break;
			case "9":
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("선택 오류");
				break;
			}

		}

	}

	static String selectMenu() {
		System.out.println();
		System.out.println("******************************");
		System.out.println("* 1. 게임하기");
		System.out.println("* 9. 종료");
		System.out.println("******************************");
		System.out.println("작업 번호 : ");

		String menuNum = sc.next();
		System.out.println();
		return menuNum;
	}

	static void showResult(String comPrint, String plPrint, int result) {
		System.out.printf("[COM : %s][PLAYER : %s] --> ", comPrint, plPrint);
		switch (result) {
		case 0:
			System.out.println("YOU LOSE !!!");
			break;
		case 1:
			System.out.println("YOU WIN !!!");
			break;
		case 2:
			System.out.println("DRAW !!!");
			break;
		}
	}

	static int getResult(int com, int pl) {
		int result = 0; // 0: lose, 1: win, 2: draw
		if (pl == 1 && com == 3 || pl == 2 && com == 1 || pl == 3 && com == 2) {
			result = 1;
		} else if (pl == com) {
			result = 2;
		}
		return result;
	}

	static String getPrint(int x) {
		String print = "";
		switch (x) {
		case 1:
			print = "가위";
			break;
		case 2:
			print = "바위";
			break;
		case 3:
			print = "보";
			break;
		}
		return print;
	}

}
