package chess.clean;

public class King extends Piece{//������ϴ��� �����ڴ� ���������Ѵ�.
	public King(int ix, int iy,int iteam) {
		x=ix;
		y=iy;
		team=iteam;
	}
	@Override
	
	public boolean isMovableTo(int tx, int ty) {
		/**/if(isSameTo(tx,ty))//���� �Ʒ� üũ
			return false;
		int x1=x-1;
		int x2=x+1;
		int y1=y-1;
		int y2=y+1;
		
		return tx>=x1&&tx<=x2&&ty>=y1&&ty<=y2;
	}
}
