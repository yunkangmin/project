package chess.dirty;

//애를 상속해서 공통코드로 만들고 거기에 기능을 추가해서 말들을 만드는것이다.

public class Pawn {
	int x;	//0~7
	int y;	//0~7
	int team;	//0:black, 1:white
	
	public Pawn(int ix,int iy,int iteam) {
		x=ix;
		y=iy;
		team=iteam;
	}
	public Pawn() {
		
		
	}
	public static Pawn create() {
		return new Pawn(0,0,0);
	}
	//기능을 3가지 정도 만들꺼임...
	public boolean attackableTo(Pawn target) {
		return team!=target.team;
	}//같은 팀인지 아닌지 확인하는 것
	public boolean movableTo(int tx,int ty) {
		if(x!=tx) {//x기준 y를 움직인다.
			return false;
		}else {
		switch(team) {
		case 1://블랙쪽 위쪽에 있다고 생각
			if(y==6)
				return ty==4||ty==5;//스타트라인에서는 2칸을 움직일수있다.
			else
				return ty==y-1;//스타트라인이 아니면 1칸씩 밖에 못움직인다.
		case 0:
			if(y==1)//검은색입장
				return ty==2||ty==3;//스타트라인에서는 2칸을 움직일수있다.
			else
				return ty==y+1;
		}
	}//이동이 가능한가 안가능한가 판단하는 메소드
	return false;
	
}
	public String toString() {//문자열은 쌍따옴표를 붙인다.
		String str=String.format("{\"x\":%s,\"y\":%s,\"team\":\"%s\"}",x,y,team==0?"BLACK":"WHITE");
		return str;
	}
}
