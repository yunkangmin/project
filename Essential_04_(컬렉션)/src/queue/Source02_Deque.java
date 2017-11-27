package queue;
import java.util.*;
public class Source02_Deque {
	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		//collection의 직속큐는 아니다. 큐를 상속받아서 만든게 디큐 특수큐
		//ArrayDeque는 큐면서 디큐기능까지 한다.
		//양방향으로 접근할수 있다.
		//insert방법 2가지 addFirst, offerFirst, addLast,offerLast
		//examine=getFirst,peekFirst,getLast,peekLast
		//remove=removeFirst,pollFirst,removeLast,pollLast
		//양방향으로 뽑아낸다.
		dq.offerFirst(3);
		dq.offerLast(9);
		dq.offerFirst(11);
		dq.offerFirst(41);
		dq.addLast(99);
		System.out.println( dq.toString());
		System.out.println(dq.peekFirst());
		System.out.println(dq.getLast());
		//중간은 못뽑느다 양끝만뽑을수있다.
		System.out.println("poll....");
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq.toString());
		//queue의 확장된 개념
		//list,add(0,obj)
		//list.get(list.size()-1)
		//list.remove(list.size()-1)
		//위에 같이 작업을 할시에는 queue를 사용하는게 낫다.
		
	}
}
