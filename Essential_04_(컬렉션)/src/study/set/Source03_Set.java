package study.set;
import java.awt.Rectangle;
import java.net.InetAddress;
import java.util.*;
class Bomb implements Comparable<Bomb>{
	double power; //실제 데미지 효력
	int radius; //폭탄 반경

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
		//같은 데이터를 가지고 있는 객체끼리는 hashCode가 같게 설정되게 Override구현
		return (int)((radius+544512)-(power*10))<<1;
	}
	@Override
	public int compareTo(Bomb o) {
		//this객체와 o객체를 비교한 결과 ,자신이 작은 경우 음수리턴
		//자신이 큰경우를 양수리턴, 같은 경우는 0리턴
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
		//폭탄의 종류
		Set<Bomb> s=new LinkedHashSet<>();
		boolean f=bomb[0].equals(bomb[2]);
		System.out.println(f);

		for(int i=0;i<bomb.length;i++) {
			s.add(bomb[i]); //hashCode부터 비교, 같은 hashCode일때 equals추가 비교
			System.out.println(bomb[i].hashCode());
		}
		System.out.println(s.size());
		//InetAddress
		//Rectangle
		//Point
	}
}
