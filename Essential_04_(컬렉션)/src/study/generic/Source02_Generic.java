package study.generic;

import java.io.CharArrayReader;
import java.util.HashSet;
import java.util.Set;

import javax.print.DocFlavor.CHAR_ARRAY;

class Tester<T extends Number>{//Ư���ڷ������� �����Ҽ����ִ�. number�迭
	void execute(T t) {
		
		
	}
}
//=================================================
public class Source02_Generic {
	public static void main(String[] args) {
		Tester<Integer> t=new Tester<Integer>();
		t.execute(3);//Ÿ�Լ������ҽ� Number��������.�������ٽ� Number�� ����ϴ� Ŭ�����迭�� �ؾ��Ѵ�.
		//���ʸ����� �����Ǵ� Ÿ���� Ŭ�������̾����. �⺻���� �ȵ�.
		
		Set<Runnable>s=new HashSet<Runnable>();//Enum�� �ȴ�.
		//�÷��� Ŭ�����鵵, ���� ����� Object���·� ������ �뵵������,
		//������, � Ÿ���� ��ü�� �����Ұ��� �����ϰ� ����ϴ°� �������̴�.
		
		//CharSequence ���ڿ� ���� Ŭ������ �̰� ����Ѵ�.
		
		
	}
}
