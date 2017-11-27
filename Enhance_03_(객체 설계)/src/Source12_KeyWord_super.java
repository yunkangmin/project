class Knife{
	int dmg;
}
//return super는 없다.
//super를 만들지도 않았고 존재하지도 않는데 자식쪽에서 리턴할 수 없다.
class Dagger extends Knife{
	int dmg;
	public Dagger(int dmg) {
		super.dmg=dmg;//자료형이 안맞다.
	}
	//하위쪽에서 재선언되어 가려지는 부모의 메소드나, 변수를 직접 사용하고 싶을 때 
	//사용하는것이 super키워드.
	public String toString() {
		return super.toString()+"{dmg:"+dmg+"}";
		//Object의 toString()이 호출된다.
	}
}
public class Source12_KeyWord_super {
public static void main(String[] args) {
	Dagger d= new Dagger(3);
	System.out.println(d.toString());
}
}
