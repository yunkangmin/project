package chess.dirty;

public class Source_PawnTEST {
public static void main(String[] args) {
	Pawn p1=new Pawn(4,5,1);
	System.out.println(p1);
	Pawn p2=new Pawn(1,2,0);
	boolean b=p1.attackableTo(p2);
	System.out.println(b);
	boolean m=p1.movableTo(4, 4);//객체생성시 x값과 이동할때의 현재x의 위치값이 같아야 한다.
	System.out.println(m);
	
	//가는지 못가는지 결과를 말해준다.
	for(int y=0;y<8;y++) {//좌표를 만들었다.//클래스안에다 만들어도된다.그리고 돌려치기하면 된다.
		String t=y+" : ";
	//	System.out.println("Y축 : "+y);
		for(int x=0;x<8;x++) {//이동 가능 경로만 보여준다.
			if(x==p1.x&&y==p1.y) {
				t+="☆";
				continue;
			}
			//System.out.println("X축 : "+x);
			//System.out.println(String.format("(%s,%s)",x,y));
			boolean r=p1.movableTo(x, y);
			//현재 p1의 위치에서 움직이기 가능한 곳만 출력
		//	System.out.println("  X축: "+x+" / "+r);
			t+=(r==true)?"※":"▦";
			//값을 누적해서 한번에 출력
		}
		System.out.println(t);
	}
}
}
