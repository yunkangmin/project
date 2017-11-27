import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Source11_RegEx {

	public static void main(String[] args) {
	String data="ÀÌÀü¿¡ ¸ô´ø Â÷´Â 21°¡1231¿´°í, »õ·Î »ê Â÷´Â 41¿À9135¿´´Âµ¥, Áö±Ý »ç°í ÁßÀÌ¶ó ¸ô°í ÀÖ´Â";
	data+="ÀÓ½Ã Â÷ ¹øÈ£´Â 79¹Ù79125³Ê12312ÀÔ´Ï´Ù.";
	//»ç¿ëÇÑ°ÍÀº ¹ö¸°´Ù »ç¿ëÀÌ ¾ÈµÈ´Ù.
	String regex="(\\d{2})([°¡-ÆR])(\\d{4})";

	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(data);
	
	while(m.find()) {
		String g=m.group();
		System.out.println("->"+g);
		
		String s1=m.group(1);
		String s2=m.group(2);
		String s3=m.group(3);
		//m.group(4);
		
		System.out.println(s1+".."+s2+".."+s3);
		String tt=String.format("%s,%s,%s,%s", m.start(),m.start(1),m.start(2),m.start(3));
		System.out.println(tt);
	}
	/*Pattern p=Pattern.compile("\\d{2}[°¡-ÆR]\\d{4}");//¿©±â¿¡´Â +¸¦ ³ÖÀ¸¸é ¾ÈµÈ´Ù.¾Æ¹«°Å³ª ³ÖÀ¸¸é ¾ÈµÈ´Ù.
	//¾È¿¡ µé¾î°¡´Â ¹®ÀÚ¿­ÀÌ Á¤±Ô½Ä¿¡ ¾È¸ÂÀ¸¸é ÅÍÁø´Ù.

	Matcher m=p.matcher(data);//ÇÑ¹ø¸¸µé¸é ÀçÈ°¿ëÀº ¾ø´Ù.´Ù½Ã ¾²·Á¸é ´Ù½Ã¸¸µé¾î¾ßÇÑ´Ù.
	for(int cnt=1;cnt<=6;cnt++) {
		boolean b=m.find();//¸ÇÃ³À½¿¡´Â Ã¹¹øÂ° µÎ»·Â°È£Ãâ¿¡´Â ±×´ÙÀ½ ¶ÇÈ£ÃâÇÏ¸é ±×´ÙÀ½
		System.out.println(b);
	}
	
	m.reset();
	int cnt=0;
	
	while(m.find()) {
		cnt++;
		String g=m.group();//ÀüÃ¼ ±×·ì m.group(0); °°Àº°ÅÀÓ
	    int s=m.start();//Ã£Àº ¹®ÀÚ¿­ÀÇ ½ÃÀÛidx
		int e=m.end();//³¡ idx+1;
		String s1=m.group(1);
		String s2=m.group(2);
		String s3=m.group(3);
		System.out.println(s1+" "+s2+" "+s3);
		String tt=String.format("%s,%s,%s,%s", m.start(),m.start(1),m.start(2),m.start(3));
		System.out.println(tt);
		
		//start <=    <  end
		System.out.println(g+"["+s+"-"+e+"]");
		System.out.println(data.substring(s,s+2));
		System.out.println(data.substring(s+2,s+3));
		System.out.println(data.substring(s+3,e));
	}
	System.out.println("CNT == "+cnt);*/
	
	//Â÷·® ¹øÈ£ ÀüÃ¼ Àâ¾ÒÀ¸¸é, ±×´ÙÀ½..
	//¾Õ¿¡ 2°³ µû·Î °¡¿îµ¥ ¹®ÀÚ µû·Î
	
	// hutblog.tistory.com/entry/02
	//Ä«Ååºí¶óÀÎµåÅ×½ºÆ® 2¹ø¹®Á¦
	//¹è¿­À»¾²ÀÚ
	//1¶ó¿îµå 2¶ó¿îµå 3¶ó¿îµå µû·Î ÃßÃâ
	//Á¤±Ô½Ä/±×·ì/Pattern&Matcher/
	//µ¥ÀÌÅÍ Ã³¸®¸¦ À§ÇÑ int[]
	//¹Ýµå½Ã 3¼¼Æ®
	//±× ÇÁ·Î±×·¥À» ½ÇÇà½ÃÄ×À»¶§ µ¥ÀÌÅÍ¸¦ ÀÔ·Â¹Þ¾Æ¼­ Ã³¸®ÇÏ°Ô¸¸ ¹Ù²ãµÎ½Ã°í
	
	}

}
