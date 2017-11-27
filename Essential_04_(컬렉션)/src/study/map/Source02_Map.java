package study.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Source02_Map {
public static void main(String[] args) {
	//Map�� ���ʸ� �����Ҷ�, ����<k,v>�� �� �����ؾ� ��.
	Map<String,Integer> si=new LinkedHashMap<>();
	si.put("if",3); //���׸�Ÿ������ ������ Ÿ������ �����ؾ���.
	Integer z=si.get("if");
	//Ű ��ü�� Set���� �����Ǳ� ������ , Set�� ���ؼ� �ߺ��� �Ǵ��Ҽ� �ִ�,
	//�⺻ ��ü(String,Integer)���� key type�� 
	//���� ��ü�� ����ϸ� toSring hashCode equals�� �� �ۼ��ؾ� �ϴ� ���ŷο��� �ִ�.
	Map<Integer,String> is=new LinkedHashMap<>();
	is.put(1, "one");
	String s=is.get(1);
	//===============================================================================
	
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
		//ó�� ������ ���ĺ�(Ű)�̸� Ű�� ����Ƚ�� ���� �� 
	//====================================================================================
	
	Map<Character,Integer> sum=new HashMap<>();
	sum.put('z', 30);
	sum.put('p', 10);
	System.out.println(sum.toString());
	sum.putAll(counter);//���������� �÷����϶��� �ȴ�.���������.
	System.out.println(sum.toString());
	//sum.clear();
	System.out.println(sum.toString());
	
}
}
