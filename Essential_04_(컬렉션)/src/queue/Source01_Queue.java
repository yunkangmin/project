package queue;
import java.util.*;
/*
 * �⺻ �÷��� ��� �ܿ�,���� ������� ���ʴ�� �����͸� �̾ƴ� ���� �ִ� ����� ������ ������.
 * �ߺ������� �ϴ� ���
 * E element()
 * boolean offer(E e) == boolean add(E e)
 * 
 * E poll() == E remove()
 * ����Ʈ���ϴ°ͺ��� ������ �ξ� �پ��.
 * 
 * 
 */
public class Source01_Queue {

	public static void main(String[] args) {
		Queue<String> q1=new ArrayDeque<>();//FIFO ������ �÷��� ���Լ���
		q1.add("����");//First In First out 1.5����
		q1.offer("����");//���� �Ȱ��� ���
		q1.add("��ɲ�");//����ִ°�
		System.out.println(q1.size());
		
		String s1=q1.element();//0��° ��Ұ� ���´�.
		System.out.println(s1);//������ �ʰ� Ȯ��
		String s2=q1.peek();
		System.out.println(s2);
		//================================================
		q1.remove("������");
		String s3=q1.remove();
		System.out.println(s3);
		System.out.println(q1.size());
		q1.poll();//����
		String s4=q1.poll();//�ֳ״� ���������°�
		System.out.println(s4);
		System.out.println(q1.isEmpty());
		String s5=q1.poll();//poll remove��ü�� �������� null�� ��ȯ�ϳ� ������
		System.out.println(s5);
		//�����͸� ��������׾Ƴ��� ����ϰ� �������� queue�� ����ȴ�.
		//get�� ������. ������ ������� ���ʴ�� �����ְ�
		
		//������ �տ��� ���� �̾ƴپ��� �ۿ� ���� �Ǿ� �ִ� ��ü
		//LinkedList�� queue�� list�� ����� «���� ���ѳ� �׷��ٰ� �ؼ� queue�� �ƴ�.
		//list�鼭 queue
		//collection ���� �ٷ� ��������� list queue set�̴�.
		//collection���� iterator
		
	}

}
