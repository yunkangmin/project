package game;
//dfdfdfdfdfd
public class Bingo {
	int num;	//숫자
	boolean flag;//체크가 된건지 아닌건지 -true 체크된것 false 체크안된것
	boolean user;
	public Bingo() {};
	 public Bingo(int num,boolean user) {
		 this.num=num;
		 this.flag=false;
		 this.user=user;
	 }
	 public String toString() {
		
		 if(flag)//SDFSD
			 return "XX";
		 if(user)
		 return num<10?"0"+num:""+num;//Integer.toString(num);
		 else
			return "??";
		/* if(flag)
			 return "XX";
		 
		 return num<10?"0"+num:""+num;//Integer.toString(num);
		*/
		 
		 
	 }
}//??처리시 추상클래스를 만들어놓고 디스플레이빙고 하이드빙고를 구현하는게 더좋을수도 잇다.
