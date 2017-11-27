package chess.dirty;

public class Display {
	//킹의 객체를 넘기면 출력한다. 기능이 주가 되면 static을 붙이는게 좋다.
	public static void kingsRoute(King k) {
		for(int y=0;y<=7;y++) {
			String m=y+":";
			for(int x=0;x<=7;x++){
				if(k.isSameTo(x, y)) {
					m+="☆";
				continue;//
				}
			m+=k.movableTo(x, y)?"※":"▦";
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
					m+="☆";
				continue;//
				}
			m+=k.movableTo(x, y)?"※":"▦";
		}
		System.out.println(m);
	}
		System.out.println();
	}
	//Piece를 안만들면 따로 메소드를 만들어줘야 한다.
}
