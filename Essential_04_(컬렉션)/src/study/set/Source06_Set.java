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
			char u="가바".charAt(r);
			int s=30+(int)(Math.random()*2)*1000;
			cn[i]=new CarNumber(t, u, s);
			System.out.println(cn[i].toString());
		}
		//=============================================================
		//cn에 설정된 CarNumber중에 중복 안센다고 가정하고 총 몇개 데이터?
		Set<CarNumber> one=new TreeSet<>();//한번만 등장한 객체들은 여기에 모으고
		Set<CarNumber> more=new TreeSet<>();//두번이상 등장한 객체는 여기에 모아달라.
		Set<CarNumber> f=new TreeSet<>();
		for(int i=0;i<cn.length;i++) {

			boolean f1=one.add(cn[i]);
			System.out.println(cn[i].toString()+".."+f1);
			if(f1==false)
				more.add(cn[i]);

			f.add(cn[i]);
			//System.out.println(cn[i].hashCode());
		}
		System.out.println(one.toString());//등장했던 모든것
		System.out.println(more.toString());//2번이상 등장했던것
		one.removeAll(more);
		System.out.println(one.toString());
		//type순으로 ,같은 타입이면 그 다음 use ,같은 use면 serial순으로 정렬
		System.out.println(f.size());
		System.out.println(f.toString());

		//add작업은 false가 뜬다 이미 가지고 있을때
		//Collection 간에 containsAll, addAll, retainAll, removeAll
		//set은 동일객체를 저장하고 싶지 않을때 사용.
	}

}
