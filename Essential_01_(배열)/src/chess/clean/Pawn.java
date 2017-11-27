package chess.clean;

public class Pawn extends Piece{
//ctrl space�ϸ� �������̵� �Ҽ� �մ°��� ���.
	public Pawn() {
		
	}
	public Pawn(int ix,int iy,int iteam) {
		super.x=ix;///�θ��� x�� y�̴�.
		y=iy;
		team=iteam;
	}
	public String toString() {
		return "PAWN : "+super.toString();
		//�����ʿ��ٰ� �۾��� ���ؼ� �����ϰ� �ʹٸ� �ڽĿ��� super�� �θ�޼ҵ带 ȣ���Ѵ���
		//�۾��� �� ���ص� �������ָ� �ȴ�.
	}
	@Override //�����޼ҵ带 �������Ѵٰ� ���� ���
	//�����Ͻ� üũ���ش�.�����Ϸ��� �����ϴ� �ּ�
	public boolean isMovableTo(int tx,int ty) {
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
}
