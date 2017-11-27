package model;

public class Function {
	//class 설계를 할때, field는 굳이 필요치 않고,
	//method들의 집합체로 설계되어 지는 경우가 있다.
	//이런 경우에 static메서드로 설계들을 하는데
	//굳이 객체 생성을 안해도 쓸수 있다.
	//static을 만들어야 편하게 쓸수 있다.
	
	public static int max(int a,int b) {
		return a>b?a:b;
		
	}
	public static double max(double a, double b) {
		return a>b?a:b;
		
	}
	//생성을 해봐야 무의미하고 가치가 없는 class라면 생성자를 막아둠.
	private Function() {
		
	}
}
