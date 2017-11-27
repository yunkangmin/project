package study.list;
/*
 * List �迭�� index�� �ִ� �÷��� / �ߺ���ü�� ������ �� /�⺻���� ����� �� �ִ�./add�Ǵ� ���� ��ȣ�� �ٿ��д�.�迭���� ����
 *  �⺻�÷����� ����� �� �ְ�, �߰�������  �� ������� ���.
 *  �������� ���� access�� ���� get(int index), remove(int index)
 * 	search�� ������ / (indexOf(Object), lastIndexOf(Object))
 *  RangeView�� ����.(�Ϻκ��� �����ؼ� �÷����� ������ �ִ�.)
 * 	//////////////////���� Iterator�� �߰������� ����.///////////////
 * 	
 * 	-Vector : �迭��� :jdk1.0���� ���� ArrayList�� ������(����ȭ�� ó�� : ���̴�) 
 * 	-ArrayList : �迭��� : ������ ��쿡 ���� ������ ���� 1.2���� ������� (����ȭ�� ó������ : ������)
 * 	-LinkedList : ��ü�� ������ ���Ѽ� �迭ó�� �۵���. 1���� 2���� �ּҸ� �˰� �ְ� 2���� 1���� 3���� �ּҸ� �˰� ����.
 * 	 Ư����Ȳ������ ������ ����.(����ȭ ó������)
 * 
 * 	����ȭ�� ó�����ؾ� ������ �� ����.
 * 
 *  ����ȭ(syncronized)�� ��Ƽ������ ��Ȳ������ ���� ����.
 * 
 */
import java.util.*;
public class Source01_List {
	public static void main(String[] args) {
		List<String> lia=new Vector<>();
		List<String> lib=new ArrayList<>();
		List<String> lic=new LinkedList<>();
		//List��� �������̽��� ��Ģ�� �����R.
		
		//���� �÷��ǿ� ���� ����߿� �ִ°� 
		//������ �ֱ� ������ �߰��� �ڷḦ ������ �ִ�. �迭���� �� ����.
		//add�� �⺻������ �ǵڿ� �ִ´�.
		lib.add("����");
		lib.add("����");//���� ��ü ����
		System.out.println(lib.size());
		boolean b=lib.contains("����");
		System.out.println(b);
		//������ collection�� ���� �ִ� ��ɵ�
		
		//index�� access : add(int idx, E e)
		lib.add(1, "�縶��");
		System.out.println(lib.toString());
		//set(int idx, E e)
		lib.set(2, "���ĵ�");
		System.out.println(lib.toString());
		//���� �ε����� �����ϸ� ������.
		
		//remove(int idx) object�� ����°� ���� ������ �ε����� ����� �� ���⿡���ִ�.
 		lib.remove(0);
 		System.out.println(lib.toString());
 		
 		//E get(int idx)
 		String s=lib.get(1);//1����ġ�� �ִ� ���� �����´�.
 		System.out.println(s);
 		System.out.println(lib.toString());
 		//=========================================================================
 		lic.add("����");
 		lic.add("����");
 		lic.add("����");
 		lib.addAll(1,lic);//Ư����ġ�� addAll��Ű�°��� ����.
 		System.out.println(lib.toString());
 		//Ư����ġ�� ���� ã�� ������ List�� ���
 		//=========================================================================
 		int i=lib.indexOf("����");//indexOf�� lastIndexOf�� �ϸ� �ٸ��� ���ü��� �ִ�.
 		System.out.println(i);
 		//=========================================================================
 		List<String> slist=lib.subList(1, 4);   //from<=    <to
 		System.out.println(slist.toString());//������ �ȹٲ��.�� �κи� �����ؼ� �ش�.
 		System.out.println(lib.toString());
 		
 		//lib.removeAll(slist);
 		//System.out.println(lib.toString());
 		
 		//�߰��� ��ȭ������ ArrayList�� ���� �߰��� ��ȭ�� ������ LinkedList�� ����.
 		//=========================================================================
 		//�����ٲٱ�
 		int n=(int)(Math.random()*lib.size());
 		int m=(int)(Math.random()*lib.size());
 		String tmp=lib.get(n);
 		lib.set(n, lib.get(m));
 		lib.set(m, tmp);
 		System.out.println(n+" <-> "+m);
 		System.out.println(lib.toString());
 		
	}
}
