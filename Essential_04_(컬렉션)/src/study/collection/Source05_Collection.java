package study.collection;
import java.util.*;
import java.util.stream.Stream;
public class Source05_Collection {

	public static void main(String[] args) {
		//Traversing Collection : ��ü Ž��(��ȸ)��ü����
		//4���� ������� ��ȸ
		//1.toArray�ؼ� ,�޾Ƽ� �ۿ��� ���� ��·�� ��ü�� ���� �ֱ� �ϴ�.
		//2.Iterator �̿��ؼ�
		//3.for-each �̿��ؼ�
		Collection c=new LinkedHashSet();
		c.add("��¤����_����");
		c.add("����_�纸");
		c.add("�����_���̽�");
		c.add("����_�巡��");
		c.add("�ر�_����");
		
		//�Ʒ� ����� ���� ���ϴ�. 1.5�̻󿡼����� ����
		for(Object o:c) {//������ for(Object o=it.next();it.has.Next();o=it.next())�� ����???
			//while(it.hasNext()) Object o= it.next();
			System.out.println(o.toString());//matches�� object�� �ȵȴ�. �ҷ��� ��Ʈ������ ĳ���� �ؾ���
			if(o instanceof String) {
				while(((String)o).startsWith("����")) {
				System.out.println(o);
				break;
				}
			}
		}
		//4. jdk1.8+�̻󿡼��� �۵�.  �ϴ� ����
		System.out.println("=======================================");
		c.stream().forEach(o->System.out.println((o instanceof String)+"/ "+o));
		                     //�״��� �ؾߵ��۾� ���� �׼��ϳ�����
		
		

	}

}
