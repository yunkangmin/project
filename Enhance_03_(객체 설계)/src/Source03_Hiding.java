//해당객체마다 public으로 파일을 만들어두는게 좋다.


public class Source03_Hiding {
	public static void main(String[] args) {
		Base b=new Base();
		System.out.println(b.toString());
		b.addValue(30);
		System.out.println(b.toString());
		System.out.println("=========");
		
		Multi m= new Multi();
		System.out.println(m.flag);
		System.out.println(m.val);
		m.addValue(1,1);
		System.out.println(m.val);
		//==========================
		//이 객체를 만들어서 사용할때,
		m.addValue(20);//해당 실 객체의 메서드가 작동함
		System.out.println(m.toString());
		//원본메서드가 작동하는거임. 원본 기능 그대로 사용됨.
		System.out.println(m.toJSON());
		
	}
}
/*상속받아서 설계들어가는 하위 class에서 
 * 필드를 같은 이름으로 만드는 경우는 거의 없음.-어떤 결과가 나온다는걸 예측할수
 * 잇기만 하면 됨
 * 
 * 메소드 같은 경우는 같은 형태로 오버라이드를 해서 사용하는 경우가 많음
 * -다형성이라는 객체 접근 버그 현상(다형성)을 이용하기 위해서,
 * 
 * 
 */
