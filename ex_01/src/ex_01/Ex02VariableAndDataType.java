package ex_01;

public class Ex02VariableAndDataType {

	public static void main(String[] args) {
		
		//1. 변수 선언
		int i;	//4byte 정수형(int) 변수 만들기
		double d;	//8byte 실수형(double) 변수 만들기
		
		//2. 변수 사용
		i = 10;	//데이터 저장
		d = 11.11;	//데이터 저장
		
		int i2 = i + i;	//데이터 읽기, 초기화(변수 선언 + 데이터 저장)
		System.out.println(i2);	//데이터 읽기
		System.out.println(d);	//데이터 읽기
		
		//3. boolean 자료형 사용 (참, 거짓(true, false) 두 개의 데이터만 사용하는 자료형)
		boolean b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);
		//b = 10; (error : 다른 자료형 저장 불가능)
		
	}

}
