package study.map;

import java.util.*;
import java.util.Map.Entry;

public class Source04_Map {
	public static void main(String[] args) {
		String[]ar="FIRE,WATER,WIND,EARTH".split(",");
		Map<String,int[]>map=new LinkedHashMap<>();

		for(int i=0;i<ar.length;i++) {
			int r=2+(int)(Math.random()*3);
			map.put(ar[i], new int[r]);
		}
		System.out.println(map.toString());
		//=================================================
		//4ĭ¥�� �迭 �̻��� �迭�� ������ Ű�鸸 ���.
		//Ű���� �𸥴ٴ� �������� �Ͽ�
		//map���׸��� ���󰣴�.

		//Ű����� ��� ��Ʈ���� �����.�׸��� set���� ��ȯ.
		//ctrl+shift+o :Entry
		/*Set<String> keys=map.keySet();//set�� ������ ��� iterator,for each���
		for(String key:keys){
			int[]val=map.get(key);
			if(val.length>=4)
				System.out.println("key.."+key);*/
			/*	
			if(map.get(key).length>=4)
				System.out.println(key);
		}*/
		/**/
			Set<Entry<String,int[]>> entry =map.entrySet();
		System.out.println(entry.toString());
		for(Entry<String,int[]> e:entry) {
			if(e.getValue().length>=4)
				System.out.println("key.."+e.getKey());
	    }

		/*	for(int i=0;i<ar.length;i++) {
			if(map.get(ar[i]).length>=4) {
				System.out.println(ar[i]);
			}
		}*/
		//Map:keySet or Map:entrySet
		//1.��ü Ű���� �̰�, Ű���� ������ �ݺ��� ���鼭
		//�����ü�� ����, �ش� �����ü�� length>=4�̻��϶� Ű�� ����Ѵ�.
		//2.��ü ��Ʈ������ �̰� ��Ʈ������ �ݺ��� ������
		//�ش翣Ʈ���� �����ü�� length>=4�϶�, �شپ� ��Ʈ���� Ű�� ����Ѵ�.
		
		
		
		
	}
}
