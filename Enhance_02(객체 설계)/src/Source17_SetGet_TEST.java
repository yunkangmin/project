/*
 * setter ? -�����ڿ� ������ ���������� �ȵǴ� �ʵ忡 �����͸� �����Ҽ� �ְ� �ص� �޼ҵ�
 * getter ? -�����ڿ� ������ �� ����Ȯ���� �ȵǴ� �ʵ忡 �����͸� Ȯ���� �� �ְ� �ص� �޼ҵ�
 * 
 * 
 * 
 */import java.text.DecimalFormat;//��ġ�� �����͸� Ư�� ������ ���ڿ��� ������ִ� ��ü
		 
public class Source17_SetGet_TEST {
public static void main(String[] args) {
	new DecimalFormat();
	
	DecimalFormat df=new DecimalFormat("#,###");//3�ڸ����� �޸��� ������ ����
	int price=3270000;
	String sPrice=df.format(price);
	System.out.println(sPrice);//�ٸ� ������ ���ڿ��� �ʿ��ϴٸ� (4�ڸ����� �������ִ�)
	//System.out.println(df.posSuffixPattern);//�� ������ ���� "#,####"�̷��� �Ҽ���
	//������ �ٸ��� �۵���.
	df.applyPattern("#,####");
	//�ش� ��ü�� ������ �ִ� ���� ���尪�� �����͸� ������ ��Ŵ.
	//�̷� ����� ������ �ִٸ� setter��� �θ��°���.
	//�ش絥���Ϳ� ������ ������.
	//setXXXX�Ϲ������� �̷��� ����� ������ �ƴ� ��쵵 �ִ�.
	//������Ʈ���� ���ڸ� ǥ���� �� �����ϴ�.
	System.out.println(df.format(price));
}
}
