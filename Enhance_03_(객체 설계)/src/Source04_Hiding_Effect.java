/*
 * �������̵� �̿�
 * 
 * 
 */
class Sample{
	//toString()�� �������̵� ���Ѽ�, ��ü�� ��½� ��µ� ������ �ٲܼ� ����.
	public String toString() {
		return "SAMPLE";
	}
	
}
public class Source04_Hiding_Effect {
	public static void main(String[] args) {
		Sample s= new Sample();//Sample class�� �ƹ��͵� �����ص��� �ʾҴµ�,
		//��ü�� �����ϰ� ����
		
		s.hashCode();//int hashcode()��� �޼ҵ�
		s.toString();//String toString()�̶�� �޼ҵ尡 ������.
		//�� �ִ°ų�....
		//�ڹٿ��� Ŭ���� ���� ������ �˾ƾ� ���ذ� ������.
		//object..?���  ��ü�� ����.
		Object o=new Object();//�� ��ü�� �ڹٿ��� �����ϴ� ��� class�� root class
		//class�� �����Ҷ�, extends�� �������� �ʰ� �������� �ϰ� �Ǹ�, 
		//�ڵ����� extends Object�� �����ؼ� ������
		String str=s.toString();//���� ��� ��ü���� �� ������ �ִ� �޼ҵ���.
		//����Ʈ ������ Ŭ������@�ؽ��ڵ�޼ҵ��� 16����
		System.out.println(str);
		int hc=s.hashCode();//����Ʈ ������ ��ü ������ ��ġ��
		System.out.println(hc);
	
		int ic=System.identityHashCode(s);
		System.out.println(ic);
		
		//��� ��ü�� toString()�̶�� �޼ҵ带 ������ �ۿ� ����.100���� ������.
		System.out.println(s.toString());
		System.out.println(s);//��ü�� �ѱ�� ������ �ش� ��ü�� ������ �ִ� toString()�� 
		//�ڵ����� �����.
	}
}
