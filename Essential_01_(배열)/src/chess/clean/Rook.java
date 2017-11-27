package chess.clean;

public class Rook extends Piece{
	public Rook(int ix, int iy,int iteam) {
		x=ix;
		y=iy;
		team=iteam;
	}
	@Override
	public boolean isMovableTo(int tx, int ty) {
		// TODO Auto-generated method stub
		return y==ty||x==tx;
	}
}
