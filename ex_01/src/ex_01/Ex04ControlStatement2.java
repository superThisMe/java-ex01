package ex_01;

public class Ex04ControlStatement2 {

	public static void main(String[] args) {
		
		//계산기 만들기
		// 숫자, 연산자, 숫자를 순차적ㅇ로 입력
		// 연산자에 따라 연산
		// 출력
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = sc.nextInt();
		System.out.print("연산자: ");
		String op = sc.next();	//문자열 입력 method
		System.out.print("숫자: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
//		System.out.println(num);
//		System.out.println(op);
//		System.out.println(num2);
		
		if (op.equals("+")) {
			System.out.println(num + num2);
		}	else if (op.equals("-")) {
				System.out.println(num - num2);
			}	else if (op.equals("*")) {
				System.out.println(num * num2);
			}	else if (op.equals("/")) {
				System.out.println((double)num / num2);
			}	else if (op.equals("%")) {
				System.out.println(num % num2);
			}	else {
				System.out.println("지원하지 않는 연산자입니다.");
			}
	}
}