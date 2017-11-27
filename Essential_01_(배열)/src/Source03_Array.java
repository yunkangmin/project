//배열은 생성을 하면서 데이터를 세팅할 수 있음.

public class Source03_Array {
public static void main(String[] args) {
	String [] ar=new String[4];//문자열을 만든건아니다. 공간을 만든것이다.
	ar[0]="자바의 문자열";//칸만 만들어두고 나중에 세팅해도된다.
	System.out.println(ar[0].indexOf("문자"));//null이 뜬다.
	//System.out.println(ar[1].indexOf("문자"));//터진다.
	
	String[] br=new String[] {"전사","도적","사냥꾼","마법사","사제"};
	int ridx=(int)(Math.random()*br.length);
	System.out.println("강민...."+br[ridx]+"!!!");
	
	//선언과 동시에 초기화도 가능하다.
	int[]nums=new int[] {31,28,31,30};
	int [] copy=new int[nums.length];//배열의 한도21억개까지int의 경우
	//[]안의 숫자를 int형으로 쓰니까
	for(int idx=0; idx<nums.length;idx++) {
		copy[idx]=nums[idx];
	}
	int[] cnums=nums.clone();//기본자료형일때만 된다.
	//clone()메소드가 위의 과정을 대신해준다.
	//같은 객체 주소가 같다.원본이 바뀐다.
	cnums[0]*=10;//int형이기 때문에 가능하다.
	
	System.out.println(cnums[0]+" / "+(cnums==nums)+" / "+nums[0]);
	int [] dnums=new int[] {31,28,31,30};
	System.out.println(dnums[0]+" / "+(dnums==nums));
	
	StringBuilder[]sbs=new StringBuilder[] {new StringBuilder(),
			new StringBuilder(),new StringBuilder()};
	//직접객체를 생성해서 넣어줘야한다.
	StringBuilder t= new StringBuilder();
	StringBuilder[] sbss=new StringBuilder[] {t,t,t,t,t};
	//int exp=1000; int cp=exp; 원본이 지켜진다.
}
}
