
public class Source07 {

	public static void main(String[] args) {
		//16Áø¼ö 0~F¸¦ ÀÌ¿ëÇØ¼­ ¼ıÀÚ¸¦ Ç¥±â
		//10Áø¼ö 10=>A, 11=>B   15=>F
		//
	/*	int n=(int)(Math.random()*45);
		String s=Integer.toString(n,16);//¾Õ¿¡ 10Áø¼ö, µÚ¿¡ º¯È¯ÇÒ Áø¼ö
		
		System.out.println(n+"Àº 16Áø¼ö "+s);*/
		
		int target=(int)(Math.random()*256);
		System.out.println(target+"À» 16Áø¼ö·Î º¯È¯ÇÏ¸é");
		String change="";
		String b;
		b=""+'a';//±×³É'a'´Â Ä³¸¯ÅÍ ÇüÀÌ¹Ç·Î ¾ÈµÈ´Ù.¹®ÀÚ¿­¿¡ Ä³¸¯ÅÍ¸¦ ´õÇÏ´Â °ÍÀº µÈ´Ù.
		System.out.println(b);
		//¹«Á¶°Ç µÎÀÚ¸®·Î ¸¸µé¾î´Ş¶ó.
		//1.16À¸·Î ³ª´³À»¶§ÀÇ ¸ò°ú ³ª¸ÓÁö¸¦ ±¸ÇØ¾ßÇÔ
		//10~15±îÁö´Â ¹®ÀÚ·Î ¹Ù²ã¾ßÇÔ
		//StringÀÌ ¾Æ¹«°Íµµ ¾ø´Ù¸é ¹®ÀÚ¿­À» ´õÇÒ ¼ö °¡ ¾ø´Ù.
		int n1=target/16;
		int n2=target%16;
		if(n1>9) {
			switch(n1) {
			case 15:
				change+="F";
				break;
			case 14:
				change+="E";
				break;
			case 13:
				change+="D";
				break;
			case 12:
				change+="C";
				break;
			case 11:
				change+="B";
				break;
			case 10:
				change+="A";
			}
		}
		else {
			change+=n1;
		}
		if(n2<10) {
			//change+=n2;
			change+=(char)(n2+48);//'0'ÀÌ 48ÀÌ±â ¶§¹®ÀÌ´Ù.±×·¯¸é ¹®ÀÚ '0'ÀÌ º¯¼ö¿¡ ÀúÀåµÈ´Ù.
			//change+=(char)n2;//ÀÎÆ®Çü ¼ıÀÚ¿¡ ¸Â´Â ¹®ÀÚ¸¦ ´ëÀÔÇÑ´Ù.
		}else {
			change+=(char)(n2+55);//65°¡ AÀÌ±â ¶§¹®ÀÌ´Ù.
		}
		System.out.println(target+">"+change);
		System.out.println('A'==65);
		System.out.println((char)55204);
		System.out.println((int)'ÆR');
		System.out.println((int)'0');//'0'-'9' : 48 ~ 57 , 'A':65~90, 'a':97
		//'°¡':44032 'ÆR'(char)55204 ÇÑ±ÛÀÇ °¡Àå ¸¶Áö¸· ÁöÁ¤µÇ¾î ÀÖÁö ¾Ê¾ÒÀ¸¹Ç·Î ?°¡ ³ª¿Â´Ù.
	
		//switch caseµÎ¹ø ÀÛ¼º
		//234==>EA 15----10
		//0±îÁö ´Ù³ª¿Â´Ù.
		//toStringÀ¸·Î ÇÏ¸é 0ÀÌ »ı·«µÈ´Ù.
		//else´ë½Å default·Î Ã³¸®ÇÒ¼öµµ ÀÖ´Ù.
		
		
		//¹®ÀÚµµ ¼ıÀÚ´Ù. 
		/*System.out.println('A'*1);
		System.out.println((int)'A');//65~90±îÁö ¾ËÆÄºªÀÌ´Ù.
		System.out.println((char)65);
		System.out.println((char)66);
		System.out.println((char)67);*/
	}

}
