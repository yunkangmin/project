
public class Source09_RegEx {
	public static void main(String[] args) {
		String[] regex=new String[] {
				"[abc]",//a or b or c
				"[^abc]",//except a or b or c //a b c °¡¾Æ´Ï°í
				"[a-zA-Z]",// a through z or A trough Z ¿µ¹®ÀÚ¾Æ¹«°Å³ª
				"[a-d[m-p]]", // a through d, m through d : a-dm-p
				"[a-z&&[def]]",//d,e ,or f
				"[a-z&&[^bc]]",//a through z and except b,c : ad-z
				"[a-z&&[^m-r]]"//a through z and except m thought r
		};
		
		boolean b="cat".matches("[abc]a[tp]");
		//¹®ÀÚ¿­ÇÏ³ª¸¦ Ã¼Å©ÇÏ´Â°Í StringÀÌ °¡Áø matches´Â true or false¹İÈ¯
		//pattern or matcher´Â ÆĞÅÏÀ» Ã£±â À§ÇÑ°Í
		System.out.println(b);
		
		String r="[abc]a[otz]";
		boolean b1="bat".matches(r);
		System.out.println(b1);
		System.out.println("batcao".matches(r));
		System.out.println("cao".matches(r));
		//Á¤È®È÷ ÀÏÄ¡ ÇÏ´ÂÁö¸¦ Ã¼Å©
		boolean t="A3b".matches("[A-Z][^0-3[368]][^g-m]");
		//&&Á¶°ÇÀ» ÀûÀ»½Ã¿¡´Â []Àû¾îÁà¾ßÇÑ´Ù.[[]]´Â ±âº»ÀÌ or µÑÁßÇÏ³ª¶óµµ ÀÖ´Ù¸é trueÀÌ´Ù.
		System.out.println(t);
		//¹Ì¸® Æ¯Á¤±×·ìÀº ±âÈ£·Î Ã³¸® ÇØµÒ.
		// . : any char 
		// \\d digit[0-9]  
		// \\D non-digit [^0-9]
		// \\s whitespace[\t\n\r]½ºÆäÀÌ½º¶ó°í »ı°¢ÇÏ¸éµÈ´Ù.
		// \\S non-white[^\\s]
		// \\w word character[A-Za-z0-9_]
		// \\W non-word character  Digit
		
		boolean z1="3 D".matches("\\d\\s\\w");
		System.out.println("==> "+z1);
		boolean z2="31´Ù0244".matches("\\d\\d[¤¡-¤¾°¡-ÆR]\\d\\d\\d\\d");
		boolean z3="31¤»0244".matches("\\d\\d[¤¡-¤¾°¡-ÆR]\\d\\d\\d\\d");
		System.out.println(z2);//¤¡¤¤¤§¤©Àº µû·Î ÀâÇôÀÖ´Ù.
		System.out.println(z3);//¤¡¤¤¤§¤©Àº µû·Î ÀâÇôÀÖ´Ù.
		
		//ÀÚ¹Ù½ºÅ©¸³Æ®½Ã ·Î±×ÀÎ½Ã ¹®ÀÚÃ¼Å©±â´É
	}
}
