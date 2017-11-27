
//해당객체마다 public으로 파일을 만들어두는게 좋다.
//디폴트클래스는 파일이름과 클래스명이 달라도 된다.
public class Base{
	int val;
	boolean flag;
	public Base() {
		val=99;
		flag=true;
		System.out.println("constructor base");
	}
	public String toString() {
		return val+"("+flag+")";
	}
	public void addValue(int d) {
		val+=d;
	}
}
/**/class Multi extends Base{
	int flag;//원래 부모에게 있엇지만,겹쳐서 만들면
	//변수도 가려버린다.
	public Multi() {
		val=199;
		flag=10;//그게 우선시 작동한다.
		System.out.println("constructor Multi");
	}
	//오버로드
	public void addValue(int a,int b) {
		addValue(a);
		addValue(b);
	}
	//오버라이드
	public void addValue(int d) {
		val+=d*2;
	}
	public String toJSON() {
		return val+"("+flag+")";
	}
}
