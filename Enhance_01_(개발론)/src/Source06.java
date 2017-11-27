/*
 * 객체지향 프로그래밍?
 * 절차지향과 다른점..?
 * 절차지향  언어에서는 주 핵심 데이터들을 프로그래머가 다 관리를 해야하는 번거로움이 있음.
 * 
 * */
public class Source06 {

	public static void main(String[] args) {
		int n1=(int)(Math.random()*20);
		int n2=(int)(Math.random()*20);
		int n3=(int)(Math.random()*20);

		//n1과 n2의 큰값을 사용해야 된다면, 절차지향방식같은 경우엔
		//데이터들을 항상 넘겨주어야 함 .
		int val1=Math.max(n1, n2);
		int val2=Math.min(n1, n2);
		System.out.println(val1+"..."+val2);

		//객체지향방식에서는 (객체=데이터보관과 보관하고 있는 데이터를 기반으로 한 작업을 할수 있는 
		//가상물체)
		//객체는 new라는 키워드로 만든다.
		//데이터저장능력이 있는 인스턴스를 생성(new)시켜서,
		//프로시져는 시키는 일만 할 수 있다.
		//데이터를 들고 있어야하는 번거로움이 있다
		//객체지향은 인스턴스를 생성해서 사용
		int ih0=System.identityHashCode(34);//이 괄호안에 설정해둔 데이터의 jvm상의 위치
		System.out.println(ih0);//실제메모리에 올라가진 않는다.
		//c는 중간매체가 없어 바로cpu메모리상에 올라간다.
		//자바는 jvm이 올려야된다고 생각하면 올리고 관리한다.
		
		System.out.println(System.identityHashCode(34));
		//34고정값 리터럴 값이 똑같다.
		
		int ihc=System.identityHashCode(new StringBuilder("JAVA"));//객체생성
		//System.identityHashCode()
		//"JAVA"라는 메시지를 저장하고 있는 객체이다.
		
		System.out.println(ihc);

		int ihc2=System.identityHashCode(new StringBuilder("JAVA"));
		//스트링빌더객체의 위치값
		System.out.println(ihc2);
		
		//new라는 키워드로 객체를 생성..(이때 만들어지는 가상물체들을 인스턴스라고 부른다)
		//객체(인스턴스) 제어를 하려면,new해서 만들어지는 위치값을 통해서 제어를 해야되는데,
		//이 값을 저장을 하려면, 만들었던 객체로 변수를 생성하시고 받아주시면 됨.
		StringBuilder sb=new StringBuilder("JAVA");
		//sb에는 위치값이 들어가있다.그 위치값을 통해서 제어를 한다.
		StringBuilder sb1=new StringBuilder("JAVA");
		
		System.out.println("==>"+System.identityHashCode(sb));
		System.out.println("==>"+System.identityHashCode(sb1));
		//서로 다른 주소이다.
		String s1=sb.toString();//객체가 가지고 있는 문자열이 나온다.
		String s2=sb1.toString();
		System.out.println(s1+"..."+s2);
		
		sb.insert(2, "!!!");//인덱스1번뒤에 추가
		sb1.append("!!!!");//맨뒤에 추가
		
		String s3=sb.toString();
		String s4=sb1.toString();
		System.out.println(s3+"..."+s4);
		//절차지향언어는 이런게 불가능
		//넘기고 받고 넘기고받고
		//메인에서 작업을 시키고 메인에서 처리한다.
		//객체지향에서는 일일이 기본데이터를 안넘겨줘도 된다
		//객체지향에서는 한번넘기면 거기에다가 계속적인 작업이 가능하다.
		//ex)sb1.append() sb1.insert()
		//함수 사용시 객체.함수이름 형식으로 사용
		//평균 합 max min 이런것들을 구할때 객체를 만들어 두고 사용하면 편하다.
		//관리적인 측면에서 훨씬 편하다.필요한 데이터만 넘겨주면 된다.
		//메인에서 너무 복잡하다.
		


	}

}
