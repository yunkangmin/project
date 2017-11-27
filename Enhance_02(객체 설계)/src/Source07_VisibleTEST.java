
/*
 * 굳이 어디서 되고, 어디선 안되고 하는걸 설정하게 해 두었나
 * 
 */
import java.util.Date;//시간 관리 객체

public class Source07_VisibleTEST {
public static void main(String[] args) {
	//만들면서  long으로 데이터를 설정 할 수 있음-long형 생성자
	//생성시킨면서 넘긴 데이터를 1970.01.01 00:00:00부터 흘러간 시간을 분석해서
	//년 월 일을 다계산해서 관리하는 객체
	long t=System.currentTimeMillis();//단위 1000ms
	Date d=new Date(t);//public class라는 것 //이 데이터가 fastTime에 설정됨
	//System.out.println(d.fastTime);
	//d.fastTime=2342342L;//not visible, public은 아니라는것
	//저 클래스 설계를 보지 않은 사람은 존재자체도 모름.
	System.out.println(d.toString());//String toString();저장된 문자열이 출력된다.
	
	Date d2=new Date(t-1000L*60*60*24*30);//계산과정중에 int의 형의 범위를 넘기므로 
	//long형으로 변환해야 한다
	System.out.println(d2.toString());
	
	boolean b=d.after(d2);//뒷날짜가 맞냐
	//데이터를 건들면 결과가 달라지기 때문에 함부로 접근해서 변경하면 안된다.
	//제한자의 개념 fastTime끼리 비교
	//객체를 마치 대소 비교 하듯이 만든것
	//객체끼리는 논리비교가 안되므로
	System.out.println(b);
	//fastTime을 외부에서 못하게 막아놧냐 객체기능이 다 엉망이 되므로
	//기껏 윤년계산설정해서 설계를 했는데 수정이 되면 엉망이 된다.
	//보통 일반적으로 객체의 데이터(필드)는 보통 접근을 막는게 일반적임.
	//Rectangle공개
	//생성자는 공개를 하는게 일반적임.
	//메소드도 공개를 하는게 일반적임.
	//d.convertToAbbr(null,null);
	//Bomb class의 rangeTo()같은 경우, 설계자가 내부에서 작업을 편하게 하려고 만들어둔것
	//new Math();
	//생성자를 생성을 못하게끔 막았다.
	//객체의 필드를 접근을 못하게 끔 막아두고 싶은데, 변경이 필요하다고 생각을 하면, 변경할수 
	//있는 메서드를 public으로 설계, 값을 확인할 수 있는 메소드를 public을 설계
	long tz=d.getTime();//return fastTime;
	System.out.println(tz);
	
	d.setTime(tz+30000);//30초추가
	System.out.println(d.toString());
	
}
}
