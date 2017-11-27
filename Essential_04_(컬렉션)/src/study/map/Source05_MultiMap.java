package study.map;
/*
 * 특정한 키로 밸류들을 여러개를 관리하고 싶은 상황임
 * 
 * 
 */
import java.util.*;
public class Source05_MultiMap {
	public static void main(String[] args) {
		//키를 Integer로 , 거기에 해당하는 워드들을 List로 관리할꺼임
		
		Map<Integer,List<String>> nums=new TreeMap<>();
		
		//1을 키로 ,해서 "하나"라는 String을 put
		if(nums.containsKey(1)==false)
			nums.put(1, new ArrayList<String>());
		
		nums.get(1).add("하나");//
		nums.get(1).add("ONE");//
		
		List<String> str=nums.get(1);
		for(String s: str) {
			System.out.println("->"+s);
		}
	}
}
