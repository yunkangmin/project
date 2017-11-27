package hint;
import java.util.*;


import java.io.*;
class Contact implements Comparable{
	String name;
	String phone;
	Contact(String n,String p){
		name=n;
		phone=p;
	}
	@Override
	public String toString() {
		return name+" / "+phone;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+phone.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals..called");
		/**/ if (obj instanceof Contact) {
			Contact r = (Contact)obj;
			return (name.equals(r.name)) &&(phone.equals(r.phone));
		}
		return super.equals(obj);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class WorldNumber {

	public static void main(String[] args) {
		Set<Contact> set=new HashSet<>();
		Map<String,List<Contact>> nums=new TreeMap<>();
		//키가 오름차순 정렬이된다.
		Console cons=System.console();
		boolean r=true;
		main:while(true) {
			//등록:add 1 ONE, add 3 셋 , add 3 THREE
			//검색: list 1(1에해당하는 모든단어가 나온다.)
			if(r){
				System.out.println("입력예시)add 윤강민 01012341234 가족");
				System.out.println("입력예시)list 가족");
				System.out.println();
				r=false;
			}
			String w=cons.readLine("WN>" );
			String[]ar=w.split("\\s");
			switch(ar[0]) {

			case "add":
				if(ar.length!=4) {
					System.out.println("잘못된 사용법입니다.");
					System.out.println("사용예) add 윤강민 01012341234 가족");
					continue main;
				}
				Contact con=new Contact(ar[1],ar[2]);
				boolean b=set.add(con);
				if(b==false) {
					Set<String> keys=nums.keySet();
					for(String k:keys) {
						List<Contact> vlist=nums.get(k);
						if(vlist.contains(con)) {
							System.out.println(con+"은(는) "+k+" 에 등록되어 있습니다.");
							continue main;
						}
					}
					/*System.out.println("이미 존재하는 연락처입니다.");
					continue main;*/

				}else {
					System.out.println("저장되었습니다.");
				}
				if(nums.containsKey(ar[3])==false)
					nums.put(ar[3], new ArrayList<Contact>());
				nums.get(ar[3]).add(con);

				List<Contact> str=nums.get(ar[3]);
				System.out.println("=="+ar[3]+"==");
				for(Contact s: str) {
					System.out.println("->"+s);
				}
				break;
			case "list":
				if(ar.length==1){
					System.out.println(nums.toString());
					break;
				}
				if(ar.length>2) {
					System.out.println("잘못된 사용법입니다.");
					System.out.println("입력예시)list 가족  or list");
					continue main;
				}
				if(nums.containsKey(ar[1])){
					System.out.println("=="+ar[1]+"==");
					System.out.println(nums.get(ar[1]));
					//System.out.println( nums.get(ar[1]));
				}
				else
					System.out.println("없는 그룹입니다.");
				break;
			default:
				System.out.println("처리할 수 없는 명령입니다.");
			}
			//String a;
			System.out.println();
			//list 5 해당 키 값만 출력
			//다른키에 같은 갑은 안된다.
			//같은연락처등록은 안되다.
			//set으로 연락처체크
		}//=========================================================
	}

}
/*##연락처 관리##
class Contact{
 String name;
 String phone;
}
일단, 기본룰은 같은 연락처는 등록이 안됨.
중복체크Set hashcode equals compareTo사용 필터링처리를 set으로 할꺼임
(HashSet,TreeSet,LinkedHashSet)이걸로 처리
contact를 설계하셔야될꺼고,
=============================================
##서브미션##
위에 연락처 너무 힘드시면, WorldNumber이거를 좀더 완성시킬것
1.한단어가 여러곳에 등록될수 없게 막을것
2.이미 등록되어 있는 단어같은 경우 해당 키값을 찍어줄것
(예를 들어 1에 one이 있으면,one을 또 add시 , 이미1에 등록된 단어이다.)
3.목록을 전부 출력하는게 아니라 서치 형태로 바꿀것
이 Contact를 그룹으로 묶어서 관리할꺼임.어느 그룹에 들어갈건지 물어본다.
Map<String,List<Contact>> map;
입력예)add 윤형호 01046148225 친구 입력을 한번에 싹 다 받는다.
         add 어머니 01012333144 가족 한줄로 입력 split
               ------contact-------- 그룹
         add 아버지 01232131231 가족(키값) 

 list 친구 친구목록이 나온다.
가족으로 또등록하면 데이터가 날라간다.
목록을 전부 출력하는게
list 3==>해당 숫자로 되어있는 리스트가 있다면 목록을 출력
없으면 그 숫자는 아직 데이터가 없다. 
 */


