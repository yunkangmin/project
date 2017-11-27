package study.map;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Source03_Map {

	public static void main(String[] args) {
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
		Integer i=counter.get('y');
		System.out.println(i);
			//처음 등장한 알파벳(키)이면 키와 등장횟수 저장 
		//===========================================================================
		//Collection View
		Set<Character> key =counter.keySet();//키값들만 set으로 만들어준다.키는 중복저장이 안되므로
		System.out.println(key.toString());
		
		Collection<Integer> value=counter.values();//콜렉션으로 반환한다.뭘리턴시키는지는 모른다.
		
		System.out.println(value.toString());//set type은 아닐꺼임, List, Queue 동일 객체가 들어가있으므로
		
		Set<Entry<Character,Integer>> entry =counter.entrySet();
		//map제네릭을 따라간다.
		
		//키밸류를 묵어서 엔트리를 만든다.그리고 set으로 반환.
		//ctrl+shift+o :Entry
		System.out.println(entry.toString());
		for(Entry<Character,Integer> e:entry) {
			//set을 돌리는 방법 Iterator
			//System.out.println("->"+e.toString());
			//System.out.println(e.getKey()+"------>"+e.getValue());
			if(e.getValue().equals(2)) {
				System.out.println(e.getKey());
			}
		}
	}//키와 밸류를 묶어서 객체로 만들어줌
	//엔트리로만들어둔 키와 밸류를 따로 뽀아서 쓸수있는것
	
	//맵전체를 컬렉션으로 바꾼다.
	//
	//밸류로 추출하고 싶다 엔트리로 하면된다.

}
