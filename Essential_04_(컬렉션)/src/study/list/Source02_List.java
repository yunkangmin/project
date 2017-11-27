package study.list;



import java.util.*;
public class Source02_List {

	public static void main(String[] args) {
		
		
		List<Integer> li=new Vector<>();
		//1.0부터 존재 [1.0 ~ 1.2(ArrayList등장시점)이전에 나온 설계된 클래스같은 경우에
		//Vector를 요구하는 class들이 있음. 그래서 알아둬야한다.
		for(int num=10;num<=100;num+=10) {
			li.add(num);
		}
		System.out.println(li.toString());
		ListIterator<Integer> it=li.listIterator(); 
		//List고유기능
		//listIterator는 앞뒤로도 갈수 있다.
		System.out.println(/**/it.nextIndex()+"..."+it.previousIndex());
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.println(i);
		}
		System.out.println(it.hasNext()+" / "/**/+it.hasPrevious());
		System.out.println(it.nextIndex()+"..."+it.previousIndex());
		while(it.hasPrevious()) {
			Integer i=it.previous();
			System.out.println(i);
		}
		//List에서는 Iterator보다는 Index를 통해서 객체 제어를 할 수 있기 때문에
		//이런 형태로도 순회가능함
		for(int idx=0;idx<li.size();idx++) {
			Integer s=li.get(idx);
			System.out.println(s);
		}
		Integer iz=new Integer(30);
		int n=li.indexOf(iz);
		System.out.println("index ? "+n);//HashCode가 equals로 객체를 동일하다고 판단함.
		
	}

}
