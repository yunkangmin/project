import java.util.Arrays;

import chess.clean.*;
public class Source07_Array {

	public static void main(String[] args) {
		Pawn []p=new Pawn[5];//Pawn��ü�� ��������Ǿƴϴ�.
		for(int idx=0;idx<p.length;idx++) {
			int team=Math.random()>0.5?1:0;
			p[idx]=new Pawn(idx,idx,team);
			System.out.println(p[idx]);
		}
		
		//String s=Arrays.toString(p);//Object�迭�� �޴´�
		//System.out.println(s);
		//Pawn�迭�� �����ִ� �ֵ��߿� ,�ε���0��ĭ�� �ִ¾ֿ� ���� ���� ���� ����
		//Pawn t=new Pawn(6,3,1);
		Pawn t=p[2];
		boolean z=t.isAttackableTo(p[0]);

		//System.out.println(t);
		//p�� �����Ǵ� �ֵ��߿� t�� ���� ���� ���� ����?
		//���� ������ �ƴ��� Ȯ���ϱ� ���ؼ���
		//0��°����� ���ʴ�� t�� ���ݽ��Ѻ��� ,false�ߴ� ����� ī����
		int chk=0;
		for(int idx=0;idx<p.length;idx++) {
			if(p[idx]==p[0])//���� ��ü���� Ȯ��
				continue;
			if(p[idx].isAttackableTo(p[0])==false) {
				chk++;
			}
		}
		System.out.println(chk);
	}

}

