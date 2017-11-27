package chess.dirty;

public class King {//상속을 써야한다.다형성을 이용하자.
	int x;	//0~7
	int y;	//0~7
	int team;	//0:black, 1:white
	
	public King(int ix,int iy,int iteam) {
		x=ix;
		y=iy;
		team=iteam;
	}
	public King() {//생성자는 상속이 안된다.디폴트생성자는 항상만들어주는게 좋다.
		
		
	}
	public static Pawn create() {
		return new Pawn(0,0,0);
	}
	//기능을 3가지 정도 만들꺼임...
	public boolean attackableTo(Pawn target) {
		return team!=target.team;
	}//같은 팀인지 아닌지 확인하는 것
	public boolean attackableTo(King target) {
		return team!=target.team;
	}//같은 팀인지 아닌지 확인하는 것
	public boolean isSameTo(int tx,int ty) {
		return x==tx&&y==ty;
	}//메소드명이 이쁜가 의미있게
	
	public boolean movableTo(int tx,int ty) {
		if(isSameTo(tx,ty))//위와 아래 체크
			return false;
		int x1=x-1;
		int x2=x+1;
		int y1=y-1;
		int y2=y+1;
		
		return tx>=x1&&tx<=x2&&ty>=y1&&ty<=y2;
	
   }
	public String toString() {//문자열은 쌍따옴표를 붙인다.
		String str=String.format("{\"x\":%s,\"y\":%s,\"team\":\"%s\"}",x,y,team==0?"BLACK":"WHITE");
		return str;
	}
}
