import java.util.List;

import model.Unit;

public class Source09_UnitTEST {

	public static void main(String[] args) {
		Unit u=null; //이클립스상에서 ctrl+shift+o : 사용가능한 class들이 뜨면서 
		//import를 구성해줌
		List l;//이 행위가 객체 생성은 아님(객체값을 보관할 수 있는 변수에는 null이라는
		//독특한 값을 가질 수 있음)
		
		//int d=null; 기본자료형에는 null대입이 안된다.
		//null은 어떤 상태? 제어하고 있는 객체가 없는 상태
		u=new Unit();
		Unit uu=new Unit();
		
		System.out.println("u ~ "+u.toJSON());
		System.out.println("=======================");
		u.damageBy(30);
		System.out.println("u ~ "+u.toJSON());
		//Unit uu= u;//찾아갈수 있는 변수가 하나라도 있으면 gc가 안일어난다.
		//u=null;//프로그램진행중에 이 코드가지 오게 되면, 10번째 라인 instance는 gc됨
		System.gc();//강제로 gc를 활성화시키게 하는 코드
		System.out.println("uu ~ "+uu.toJSON());
	
		Unit.applyBuff("atk");//class 전체에서 하나만 가지고 있고 그걸 가지고 객체들에게 영향을 준다
		u.applyBuff("atk");
		System.out.println("=======================");
		System.out.println("u ~ "+u.toJSON());
		System.out.println("uu ~ "+uu.toJSON());
		//static은 공용이므로 어떤 변화가 일어나면 그 변화가 전체 객체에 적용된다.
		//하지만 그냥 멤버필드는 인스턴스 필드이므로 객체마다 고유값을 가진다.
		//따라서 어느 한 객체의 필드값을 변경하더라도 전체 객체의 값이 바뀌지 않는다.
		//static을 사용하는 경우
		//돈이 있을때마다 유닛생성
		//업그레이드
		//객체필드면 한놈만 업그레이드, static필드면 전체적으로 올라가는 효과
	}
	

}
