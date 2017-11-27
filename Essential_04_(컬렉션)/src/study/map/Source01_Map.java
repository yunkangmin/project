package study.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Map이라는 Collection을 살펴보려고 한다.
 * 기존에 사용한 List,Set,Queue와는 사용하는 방법자체가 다름(계열자체가 다름)
 * 
 * # List,Set,Queue -공통점 / 관리할 객체값(밸류)만 넘기면 됨.
 * # Map - 저장할 밸류에 키값을 설정해서 넘겨야 함.
 * 		   밸류값을 키를 통해 제어할수 있음
 * 대표 Map / HashMap, LinkedHashMap, TreeMap,
 * 		특수 Map / Properties
 * 
 * 
 */
public class Source01_Map {
@SuppressWarnings("rawtypes")//경고를 누르는것
public static void main(String[] args) {
	//list set queue는 collection인터페이스가 최상위
	//기본 Usage
	//put,get,remove,containsKey,containsValue,size,isEmpty

	Map map=new HashMap<>();//동일(독립)인터페이스 스마트폰으로 치면 애플
	//4개다 물릴수 있다.
	//put : 객체 저장(키,밸류)
	System.out.println(map.isEmpty());//boolean isEmpty();
	map.put("one",1);//실제저장은 Integer(1)<- String("one");
	map.put("하나", 1);//밸류는 겹쳐도 상관없다.
	map.put("one", 11);//하나의 키에는 중복키를 허용안함(키는 반드시 하나의 밸류밖에 못가진다.)
	//"one"이 11로 바뀐다.
	
	int size=map.size();
	System.out.println("size = "+size);
	//저장시킬객체에 특정키를 붙인다.나중에 키를 가지고 밸류를 제어할수 있다.
	Object o=map.get("one");//제네릭설정을 안했기 때문에 Object
	System.out.println((o instanceof Integer)+" / "+o);//없는키를 쓰면 null이 뜬다.
	Object oo=map.get("two");
	System.out.println(oo+" / "+(oo==null));//get으로 가져오고 put으로 가져온다.
	//list는 인덱스로 접근 인덱스를 찾아야한다.
	
	Object z=map.remove("one");//키를 통해서 다 제어를 한다.지워지면서 그 객체값을 반환함
	System.out.println(z);//없는 키값을 입력하면 null이 뜬다.
	
	boolean b1=map.containsKey("one");//"one"이라는 키가 있냐
	System.out.println(b1);//없는 키를 넣는다면 false가 나온다.
	
	//키값을 set으로 관리 왜냐면 set은 중복객체를 저장안하기때문 키를 어떻게 관리하느냐에 따라
	//종류가 나뉜다.
	
	boolean b2=map.containsValue(1);//1을 가진 Integer객체가 있냐.
	System.out.println(b2);
	
	System.out.println(map.toString());
	
	
	
	
}
}
