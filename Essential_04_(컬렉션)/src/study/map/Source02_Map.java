package study.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Source02_Map {
public static void main(String[] args) {
	//Map은 제너릭 설정할때, 형태<k,v>를 다 설정해야 함.
	Map<String,Integer> si=new LinkedHashMap<>();
	si.put("if",3); //제네릭타입으로 선언한 타입으로 설정해야함.
	Integer z=si.get("if");
	//키 객체가 Set으로 관리되기 때문에 , Set에 의해서 중복을 판단할수 있는,
	//기본 객체(String,Integer)들을 key type로 
	//임의 객체를 사용하면 toSring hashCode equals를 다 작성해야 하는 번거로움이 있다.
	Map<Integer,String> is=new LinkedHashMap<>();
	is.put(1, "one");
	String s=is.get(1);
	//===============================================================================
	
	String data="applemango";
	//Map을 이용해서, 알파벳별 등장 횟수
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
		//처음 등장한 알파벳(키)이면 키와 등장횟수 저장 또 
	//====================================================================================
	
	Map<Character,Integer> sum=new HashMap<>();
	sum.put('z', 30);
	sum.put('p', 10);
	System.out.println(sum.toString());
	sum.putAll(counter);//같은형태의 컬렉션일때만 된다.덮어씌어진다.
	System.out.println(sum.toString());
	//sum.clear();
	System.out.println(sum.toString());
	
}
}
