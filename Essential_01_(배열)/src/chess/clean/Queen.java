package chess.clean;
/*
 * compile error..?
 * extends�� ����� abstract method�� �ݵ�� �������̵带�ؾ���.
 * abstract class�� ������� class��� �����ص��ȴ�.
 * abstract class�� �����ְ� ����ϸ� �������̵� �ؾ��� �޼ҵ带 �� ���ִ�.
 * ���赵 ���� 
 */
public class Queen extends Piece{

	public Queen(int ix,int iy,int iteam) {
		x=ix;///�θ��� x�� y�̴�.
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
