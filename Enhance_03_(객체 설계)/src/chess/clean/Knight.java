package chess.clean;

public class Knight extends Piece{
	public Knight(int ix,int iy,int iteam) {
		x=ix;
		y=iy;
		team=iteam;
	}
	@Override
	public boolean isMovableTo(int tx, int ty) {
		//x이동거리가 2고, y이동거리가 1이거나
		//x이동거리가 1이고, y이동거리가 2거나
		if(isSameTo(tx, ty))
			return false;
		else {
			int dx=Math.abs(tx-x);
			int dy=Math.abs(ty-y);
			
			return (dx==2&&dy==1)||(dx==1&&dy==2);
					//*         +   연산자우선순위표시괄호
		}
	}
}
