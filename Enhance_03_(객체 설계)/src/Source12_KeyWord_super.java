class Knife{
	int dmg;
}
//return super�� ����.
//super�� �������� �ʾҰ� ���������� �ʴµ� �ڽ��ʿ��� ������ �� ����.
class Dagger extends Knife{
	int dmg;
	public Dagger(int dmg) {
		super.dmg=dmg;//�ڷ����� �ȸ´�.
	}
	//�����ʿ��� �缱��Ǿ� �������� �θ��� �޼ҵ峪, ������ ���� ����ϰ� ���� �� 
	//����ϴ°��� superŰ����.
	public String toString() {
		return super.toString()+"{dmg:"+dmg+"}";
		//Object�� toString()�� ȣ��ȴ�.
	}
}
public class Source12_KeyWord_super {
public static void main(String[] args) {
	Dagger d= new Dagger(3);
	System.out.println(d.toString());
}
}
