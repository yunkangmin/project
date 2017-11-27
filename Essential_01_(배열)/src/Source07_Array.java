import java.util.Arrays;

import chess.clean.*;
public class Source07_Array {

	public static void main(String[] args) {
		Pawn []p=new Pawn[5];//Pawn객체가 만들어진건아니다.
		for(int idx=0;idx<p.length;idx++) {
			int team=Math.random()>0.5?1:0;
			p[idx]=new Pawn(idx,idx,team);
			System.out.println(p[idx]);
		}
		
		//String s=Arrays.toString(p);//Object배열로 받는다
		//System.out.println(s);
		//Pawn배열로 묶여있는 애들중에 ,인덱스0번칸에 있는애와 같은 팀인 애의 개수
		//Pawn t=new Pawn(6,3,1);
		Pawn t=p[2];
		boolean z=t.isAttackableTo(p[0]);

		//System.out.println(t);
		//p로 관리되는 애들중에 t와 같은 팀인 애의 개수?
		//같은 팀인지 아닌지 확인하기 위해서는
		//0번째놈부터 차례대로 t를 공격시켜보고 ,false뜨는 경우을 카운팅
		int chk=0;
		for(int idx=0;idx<p.length;idx++) {
			if(p[idx]==p[0])//같은 객체인지 확인
				continue;
			if(p[idx].isAttackableTo(p[0])==false) {
				chk++;
			}
		}
		System.out.println(chk);
	}

}

