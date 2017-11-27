import java.io.IOException;
import java.net.ServerSocket;

/*
 * 예외 전가 :
 *  익셉션을 직접 처리를 꼭해야되는 건 아니고, 이작업을 호출한 곳으로 넘겨서 그쪽에서 처리를 시킬수 있음.
 * 
 * 메소드뒤에 붙는 throws XXXXXXException의 의미?
 *  이 메소드 안에서 발생하는 XXXXXXException을 딴 곳으로 넘겨서 처리할꺼니까 신경쓰지 말아달라는것.
 * 
 * 메인에다가 붙여두는것은 그렇게 좋은건 아님.=>따른 곳으로 넘기는게 불가능->JVM
 * 
 * throws는 언제 사용하냐..?
 * 
 * 
 */
class Timer{
	Timer()throws InterruptedException{//클래스를 만들어두면 어딘가에서는 사용한다. 메인 그전이라면 막을수 있는 가능성이 있다.
		//메인이 아닌 메소드에서 예외처리가 귀찮을시 사용한다. 메인에다가만 안해주면된다 해줘도 되지만 최종처리가 안된다.
		//나중에 이메소드를 사용할때 막겠다는것
		//하나의 메소드가 터지면 그것때문에 try catch를 해야한다.
		
		System.out.print("CREATE");//print 줄바꿈 없이 단순 출력
		
		//try {
			for(int i=0;i<=3;i++) {
		System.out.print(".");
			Thread.sleep(500);// InterruptedException 필수처리 익셉션
			}
			System.out.println("COMPLETED");
	}
}
public class Source08_Exception {

	public static void main(String[] args) throws InterruptedException,IOException{
		
		/*sleep메써드로 쓰레드 대기상태에 있을 때

		interrupt()메써드로 쓰레드를 끝내버리면

		발생하게 된다.*/

		


		
		System.out.print("Ready");//print 줄바꿈 없이 단순 출력
		
			//try {
				for(int i=0;i<=3;i++) {
			System.out.print(".");
				Thread.sleep(500);// InterruptedException 필수처리 익셉션
				}
			//} catch (InterruptedException ie) {
				//System.out.println("exception : "+ie.getMessage());
		//	}
		
		System.out.println("DONE");
		new ServerSocket(445);
	}

}
