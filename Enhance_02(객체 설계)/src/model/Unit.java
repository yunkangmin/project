package model;
/*
 * static -instance���� �Ҵ�Ǵ°� �ƴ϶�
 *  class�̸����� �� �ϳ��� �Ҵ縸 ��.
 *  
 *  staticŰ����� , field�� method�� ���ϼ� ����.
 *  field�� ���̴� ��, �������� ������ �ʿ���� ��쿡 ����.
 *  method�� ���̴� ��, static field�� �����ϴ� ��Ȳ�� ����.
 *  static field�� static method�� �����Ѵ�.
 *  static method�� �� �ȿ��� static field�� ���� �մ�.
 *  instance field�� instance method ��� ����
 *  static method�� ���� ����°�
 *  �� �޼���� ��ü�� ���ؼ��� �ƴ϶� class�̸����� ������ ���� ����.
 *  �����ν��Ͻ� ��� �ϴ� �޼��尡 �ƴ�
 *  class ��ü�� ������ ��ġ�� ���� �ڵ� ������ ����
 *  ����ƽ�ʵ� ����ƽ�ʵ�
 *  static�� ���� ���� �ϴ� �޸� ������ ���� �ִ�.
 *  
 */
//public ������ �����ϴ� class�� �ƴϸ�, ���������� �ʿ����.
public class Unit {
	int hp;//�Ϲ��ʵ���� �ν��Ͻ����� ���������� �Ҵ�(=�ο�)
	static int atk;//�����ڿ� ������ static�� �����ϰ� �Ǹ�  class��ü���� �ϳ�
	static int def;//�ν��Ͻ����� ������ �ȵ� .class variable(static filed)
	//ü�º���
	//���� �ʵ带 �����ϰ� �޼ҵ�� �� ����� ���Ѵ�.
	//������ �ϳ������
	//�������
	//������Ű�������� ������ ����
	static {
		atk=20;
		def=10;
		System.out.println("class loaded...");
		//static�ʵ� �ʱ�ȭ���
		//��Ÿ�ӽ� ���ѹ��� ���� ��
		applyBuff("atk");//static method�̹Ƿ� �۵�����
	}
	public Unit() {
		hp=100;
		System.out.println("instance constructor");
		//atk=20;
		//def=10;//�ν��Ͻ� �޼ҵ忡���� ����ƽ�ʵ�� ������ �����ϴ�
		//��ü������ �۵�
	}
	public String toJSON() {
		return "{hp:"+hp+",atk:"+atk+",def:"+def+"}";
	}
	//�Ű������� ���޹��� ��ŭ ���� ó���ϰ�, ����ִ��� �ƴ����� ����.
	public boolean damageBy(int dmg){
		hp-=(dmg-def>0)?dmg-def:0;
		return hp>0;
	}
	//�Ű������� ���޹��� ���ڿ��� ����, atk�� def�� ��ȭ�� �ְ�, ���� ���Ͻ�ų����
	//��� true�� ��ȯ��.output�� �ʿ���ٰ� �����ϸ� void�� ��ȯ���� ����
	//�޼ҵ尡 ��ȯ�Ұ� ������ void��� ���� �ȴ�.
	//��ü�� �����ϴٺ��� void���°� ���� ���δ�.
	//���� Ȯ�� ���� �ʾƾ� �Ǵ� ��Ȳ�̿´�.
	//�Ϲ����� ������ ����
	//�������⿡���� ������� �޾ƾ� �Ѵ� Ȯ���� �Ǿ� �ϱ⶧����
	
	public static boolean applyBuff(String mode) {
		switch(mode) {
		case "atk":
			atk*=2; break;
		case "def":
			def*=2; break;
		}
		//hp+=10;�̰Ŵ� �ν��Ͻ� �ʵ��̹Ƿ� ���Ұ�
		//static method������ static�ʵ常 ��밡��
		return true;
	}
	
}
