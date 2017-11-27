package study.set;


import java.util.*;
public class Source02_Set {

	public static void main(String[] args) {
		//실제로는 다른 객체지만 같다고 판단하는 이유.
		
		Integer i=new Integer(44);
		Integer ii=new Integer(44);
		System.out.println(i==ii);//두객체는 분명히 다름.
		Set<Integer> set=new HashSet<>();
		set.add(i);
		set.add(i);//동일 객체는 무조건 저장안하고
		System.out.println(set.size());
		set.add(ii);//동일 객체라고 판단되면, 저장을 안하는데
		System.out.println(set.size());
		//======================================================
		//HashSet, LinkedHashSet같은 경우엔 
		boolean b=i.equals(ii);
		System.out.println(b);
		boolean bb=(i.hashCode()==ii.hashCode());//두 객체의 hashCode같으면
		//자신의 value를 리턴하도록 오버라이드 해놨음.
		System.out.println(bb);
		//hashcode는 오버라이드 하지 않으면 주소값을 리턴하도록 설정해놨다.
		//"".hashCode();
		
		//TreeSet 같은 경우엔
		Set<Integer> set2=new TreeSet<>();
		set2.add(i);
		set2.add(ii);
		System.out.println(set2.size());
		int t=i.compareTo(ii);
		//작다고 생각하면 앞쪽으로 저장.
		System.out.println(t);
	}

}
