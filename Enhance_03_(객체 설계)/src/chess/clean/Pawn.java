package chess.clean;

public class Pawn extends Piece{
//ctrl space하면 오버라이딩 할수 잇는것이 뜬다.
	public Pawn() {
		
	}
	public Pawn(int ix,int iy,int iteam) {
		super.x=ix;///부모의 x와 y이다.
		y=iy;
		team=iteam;
	}
	public String toString() {
		return "PAWN : "+super.toString();
		//슈퍼쪽에다가 작업을 더해서 리턴하고 싶다면 자식에서 super로 부모메소드를 호출한다음
		//작업을 더 해준뒤 리턴해주면 된다.
	}
	@Override //원본메소드를 재정의한다고 직접 기술
	//컴파일시 체크해준다.컴파일러가 이해하는 주석
	public boolean isMovableTo(int tx,int ty) {
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
}
