
public class Source03_String {

	public static void main(String[] args) {
		//문자열을 토대로 정보제공
		//설정해논 캐릭터배열에 대한 정보를 찾아준다.
		//String class's method
		//String은 char[]로 문자들을 관리함.
		String sample="자바의 String";
		//char[]배열로 문자들이 관리됨.

		//int length()
		int len=sample.length();//배열길이: 문자열길이
		System.out.println(len);

		//char charAt(int)
		char c= sample.charAt(1);
		System.out.println(c);
		//생각..String==>char parsing이 없다.
		char t="잠".charAt(0);

		//몇글자 제한 String.length()필요
		//특정위치에 있는 문자
		//String.substring(int) / String.substring(int,int)
		String sub1=sample.substring(2);//일부분을 추출 원본은 안바뀐다.2부터 끝까지 추출
		System.out.println(sub1);//0 1 2 순서대로 배열이므로
		String sub2=sample.substring(3, 7);//begin<=   <end
		//거꾸로는 안된다.7-3을해서 계산
		System.out.println(sub2+".."+sub2.length());

		String id="oracle";
		String hid=id.substring(0, 2)+"*****";
		//0부터 몇개 추출
		System.out.println(hid);

		String phone="084-001-04-104-527";
		//중간에 숫자만 추출
		char[] ar=phone.toCharArray();//clone으로 생성해서 리턴
		//ar.equals(ar);캐릭터는 equals가 없다 Object의 equals다.
		String m2=new String(ar,4,4);
		System.out.println(m2);
		String m2_2=phone.substring(4,8);
		System.out.println(m2_2);
		System.out.println(m2==m2_2);

		//String[] split(String), String[] split(String,int)
		System.out.println("===========================");
		String[] arr=phone.split("-",4);//특정문자열기준으로 쪼개기 해당데이터는 사라진다.리밋4개이상부터는 그냥 합친다.
		System.out.println(arr.length);
		for(int idx=0;idx<arr.length;idx++) {
			System.out.println(idx+"=>"+arr[idx]);
		}
		//Search 기능
		String test="pop!pop!!pop";//특정문자의 위치
		//int indexOf(char), int indexOf(String)
		//int indexOf(char, int) , int indexOf(String, int)
		//숫자가 들어가는 것은 탐색위치 디폴트가 0
		//int lastIndexOf(char), int lastIndexOf(String)
		//int lastIndexOf(char, int), int lastIndexOf(String, int)
		//=>처음 발견한 위치값이며 , 없는 경우만 -1
		//boolean contains(String)
		//이게 싫으면 tochatArray해서 만들면된다.
		System.out.println(test.indexOf('o'));
		System.out.println(test.indexOf('p'));
		System.out.println(test.indexOf("p!!"));
		System.out.println(test.indexOf("p!",4));
		System.out.println(test.lastIndexOf("p!"));
		System.out.println(test.lastIndexOf("p!",5));
		//5번째부터0번째로가면서 찾기 인덱스는 뒤나 앞이나 처음부터 센다.
		//거꾸로 찾는다.그냥 뒤에서 부터 찾는것
		System.out.println(test.contains("p!pp"));//문자열이 있는지 없는지체크

		//replace 기능
		String tag="<h2>H e l l o!</h2>";
		//String toUpperCase()==>전부 대문자로 변경
		//String toLowerCase()==>전부 소문자로 변경
		//String replace(char, char), String replace(String, String)
		String u= tag.toUpperCase();
		System.out.println(u);//자신이 가지고 있는 데이터는 안바뀐다.
		
		String r=tag.replace("<", "&lt");//문자바꾸기
		System.out.println(r);

		//금지어 필터링
	}
}


