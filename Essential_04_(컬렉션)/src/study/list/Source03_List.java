package study.list;
import java.util.*;
public class Source03_List {

	public static void main(String[] args) {
		String[] ar="SUN.MON.TUE.WED.THU.FRI.SAT".split("\\.");//���Խ� ���� ������
		System.out.println(ar.length);
		List<String> list=new ArrayList<>();
		for(int i=0;i<ar.length;i++) {
			list.add(ar[i]);
		}
		System.out.println(list.toString());
		String s=list.get(4);
		System.out.println(s);
		List<String> slist=list.subList(2,5);
	//	list.remove(4);//sublist�� �̰���  ������ �ٲ�� ��������. 
		String m=slist.get(2);//�Ϻκ��� �����ش�.
	//	slist.set(2, "thu");
		slist.remove(2);//������ ������ ��ĥ �� �ִ°�
		System.out.println(m);
		System.out.println(list.get(4));
		System.out.println(slist.toString());
		
	}

}
