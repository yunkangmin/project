package study.set;
import java.util.*;
class CarNumber implements Comparable<CarNumber>{
	int type;
	char use;
	int serial;

	CarNumber(int t, char u, int s){
		type=t;
		use=u;
		serial=s;
	}

	public String toString() {
		//while??
		/*String stype=type<10?"0"+type:""+type;
		String sserial;
		if(serial>1000) {
			sserial=""+serial;
		}else if(serial>100) {
			sserial="0"+serial;
		}else if(serial>10) {
			sserial="00"+serial;
		}else {
			sserial="000"+serial;
		}
		return stype+" "+use+" "+sserial;*/
		/*if(type==1&&serial/100==0) {
			return "0"+type+" "+use+" "+"00"+serial;
		}
		if(type==1) {

			return "0"+type+" "+use+" "+serial;
		}
		if(serial/100==0) {

			return type+" "+use+" "+"00"+serial;
		}
		return type+" "+use+" "+serial;*/
		String stype=String.format("%02d", type);
		String sserial=String.format("%04d", serial);
		return stype+" "+use+" "+sserial;
	}
	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals..called");
		if (obj instanceof CarNumber) {
			CarNumber r = (CarNumber)obj;
			return (type == r.type) &&(use == r.use)&&(serial==r.serial);
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		//System.out.println("hashCode..called");
		return type+use+serial*1234;
	}

	@Override
	public int compareTo(CarNumber o) {
		/**/if(this.equals(o))
			return 0;
		else {
			if(this.type!=o.type)
				return type<o.type?-1:1;
			else if (this.type==o.type&&this.use!=o.use)
				return use<o.use?-1:1;
			else
				return serial<o.serial?-1:1;
		}

	}
}


public class Source04_Set {
	public static void main(String[] args) {
		CarNumber[] cn=new CarNumber[15];
		for(int i=0;i<cn.length;i++) {
			int t=1+(int)(Math.random()*2)*10;
			int r=(int)(Math.random()*2);
			char u="가바".charAt(r);
			int s=30+(int)(Math.random()*2)*1000;
			cn[i]=new CarNumber(t, u, s);
			System.out.println(cn[i].toString());
		}
		//=============================================================
		//cn에 설정된 CarNumber중에 중복 안센다고 가정하고 총 몇개 데이터?
		Set<CarNumber> f=new HashSet<>();
		for(int i=0;i<cn.length;i++) {
			f.add(cn[i]);
			//System.out.println(cn[i].hashCode());
		}
		System.out.println(f.size());
		System.out.println(f.toString());
	}
}
