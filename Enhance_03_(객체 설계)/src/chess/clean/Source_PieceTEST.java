package chess.clean;
/*
 * 이 패키지에 설계된 Piece객체의 역할..?
 * 이 프로젝트에서 객체생성이 한번도 안될수도 있음.
 * 애는 무의미한거임?
 * 제어를 하기 위해서 설계함.
 * 메인보드의 램 램을 상속받는 어느 회사의 제품들 그 제품들이 램을 상속하면
 * 어느회사든지 낑겨넣을수 있다.
 */
public class Source_PieceTEST {

	public static void main(String[] args) {
		Piece p=new Pawn(3,5,1);
		Pawn pa=new Pawn(1,6,1);
		//Piece p=pa;
		//p.isMovableTo(3,1);
		Display.showRoute(p);
		Display.showRoute(pa);//이메소드의 매개변수는 Piece다 그러므로 자식객체
		//도 전달받을 수 있다.
		King k=new King(3,3,1);
		Display.showRoute(k);
		//Piece p=k;
		//p.isMovableTo(3,1);
		k.isAttackableTo(pa);
		
		Rook r=new Rook(3,4,1);//직선 방향으로만 
		Display.showRoute(r);
		
		Bishop b= new Bishop(3,4,1);//대각선방향으로만
		Display.showRoute(b);
		
		/**/Knight kn=new Knight(4,3,1);
		Display.showRoute(kn);
		
		/**/Queen q=new Queen(4,3,1);
		Display.showRoute(q);
		
		//상속시에는 큰 그림을 그리고 설계해야 한다.
		//
	}
}
