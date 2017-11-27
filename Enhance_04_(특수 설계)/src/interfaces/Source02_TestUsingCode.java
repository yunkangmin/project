package interfaces;

import javax.swing.JOptionPane;

/*
 * 
 * 
 */
class Checker {}
class TimeChecker extends Checker implements Runnable{
	//인터페이스는 상속이 아닌 구현이기 때문에 상속과 구현이 동시에 가능하다.
	public void run() {
		long t1=System.currentTimeMillis();
		int cnt=0;
		while(true) {
			
			if(System.currentTimeMillis()-t1>5000)
				break;
			cnt++;
		}
		System.out.println(cnt);
		JOptionPane.showConfirmDialog(null, "Time OVER");
		System.exit(0);
	}
}
public class Source02_TestUsingCode {
public static void main(String[] args) {
	//Runnable동시작업할시 이형태로 만들어야 한다.
	//인터페이스를 토대로 만들어야한다.
	//클래스는 JVM이 실행시켜준다.메인에서 동시작동하는것 Runnable토대로 만든다.
	//멀티프로세스멀티스레드
	Runnable r= new TimeChecker();
	new Thread(r).start();//Runnable class를 작동시키는 코드

	//동시진행 스레드에 인터페이스가 있다.이걸보고 똑같이 만들어내라 이형태로 만들어내라
	//매개변수로 요구하는것 볼링 gui윈도우폼전용 지금단계에서 할수없다.
	int n=JOptionPane.showConfirmDialog(null, "Do You Want To Exit");
	System.out.println("CHECK : "+n);
	//뭔가를 눌러야 다음 코드로 진행이 된다
	//버튼을 누른게 숫자로 나온다.
	//10초동안 아무작업이 없으면 경고창을 띄우거나
}
}
