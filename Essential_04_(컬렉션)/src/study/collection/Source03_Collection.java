package study.collection;
import java.util.*;
public class Source03_Collection {

	public static void main(String[] args) {
			
		Collection c= new HashSet();//Set�迭���� ���� ���� ���Ǵ� ��ü.
		
		System.out.println(c.isEmpty());//ó�� ������̱⶧���� �翬�� true�� ���.
		
		c.add("�ڹ�");//��ü�� ����ִ´�.���ڿ��� �ٷ� ��ü�� �����ȴ�.
		c.add(4);//autoboxing=>Integer AutoWrap //1.5���� ���� ����ڽ�
		StringBuilder s=new StringBuilder("HANGMAN");
		c.add(s);
		
		boolean z=c.add(s);
		System.out.println(z);//�ݷ����� �⺻������ �ڽ��� �Ȱ����� �ִ� ��ü�� �߰��� �Ѵ�.
		//������ �ִ� ��ü�� �� �����ϳ� ���ϳ�(�ߺ���ü)=>�迭�� ���� �ٸ���.
		//set�迭�� ���� ��ü�� �������.
		System.out.println(c.size());
		
		//�� �÷����� ������ �ִ� ��ü�� ������ �� �ְ� �ϴ°� Iterator
		Iterator it=c.iterator();//�̾ȿ� ��ü���� ����Ǿ� �ִ�.�����Ҽ� �ִ� ���� ����.��ȯ��ü�� ���� ����
		while(it.hasNext()) {
			Object o=it.next(); //��ü�� ���������� �� �ƴϰ�, ��ü���� ����
			System.out.println(o.getClass().getSimpleName());//class��ü�� ������ �ִ� �޼ҵ�
			//����Ŭ�����ε�
			if(o instanceof StringBuilder) {//StringBuilder���� Ȯ���ϰ� ����ȯ�� �ϴ°�
				((StringBuilder)o).append("~~");
			}
		}
		System.out.println(s.toString());
	/*	for(int cnt=1;cnt<=10;cnt++) {
		boolean b=it.hasNext();//������ �� �ִ� ��ü�� �ֳ� ������ �� �˷���.�̾Ƴ����ִ� �ְ� �ֳ� ���ĸ� ����°�.add�� �Ѽ�Ʈ
		System.out.println("hasNext? "+b);
		Object o=it.next();//ù���� ��ü������.�ѹ��� ȣ���ϸ� �״��� ��ü�� ����.
		System.out.println(o.getClass().getName());//size��ŭ next�� �ص� �ȴ�.
		//���µ� next�� �̾Ƽ� ������.
		}*/
		}

}
