package annotations;

public class Source02_AnnotationTEST {
    @SuppressWarnings({"deprecation","unused","null"})
    //������ �ȶ��.
	public static void main(String[] args) {
    	int a;
		Piece p=null;//�̰� 100���� ���ΰ� �ƴϱ� ��� ���.
		Piece p1=Math.random()>0.5?null:new Bishop(2,2,1);
		//100���� ������ �˼���� ��� �ȶ��.
		//�� ��ü�� Deprecated�޼ҵ带 ����Ҷ� ��� �� ������ ���.
		//���α׷��� ������ �����ʴ�.
		//��� ��.
		p.isAttackableTo(null);
	}

}
