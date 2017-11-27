package chess.dirty;

public class Source_KingTEST {

	public static void main(String[] args) {
		King k=new King(1,7,0);
		Display.kingsRoute(k);
		
		King kk=new King(3,5,1);
		Display.kingsRoute(kk);
		
		Pawn p1=new Pawn(3,6,1);
		Display.PawnsRoute(p1);
		//만약 상속없이 Rook객체를 만든다고 치자.
		//Rock이란 애는 직선방향으로만 이동이 가능함.
		//tx==x &&ty!=y||tx!=x &&ty==y;//직선 방향 체크
		//둘중에 하나만 만족하면 된다.
		
		//그냥 텅빈상태에서 움직일수 있는 곳을 체크하는것
		
}
}
