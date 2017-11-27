import model.Function;

public class Source12_Function_TEST {

	public static void main(String[] args) {
		//객체지향의 장점은
		//여러개를 생성해도 개별적인 instance영역이 생기는 게 장점
		
		//Function f=new Function();
		//f.max(3, 2);
		
		int t=Function.max(3,2);
		System.out.println(t);
	}

}
