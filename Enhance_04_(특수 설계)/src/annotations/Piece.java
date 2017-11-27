package annotations;
/**
 * @author YOON
 *
 */
//Ŭ���������� ����°�
//������ �����ְ�
//��Ŭ�� export >> javadoc>>config>>bin>>javadoc
//������Ʈ�� doc>>annotaion>>class-use>>piece.html
//���α׷��� ������ ��ġ�°� �ƴ϶� �ٸ������� ������ ��ģ��.
public abstract class Piece {
	int x;
	int y;
	int team;

	@Override//Compiler���� �������� �޼ҵ� �������̵��Ű�� �ִٰ� �˷���.
	public String toString() {//���ڿ��� �ֵ���ǥ�� ���δ�.
		String str=String.format("{\"x\":%s,\"y\":%s,\"team\":\"%s\"}",x,y,team==0?"BLACK":"WHITE");
		return str;
	}
	/**
	 * �ش簴ü�� ��ǥ�� ���� ��� ��ȯ
	 * @param tx ���� x��ǥ
	 * @param ty ���� y��ǥ
	 * @return	�ڽ��� x,y�� ���Ͽ� ���� ��ǥ�ΰ�?
	 */
	public final boolean isSameTo(int tx,int ty) {
		return x==tx&&y==ty;
		//���� ��ġ�� �ű���� �ϴ� ���̶� ������
	}//�޼ҵ���� �̻۰� �ǹ��ְ�
	@Deprecated //�� Ŭ�������� ���̻� �� �޼ҵ尡 ������ �ʾ����� ���ڴٰ� �����Ҷ�
	public boolean isAttackableTo(Piece p) {
		return this.team!=p.team;
		//this�� ����������� ��������� ǥ���ص��ȴ�.
	}//�Ű������� Piece�̱⶧���� �ڽİ�ü�鵵 ����Ҽ��ִ�.
	//extends�ɰ� ������ ��ü�鿡�� �����Ǹ� �ؾߵ� �޼ҵ���.(���¸� ��Ƶа�)
	public abstract boolean isMovableTo(int tx,int ty);
	//�̰� �߰��ϸ� �ڽİ�ü���� �������̵� �Ҽ� �մ� ���ɼ��� �����ִ�.
	//����� �������̵��� ���Ѵ�.
}
