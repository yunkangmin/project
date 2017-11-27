package study.collection;
/*
 * �÷����̶�� �Ҹ���� ��ü�� - (�����̳�)
 * ������ ������ �������� ����� ��ü��(����, �˻�, ���� ��..)
 * 
 * ���� ����� �� �ִ� Class���� ���ʿ������ε�, ũ�� �� �з��� ������������.
 * 
 * -Collection �迭 :
 * 		-Set / List / Queue
 * 
 * -Map �迭 :
 * 
 */
import java.util.*;
public class Source01_Collections {
public static void main(String[] args) {
	//new Collection(); �������̽��̱� ������ ���������� �ȵȴ�.
	Collection[]c=new Collection[] {new TreeSet(),new Vector(),new PriorityQueue(),
			new ArrayList(), new Stack(), new LinkedHashSet()};
	for(int i=0; i<c.length;i++) {
		boolean b1=c[i] instanceof Set;//Set�迭�̳ľƴϳ�
		boolean b2=c[i] instanceof List;
		boolean b3=c[i] instanceof Queue;
		System.out.println(b1+".."+b2+".."+b3);
		
	}
	Map[] m=new Map[] {new Hashtable(), new Properties(), new HashMap()};
	
	//�� �ΰ����� ��� �ݷ����̶�� �Ѵ�. �ΰ��� �������̽��̴�.
	//������� Ʈ������ �ʰ迭�� ������.�� �ؽ����̺��� �ݷ��ǿ� ������.
	//������ó���� ��ü
	//�迭�� �̿��ؼ� �����Ͱ����� �ϴ°� �Ѱ谡 �־ �ݷ����� ����Ѵ�.
	
}
}
