package study.set;
import java.awt.Rectangle;
import java.net.InetAddress;
import java.util.*;
class Bomb implements Comparable<Bomb>{
	double power; //���� ������ ȿ��
	int radius; //��ź �ݰ�

	Bomb(double p, int r){
		power=p;
		radius=r;

	}
	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals..called");
		  /* if (obj instanceof Bomb) {
			   Bomb r = (Bomb)obj;
	            return (power == r.power) &&(radius == r.radius);
	        }
	        return super.equals(obj);*/
	        if (obj instanceof Bomb) {
				   Bomb r = (Bomb)obj;
		            return (power == r.power) &&(radius == r.radius);
		        }
	        else {
	        	return false;
	        	
	        }
	}
	@Override
	public int hashCode() {
		//System.out.println("hashCode..called..");
		//���� �����͸� ������ �ִ� ��ü������ hashCode�� ���� �����ǰ� Override����
		return (int)((radius+544512)-(power*10))<<1;
	}
	@Override
	public int compareTo(Bomb o) {
		//this��ü�� o��ü�� ���� ��� ,�ڽ��� ���� ��� ��������
		//�ڽ��� ū��츦 �������, ���� ���� 0����
		if(radius==o.radius&&power==o.power)
			return 0;
		else {
			if(power==o.power)
				return radius<o.radius?-1:1;
			else
				return power<o.power?-1:1;
			
		}
	}
	public String toString() {
		return power+" p/"+radius+"r";
		
	}
	
}

public class Source03_Set {
	public static void main(String[] args) {
		Bomb[] bomb=new Bomb[] {
				new Bomb(100.0,3),new Bomb(90.0,4),new Bomb(100.0,3),new Bomb(90.0,3)
		};
		//��ź�� ����
		Set<Bomb> s=new LinkedHashSet<>();
		boolean f=bomb[0].equals(bomb[2]);
		System.out.println(f);

		for(int i=0;i<bomb.length;i++) {
			s.add(bomb[i]); //hashCode���� ��, ���� hashCode�϶� equals�߰� ��
			System.out.println(bomb[i].hashCode());
		}
		System.out.println(s.size());
		//InetAddress
		//Rectangle
		//Point
	}
}
