package chess.dirty;

//�ָ� ����ؼ� �����ڵ�� ����� �ű⿡ ����� �߰��ؼ� ������ ����°��̴�.

public class Pawn {
	int x;	//0~7
	int y;	//0~7
	int team;	//0:black, 1:white
	
	public Pawn(int ix,int iy,int iteam) {
		x=ix;
		y=iy;
		team=iteam;
	}
	public Pawn() {
		
		
	}
	public static Pawn create() {
		return new Pawn(0,0,0);
	}
	//����� 3���� ���� ���鲨��...
	public boolean attackableTo(Pawn target) {
		return team!=target.team;
	}//���� ������ �ƴ��� Ȯ���ϴ� ��
	public boolean movableTo(int tx,int ty) {
		if(x!=tx) {//x���� y�� �����δ�.
			return false;
		}else {
		switch(team) {
		case 1://���� ���ʿ� �ִٰ� ����
			if(y==6)
				return ty==4||ty==5;//��ŸƮ���ο����� 2ĭ�� �����ϼ��ִ�.
			else
				return ty==y-1;//��ŸƮ������ �ƴϸ� 1ĭ�� �ۿ� �������δ�.
		case 0:
			if(y==1)//����������
				return ty==2||ty==3;//��ŸƮ���ο����� 2ĭ�� �����ϼ��ִ�.
			else
				return ty==y+1;
		}
	}//�̵��� �����Ѱ� �Ȱ����Ѱ� �Ǵ��ϴ� �޼ҵ�
	return false;
	
}
	public String toString() {//���ڿ��� �ֵ���ǥ�� ���δ�.
		String str=String.format("{\"x\":%s,\"y\":%s,\"team\":\"%s\"}",x,y,team==0?"BLACK":"WHITE");
		return str;
	}
}
