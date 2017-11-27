/*
 * 프로그래밍? 어떤 일을 처리하기 위해 컴퓨터에게 일을 시키는 과정
 * 프로그래밍 기본에서 학습되어야 할 단계.
 * 
 * -데이터를 다루는 과정 (변수 , 연산)
 * -단순히  //프로모션 코드 구현
 * -원하는 결과를 얻기 위해 로직을 구현(특정상황에 따라서는 다른 흐름이 일어나야 한다.)
 * -지금 까지는 일방향으로 계산하다보면 결과가 나온다.
 * -로직구현 흐름구현
 *  이클립스에 코딩 지원 기능
 *  ctrl+space : code assist
 * 
 * */
public class Source01 {
	// main : ctrl+ space

	public static void main(String[] args) {
		// System.out.println(); sysout:ctrl+space
		System.out.println("로직(논리흐름)만들기.");
		// 조건문과 반복문을 이용해서 만들어내면 됨.
		// 산수 프로그램 초등학생 교육을 위한 산수 프로그램을 만들어보자.
		// 난이도를 측정해달라...
		// 자릿수의 변화가 안일어난다 1단계
		// 1의 자리나 10의 자리에서 올림 현상횟수를 난이도로 설정
		String opt = Math.random() > 0.5 ? "+" : "-";
		int n1 = 10 + (int) (Math.random() * 90);
		int n2 = 10 + (int) (Math.random() * 90);
		int lv = 1;
		// 작업지시
		System.out.println("[" + opt + "]");
		// if statment는 데이터 상태에 따른 로직(논리 흐름)처리가 가능
		if (opt == "+") {// 안에는 boolean data 혹은 boolean expression
			// 중괄호안에서 선언된 변수는 해당 중괄호 안에서만 유효하다
			// 이 안에 opt변수를 또 쓸수 없다
			// main안에 두번중복되므로
			// 코드블록을 지정
			System.out.println("opt 값이 + 일때");
			int h1 = (n1 % 10) + (n2 % 10) >= 10 ? 1 : 0;
			int h2 = (n1 / 10) + (n2 / 10) >= 10 ? 1 : 0;
			lv = h1 + h2;
		}
		/*
		 * String qz = "난이도#" + lv + " > " + n1 + " + " + n2 + " = ";
		 * System.out.println(qz);
		 */
		// 뺄셈
		else {
			System.out.println("opt 값이 - 일때");
			int h1 = (n1 % 10) - (n2 % 10) < 0 ? 1 : 0;
			int h2 = (n1 / 10) - (n2 / 10) < 0 ? 1 : 0;
			lv += h1 + h2;
		}
		// 부호도 랜덤으로 뽑는다 //조건문 분기문

		/*
		 * if else
		 */

		String qz = "난이도#" + lv + " > " + n1 + opt + n2 + " = ";
		System.out.println(qz);
	}

}
