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
		//4칸짜리 배열 이상의 배열이 설정된 키들만 출력.
		//키값을 모른다는 전제조건 하에
		//map제네릭을 따라간다.

		//키밸류를 묵어서 엔트리를 만든다.그리고 set으로 반환.
		//ctrl+shift+o :Entry
		/*Set<String> keys=map.keySet();//set을 돌리는 방법 iterator,for each등등
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
		//1.전체 키셋을 뽑고, 키셋을 가지고 반복을 돌면서
		//밸류객체를 얻어내며, 해당 밸류객체의 length>=4이상일때 키를 출력한다.
		//2.전체 엔트리셋을 뽑고 엔트리셋을 반복을 돌려서
		//해당엔트리의 밸류객체의 length>=4일때, 해다아 엔트리의 키를 출력한다.
		
		
		
		
	}
}
