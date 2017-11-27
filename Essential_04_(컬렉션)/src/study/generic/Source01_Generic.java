package study.generic;
/*
 * �÷��� ���� ��� ����, ���� Ư¡�� ���캼�ٵ�, ������  Generic�̶���  ���캼�ʿ䰡 �ִ�.
 * 
 * 
 */
import java.util.*;
class Sample<E>{//1.5�̻���͸� generic ���
	E data;
	Sample(){
		
	}
	E currentData() {//getter
		return data;
	}
	void changeData(E data) {//setter �� set�̳� get���� ���۾��ص� �ȴ�.
		this.data=data;
	}
}
//===================================================
public class Source01_Generic {
	public static void main(String[] args) {
		Sample p= new Sample();//Ÿ�������� ���ϸ� object�� �����ȴ�.
		
		Sample<String> sp=new Sample<String>();//�������� �Ű�����Ÿ���� object;
		sp.changeData("ss");//Ÿ���� �������ϸ� object�� �����ȴ�.
		
		Sample<int[]>sp1=new Sample<int[]>();//int[]�� �ٲ��.
		sp1.currentData();//�ϳ��� ��ü�� Ÿ�Ժ��� ���������� 
		
		Set<String> s1=new HashSet<String>();//String���� ó��
		Set s=new HashSet();//object�� ó��
		Set<Object> s2=new HashSet<Object>();//�Ƚᵵ object������ �׷��� Object��� ����.
		//Collection���� ������ set����� ���� ��� �Ѵܰ賻����
		//�θ�Ÿ�����δ� ��� �ȵȴ�. 
		//is a raw type. References to generic type HashSet<E> should be parameterized ���
		//���׸�Ÿ���� �����ض�.
		//Generic �ڹ� 1.5���� �߰��� ����, ������ �ʹ��� �ڿ������� ����.
		//HashSet s=new HashSet();�̷��� �ص� �������.
		
		//�÷��ǿ� ���ʸ��� ���Խ��ѵ�.
		
		
		
		
		
		
		
		
	}
}
