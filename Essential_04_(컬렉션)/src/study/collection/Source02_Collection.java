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
		//두가지에 다 속하는경우도있다. 그래서 else if로 안했다.
		//LinkedHashSet은 두가지에 다속한다.
		//==============================================================================
		//공통목적은 객체 관리
		//basic operarion
		//int size() 관리하는 객체 개수
		//boolean isEmpty() 비어있는지 확인 (size()==0)
		//boolean contains(Object o) 특정객체를 가지고 있는지 확인
		//boolean add(Object o) 객체 저장후 성공여부 반환
		//boolean remove(Object o) 특정객체 삭제 성공여부 반환
		//Iterator iterator()//요소에 접근할수 있는 역할 커서역할
		String name=c.getClass().getName()+" / type : ";//객체 이름이 뜬다
		//System.out.println(name);//instanceof 사용해서 , 그 계열이 뭔지 출력

		if(c instanceof List)
			name+="List ";
		//System.out.println("List계열입니다.");
		if(c instanceof Set)
			name+="Set ";
		//System.out.println("Set계열입니다.");
		if(c instanceof Queue)
			name+="Queue ";
		//System.out.println("Queue계열입니다.");
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
				//저장실패유무
			}
		}
		//set 계열은 같은 객체를 저장안한다
		//List는 상관없음
		//객체저장이 타입에 다라서 실패할수도 있다.
		boolean cc=c.contains(ar);
		System.out.println(cc);

		System.out.println(c.size()+" / isEmpty ? "+c.isEmpty());
		//컬렉션은 리밋이 없다.
		//배열은 크기가 정해져있다.

		boolean z=c.remove(str);//str <=> ar
		System.out.println("remove = "+z);//지우는데 성공하면 true or false가 나온다.

		Iterator it=c.iterator();
		//탐색용 객체 안에 뭐가 있는지 알고싶을때 안에 데이터를 접근하게 해주는 용도




	}

}


