
public class Study14 {

	public static void main(String[] args) {
		//데이터 상태에 따른 다른 연산이 필요할때
		//1.삼항연산:데이터 상태에 따라서 다른 결과물이 필요할때
		//2.if~else:데이터상태에 따라서 다른 작업이 요구될때
		
		double e= Math.random();
		System.out.println("e= "+e);
		//boolean(boolean데이터 혹은 연산)? true일떄 사용할 데이터:false일떄 사용할데이터
		boolean f=e>0.5;
		System.out.println(f?1:0);
		System.out.println(e>0.5?1:0);
		int s =e>0.5?1:0;
		System.out.println(s);
		
		int age=10+(int)(Math.random()*20);
		System.out.println(age);
	System.out.println(age>=19?"성인":"미성년자");
	String cate=
			age>=19?"성인":"미성년자";

			
			int  val1=35+(int)(Math.random()*30);//35->64
			int val2=35+(int)(Math.random()*30);
			System.out.println(val1+".."+val2);
	
	//50에 가까운 숫자를 뽑아달라.그리고 choice에 설정
			int g1=val1>50?val1-50:50-val1;
			int g2=val2-50;
			g2=g2>0?g2:-g2;
			int choice=g1<g2?val1:val2;
			System.out.println(choice);
			
	}

}
