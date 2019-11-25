//주석 : 컴파일러가 컴파일하지 않는 영역 -> 코드에 대한 설명을 작성하느 곳
//1. 여기서부터 이 줄 끝까지 주석(블록 주석)
/*
2. 여러줄 가능(라인 주석)
 */
/**
3. 문서화할 주석(자바독)
 */

package ex_01;

//class : 프로그램의 기본 단위
public class Ex01HelloWorld {
	
	//public static void main(String[] args) : 프로그램이 시작되는 곳
	public static void main(String[] args) {

		//대소문자 구분(system.out.println("ERROR!") -> 에러
		System.out.println("Hello, Java with Eclipse"); //실행문 끝에 ; 필수
		System.out.println("Effective Tool for Java Development"); //Ctrl+space: content assist
		System.out.println("The End"); //Ctrl+F11: run

	}	//프로그램이 종료되는 위치

}
