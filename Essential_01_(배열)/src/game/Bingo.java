package game;

public class Bingo {
	int num;	//숫자
	boolean flag;//체크가 된건지 아닌건지 -ture 체크된것 false 체크안된것
	 public Bingo(int num) {
		 this.num=num;
		 this.flag=false;
	 }
	 public String toString() {
		 if(flag)
			 return "XX";
		 
		 return num<10?"0"+num:""+num;//Integer.toString(num);
	 }
}
