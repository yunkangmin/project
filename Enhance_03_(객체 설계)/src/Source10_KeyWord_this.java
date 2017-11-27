/*
 * 객체 설계시에 쓸수 있는 키워드[this, super]?
 * this=해당객체를 의미하는 변수
 * super=해당객체의 부모를 의미하는변수
 * 
 * 매개변수나 자식쪽에서 만든 변수/메서드에 의해 부모를 접근 할 수 있는 상황일때,
 * 사용하게 됨.
 * 메소드안에서 매개변수의 이름과 멤버변수의 이름이 같을때사용. 
 */
class Weapon{
	int price;//필드로 잡혀있다고 치더라도

	public Weapon(int price) {//생성자나
		this.price=price;
	}
	public String toString() {//메소드에서 같은 이름변수를 사용할수 있게해둠
		String price="XX";	  //그랫을 경우에 멤버필드가 가려지게됨
		//그런 경우라면 this를 이용하면 이 가려져있는 멤버를 접근할수 있음
		//주로 사용하는 형태?
		//데이터를 세팅할때 같은 변수명으로 처리한다거나....1
		return "price = "+this.price+" / "+price;
	}
}
public class Source10_KeyWord_this {
	public static void main(String[] args) {

		Weapon w=new Weapon(3000);
		System.out.println(w.price);
		System.out.println(w.toString());
	}
}
