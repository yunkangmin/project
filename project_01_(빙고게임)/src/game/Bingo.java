package game;
//dfdfdfdfdfd
public class Bingo {
	int num;	//����
	boolean flag;//üũ�� �Ȱ��� �ƴѰ��� -true üũ�Ȱ� false üũ�ȵȰ�
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
}//??ó���� �߻�Ŭ������ �������� ���÷��̺��� ���̵���� �����ϴ°� ���������� �մ�.
