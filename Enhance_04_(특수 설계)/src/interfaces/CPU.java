package interfaces;
/*
 * class와는 다르게, static final field / abstract method만을 가질수 있음
 * 실제로 만들어낼 객체의 메소드 형태만을 기술해둘수 있음.
 */
public interface CPU {
	//int level;오류가난다.일반필드
	//public CPU() {}오류.생성자도 설정안되고
	//public void run() {}오류. 일반메소드도 못만든다.
	public abstract void stop();//추상메소드만 설계가능
	public static final int MAX=4;//필드는 public final만 설계가 가능.
	
}
