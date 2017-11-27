package study.set;
/*
 * TreeSet���� ó���Ǵ� ��쿣, hashCode(), equals()���ٰ� ���ϰ�ü��� �Ǵ��ϴ°� �ƴ϶�,
 * compareTo�� �� ��� 0�̸� ���� ��ü, 
 * 
 */

import java.util.*;
class Source05_Set {
public static void main(String[] args) {
	Set<Bomb> set=new TreeSet<>();
	//TreeSet���� ó���� ��ü�� ,, Comparable�������̽��� �����ؾ� �Ѵ�.
	
	Bomb[] bombs=new Bomb[] {
			new Bomb(100.0,3),new Bomb(90.0,4),new Bomb(100.0,3),new Bomb(90.0,3)
	};
	//String�� �̹� �����Ǿ� �ִ�.Integer�� ���������̴�.
	//Treese���� �ϰ� �ʹٸ� Comparabe�� �����ϸ� �ȴ�.
	System.out.println(bombs[0] instanceof Comparable);
	for(int i=0;i<bombs.length;i++) {
		set.add(bombs[i]);
		
	}
	System.out.println(set.size());
	System.out.println(set.toString());
	//������ �տ� �´� ��������
	//�迭�� TreeSet���� ó���Ѵٸ�
}
}
