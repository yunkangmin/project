package study.collection;
/*
 * 컬렉션이라고 불리우는 객체들 - (컨테이너)
 * 데이터 관리를 목적으로 설계된 객체들(저장, 검색, 조작 등..)
 * 
 * 실제 사용할 수 있는 Class들은 수십여가지인데, 크게 두 분류로 나뉘어져있음.
 * 
 * -Collection 계열 :
 * 		-Set / List / Queue
 * 
 * -Map 계열 :
 * 
 */
import java.util.*;
public class Source01_Collections {
public static void main(String[] args) {
	//new Collection(); 인터페이스이기 때문에 직접생성은 안된다.
	Collection[]c=new Collection[] {new TreeSet(),new Vector(),new PriorityQueue(),
			new ArrayList(), new Stack(), new LinkedHashSet()};
	for(int i=0; i<c.length;i++) {
		boolean b1=c[i] instanceof Set;//Set계열이냐아니냐
		boolean b2=c[i] instanceof List;
		boolean b3=c[i] instanceof Queue;
		System.out.println(b1+".."+b2+".."+b3);
		
	}
	Map[] m=new Map[] {new Hashtable(), new Properties(), new HashMap()};
	
	//이 두가지를 묶어서 콜렉션이라고 한다. 두가지 인터페이스이다.
	//예를들어 트리셋은 맵계열에 못들어간다.또 해쉬테이블은 콜렉션에 못들어간다.
	//데이터처리용 객체
	//배열을 이용해서 데이터관리를 하는건 한계가 있어서 콜렉션을 사용한다.
	
}
}
