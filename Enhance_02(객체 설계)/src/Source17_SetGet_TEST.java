/*
 * setter ? -제한자에 막혀서 직접설정이 안되는 필드에 데이터를 설정할수 있게 해둔 메소드
 * getter ? -제한자에 막혀서 값 직접확인이 안되는 필드에 데이터를 확인할 수 있게 해둔 메소드
 * 
 * 
 * 
 */import java.text.DecimalFormat;//수치형 데이터를 특정 포맷의 문자열로 만들어주는 객체
		 
public class Source17_SetGet_TEST {
public static void main(String[] args) {
	new DecimalFormat();
	
	DecimalFormat df=new DecimalFormat("#,###");//3자리마다 콤마가 찍혀서 나옴
	int price=3270000;
	String sPrice=df.format(price);
	System.out.println(sPrice);//다른 포맷의 문자열이 필요하다면 (4자리마다 구분해주는)
	//System.out.println(df.posSuffixPattern);//이 변수에 직접 "#,####"이렇게 할수만
	//있으면 다르게 작동함.
	df.applyPattern("#,####");
	//해당 객체가 가지고 있는 패턴 저장값에 데이터를 세팅을 시킴.
	//이런 기능을 가지고 있다면 setter라고 부르는거임.
	//해당데이터에 영향을 끼쳤음.
	//setXXXX일반적으로 이렇게 만들긴 하지만 아닌 경우도 있다.
	//웹사이트에서 숫자를 표현할 때 유용하다.
	System.out.println(df.format(price));
}
}
