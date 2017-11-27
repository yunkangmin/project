package study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Source02_Collection {

	public static void main(String[] args) {
		Collection[]collections=new Collection[] {/*new TreeSet(),*/new Vector(),new PriorityQueue(),
				new ArrayList(), new Stack(), new LinkedHashSet()};

		Collection c=collections[(int)(Math.random()*collections.length)];//new LinkedList();
		//�ΰ����� �� ���ϴ°�쵵�ִ�. �׷��� else if�� ���ߴ�.
		//LinkedHashSet�� �ΰ����� �ټ��Ѵ�.
		//==============================================================================
		//��������� ��ü ����
		//basic operarion
		//int size() �����ϴ� ��ü ����
		//boolean isEmpty() ����ִ��� Ȯ�� (size()==0)
		//boolean contains(Object o) Ư����ü�� ������ �ִ��� Ȯ��
		//boolean add(Object o) ��ü ������ �������� ��ȯ
		//boolean remove(Object o) Ư����ü ���� �������� ��ȯ
		//Iterator iterator()//��ҿ� �����Ҽ� �ִ� ���� Ŀ������
		String name=c.getClass().getName()+" / type : ";//��ü �̸��� ���
		//System.out.println(name);//instanceof ����ؼ� , �� �迭�� ���� ���

		if(c instanceof List)
			name+="List ";
		//System.out.println("List�迭�Դϴ�.");
		if(c instanceof Set)
			name+="Set ";
		//System.out.println("Set�迭�Դϴ�.");
		if(c instanceof Queue)
			name+="Queue ";
		//System.out.println("Queue�迭�Դϴ�.");
		System.out.println(name);
		int s=c.size();
		System.out.println(s);
		
		boolean e=c.isEmpty();
		System.out.println(e);

		int[]ar=new int[] {1,2,3,4};
		String str="java";
		c.add(str);

		if(Math.random()>0.5) {
			for(int cnt=1;cnt<=3;cnt++) {
				boolean ca=c.add(ar);
				System.out.println("ADD event : "+ca);
				//�����������
			}
		}
		//set �迭�� ���� ��ü�� ������Ѵ�
		//List�� �������
		//��ü������ Ÿ�Կ� �ٶ� �����Ҽ��� �ִ�.
		boolean cc=c.contains(ar);
		System.out.println(cc);

		System.out.println(c.size()+" / isEmpty ? "+c.isEmpty());
		//�÷����� ������ ����.
		//�迭�� ũ�Ⱑ �������ִ�.

		boolean z=c.remove(str);//str <=> ar
		System.out.println("remove = "+z);//����µ� �����ϸ� true or false�� ���´�.

		Iterator it=c.iterator();
		//Ž���� ��ü �ȿ� ���� �ִ��� �˰������ �ȿ� �����͸� �����ϰ� ���ִ� �뵵




	}

}


