
/*
 * Error 계열은 , 하드웨어적인 결함임.
 * 
 * 
 * StackOverflowErroe:해야될 작업이 밀리는 경우에 생김(cpu가 좋으면 해결됨)
 * OutOfMemoryError : 허용 메모리초과되는 경우에 발생..(RAM이 좋으면 해결됨)
 * 
 * 이렇게 갑작스럽게 종료되는걸 막고 싶다면 , 처리를 해주면 됨.
 * ==>JVm(다이렉트로)쪽으로 안들어가게끔 철리
 *
 *
 *
 */
import java.util.*;

public class Source02_Error {
	static void recursive() {
		System.out.println(System.currentTimeMillis());
		recursive();
	}

	public static void main(String[] args) {
	try {
		recursive();// stackoverflowerror 컴퓨터의 작업속도를 못따라가는것 무한호출 cpu문제
	}catch(StackOverflowError sof){ //OutOfMemoryError는 못잡는다.
		//사용자입장에서 그냥 터지면 안되므로 에러이유를 알려준다.
		System.out.println("당신의 컴퓨터가 이 프로그램을 구동할 수 없습니다.");
		//안정적인 종료
	}	
	/*	*/List<int[]> li = new ArrayList<>();
	try {
		for (int cnt = 1; cnt <= 10000; cnt++) {
			int[] t = new int[1000000];
			li.add(t);
		}
	}catch(OutOfMemoryError oome){
		System.out.println("시스템 성능상 구동이 안됩니다.");
	}
	System.out.println("=========================");
	}
}// 컴퓨터를 사용하다가 터지는 계열 컴퓨터적인 문제->메모리부족
// OutOfMemoryError
// 익셉션은 코드문제
// 에러든 익셉션이든 프로그램이 뻗는다.
// 우리는 프로그램의 비정상종료를 막고싶다. 그냥 뻗는것보다.
// 안되는 걸 막고 다른상황으로 작업을 할 수 있게 유도->handling