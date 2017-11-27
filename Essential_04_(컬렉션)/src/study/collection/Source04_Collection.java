package study.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class Source04_Collection {

	public static void main(String[] args) {
		//Bulk Operation : �÷��� ��ü �۾�. ��뷮 �۾�
		
		Collection c1= new Vector();
		c1.add("����");//string wrapper��ü�� ��ü������ ���ϰ� ������ �ִ�.
		c1.add("����");
		c1.add("��å");
		c1.add("����");
		c1.add("������");
		//�÷��� ������ ��ȯ�� ������.
		//HashSet c2=(HashSet)c1;�̷� �ֱⰡ �ƴ϶�
		Collection c2=new HashSet(c1);//�迭�������  ���Ͱ� �ؽ������� �ٲ���.
		Collection c3=new PriorityQueue(c1);//�迭�������  ���Ͱ� �ؽ������� �ٲ���.
		//�÷��ǰ� ��ȯ����
		
		System.out.println(c2.toString());//�÷����� toString()�� �������� ��ü���� toString()�� ���
		//�ܼ�����Ȯ�� �Ҷ��� toString()���� Ȯ�� ���������� �ݺ����� ������ ���
		Collection p=new Stack();
		p.add("����");
		p.add("��å");
		
		//boolean containsAll(Collection) / boolean addAll(Collection ), boolean removeAll(Collection)
		//boolean retainAll(Collection) /void clear()
		
		boolean b1=c2.containsAll(p);//p�� ������ �ִ� ��ü�� c2�� ������ �ִ��� Ȯ�� �ϴ°�.
		System.out.println(b1);
		System.out.println(c2.toString());
		
		boolean b2=c2.addAll(p);//c2���ٰ� p�� ������ �ִ� ��ü�� �������ϰ� �����ϸ� true or false�� ��ȯ
		System.out.println(b2);//hashset�� ���ϰ�ü�� ������Ѵ�. List�迭�� ������ ���ϰ�ü ���尡��
		System.out.println(c2.toString());
		//set�迭�� ���ϰ�ü������ �ȵȴ�. 1�� �̻��� ��ü�� add�Ȱ����� return queue�� ���ϰ�ü ���尡��
		//set���� �Դٰ����ϸ� ���͸��� �ȴ�.
		boolean b3=c2.retainAll(p);//�����ո� �����.
		System.out.println(b3);//��ġ�� ���븸 �����.
		System.out.println(c2.toString());
		
		/*
		//������ remove�� �ѹ��̶� �ϸ� �Ʒ��� false�� ���. �÷��ǰ� ����
		boolean b3=c2.removeAll(p);//c2���� p�� ���� ��ü�� ����.
		System.out.println(b3);
		System.out.println(c2.toString());
		*/
		//c2.clear(); �÷��� �ʱ�ȭ. ������ �ִ� ��ü���� �ϴ� ������.
		
		//toArray()
		Object[] ar=c2.toArray();//�迭�� �������.
		System.out.println(ar.length);
		//===========��� �÷����� ������========================
		
		//��ü �÷��� �κ� �÷���
		//addAll�ϸ� �ٵ���.removeAll containsAll
		
	}

}
