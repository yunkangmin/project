
public class Source02_Wrapper {

	public static void main(String[] args) {
		//Wrapper class 와 data간에 Auto Boxing,Auto Unboxing(자동으로 
		//Wrap이 되고, UnWrap
		//1.5버전이후부터 개발자의 편의를 위해서 지원 컴파일버전
		int v=2;//byte범위내에서는 된다.-128~127
		Integer i=v;//이제 허용이 됬다.자동으로 Wrap처리가 된다.(Auto Boxing)
		int vv=i;//자동으로 UnWrap되서 int로 변환되기도 함.(Auto UnBoxing)
		Integer ii=2;
		System.out.println(i==ii);
		
		Character c='문';
		Character cc='문';
		System.out.println(c+" vs "+cc);
		System.out.println(c==cc);
		
		//자동방식 될때는 사용되는 메소드가, Wrapper class의 valueOf메소드가 작동하는것.
		Integer izz=21;
		Integer iz=Integer.valueOf(21);//이 값을 null로 바꾸면?
		System.out.println("====================");
		System.out.println(izz+iz);//객체값비교 언박싱이일어난다.(계산, 대입)
		Integer cmp=new Integer(21);
		System.out.println(izz==iz);
		System.out.println(cmp==iz);
		
		Boolean t=false;
		Boolean t2=Boolean.valueOf(false);
		System.out.println(t==t2);//cache처리 true
		Boolean t3=new Boolean(false);//new로 처리한것들은 무조건 다르다.
		System.out.println(t==t3);
		t3=null;
		//boolean b=t3;//t3.booleanValue();
		//t3이 null이어서 터진다.
	
		//기본적으로 new가 들어가는것들은 아무리 ==해도 다르다고 뜬다.
		//Integercache를 이용해서 같은 객체가 나올수도 있다.
		//-128~127사이의 이미한번이라도 만든 객체들은 그객체값을 리턴한다.
		//String과 비슷한 의미
	
	}

}
