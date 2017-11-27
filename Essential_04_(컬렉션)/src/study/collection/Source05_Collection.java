package study.collection;
import java.util.*;
import java.util.stream.Stream;
public class Source05_Collection {

	public static void main(String[] args) {
		//Traversing Collection : 객체 탐색(순회)객체접근
		//4가지 방법으로 순회
		//1.toArray해서 ,받아서 밖에서 제어 어쨌든 객체를 쓸수 있긴 하다.
		//2.Iterator 이용해서
		//3.for-each 이용해서
		Collection c=new LinkedHashSet();
		c.add("밀짚모자_루피");
		c.add("혁명군_사보");
		c.add("흰수염_에이스");
		c.add("혁명군_드래곤");
		c.add("해군_거프");
		
		//아래 방식이 제일 편하다. 1.5이상에서부터 지원
		for(Object o:c) {//원래는 for(Object o=it.next();it.has.Next();o=it.next())이 형태???
			//while(it.hasNext()) Object o= it.next();
			System.out.println(o.toString());//matches는 object라서 안된다. 할려면 스트링으로 캐스팅 해야함
			if(o instanceof String) {
				while(((String)o).startsWith("혁명군")) {
				System.out.println(o);
				break;
				}
			}
		}
		//4. jdk1.8+이상에서만 작동.  일단 보류
		System.out.println("=======================================");
		c.stream().forEach(o->System.out.println((o instanceof String)+"/ "+o));
		                     //그다음 해야될작업 설정 액션하나설정
		
		

	}

}
