package study.set;
/*
 * TreeSet으로 처리되는 경우엔, hashCode(), equals()같다고 동일객체라고 판단하는게 아니라,
 * compareTo를 한 결과 0이면 같은 객체, 
 * 
 */

import java.util.*;
class Source05_Set {
public static void main(String[] args) {
	Set<Bomb> set=new TreeSet<>();
	//TreeSet으로 처리될 객체는 ,, Comparable인터페이스를 구현해야 한다.
	
	Bomb[] bombs=new Bomb[] {
			new Bomb(100.0,3),new Bomb(90.0,4),new Bomb(100.0,3),new Bomb(90.0,3)
	};
	//String은 이미 구현되어 있다.Integer도 마찬가지이다.
	//Treese으로 하고 싶다면 Comparabe을 구현하면 된다.
	System.out.println(bombs[0] instanceof Comparable);
	for(int i=0;i<bombs.length;i++) {
		set.add(bombs[i]);
		
	}
	System.out.println(set.size());
	System.out.println(set.toString());
	//작은게 앞에 온다 오름차순
	//배열을 TreeSet으로 처리한다면
}
}
