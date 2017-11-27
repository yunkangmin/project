package study.set;
/*
 * Set 계열의 컬렉션은 중복되는 Elements(객체)를 저장을 하지 않는 컬렉션임.
 * 	동일객체(혹은 동일된다고 판단되는 객체) / -String 및 Wrapper객체는 데이터가 같으면 같다고 판단함.
 * 	
 * 	일반적으로 자주 쓰이는 class는
 *  HashSet: 속도는 제일 빠름. - 순서보장을 못받음.
 * 	LinkedHashSet: HashSet보다는 느린데 -순서보장을 받음.
 * 
 *  TreeSet:객체가 가지고 있는 value에 기반한 정렬된 형태로 보관.
 */
import java.util.*;
public class Source01_Set {
public static void main(String[] args) {
	Set<String> s1=new HashSet<>();
	Set<String> s2=new LinkedHashSet<>();
	Set<String> s3=new TreeSet<>();
	//앞에 타입을 설정했으면 뒤에는 설정안해도된다.
	
	String[] data="jan,feb,mar,feb,apr,may,may,jun,jan".toUpperCase().split(",");
	System.out.println(data[1]==data[3]);
	for(int i=0;i<data.length;i++) {
		boolean b1=s1.add(data[i]);
		boolean b2=s2.add(data[i]);
		boolean b3=s3.add(data[i]);
		System.out.println(b1+".."+b2+".."+b3);
	}
	System.out.println(s1.toString());//순서보장안됨
	System.out.println(s2.toString());//순서보장됨
	System.out.println(s3.toString());//제일 작은 값을 가지고 있는 데이터부터 출력
	//어쩃든 셋다 동일 객체는 저장을 안한다.
	//꼭같은 객체뿐만 아니라 다른 객체인데도 동일 하다고 판단되면 저장안한다.
	//Iterator로 출력해도 같은 결과가 나온다.
	//String계열은 객체가 달라도 내부 문자열이 같으면 같다고 판단한다.
	//hangman에 응용
}
}
