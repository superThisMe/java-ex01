package ex_01;

public class Ex04ControlStatement {

	public static void main(String[] args) {
		
		//Math.random() : 난수 발생기(0<=r<1 범위 double형)
		double r = Math.random();
		//System.out.println(r);
		
		int num = (int)(r * 900) + 100;	//100<=num<1000 범위의 int형
		System.out.println(num);
		
/* If 문
		if (num > 800) {	//num이 800보다 크다면
			System.out.println("number는 800보다 큽니다.");
		}
*/
/* If else 문
  		if (num > 800) {	//num이 800보다 크다면
 			System.out.println("number는 800보다 큽니다.");
		}
		else {	//num이 800보다 작거나 같은 경우
			System.out.println("number가 800보다 작거나 같습니다.");
		}
	}
*/
		if (num > 800) {	//If elseif else 문
			System.out.println("number는 800보다 큽니다.");
		}	else if (num > 600) {
			System.out.println("number는 600보다 큽니다.");
		}	else if (num > 400) {
			System.out.println("number는 400 큽니다.");
		}	else if (num > 200) {
			System.out.println("number는 200 큽니다.");
		}	else {
			System.out.println("number는 200보다 작거나 같습니다.");
		}
	}
}