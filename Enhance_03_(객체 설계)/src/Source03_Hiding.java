//�ش簴ü���� public���� ������ �����δ°� ����.


public class Source03_Hiding {
	public static void main(String[] args) {
		Base b=new Base();
		System.out.println(b.toString());
		b.addValue(30);
		System.out.println(b.toString());
		System.out.println("=========");
		
		Multi m= new Multi();
		System.out.println(m.flag);
		System.out.println(m.val);
		m.addValue(1,1);
		System.out.println(m.val);
		//==========================
		//�� ��ü�� ���� ����Ҷ�,
		m.addValue(20);//�ش� �� ��ü�� �޼��尡 �۵���
		System.out.println(m.toString());
		//�����޼��尡 �۵��ϴ°���. ���� ��� �״�� ����.
		System.out.println(m.toJSON());
		
	}
}
/*��ӹ޾Ƽ� ������� ���� class���� 
 * �ʵ带 ���� �̸����� ����� ���� ���� ����.-� ����� ���´ٴ°� �����Ҽ�
 * �ձ⸸ �ϸ� ��
 * 
 * �޼ҵ� ���� ���� ���� ���·� �������̵带 �ؼ� ����ϴ� ��찡 ����
 * -�������̶�� ��ü ���� ���� ����(������)�� �̿��ϱ� ���ؼ�,
 * 
 * 
 */
