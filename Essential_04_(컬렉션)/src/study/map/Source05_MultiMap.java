package study.map;
/*
 * Ư���� Ű�� ������� �������� �����ϰ� ���� ��Ȳ��
 * 
 * 
 */
import java.util.*;
public class Source05_MultiMap {
	public static void main(String[] args) {
		//Ű�� Integer�� , �ű⿡ �ش��ϴ� ������� List�� �����Ҳ���
		
		Map<Integer,List<String>> nums=new TreeMap<>();
		
		//1�� Ű�� ,�ؼ� "�ϳ�"��� String�� put
		if(nums.containsKey(1)==false)
			nums.put(1, new ArrayList<String>());
		
		nums.get(1).add("�ϳ�");//
		nums.get(1).add("ONE");//
		
		List<String> str=nums.get(1);
		for(String s: str) {
			System.out.println("->"+s);
		}
	}
}
