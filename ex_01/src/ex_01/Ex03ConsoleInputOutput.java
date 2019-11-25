package ex_01;

public class Ex03ConsoleInputOutput {

	public static void main(String[] args) {

		//1. 명령프롬프트에서 사용자 입력 받기
		
		java.util.Scanner sc = new java.util.Scanner(System.in);	//입력기 만들기
		
		System.out.println("이름을 입력하세요 : ");
		String str = sc.nextLine();	//사용자 (키보드) 입력
		System.out.println(str + "을(를) 입력했습니다.");
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();	//사용자 (키보드) 입력
		System.out.println(age + "세를 입력했습니다.");
		
		//2. 명령프롬프트에서 출력
		
		System.out.print("print로 출력");
		System.out.println("println으로 출력");
		String title = "Java";
		int level = 10;
		System.out.println("[TITLE : " + title + "][LEVEL : " + level + "]");
		System.out.printf("[TITLE : %s][LEVEL : %d]\n", title, level);
		System.out.printf("[TITLE : %s][LEVEL : %d]", title, level);
		
		sc.close();	//sc(scanner) 반환
	}
	
}
