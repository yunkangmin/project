package queue;
import java.util.*;
public class Source02_Deque {
	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		//collection�� ����ť�� �ƴϴ�. ť�� ��ӹ޾Ƽ� ����� ��ť Ư��ť
		//ArrayDeque�� ť�鼭 ��ť��ɱ��� �Ѵ�.
		//��������� �����Ҽ� �ִ�.
		//insert��� 2���� addFirst, offerFirst, addLast,offerLast
		//examine=getFirst,peekFirst,getLast,peekLast
		//remove=removeFirst,pollFirst,removeLast,pollLast
		//��������� �̾Ƴ���.
		dq.offerFirst(3);
		dq.offerLast(9);
		dq.offerFirst(11);
		dq.offerFirst(41);
		dq.addLast(99);
		System.out.println( dq.toString());
		System.out.println(dq.peekFirst());
		System.out.println(dq.getLast());
		//�߰��� ���̴��� �糡���������ִ�.
		System.out.println("poll....");
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq.toString());
		//queue�� Ȯ��� ����
		//list,add(0,obj)
		//list.get(list.size()-1)
		//list.remove(list.size()-1)
		//���� ���� �۾��� �ҽÿ��� queue�� ����ϴ°� ����.
		
	}
}
