package interfaces;

public class Source05_About_Robot {
public static void main(String[] args) {
	JapanTranslator j= new JapanTranslator();
	KoreaTranslator k= new KoreaTranslator();
	
	Robot r= new Robot(k);
	r.sayNumber();
	//�θ�� �ƴ����� ĳ������ �ȴ�.
	Translator zz=(Translator)r;
	
	System.out.println(zz.execute("1"));
	//����� �ڽ�Ŭ������ �θ�Ŭ������ ��� ������ �� ������ �ְ�
	//������ �������̽��� ����Ŭ������  �Ȱ����� �־ �ȴ�.�ٸ�
	//�޼ҵ带 ������ �ݵ�� ����������Ѵ�.
	//interface casting��  ����� casting���� �ٸ���,
	//������ �õ� �ɼ�����.���߿� ���� �߻��Ҽ��� ����.
	//����� �ƴ� �����ؾ� �� ���̱⶧����
	//�����޴°� �ƴ� �����ؾ��� ���̱⶧��
	//��ӿ����� �������� �ȵȴ� ���ڶ��θ��ȴ�.
}
}
