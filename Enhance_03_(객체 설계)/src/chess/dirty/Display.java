package chess.dirty;

public class Display {
	//ŷ�� ��ü�� �ѱ�� ����Ѵ�. ����� �ְ� �Ǹ� static�� ���̴°� ����.
	public static void kingsRoute(King k) {
		for(int y=0;y<=7;y++) {
			String m=y+":";
			for(int x=0;x<=7;x++){
				if(k.isSameTo(x, y)) {
					m+="��";
				continue;//
				}
			m+=k.movableTo(x, y)?"��":"��";
		}
		System.out.println(m);
	}
		System.out.println();
	}
	public static void PawnsRoute(Pawn k) {
		for(int y=0;y<=7;y++) {
			String m=y+":";
			for(int x=0;x<=7;x++){
				if(k.x==x&&k.y==y) {
					m+="��";
				continue;//
				}
			m+=k.movableTo(x, y)?"��":"��";
		}
		System.out.println(m);
	}
		System.out.println();
	}
	//Piece�� �ȸ���� ���� �޼ҵ带 �������� �Ѵ�.
}
