import java.util.List;

import model.Unit;

public class Source09_UnitTEST {

	public static void main(String[] args) {
		Unit u=null; //��Ŭ�����󿡼� ctrl+shift+o : ��밡���� class���� �߸鼭 
		//import�� ��������
		List l;//�� ������ ��ü ������ �ƴ�(��ü���� ������ �� �ִ� �������� null�̶��
		//��Ư�� ���� ���� �� ����)
		
		//int d=null; �⺻�ڷ������� null������ �ȵȴ�.
		//null�� � ����? �����ϰ� �ִ� ��ü�� ���� ����
		u=new Unit();
		Unit uu=new Unit();
		
		System.out.println("u ~ "+u.toJSON());
		System.out.println("=======================");
		u.damageBy(30);
		System.out.println("u ~ "+u.toJSON());
		//Unit uu= u;//ã�ư��� �ִ� ������ �ϳ��� ������ gc�� ���Ͼ��.
		//u=null;//���α׷������߿� �� �ڵ尡�� ���� �Ǹ�, 10��° ���� instance�� gc��
		System.gc();//������ gc�� Ȱ��ȭ��Ű�� �ϴ� �ڵ�
		System.out.println("uu ~ "+uu.toJSON());
	
		Unit.applyBuff("atk");//class ��ü���� �ϳ��� ������ �ְ� �װ� ������ ��ü�鿡�� ������ �ش�
		u.applyBuff("atk");
		System.out.println("=======================");
		System.out.println("u ~ "+u.toJSON());
		System.out.println("uu ~ "+uu.toJSON());
		//static�� �����̹Ƿ� � ��ȭ�� �Ͼ�� �� ��ȭ�� ��ü ��ü�� ����ȴ�.
		//������ �׳� ����ʵ�� �ν��Ͻ� �ʵ��̹Ƿ� ��ü���� �������� ������.
		//���� ��� �� ��ü�� �ʵ尪�� �����ϴ��� ��ü ��ü�� ���� �ٲ��� �ʴ´�.
		//static�� ����ϴ� ���
		//���� ���������� ���ֻ���
		//���׷��̵�
		//��ü�ʵ�� �ѳ� ���׷��̵�, static�ʵ�� ��ü������ �ö󰡴� ȿ��
	}
	

}
