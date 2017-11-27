package study.generic;
/*
 * 컬레션 공통 기능 말고, 고유 특징을 살펴볼텐데, 그전에  Generic이란걸  살펴볼필요가 있다.
 * 
 * 
 */
import java.util.*;
class Sample<E>{//1.5이상부터만 generic 허용
	E data;
	Sample(){
		
	}
	E currentData() {//getter
		return data;
	}
	void changeData(E data) {//setter 꼭 set이나 get으로 시작안해도 된다.
		this.data=data;
	}
}
//===================================================
public class Source01_Generic {
	public static void main(String[] args) {
		Sample p= new Sample();//타입지정을 안하면 object로 설정된다.
		
		Sample<String> sp=new Sample<String>();//생성자의 매개변수타입이 object;
		sp.changeData("ss");//타입을 지정안하면 object로 설정된다.
		
		Sample<int[]>sp1=new Sample<int[]>();//int[]로 바뀐다.
		sp1.currentData();//하나의 객체를 타입별로 만들지말고 
		
		Set<String> s1=new HashSet<String>();//String으로 처리
		Set s=new HashSet();//object로 처리
		Set<Object> s2=new HashSet<Object>();//안써도 object이지만 그래도 Object라고 쓰자.
		//Collection으로 받으면 set기능을 쓸수 없어서 한단계내린것
		//부모타입으로는 제어가 안된다. 
		//is a raw type. References to generic type HashSet<E> should be parameterized 경고
		//제네릭타입을 설정해라.
		//Generic 자바 1.5부터 추가된 문법, 지금은 너무나 자연스러운 문법.
		//HashSet s=new HashSet();이렇게 해도 상관없다.
		
		//컬레션에 제너릭을 도입시켜둠.
		
		
		
		
		
		
		
		
	}
}
