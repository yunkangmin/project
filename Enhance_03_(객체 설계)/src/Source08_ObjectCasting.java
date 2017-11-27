class Human{}
class Asian extends Human{}
class European extends Human{}
class Korean extends Asian{}
class Japanese extends Asian{}
class French extends European{}
/*
 * ĳ������ �Ǵ� ��츦 �ϴ� ���캸��.
 * 
 * 
 * 
 */
public class Source08_ObjectCasting {
public static void main(String[] args) {
	Korean k=new Korean();
	boolean b=k instanceof Korean;
	System.out.println(k instanceof Korean);
	//����ϴ��� Ȯ���ϴ� ������
	//Japanese j=(Japanese)k;//������ ����
	//System.out.println(k instanceof Japanese);//������ ����
	Human h=(Human)k;//(Human)������ �� ����.
	//h=new French();
	//French f=(French)h;//(French)�����Ұ�.�ڽİ�ü�� ĳ�����ϴ°��̶�
	//�ٿ�ĳ������ ���� ���°� �ƴϸ��� ������ �߻��� ���� �ִ�.
	Asian a=(Asian)h;
	System.out.println(System.identityHashCode(k));
	System.out.println(System.identityHashCode(h));
	System.out.println(k==h);
	System.out.println(a==h);
	System.out.println("============================");
	System.out.println(k instanceof Asian);
	//�ش簴ü�� Asian����(������ü)��ü���� �´���.
	System.out.println(h instanceof Asian);
	//������� �ִ� ���� �߿��ϴ�.
	European e=new European();
	Human hh=e;
	System.out.println(e instanceof French);
	//French ff=(French)hh;//��� �ܰ���� �ٿ�ĳ������ ���������� �˾Ƶ���
	
	//�̰� �������̶�� �θ��µ�.
	//1.Ư����ü�� �����ϱ� ����, �ݵ�� �� ������ ������ �ʿ��Ѱ� �ƴ�.(����Ÿ�����ε�
	//�����)
	//2.Ư����ü������ ������ �ش� ��ü�� ����Ǵ°� �ƴ�(������ü�� ���尡��)
	
	Asian a1=new Korean();
	Asian a2=new Japanese();
	//Asian a3=new French();
	//Korean��ü�� ���鶧 �� ���� Ŭ������ �ټ����� �ִ�.
	
	//

}
}
