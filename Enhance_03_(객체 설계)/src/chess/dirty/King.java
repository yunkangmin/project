package chess.dirty;

public class King {//����� ����Ѵ�.�������� �̿�����.
	int x;	//0~7
	int y;	//0~7
	int team;	//0:black, 1:white
	
	public King(int ix,int iy,int iteam) {
		x=ix;
		y=iy;
		team=iteam;
	}
	public King() {//�����ڴ� ����� �ȵȴ�.����Ʈ�����ڴ� �׻󸸵���ִ°� ����.
		
		
	}
	public static Pawn create() {
		return new Pawn(0,0,0);
	}
	//����� 3���� ���� ���鲨��...
	public boolean attackableTo(Pawn target) {
		return team!=target.team;
	}//���� ������ �ƴ��� Ȯ���ϴ� ��
	public boolean attackableTo(King target) {
		return team!=target.team;
	}//���� ������ �ƴ��� Ȯ���ϴ� ��
	public boolean isSameTo(int tx,int ty) {
		return x==tx&&y==ty;
	}//�޼ҵ���� �̻۰� �ǹ��ְ�
	
	public boolean movableTo(int tx,int ty) {
		if(isSameTo(tx,ty))//���� �Ʒ� üũ
			return false;
		int x1=x-1;
		int x2=x+1;
		int y1=y-1;
		int y2=y+1;
		
		return tx>=x1&&tx<=x2&&ty>=y1&&ty<=y2;
	
   }
	public String toString() {//���ڿ��� �ֵ���ǥ�� ���δ�.
		String str=String.format("{\"x\":%s,\"y\":%s,\"team\":\"%s\"}",x,y,team==0?"BLACK":"WHITE");
		return str;
	}
}
