package chess.clean;

import java.awt.event.*;
class TestAdapter extends WindowAdapter{
	
}
public class Source_AbstractTEST {

	public static void main(String[] args) {
		Piece p;//����Ÿ�����ε� ����� �ȵǴ°� �ƴϰ�,
		//new Piece();��ü ������ �ȵ� Cannot instantiate...
		p=new Pawn(3,5,1);
		//0new WindowAdapter;//�߻�Ŭ���� ������ �ȿ� �߻�޼ҵ尡 ����.
		//�߻�Ŭ������ ������ü������ �Ұ��ϴ�.
	}
}
