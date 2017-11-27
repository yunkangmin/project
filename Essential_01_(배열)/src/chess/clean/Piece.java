package chess.clean;
/*
 * 모든 Chess 객체들의 기본//실제 생성은 안할수도 있음.
 * 생성시키진 않겠지만, 나름 의미가 있는 객체임. 제어용으로 사용될꺼라서
 * abstract??옵션 사용을 할 수 있음. 어찌 바뀌는지.
 * 직접 Piece객체를 만들려고 클래스를 설계하진않는다.
 * 
 * abstract가 있으나 없으나 큰 영향이 없다.
 * 추상클래스라고 부르는데, 객체생성이 안됨.
 * A가 붙여져 있는 클래스.
 * class설계의 목적이 생성이 아닌 제어용(틀)이라면,abstract처리해주는 게 좋다.
 * 
 * abstract class에만 가질수 있는 abstract method때문
 *abstract class만 abstract method를 가질 수있다.
 *일반 class는 abstract method를 가질수 없다.
 *일반 class는 직접사용을 목적으로 하기 때문 생성을 할수 있기 때문 
 *필드에서는 abstract키워드를 못쓴다.
 *abstract를 안쓰면 어찌 됫든 method를 완성해야 하는데 abstract는 미완성상태로
 *둬도 에러가 안난다.
 *final abstract 동시에 설정이 안된다.
 *상속을 못하면서 상속을 하게 는 안된다.
 *abstract class가 무조건 abstract method를 가져야 하는 건아님.
 */
public abstract class Piece {
	int x;
	int y;
	int team;
	
	public String toString() {//문자열은 쌍따옴표를 붙인다.
		String str=String.format("{\"x\":%s,\"y\":%s,\"team\":\"%s\"}",x,y,team==0?"BLACK":"WHITE");
		return str;
	}
	public final boolean isSameTo(int tx,int ty) {
		return x==tx&&y==ty;
		//현재 위치랑 옮길려고 하는 곳이랑 같은가
	}//메소드명이 이쁜가 의미있게
	public boolean isAttackableTo(Piece p) {
		return this.team!=p.team;
		//this를 안적어도되지만 명시적으로 표시해도된다.
	}//매개변수가 Piece이기때문에 자식객체들도 사용할수있다.
	//extends걸고 설계할 객체들에서 재정의를 해야될 메소드임.(형태만 잡아둔것)
	public abstract boolean isMovableTo(int tx,int ty);
	//이걸 추가하면 자식객체들이 오버라이딩 할수 잇는 가능성이 열려있다.
	//지우면 오버라이딩을 못한다.
}
