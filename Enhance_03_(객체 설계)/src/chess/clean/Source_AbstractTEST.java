package chess.clean;

import java.awt.event.*;
class TestAdapter extends WindowAdapter{
	
}
public class Source_AbstractTEST {

	public static void main(String[] args) {
		Piece p;//변수타입으로도 사용이 안되는건 아니고,
		//new Piece();객체 생성이 안됨 Cannot instantiate...
		p=new Pawn(3,5,1);
		//0new WindowAdapter;//추상클래스 하지만 안에 추상메소드가 없다.
		//추상클래스는 직접객체생성이 불가하다.
	}
}
