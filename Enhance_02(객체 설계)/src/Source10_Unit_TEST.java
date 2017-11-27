import model.Unit;

public class Source10_Unit_TEST {

	public static void main(String[] args) {
		Unit u1=new Unit();
		Unit u2=new Unit();
		Unit u3=new Unit();
		
		System.out.println(u1.toJSON());
		System.out.println(u2.toJSON());
		System.out.println(u3.toJSON());
		
		//u.damageBy(10);
		//Unit.damageBy(10);//static method�� �ƴѰͿ� class�̸����� ���� �Ѵ� ����
		
		//static�� �ν��Ͻ��� ������ ����������
		//��������� �ƴ� static������� �����ض� class�̸����� �����ض�
		//u1�� �ö󰡴´����� �ش�.
		u1.applyBuff("atk");
		
		Unit.applyBuff("atk");//��ü ��ü�� ������ ��ģ��.
		Unit.applyBuff("def");
		
		System.out.println("=======================");
		System.out.println(u1.toJSON());
		System.out.println(u2.toJSON());
		System.out.println(u3.toJSON());
		//�跰���� ������ �� ��� ����. ���� ��ü ���׷��̵�
		//���߿� �� ������ �����.�̹� �ݿ��� ������ ���;� �Ѵ�.
		//���׷��̵尡 �ݿ��� �ȉ��.
		//�׷��� static�ʵ�� static������� ���� �ε��Ѵ�.
		
		Unit last=new Unit();
		System.out.println("=======================");
		System.out.println(last.toJSON());
		System.out.println(u1.toJSON());
		System.out.println(u2.toJSON());
		System.out.println(u3.toJSON());
	}

}
