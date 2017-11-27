import java.util.Date;

public class Source08_Date_USE {

	public static void main(String[] args) {
		Date b= new Date(0);//default생성은 System.currentTimeMillis()로 설정됨
		//시차때문에 0을 넣으며 9시가 나온다.
		System.out.println(b.toString());
		b.setYear(90);//1900+@
		//빗금은 설계자가 사용이 안될것으로 알고 사용자에게 사용하지말라고 표시해둔것
		//근데 사용은 가능하다.
		System.out.println(b.toString());
		b.setMonth(11);//JAN:0~DEC 11
		System.out.println();
		b.setDate(17);//1
		b.setHours(8);
		b.setMinutes(18);
		System.out.println(b.toString());
		long elapse=System.currentTimeMillis(); //b-fastTime
		System.out.println(elapse);
		//데이터자체를 직접수정할수 없기에 메소드를 이용하여 데이터를 간접수정
		//패키지 관리, 임포트, 객체안에 필드를 함부로 쓸수 없다, 접근제한자, 시야
		//private public protected default 
		//데이터보호를 위해서 오작동방지
		//메소드명 앞에 public을 붙여야 타 패키지에서도 사용가능하다.
		
		
	}

}
