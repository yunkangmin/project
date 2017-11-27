package study.map;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Source03_Map {

	public static void main(String[] args) {
		String data="applemango";
		//Map�� �̿��ؼ�, ���ĺ��� ���� Ƚ��
		Map<Character,Integer> counter=new TreeMap<>();
		for(int i=0;i<data.length();i++) {
			char c=data.charAt(i);
			//System.out.println(c);
			if(counter.containsKey(c)) {
				Integer val=counter.put(c,counter.get(c)+1);//Autoboxing
				counter.put(c, val+1);
			}else {
				counter.put(c, 1);
			}
			//String:charAt  / String :length
			//Map:get / Map :put / Map:containKey
		}
		System.out.println(counter.toString());
		Integer i=counter.get('y');
		System.out.println(i);
			//ó�� ������ ���ĺ�(Ű)�̸� Ű�� ����Ƚ�� ���� 
		//===========================================================================
		//Collection View
		Set<Character> key =counter.keySet();//Ű���鸸 set���� ������ش�.Ű�� �ߺ������� �ȵǹǷ�
		System.out.println(key.toString());
		
		Collection<Integer> value=counter.values();//�ݷ������� ��ȯ�Ѵ�.�����Ͻ�Ű������ �𸥴�.
		
		System.out.println(value.toString());//set type�� �ƴҲ���, List, Queue ���� ��ü�� �������Ƿ�
		
		Set<Entry<Character,Integer>> entry =counter.entrySet();
		//map���׸��� ���󰣴�.
		
		//Ű����� ��� ��Ʈ���� �����.�׸��� set���� ��ȯ.
		//ctrl+shift+o :Entry
		System.out.println(entry.toString());
		for(Entry<Character,Integer> e:entry) {
			//set�� ������ ��� Iterator
			//System.out.println("->"+e.toString());
			//System.out.println(e.getKey()+"------>"+e.getValue());
			if(e.getValue().equals(2)) {
				System.out.println(e.getKey());
			}
		}
	}//Ű�� ����� ��� ��ü�� �������
	//��Ʈ���θ����� Ű�� ����� ���� �ǾƼ� �����ִ°�
	
	//����ü�� �÷������� �ٲ۴�.
	//
	//����� �����ϰ� �ʹ� ��Ʈ���� �ϸ�ȴ�.

}
