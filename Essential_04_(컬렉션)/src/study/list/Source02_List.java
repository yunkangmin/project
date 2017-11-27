package study.list;



import java.util.*;
public class Source02_List {

	public static void main(String[] args) {
		
		
		List<Integer> li=new Vector<>();
		//1.0���� ���� [1.0 ~ 1.2(ArrayList�������)������ ���� ����� Ŭ�������� ��쿡
		//Vector�� �䱸�ϴ� class���� ����. �׷��� �˾Ƶ־��Ѵ�.
		for(int num=10;num<=100;num+=10) {
			li.add(num);
		}
		System.out.println(li.toString());
		ListIterator<Integer> it=li.listIterator(); 
		//List�������
		//listIterator�� �յڷε� ���� �ִ�.
		System.out.println(/**/it.nextIndex()+"..."+it.previousIndex());
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.println(i);
		}
		System.out.println(it.hasNext()+" / "/**/+it.hasPrevious());
		System.out.println(it.nextIndex()+"..."+it.previousIndex());
		while(it.hasPrevious()) {
			Integer i=it.previous();
			System.out.println(i);
		}
		//List������ Iterator���ٴ� Index�� ���ؼ� ��ü ��� �� �� �ֱ� ������
		//�̷� ���·ε� ��ȸ������
		for(int idx=0;idx<li.size();idx++) {
			Integer s=li.get(idx);
			System.out.println(s);
		}
		Integer iz=new Integer(30);
		int n=li.indexOf(iz);
		System.out.println("index ? "+n);//HashCode�� equals�� ��ü�� �����ϴٰ� �Ǵ���.
		
	}

}
