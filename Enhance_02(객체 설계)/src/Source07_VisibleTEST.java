
/*
 * ���� ��� �ǰ�, ��� �ȵǰ� �ϴ°� �����ϰ� �� �ξ���
 * 
 */
import java.util.Date;//�ð� ���� ��ü

public class Source07_VisibleTEST {
public static void main(String[] args) {
	//����鼭  long���� �����͸� ���� �� �� ����-long�� ������
	//������Ų�鼭 �ѱ� �����͸� 1970.01.01 00:00:00���� �귯�� �ð��� �м��ؼ�
	//�� �� ���� �ٰ���ؼ� �����ϴ� ��ü
	long t=System.currentTimeMillis();//���� 1000ms
	Date d=new Date(t);//public class��� �� //�� �����Ͱ� fastTime�� ������
	//System.out.println(d.fastTime);
	//d.fastTime=2342342L;//not visible, public�� �ƴ϶�°�
	//�� Ŭ���� ���踦 ���� ���� ����� ������ü�� ��.
	System.out.println(d.toString());//String toString();����� ���ڿ��� ��µȴ�.
	
	Date d2=new Date(t-1000L*60*60*24*30);//�������߿� int�� ���� ������ �ѱ�Ƿ� 
	//long������ ��ȯ�ؾ� �Ѵ�
	System.out.println(d2.toString());
	
	boolean b=d.after(d2);//�޳�¥�� �³�
	//�����͸� �ǵ�� ����� �޶����� ������ �Ժη� �����ؼ� �����ϸ� �ȵȴ�.
	//�������� ���� fastTime���� ��
	//��ü�� ��ġ ��� �� �ϵ��� �����
	//��ü������ ���񱳰� �ȵǹǷ�
	System.out.println(b);
	//fastTime�� �ܺο��� ���ϰ� ���ƇJ�� ��ü����� �� ������ �ǹǷ�
	//�ⲯ �����꼳���ؼ� ���踦 �ߴµ� ������ �Ǹ� ������ �ȴ�.
	//���� �Ϲ������� ��ü�� ������(�ʵ�)�� ���� ������ ���°� �Ϲ�����.
	//Rectangle����
	//�����ڴ� ������ �ϴ°� �Ϲ�����.
	//�޼ҵ嵵 ������ �ϴ°� �Ϲ�����.
	//d.convertToAbbr(null,null);
	//Bomb class�� rangeTo()���� ���, �����ڰ� ���ο��� �۾��� ���ϰ� �Ϸ��� �����а�
	//new Math();
	//�����ڸ� ������ ���ϰԲ� ���Ҵ�.
	//��ü�� �ʵ带 ������ ���ϰ� �� ���Ƶΰ� ������, ������ �ʿ��ϴٰ� ������ �ϸ�, �����Ҽ� 
	//�ִ� �޼��带 public���� ����, ���� Ȯ���� �� �ִ� �޼ҵ带 public�� ����
	long tz=d.getTime();//return fastTime;
	System.out.println(tz);
	
	d.setTime(tz+30000);//30���߰�
	System.out.println(d.toString());
	
}
}
