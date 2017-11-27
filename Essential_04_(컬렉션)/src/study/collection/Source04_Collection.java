package study.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class Source04_Collection {

	public static void main(String[] args) {
		//Bulk Operation : 컬렉션 전체 작업. 대용량 작업
		
		Collection c1= new Vector();
		c1.add("유비");//string wrapper객체는 객체생성을 안하고 넣을수 있다.
		c1.add("조조");
		c1.add("손책");
		c1.add("주유");
		c1.add("제갈량");
		//컬렉션 간에는 변환이 가능함.
		//HashSet c2=(HashSet)c1;이런 애기가 아니라
		Collection c2=new HashSet(c1);//배열계수설정  벡터가 해쉬셋으로 바꼇다.
		Collection c3=new PriorityQueue(c1);//배열계수설정  벡터가 해쉬셋으로 바꼇다.
		//컬렉션간 변환가능
		
		System.out.println(c2.toString());//컬렉션의 toString()은 관리중인 객체들의 toString()이 출력
		//단순내용확인 할때는 toString()으로 확인 내부적으로 반복문을 돌려서 출력
		Collection p=new Stack();
		p.add("유비");
		p.add("손책");
		
		//boolean containsAll(Collection) / boolean addAll(Collection ), boolean removeAll(Collection)
		//boolean retainAll(Collection) /void clear()
		
		boolean b1=c2.containsAll(p);//p가 가지고 있는 객체를 c2가 가지고 있는지 확인 하는것.
		System.out.println(b1);
		System.out.println(c2.toString());
		
		boolean b2=c2.addAll(p);//c2에다가 p가 가지고 있는 객체를 다저장하고 성공하면 true or false를 반환
		System.out.println(b2);//hashset은 동일객체를 저장안한다. List계열은 무조건 동일객체 저장가능
		System.out.println(c2.toString());
		//set계열은 동일객체저장이 안된다. 1개 이상의 객체가 add된건지를 return queue도 동일객체 저장가능
		//set에서 왔다갔다하면 필터링이 된다.
		boolean b3=c2.retainAll(p);//교집합만 남긴다.
		System.out.println(b3);//겹치는 내용만 남긴다.
		System.out.println(c2.toString());
		
		/*
		//그전에 remove를 한번이라도 하면 아래는 false가 뜬다. 컬렉션간 연산
		boolean b3=c2.removeAll(p);//c2에서 p가 가진 객체를 뺀다.
		System.out.println(b3);
		System.out.println(c2.toString());
		*/
		//c2.clear(); 컬레션 초기화. 가지고 있던 객체값을 싹다 날린다.
		
		//toArray()
		Object[] ar=c2.toArray();//배열로 만들어줌.
		System.out.println(ar.length);
		//===========모든 컬렉션의 공통기능========================
		
		//전체 컬레션 부분 컬렉션
		//addAll하면 다들어간다.removeAll containsAll
		
	}

}
