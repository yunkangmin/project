package chess.clean;

public class Bishop extends Piece{
	public Bishop(int ix,int iy,int iteam) {
		x=ix;
		y=iy;
		team=iteam;
	}
	@Override
	public boolean isMovableTo(int tx, int ty) {
		if(isSameTo(tx, ty))
			return false;
		int dx=tx-x;//������ �ϴ� ��ǥ������ ���� ��ġ���� ����
		int dy=ty-y;
		/*dx=dx>0?dx:-dx;
		dy=dy>0?dy:-dy;*/
		dx*=dx>0?1:-1;
		dy*=dy>0?1:-1;
		//x�� ������ �� �̵����� , y������ �������� �̵����� ������ ��
		return Math.abs(tx-x)==Math.abs(ty-y);
		//���밪���ϴ°�
		//Ư�������� x���� y���� ������ �ȴ�.
	}
}
