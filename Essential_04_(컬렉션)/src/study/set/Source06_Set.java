package study.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Source06_Set {

	public static void main(String[] args) {
		CarNumber[] cn=new CarNumber[15];
		for(int i=0;i<cn.length;i++) {
			int t=1+(int)(Math.random()*2)*10;
			int r=(int)(Math.random()*2);
			char u="����".charAt(r);
			int s=30+(int)(Math.random()*2)*1000;
			cn[i]=new CarNumber(t, u, s);
			System.out.println(cn[i].toString());
		}
		//=============================================================
		//cn�� ������ CarNumber�߿� �ߺ� �ȼ��ٰ� �����ϰ� �� � ������?
		Set<CarNumber> one=new TreeSet<>();//�ѹ��� ������ ��ü���� ���⿡ ������
		Set<CarNumber> more=new TreeSet<>();//�ι��̻� ������ ��ü�� ���⿡ ��ƴ޶�.
		Set<CarNumber> f=new TreeSet<>();
		for(int i=0;i<cn.length;i++) {

			boolean f1=one.add(cn[i]);
			System.out.println(cn[i].toString()+".."+f1);
			if(f1==false)
				more.add(cn[i]);

			f.add(cn[i]);
			//System.out.println(cn[i].hashCode());
		}
		System.out.println(one.toString());//�����ߴ� ����
		System.out.println(more.toString());//2���̻� �����ߴ���
		one.removeAll(more);
		System.out.println(one.toString());
		//type������ ,���� Ÿ���̸� �� ���� use ,���� use�� serial������ ����
		System.out.println(f.size());
		System.out.println(f.toString());

		//add�۾��� false�� ��� �̹� ������ ������
		//Collection ���� containsAll, addAll, retainAll, removeAll
		//set�� ���ϰ�ü�� �����ϰ� ���� ������ ���.
	}

}
