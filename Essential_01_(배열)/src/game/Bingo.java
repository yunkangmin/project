package game;

public class Bingo {
	int num;	//����
	boolean flag;//üũ�� �Ȱ��� �ƴѰ��� -ture üũ�Ȱ� false üũ�ȵȰ�
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
