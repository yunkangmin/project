
public class Source02_Array {
//메인은 이름을 내맘대로해도된다. 다른곳에서 쓰이지 않기 때문에
	public static void main(String[] args) {
		//배열객체는 생성을 하게 되면, 기본적으로 초기화가 다 되어있음
		//boolean==>false/ byte,short,int,long==>0
		//float,double==>0.0/객체는 null
		boolean[] a;//배열을 생성한 건 아님.
		a=new boolean[5];
		System.out.println(a[0]);//기본이 false다.
		Runnable[] r=new Runnable[10];//객체는 기본이 null
		System.out.println(r[0]);
		System.out.println(r[0]==null);
		String[] jobs=new String[4];
		System.out.println(jobs[0]);
		
		//배열은 final로 설정된 length라는 field가 있음==>int
		System.out.println(a.length);//크기가 나온다.
		System.out.println(r+"의 마지막 index = "+(r.length-1));
		//length는 퍼블릭이다.
		
		//배열자체는 메소드가 없는데 Object의 clone()을 오버라이드 해두었음.
		
		int[] sample=new int[3];
		for(int idx=0;idx<sample.length;idx++) {
			sample[idx]=idx;
		}
		int[] csample=sample.clone();//새로운 배열 하나만들어서 자신의 데이터를 세팅시켜서
		//복제본을 만들어준다.
		System.out.println(csample[2]+".."+csample[1]+".."+csample[0]);
		System.out.println(sample==csample);//같진않다.
	
	}

}
