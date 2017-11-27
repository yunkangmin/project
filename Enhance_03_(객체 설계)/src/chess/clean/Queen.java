package chess.clean;
/*
 * compile error..?
 * extends의 대상의 abstract method는 반드시 오버라이드를해야함.
 * abstract class는 상속전용 class라고 생각해도된다.
 * abstract class를 던져주고 상속하면 오버라이드 해야할 메소드를 알 수있다.
 * 설계도 역할 
 */
public class Queen extends Piece{

	public Queen(int ix,int iy,int iteam) {
		x=ix;///부모의 x와 y이다.
		y=iy;
		team=iteam;
	}
	@Override
	public boolean isMovableTo(int tx, int ty) {
		if(isSameTo(tx, ty))
			return false;
		
		return Math.abs(tx-x)==Math.abs(ty-y)|| y==ty||x==tx;
	}
}
