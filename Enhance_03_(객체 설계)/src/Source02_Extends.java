import hospital.*;//import�Ҷ�, ��Ű����.*�� �����ϸ�, �ش� ��Ű���� ��� class�� 
//import�� ��

/*
 * ����� ����, ��?
 * -��ü������� ����� �ϴ� ���� ū ������ �ҽ��� ��Ȱ�� ������.
 * �̹� ����Ǿ��ִ� Ŭ������ �ʵ峪 �޼ҵ���� ���ο� Ŭ���� ���迡�� �ٽ� ������ �� �ֱ� ������
 * �ߺ��� ����� ������ ������ ���� �ʾƵ� ��.���꼺 ������� �̾����� ��.
 * 
 * ���պ��� ����ý��� ���� / ȯ��,�ǻ�,��ȣ��,����� ��ü�� �����ؾ���.
 * �ٷ� ��ü ���踦 �� ���� �ϴ°� ���ٴ�, �������� �����ؼ� �⺻��ü�� �����ϰ� extends�� �̿��ϸ�
 * �������� ��ü ����� �����ڵ带 �ֿ������� ȿ���� �� �� ����.
 * 
 */
public class Source02_Extends {
	public static void main(String[] args) {
	Sims s= new Sims();
	Doctor d= new Doctor("������",29,"��",1);
	System.out.println(d);
	System.out.println(d.toJSON());//�� ����� Sims class�κ��� extends��
	//��Ȳ�̱⿡ ������.
	boolean r=d.treat(19);
	System.out.println(r);
	
	Patient p= new Patient();
	System.out.println(p.toJSON());//toJSON()�� Sims���� extends�� ��Ȳ�̱⿡ ������.
	
	p.recieveTreat(30);
	StringBuilder sb=new StringBuilder("�ڹ� ��� �������� ����");
	sb.replace(0,2,"���̽�");
	System.out.println(sb.toString());
	}
}
//class ExStringBuilder extends Stringbuilder{	} final class�� ����Ҽ� ����.

/*extends�� Ȱ���ϱ� ���ؼ� �˾Ƶ� ��..
 * 1.extends�� �� �ϳ��� class�� ������θ� �����Ҽ� ����.(���߻��x)
 * 2.��ӵǾ� ����� class�� �ٸ� class���� super�� �� �� ����.
 * 3.��� class���� ���� extends�� ����� �ƴ�.
 * 4.���� Ŭ������ �θ�Ŭ������ ���� �̸����� �Ǿ��ִ� ������ �޼ҵ尡 �ִٸ�
 * �ڽ�Ŭ�������� �켱�� ��.
 * 5.�޼ҵ尰���� �ǵ������� �������̵带 ��Ű�� ��Ȳ�� �����, ������ �ֱ� ������
 * -�׻�Ǵ� �� �ƴϰ�, �ȴٰ� ġ���� �þߴ� �ּ��� �����ؾ� ��
 * 
 *
 */
  
