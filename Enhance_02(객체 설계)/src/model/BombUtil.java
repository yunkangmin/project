package model;
//��ź��ü
//��ɼ� class�̱� ������ static�� �ٿ���.
//��ü�� ��ȯ�� �� �ִ�.
public class BombUtil {
	public static Bomb create() {
		int x=-5+(int)(Math.random()*11);
		int y=-5+(int)(Math.random()*11);
		int r=1+(int)(Math.random()*4);
		
		Bomb b=new Bomb(x,y,r);
		//b���ּҴ� ���� �ؿ� �Լ��θ� �� �� �ִ�.
		int t=System.identityHashCode(b);
		System.out.println(b);
		//model.Bomb�����°� ����� �Ǵµ� b�� ����ִ� ���� �ƴ�
		System.out.println("create.."+t);
		return b;
	}
}
