import model.Unit;

/*
 * 객체지향언어에서 지원하는 상속(inheritance)=(확장/extension)이라는 개념.
 * 상속은 이미 만들어진기존 클래스가 가지고 있는 내용을 
 * 수정, 추가해서 새로운 클래스를 설계하는 기법
 * 
 * 개념을 설명하기 위해 이전 프로젝트에서 설계해둔, model패키지를 복사해서 가지고 오자.
 * 어떤 식으로 작동하는지 일단 보고, 어떻게 활용하는지 생각을 해보자.
 * 
 * public class를 설계하는게 아니라면, 개별파일이 필요없음
 */
//실제 설계되는 class [MagicUnit같이...]애를 하위클래스, subClass,자식클래스,파생클래스
//원본이 되는 class[Unit같이..]애를 상위클래스, superClass, 부모클래스, 원본클래스

class MagicUnit extends Unit{//extends : 확장
	public void selfHeal() {
		hp+=10;	//원본에 붙어있는 애들을 꼭 자기것 마냥 사용해서, 추가 기능 구현이 가능
		hp=hp>100?100:hp;//단 제한자에 걸리는 건 어쩔수 없음
		
		
	}
}


public class Source01_Suggest {
	public static void main(String[] args) {
		MagicUnit u= new MagicUnit();
		String s=u.toJSON();
		System.out.println(s);
		//u.hp=300;
		u.damageBy(30);//자식객체는 부모객체의 메소드를 자기 것마냥 쓸수있다.
		System.out.println(u.toJSON());
		u.selfHeal();
		System.out.println(u.toJSON());
	}
}
