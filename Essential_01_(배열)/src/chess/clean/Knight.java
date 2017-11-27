package chess.clean;

public class Knight extends Piece{
	public Knight(int ix,int iy,int iteam) {
		x=ix;
		y=iy;
		team=iteam;
	}
	@Override
	public boolean isMovableTo(int tx, int ty) {
		//x�̵��Ÿ��� 2��, y�̵��Ÿ��� 1�̰ų�
		//x�̵��Ÿ��� 1�̰�, y�̵��Ÿ��� 2�ų�
		if(isSameTo(tx, ty))
			return false;
		else {
			int dx=Math.abs(tx-x);
			int dy=Math.abs(ty-y);
			
			return (dx==2&&dy==1)||(dx==1&&dy==2);
					//*         +   �����ڿ켱����ǥ�ð�ȣ
		}
	}
}
