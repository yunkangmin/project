package chess.dirty;

public class Source_KingTEST {

	public static void main(String[] args) {
		King k=new King(1,7,0);
		Display.kingsRoute(k);
		
		King kk=new King(3,5,1);
		Display.kingsRoute(kk);
		
		Pawn p1=new Pawn(3,6,1);
		Display.PawnsRoute(p1);
		//���� ��Ӿ��� Rook��ü�� ����ٰ� ġ��.
		//Rock�̶� �ִ� �����������θ� �̵��� ������.
		//tx==x &&ty!=y||tx!=x &&ty==y;//���� ���� üũ
		//���߿� �ϳ��� �����ϸ� �ȴ�.
		
		//�׳� �ֺ���¿��� �����ϼ� �ִ� ���� üũ�ϴ°�
		
}
}
