package study.list;
/*
 * List 계열은 index가 있는 컬렉션 / 중복객체를 저장을 함 /기본적인 기능은 다 있다./add되는 것을 번호를 붙여둔다.배열같은 느낌
 *  기본컬렉션의 기능은 다 있고, 추가적으로  들어간 순서대로 기억.
 *  포지션을 통한 access가 가능 get(int index), remove(int index)
 * 	search도 가능함 / (indexOf(Object), lastIndexOf(Object))
 *  RangeView가 가능.(일부분을 추출해서 컬렉션을 만들어낼수 있다.)
 * 	//////////////////전용 Iterator가 추가적으로 있음.///////////////
 * 	
 * 	-Vector : 배열기반 :jdk1.0부터 존재 ArrayList의 구버전(동기화를 처리 : 무겁다) 
 * 	-ArrayList : 배열기반 : 보통의 경우에 가장 성능이 좋음 1.2에서 만들어짐 (동기화를 처리안함 : 가볍고)
 * 	-LinkedList : 객체간 연결을 시켜서 배열처럼 작동됨. 1번이 2번의 주소를 알고 있고 2번이 1번과 3번의 주소를 알고 있음.
 * 	 특정상황에서는 성능이 좋음.(동기화 처리안함)
 * 
 * 	동기화를 처리안해야 성능이 더 좋다.
 * 
 *  동기화(syncronized)는 멀티쓰레드 상황에서만 볼수 있음.
 * 
 */
import java.util.*;
public class Source01_List {
	public static void main(String[] args) {
		List<String> lia=new Vector<>();
		List<String> lib=new ArrayList<>();
		List<String> lic=new LinkedList<>();
		//List라는 인터페이스로 규칙을 만들어둚.
		
		//원래 컬렉션에 없던 기능중에 있는거 
		//순서가 있기 때문에 중간에 자료를 넣을수 있다. 배열보다 더 좋다.
		//add는 기본적으로 맨뒤에 넣는다.
		lib.add("조조");
		lib.add("조조");//동일 객체 저장
		System.out.println(lib.size());
		boolean b=lib.contains("조조");
		System.out.println(b);
		//위에는 collection에 원래 있는 기능들
		
		//index를 access : add(int idx, E e)
		lib.add(1, "사마의");
		System.out.println(lib.toString());
		//set(int idx, E e)
		lib.set(2, "하후돈");
		System.out.println(lib.toString());
		//없는 인덱스를 접근하면 터진다.
		
		//remove(int idx) object를 지우는건 원래 있지만 인덱스로 지우는 건 여기에만있다.
 		lib.remove(0);
 		System.out.println(lib.toString());
 		
 		//E get(int idx)
 		String s=lib.get(1);//1번위치에 있는 값만 가져온다.
 		System.out.println(s);
 		System.out.println(lib.toString());
 		//=========================================================================
 		lic.add("여몽");
 		lic.add("주유");
 		lic.add("육손");
 		lib.addAll(1,lic);//특정위치에 addAll시키는것이 가능.
 		System.out.println(lib.toString());
 		//특정위치의 값을 찾고 싶으면 List를 사용
 		//=========================================================================
 		int i=lib.indexOf("여몽");//indexOf와 lastIndexOf를 하면 다르게 나올수도 있다.
 		System.out.println(i);
 		//=========================================================================
 		List<String> slist=lib.subList(1, 4);   //from<=    <to
 		System.out.println(slist.toString());//원본은 안바뀐다.그 부분만 추출해서 준다.
 		System.out.println(lib.toString());
 		
 		//lib.removeAll(slist);
 		//System.out.println(lib.toString());
 		
 		//중간에 변화없으면 ArrayList가 좋고 중간에 변화가 있으면 LinkedList가 낫다.
 		//=========================================================================
 		//순서바꾸기
 		int n=(int)(Math.random()*lib.size());
 		int m=(int)(Math.random()*lib.size());
 		String tmp=lib.get(n);
 		lib.set(n, lib.get(m));
 		lib.set(m, tmp);
 		System.out.println(n+" <-> "+m);
 		System.out.println(lib.toString());
 		
	}
}
