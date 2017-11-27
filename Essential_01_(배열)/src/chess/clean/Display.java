package chess.clean;

public class Display {
	public static void showRoute(Piece p) {
		System.out.println(p.toString());
		for(int y=0;y<=7;y++) {
			String m=y+":";
			for(int x=0;x<=7;x++){
				if(p.isSameTo(x, y)) {
					m+="��";
				continue;///
				}
			m+=p.isMovableTo(x, y)?"��":"��";
		}
		System.out.println(m);
	}
		System.out.println();
	}
}
