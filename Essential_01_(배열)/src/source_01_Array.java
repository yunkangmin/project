import chess.clean.Pawn;

/*
 * 배열 객체 (Array)
 * -같은 타입의 객체 여러개를 묶어서 관리할수 있게 박스형태의 객체
 * 한번 만들어질때 크기가 지정이 되어야하고, 정해지 타입의 데이터만 관리
 * 배열객체가 관리하는 데이터보관소는 index를 통해서 접근,제어가 가능함.
 * 
 * 
 */
public class source_01_Array {
public static void main(String[] args) {
	//new Runnable();인터페이스라서 생성이 안된다.
	System.out.println(new int[4]);//int 데이터까지 세팅이 
	System.out.println(new String[3]);//시작주소값이 찍힌다.
	System.out.println(new Pawn[8]);
	System.out.println(new Runnable[3]);
	//인터페이스라서 객체생성이 안되지만 데이터보관소로서 배열객체로 생성이 가능하다.
	//보관소를 만드는거지 실제 데이터를 생성한게 아니다.
	//생성시켜두고 사용을 하려면,
	//Object o=new int[4];배열객체도 Object의 하위임
	//실제 사용을 하려면 제대로 받아야 되는데,
	int[]a=new int[4];
	String[] b=new String[3];//변수 선언이 이게 권장 이긴 하지만
	Pawn c[]=new Pawn[4];//이렇게 해도 되긴 함.
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	//배열의 저장공간의 index처리가 되어있음 0번부터==>마지막인덱스 [실제만든크기-1]
	a[0]=4;
	//a[4]=true;int형 공간이어서 못쓴다.
	b[0]="java";
	c[0]=new Pawn(1,4,1);
	
	//System.out.println(c[4]);없는 인덱스접근 런타임오류가 발생한다.
	//그 안에 있는 데이터는...
	int z=a[0];
	System.out.println(z);
	System.out.println(a[0] * 3);//그냥 바로 써도 된다.
	
	Pawn pz=c[0];//뽑아서 써도 되고
	System.out.println(pz.toString());
	System.out.println(c[0].isSameTo(1, 4));//그냥바로 써도되고
}
}

