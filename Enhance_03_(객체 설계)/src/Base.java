
//�ش簴ü���� public���� ������ �����δ°� ����.
//����ƮŬ������ �����̸��� Ŭ�������� �޶� �ȴ�.
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
	int flag;//���� �θ𿡰� �־�����,���ļ� �����
	//������ ����������.
	public Multi() {
		val=199;
		flag=10;//�װ� �켱�� �۵��Ѵ�.
		System.out.println("constructor Multi");
	}
	//�����ε�
	public void addValue(int a,int b) {
		addValue(a);
		addValue(b);
	}
	//�������̵�
	public void addValue(int d) {
		val+=d*2;
	}
	public String toJSON() {
		return val+"("+flag+")";
	}
}
