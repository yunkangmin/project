package study.collection;
import java.util.*;
public class Source03_Collection {

	public static void main(String[] args) {
			
		Collection c= new HashSet();//Set계열에서 가장 많이 사용되는 객체.
		
		System.out.println(c.isEmpty());//처음 만든것이기때문에 당연히 true가 뜬다.
		
		c.add("자바");//객체를 집어넣는다.문자열은 바로 객체가 생성된다.
		c.add(4);//autoboxing=>Integer AutoWrap //1.5부터 지원 오토박싱
		StringBuilder s=new StringBuilder("HANGMAN");
		c.add(s);
		
		boolean z=c.add(s);
		System.out.println(z);//콜렉션은 기본적으로 자신이 안가지고 있는 객체는 추가를 한다.
		//가지고 있는 객체를 더 저장하냐 안하냐(중복객체)=>계열에 따라 다르다.
		//set계열은 같은 객체를 저장안함.
		System.out.println(c.size());
		
		//이 컬렉션이 가지고 있는 객체를 접근할 수 있게 하는게 Iterator
		Iterator it=c.iterator();//이안에 객체값이 저장되어 있다.접근할수 있는 값만 보관.순환객체로 각각 접근
		while(it.hasNext()) {
			Object o=it.next(); //객체를 지워버리는 건 아니고, 객체값만 리턴
			System.out.println(o.getClass().getSimpleName());//class객체가 가지고 있는 메소드
			//동적클래스로딩
			if(o instanceof StringBuilder) {//StringBuilder인지 확인하고 형변환을 하는것
				((StringBuilder)o).append("~~");
			}
		}
		System.out.println(s.toString());
	/*	for(int cnt=1;cnt<=10;cnt++) {
		boolean b=it.hasNext();//접근할 수 있는 객체가 있냐 없느냐 를 알려줌.뽑아낼수있는 애가 있냐 없냐를 물어보는것.add와 한세트
		System.out.println("hasNext? "+b);
		Object o=it.next();//첫번쨰 객체값리턴.한번더 호출하면 그다음 객체가 나옴.
		System.out.println(o.getClass().getName());//size만큼 next를 해도 된다.
		//없는데 next로 뽑아서 터진다.
		}*/
		}

}
