package study.list;
import java.util.*;
public class Source03_List {

	public static void main(String[] args) {
		String[] ar="SUN.MON.TUE.WED.THU.FRI.SAT".split("\\.");//정규식 공백 여러개
		System.out.println(ar.length);
		List<String> list=new ArrayList<>();
		for(int i=0;i<ar.length;i++) {
			list.add(ar[i]);
		}
		System.out.println(list.toString());
		String s=list.get(4);
		System.out.println(s);
		List<String> slist=list.subList(2,5);
	//	list.remove(4);//sublist로 뽑고나서  원본이 바뀌면 망가진다. 
		String m=slist.get(2);//일부분을 빌려준다.
	//	slist.set(2, "thu");
		slist.remove(2);//원본에 영향을 끼칠 수 있는것
		System.out.println(m);
		System.out.println(list.get(4));
		System.out.println(slist.toString());
		
	}

}
