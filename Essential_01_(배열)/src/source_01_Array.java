import chess.clean.Pawn;

/*
 * �迭 ��ü (Array)
 * -���� Ÿ���� ��ü �������� ��� �����Ҽ� �ְ� �ڽ������� ��ü
 * �ѹ� ��������� ũ�Ⱑ ������ �Ǿ���ϰ�, ������ Ÿ���� �����͸� ����
 * �迭��ü�� �����ϴ� �����ͺ����Ҵ� index�� ���ؼ� ����,��� ������.
 * 
 * 
 */
public class source_01_Array {
public static void main(String[] args) {
	//new Runnable();�������̽��� ������ �ȵȴ�.
	System.out.println(new int[4]);//int �����ͱ��� ������ 
	System.out.println(new String[3]);//�����ּҰ��� ������.
	System.out.println(new Pawn[8]);
	System.out.println(new Runnable[3]);
	//�������̽��� ��ü������ �ȵ����� �����ͺ����ҷμ� �迭��ü�� ������ �����ϴ�.
	//�����Ҹ� ����°��� ���� �����͸� �����Ѱ� �ƴϴ�.
	//�������ѵΰ� ����� �Ϸ���,
	//Object o=new int[4];�迭��ü�� Object�� ������
	//���� ����� �Ϸ��� ����� �޾ƾ� �Ǵµ�,
	int[]a=new int[4];
	String[] b=new String[3];//���� ������ �̰� ���� �̱� ������
	Pawn c[]=new Pawn[4];//�̷��� �ص� �Ǳ� ��.
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	//�迭�� ��������� indexó���� �Ǿ����� 0������==>�������ε��� [��������ũ��-1]
	a[0]=4;
	//a[4]=true;int�� �����̾ ������.
	b[0]="java";
	c[0]=new Pawn(1,4,1);
	
	//System.out.println(c[4]);���� �ε������� ��Ÿ�ӿ����� �߻��Ѵ�.
	//�� �ȿ� �ִ� �����ʹ�...
	int z=a[0];
	System.out.println(z);
	System.out.println(a[0] * 3);//�׳� �ٷ� �ᵵ �ȴ�.
	
	Pawn pz=c[0];//�̾Ƽ� �ᵵ �ǰ�
	System.out.println(pz.toString());
	System.out.println(c[0].isSameTo(1, 4));//�׳ɹٷ� �ᵵ�ǰ�
}
}

