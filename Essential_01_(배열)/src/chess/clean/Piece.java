package chess.clean;
/*
 * ��� Chess ��ü���� �⺻//���� ������ ���Ҽ��� ����.
 * ������Ű�� �ʰ�����, ���� �ǹ̰� �ִ� ��ü��. ��������� ���ɲ���
 * abstract??�ɼ� ����� �� �� ����. ���� �ٲ����.
 * ���� Piece��ü�� ������� Ŭ������ ���������ʴ´�.
 * 
 * abstract�� ������ ������ ū ������ ����.
 * �߻�Ŭ������� �θ��µ�, ��ü������ �ȵ�.
 * A�� �ٿ��� �ִ� Ŭ����.
 * class������ ������ ������ �ƴ� �����(Ʋ)�̶��,abstractó�����ִ� �� ����.
 * 
 * abstract class���� ������ �ִ� abstract method����
 *abstract class�� abstract method�� ���� ���ִ�.
 *�Ϲ� class�� abstract method�� ������ ����.
 *�Ϲ� class�� ��������� �������� �ϱ� ���� ������ �Ҽ� �ֱ� ���� 
 *�ʵ忡���� abstractŰ���带 ������.
 *abstract�� �Ⱦ��� ���� �̵� method�� �ϼ��ؾ� �ϴµ� abstract�� �̿ϼ����·�
 *�ֵ� ������ �ȳ���.
 *final abstract ���ÿ� ������ �ȵȴ�.
 *����� ���ϸ鼭 ����� �ϰ� �� �ȵȴ�.
 *abstract class�� ������ abstract method�� ������ �ϴ� �Ǿƴ�.
 */
public abstract class Piece {
	int x;
	int y;
	int team;
	
	public String toString() {//���ڿ��� �ֵ���ǥ�� ���δ�.
		String str=String.format("{\"x\":%s,\"y\":%s,\"team\":\"%s\"}",x,y,team==0?"BLACK":"WHITE");
		return str;
	}
	public final boolean isSameTo(int tx,int ty) {
		return x==tx&&y==ty;
		//���� ��ġ�� �ű���� �ϴ� ���̶� ������
	}//�޼ҵ���� �̻۰� �ǹ��ְ�
	public boolean isAttackableTo(Piece p) {
		return this.team!=p.team;
		//this�� ����������� ��������� ǥ���ص��ȴ�.
	}//�Ű������� Piece�̱⶧���� �ڽİ�ü�鵵 ����Ҽ��ִ�.
	//extends�ɰ� ������ ��ü�鿡�� �����Ǹ� �ؾߵ� �޼ҵ���.(���¸� ��Ƶа�)
	public abstract boolean isMovableTo(int tx,int ty);
	//�̰� �߰��ϸ� �ڽİ�ü���� �������̵� �Ҽ� �մ� ���ɼ��� �����ִ�.
	//����� �������̵��� ���Ѵ�.
}
