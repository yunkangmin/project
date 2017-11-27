package study.set;


import java.util.*;
public class Source02_Set {

	public static void main(String[] args) {
		//�����δ� �ٸ� ��ü���� ���ٰ� �Ǵ��ϴ� ����.
		
		Integer i=new Integer(44);
		Integer ii=new Integer(44);
		System.out.println(i==ii);//�ΰ�ü�� �и��� �ٸ�.
		Set<Integer> set=new HashSet<>();
		set.add(i);
		set.add(i);//���� ��ü�� ������ ������ϰ�
		System.out.println(set.size());
		set.add(ii);//���� ��ü��� �ǴܵǸ�, ������ ���ϴµ�
		System.out.println(set.size());
		//======================================================
		//HashSet, LinkedHashSet���� ��쿣 
		boolean b=i.equals(ii);
		System.out.println(b);
		boolean bb=(i.hashCode()==ii.hashCode());//�� ��ü�� hashCode������
		//�ڽ��� value�� �����ϵ��� �������̵� �س���.
		System.out.println(bb);
		//hashcode�� �������̵� ���� ������ �ּҰ��� �����ϵ��� �����س���.
		//"".hashCode();
		
		//TreeSet ���� ��쿣
		Set<Integer> set2=new TreeSet<>();
		set2.add(i);
		set2.add(ii);
		System.out.println(set2.size());
		int t=i.compareTo(ii);
		//�۴ٰ� �����ϸ� �������� ����.
		System.out.println(t);
	}

}
