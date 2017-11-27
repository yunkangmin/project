package annotations;
/**
 * @author YOON
 *
 */
//클래스설명서를 만드는것
//남들이 볼수있게
//우클릭 export >> javadoc>>config>>bin>>javadoc
//프로젝트에 doc>>annotaion>>class-use>>piece.html
//프로그램에 영향을 끼치는게 아니라 다른쪽으로 영향을 끼친다.
public abstract class Piece {
	int x;
	int y;
	int team;

	@Override//Compiler에게 물려받은 메소드 오버라이드시키고 있다고 알려줌.
	public String toString() {//문자열은 쌍따옴표를 붙인다.
		String str=String.format("{\"x\":%s,\"y\":%s,\"team\":\"%s\"}",x,y,team==0?"BLACK":"WHITE");
		return str;
	}
	/**
	 * 해당객체의 좌표와 비교한 결과 반환
	 * @param tx 비교할 x좌표
	 * @param ty 비교할 y좌표
	 * @return	자신의 x,y와 비교하여 같은 좌표인가?
	 */
	public final boolean isSameTo(int tx,int ty) {
		return x==tx&&y==ty;
		//현재 위치랑 옮길려고 하는 곳이랑 같은가
	}//메소드명이 이쁜가 의미있게
	@Deprecated //그 클래스에서 더이상 이 메소드가 사용되지 않았으면 좋겠다고 생각할때
	public boolean isAttackableTo(Piece p) {
		return this.team!=p.team;
		//this를 안적어도되지만 명시적으로 표시해도된다.
	}//매개변수가 Piece이기때문에 자식객체들도 사용할수있다.
	//extends걸고 설계할 객체들에서 재정의를 해야될 메소드임.(형태만 잡아둔것)
	public abstract boolean isMovableTo(int tx,int ty);
	//이걸 추가하면 자식객체들이 오버라이딩 할수 잇는 가능성이 열려있다.
	//지우면 오버라이딩을 못한다.
}
