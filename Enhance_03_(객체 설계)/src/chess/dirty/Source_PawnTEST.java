package chess.dirty;

public class Source_PawnTEST {
public static void main(String[] args) {
	Pawn p1=new Pawn(4,5,1);
	System.out.println(p1);
	Pawn p2=new Pawn(1,2,0);
	boolean b=p1.attackableTo(p2);
	System.out.println(b);
	boolean m=p1.movableTo(4, 4);//��ü������ x���� �̵��Ҷ��� ����x�� ��ġ���� ���ƾ� �Ѵ�.
	System.out.println(m);
	
	//������ �������� ����� �����ش�.
	for(int y=0;y<8;y++) {//��ǥ�� �������.//Ŭ�����ȿ��� �����ȴ�.�׸��� ����ġ���ϸ� �ȴ�.
		String t=y+" : ";
	//	System.out.println("Y�� : "+y);
		for(int x=0;x<8;x++) {//�̵� ���� ��θ� �����ش�.
			if(x==p1.x&&y==p1.y) {
				t+="��";
				continue;
			}
			//System.out.println("X�� : "+x);
			//System.out.println(String.format("(%s,%s)",x,y));
			boolean r=p1.movableTo(x, y);
			//���� p1�� ��ġ���� �����̱� ������ ���� ���
		//	System.out.println("  X��: "+x+" / "+r);
			t+=(r==true)?"��":"��";
			//���� �����ؼ� �ѹ��� ���
		}
		System.out.println(t);
	}
}
}
