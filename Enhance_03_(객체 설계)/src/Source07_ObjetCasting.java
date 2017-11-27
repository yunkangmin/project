import hospital.Corpse;
import hospital.Doctor;
import hospital.Patient;
import hospital.Sims;

/*
 * 상속(=확장)
 * 이미 존재하는 ○ class에 변경(내용추가. 기능변경)을 가한
 * 								□class를 설계하는 것
 * 효과?
 * -객체 리모델링이 용이
 * -공통 부분 추출로 여러 객체 설계 용이
 * -다형성을 이용한 여러객체 제어 가능.
 * 
 * 
 */
public class Source07_ObjetCasting {
	public static void main(String[] args) {
		//객체값 캐스팅이 가능함.
		Corpse c=new Corpse();
		Patient p=(Patient)c;//c객체를 Patient 객체라고 생각하고
		//객체 제어가 됨
		System.out.println("1st done..");
		Sims s=(Sims)p;
		System.out.println("2nd done..");
		Patient pp=(Patient)s;
		System.out.println("3rd done..");
		//항상 되는건 아니고, 같은 상속계층에서만
		//Doctor d=(Doctor)p;//상속관계가 아니여서 안된다.
		//계열이 다르면 컴파일 실패
		Doctor d=(Doctor)s;//객체캐스팅은 런타임에러가 발생할수 있음
		//컴파일에러는 아니다.시도는 된다.
		//실제로 안바껴서 에러가 난다.
		System.out.println("4th done..");
		//이과정에서 생략이 부모타입으로 올리는 경우는 ()생략할수 있음.
		//객체값을  부모타입으로 올리는걸 업캐스팅.
		//객체값을 자식타입으로 내리는 걸 다운캐스팅.
		//업캐스팅은 ()생략가능
		//객체캐스팅은 항상 성공하는건 아님.해당객체로 안바뀌면 캐스팅 실패가 
		//뜰수도 있다.
		//이걸 이용하기 위해서 상속구조를 만듬.
	}
}
