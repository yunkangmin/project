package queue;
import java.util.*;
/*
 * 기본 컬렉션 기능 외에,넣은 순서대로 차례대로 데이터를 뽑아다 쓸수 있는 기능이 구현이 되있음.
 * 중복저장은 일단 허용
 * E element()
 * boolean offer(E e) == boolean add(E e)
 * 
 * E poll() == E remove()
 * 리스트로하는것보다 성능이 훨씬 뛰어나다.
 * 
 * 
 */
public class Source01_Queue {

	public static void main(String[] args) {
		Queue<String> q1=new ArrayDeque<>();//FIFO 형태의 컬렉션 선입선출
		q1.add("전사");//First In First out 1.5부터
		q1.offer("전사");//둘이 똑같은 기능
		q1.add("사냥꾼");//집어넣는것
		System.out.println(q1.size());
		
		String s1=q1.element();//0번째 요소가 나온다.
		System.out.println(s1);//지우진 않고 확인
		String s2=q1.peek();
		System.out.println(s2);
		//================================================
		q1.remove("마법사");
		String s3=q1.remove();
		System.out.println(s3);
		System.out.println(q1.size());
		q1.poll();//전사
		String s4=q1.poll();//애네는 지워버린는것
		System.out.println(s4);
		System.out.println(q1.isEmpty());
		String s5=q1.poll();//poll remove객체가 없었을때 null을 반환하냐 터지냐
		System.out.println(s5);
		//데이터를 차곡차곡쌓아놓고 사용하고 싶을때는 queue를 쓰면된다.
		//get을 못쓴다. 보관된 순서대로 차례대로 쓸수있게
		
		//무조건 앞에서 부터 뽑아다쓸수 밖에 없게 되어 있는 객체
		//LinkedList는 queue와 list의 기능을 짬뽕을 시켜놈 그렇다고 해서 queue는 아님.
		//list면서 queue
		//collection 에서 바로 만들어진게 list queue set이다.
		//collection위에 iterator
		
	}

}
