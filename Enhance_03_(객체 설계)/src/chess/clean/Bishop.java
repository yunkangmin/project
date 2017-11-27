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
		int dx=tx-x;//가고자 하는 좌표값에서 실제 위치값을 뺀것
		int dy=ty-y;
		/*dx=dx>0?dx:-dx;
		dy=dy>0?dy:-dy;*/
		dx*=dx>0?1:-1;
		dy*=dy>0?1:-1;
		//x로 가고자 한 이동량과 , y축으로 가고자한 이동량이 같으면 됨
		return Math.abs(tx-x)==Math.abs(ty-y);
		//절대값구하는것
		//특정점에서 x값과 y값이 같으면 된다.
	}
}
