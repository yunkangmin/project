package chess.clean;
/*
 * �� ��Ű���� ����� Piece��ü�� ����..?
 * �� ������Ʈ���� ��ü������ �ѹ��� �ȵɼ��� ����.
 * �ִ� ���ǹ��Ѱ���?
 * ��� �ϱ� ���ؼ� ������.
 * ���κ����� �� ���� ��ӹ޴� ��� ȸ���� ��ǰ�� �� ��ǰ���� ���� ����ϸ�
 * ���ȸ����� ���ܳ����� �ִ�.
 */
public class Source_PieceTEST {

	public static void main(String[] args) {
		Piece p=new Pawn(3,5,1);
		Pawn pa=new Pawn(1,6,1);
		//Piece p=pa;
		//p.isMovableTo(3,1);
		Display.showRoute(p);
		Display.showRoute(pa);//�̸޼ҵ��� �Ű������� Piece�� �׷��Ƿ� �ڽİ�ü
		//�� ���޹��� �� �ִ�.
		King k=new King(3,3,1);
		Display.showRoute(k);
		//Piece p=k;
		//p.isMovableTo(3,1);
		k.isAttackableTo(pa);
		
		Rook r=new Rook(3,4,1);//���� �������θ� 
		Display.showRoute(r);
		
		Bishop b= new Bishop(3,4,1);//�밢���������θ�
		Display.showRoute(b);
		
		/**/Knight kn=new Knight(4,3,1);
		Display.showRoute(kn);
		
		/**/Queen q=new Queen(4,3,1);
		Display.showRoute(q);
		
		//��ӽÿ��� ū �׸��� �׸��� �����ؾ� �Ѵ�.
		//
	}
}
