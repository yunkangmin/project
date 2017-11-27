package model;

public class Source11_Illusion_TEST {

	public static void main(String[] args) {
		Illusion i1=new Illusion();
		Illusion i2=new Illusion();
		Illusion i3=new Illusion();
		
		int n= i1.damagedBy(80);
		System.out.println(n);
		int n1=i2.damagedBy(30);
		System.out.println(n1);
		int n2=i1.damagedBy(30);
		System.out.println(n2);
		int n3=i3.damagedBy(300);
		System.out.println(n3);
	}

}
