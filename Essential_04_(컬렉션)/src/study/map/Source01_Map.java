package study.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Map�̶�� Collection�� ���캸���� �Ѵ�.
 * ������ ����� List,Set,Queue�ʹ� ����ϴ� �����ü�� �ٸ�(�迭��ü�� �ٸ�)
 * 
 * # List,Set,Queue -������ / ������ ��ü��(���)�� �ѱ�� ��.
 * # Map - ������ ����� Ű���� �����ؼ� �Ѱܾ� ��.
 * 		   ������� Ű�� ���� �����Ҽ� ����
 * ��ǥ Map / HashMap, LinkedHashMap, TreeMap,
 * 		Ư�� Map / Properties
 * 
 * 
 */
public class Source01_Map {
@SuppressWarnings("rawtypes")//��� �����°�
public static void main(String[] args) {
	//list set queue�� collection�������̽��� �ֻ���
	//�⺻ Usage
	//put,get,remove,containsKey,containsValue,size,isEmpty

	Map map=new HashMap<>();//����(����)�������̽� ����Ʈ������ ġ�� ����
	//4���� ������ �ִ�.
	//put : ��ü ����(Ű,���)
	System.out.println(map.isEmpty());//boolean isEmpty();
	map.put("one",1);//���������� Integer(1)<- String("one");
	map.put("�ϳ�", 1);//����� ���ĵ� �������.
	map.put("one", 11);//�ϳ��� Ű���� �ߺ�Ű�� ������(Ű�� �ݵ�� �ϳ��� ����ۿ� ��������.)
	//"one"�� 11�� �ٲ��.
	
	int size=map.size();
	System.out.println("size = "+size);
	//�����ų��ü�� Ư��Ű�� ���δ�.���߿� Ű�� ������ ����� �����Ҽ� �ִ�.
	Object o=map.get("one");//���׸������� ���߱� ������ Object
	System.out.println((o instanceof Integer)+" / "+o);//����Ű�� ���� null�� ���.
	Object oo=map.get("two");
	System.out.println(oo+" / "+(oo==null));//get���� �������� put���� �����´�.
	//list�� �ε����� ���� �ε����� ã�ƾ��Ѵ�.
	
	Object z=map.remove("one");//Ű�� ���ؼ� �� ��� �Ѵ�.�������鼭 �� ��ü���� ��ȯ��
	System.out.println(z);//���� Ű���� �Է��ϸ� null�� ���.
	
	boolean b1=map.containsKey("one");//"one"�̶�� Ű�� �ֳ�
	System.out.println(b1);//���� Ű�� �ִ´ٸ� false�� ���´�.
	
	//Ű���� set���� ���� �ֳĸ� set�� �ߺ���ü�� ������ϱ⶧�� Ű�� ��� �����ϴ��Ŀ� ����
	//������ ������.
	
	boolean b2=map.containsValue(1);//1�� ���� Integer��ü�� �ֳ�.
	System.out.println(b2);
	
	System.out.println(map.toString());
	
	
	
	
}
}
