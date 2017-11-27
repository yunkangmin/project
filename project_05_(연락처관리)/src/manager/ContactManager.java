package manager;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ContactManager {
	public static void main(String[] args) {
		Set<Contact> filter=new HashSet<>();
		Map<String,List<Contact>> cs=new TreeMap<>();
		//키가 오름차순 정렬이된다.
		Console cons=System.console();
		main:while(true) {
			//등록:add 사람이름 연락처 그룹
			//검색: list 그룹
			String w=cons.readLine("MANAGER>" );
			String[]ar=w.split("\\s");
			switch(ar[0]) {

			case "add":
				if(ar.length!=3) {
					System.out.println("잘못된 사용법입니다.");
					System.out.println("사용예) add 이름 연락처 그룹");
					continue main;
				}
				String key=ar[3];
				if(cs.get(key)==null)
					cs.put(key, new ArrayList<Contact>());
				Contact value=new Contact(ar[1],ar[2]);
				//=================================================
				boolean f=filter.add(value);
				System.out.println(f);
				if(f) {
				//=================================================
				cs.get(key).add(value);//해당 키의 List에 add
				System.out.println("등록이되었습니다.");
				//false가 뜨면 어디 소속인지 까지 검섹
				}else {
					//이 value가 소속된 List의 키를 출력
					Set<String> keys=cs.keySet();
					for(String k:keys) {
						List<Contact> vlist=cs.get(k);
						if(vlist.contains(value)) {
							System.out.println(value+"은(는) "+k+"에 등록되어 있습니다.");
							break;
						}
					}
				}
				break;
			case "list":
				if(ar.length!=2) {
					System.out.println("잘못된 사용법입니다.");
					System.out.println("사용예) list 3");
					continue main;
				}
				String ke=ar[1];
				if(cs.get(ke)!=null) {
					System.out.println(ke+"은/는 "+cs.get(ke).toString());
					
				}else {
					System.out.println(ke+"는 등록되지 않은 데이터입니다.");
				}
				System.out.println(cs.toString());
				break;
			default:
				System.out.println("처리할 수 없는 명령입니다.");
			}
			System.out.println();
			//list 5 해당 키 값만 출력
			//다른키에 같은 갑은 안된다.
			//같은연락처등록은 안되다.
			//set으로 연락처체크
		}//=========================================================
	}
}
