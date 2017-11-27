package match;

import java.util.*;
import java.io.Console;

public class MatchMain {
	public static void main(String[] args) {
		Console console=System.console();
		String[]jobs="전사,사냥꾼,도적,성기사,마법사,흑마법사,드루이드,주술사,사제,죽음의기사".split(",");
		List<String> party=new LinkedList<>();
		System.out.println("!!파티 구성!!");
		//총 7명의 직업군이 필요함
		while(party.size()<7) {
			String j=console.readLine("추가할 직업(%s/7)>",party.size()+1);
			Set<String> set=new HashSet<>();
			for(int i=0;i<jobs.length;i++) {
				set.add(jobs[i]);
			}
			boolean b1=set.contains(j);
			if(b1==false) {
				System.out.println("없는 직업입니다.다시입력하세요");
				continue;
			}
			
			boolean b=party.contains(j);
			if(b) {
				String jj=console.readLine("해당직업은 등록되어있습니다. 중복저장하시겟냐? Y/N ");
				if(jj.equals("y")||jj.equals("Y")) {//jj.equalsIgnoreCase("y");대소문자 구분없음
					party.add(j);
					System.out.println("저장되었습니다.");
				}
				else {
					System.out.println("저장하지 않습니다.");
					continue;
				}
			}
			else {
				party.add(j);
			}
		}
		//================================================================================
		while(true) {
			System.out.println(party.toString());
			String c=console.readLine("이대로 진행하시겠습니까?(Y/N)");
			//애가 입력한게 "Y"면 break;
			//그게 아니면
			if(c.equals("y")||c.equals("Y")) {
				break;
			}
			else {
			String d=console.readLine("변경할 순번 두개 입력(예:2 5) ");
			//여기서 순번 바꿔주고,
			//String []ar=d.split("\\s+");
			char a=d.charAt(0);
			char b=d.charAt(2);
			String tmp=party.get(a-48);
			party.set(a-48, party.get(b-48));
			party.set(b-48, tmp);
			}
		}
		System.out.println("최종 파티.. 결과");
		System.out.println(party.toString());
		Set<String> s=new HashSet<>();
		for(int i=0;i<jobs.length;i++) {
			s.add(jobs[i]);
		}
		s.removeAll(party);
		System.out.println("빠져있는 직업군 : "+s);
		/*파티구성에 필요한 직업군을 모아라.
		7명의 string을 모아야 함.

		1단계
		1.입력받는 STring은 jobs에서 하나라도 일치해야됨.
		2.이미입력한 직업같은 경우는 , 한번 물어봐달라
		 해당직업은 등록되어있습니다. 중복저장하시겟냐? Y/N

		2단계
		순번조절을 해야함
		1.사용자가 순번 조절을 원할시 수치 두개 입력받아서, 그 해당 인덱스의 데이터를
		swap시키면 됨
		2.조절을 원하지 않는다면 break;

		3단계
		완성된 list를 출력해줌.
		빠져있는 직업군을 추가 출력.

		contains로 체크
		없는직업이면 없다고 체크
		순서바꾸기
		마지마가 최종순서*/
	}

}
