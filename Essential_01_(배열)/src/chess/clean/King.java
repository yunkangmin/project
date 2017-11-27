package chess.clean;

public class King extends Piece{//상속을하더라도 생성자는 만들어줘야한다.
	public King(int ix, int iy,int iteam) {
		x=ix;
		y=iy;
		team=iteam;
	}
	@Override
	
	public boolean isMovableTo(int tx, int ty) {
		/**/if(isSameTo(tx,ty))//위와 아래 체크
			return false;
		int x1=x-1;
		int x2=x+1;
		int y1=y-1;
		int y2=y+1;
		
		return tx>=x1&&tx<=x2&&ty>=y1&&ty<=y2;
	}
}
