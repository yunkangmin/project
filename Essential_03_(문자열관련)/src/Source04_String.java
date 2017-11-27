
public class Source04_String {
	public static void main(String[] args) {
		//Comparing 비교 (다른 문자열과 비교)
		//경로
		String[] datas=new String [] {
				"/my/info","/account/create","/message/send",
				"/message/list","/account/list"
		};
		
		//boolean startsWith(String), boolean endsWith(String)
		//해당 문자열로 시작하는냐 아니면 끝나느냐 true or false
		for(int i=0;i<datas.length;i++) {
			System.out.println("=>"+datas[i]);
			boolean s=datas[i].startsWith("/message");
			boolean e=datas[i].endsWith("/list");
			System.out.println(s+".."+e);
		}
		//int compareTp(String)  / a.compareTo(b)==>a-b==>int
		int c="관우".compareTo("관평우우우");
		//길이를 맞춰보고 작은것과 긴것의 문자가 같을경우 길이차가 리턴
		//관우에서 관우가2글자. 관평과 비교. 우와 평이 다르므로 아스키코드값차 리턴
		//만약 관우와 관우우우우는 관우까지가 같으므로 길이차를 리턴.
		
		System.out.println('우'-'평');
		System.out.println(c);
		System.out.println("20123412".compareTo("2"));
		
		//boolean equals(String another):일치 체크
		String s1=datas[3].substring(datas[3].lastIndexOf("/")+1);
		System.out.println(s1);//s1.intern()하면 true가 나온다.
		System.out.println(s1=="list");
		System.out.println(s1.equals("list"));
		//전부다 같은 배열인지 확인 같은길이라면 거기서 비교 하나라도 다르면 리턴 false
		
		String[] rep=new String[] {"a321","b111","c4312","a1111"};
		//boolean matches(String)
		boolean f1=rep[0].matches("[ab]\\d{3}");
		System.out.println("==>"+f1);
		for(int i=0;i<rep.length;i++) {
			System.out.println(rep[i]+"==> "+rep[i].matches("[ab]\\d{3}"));
		}
		//정규식패턴에 맞는지
		//datas[3].
		
		
	}
}
