
public class Source10_RegEx {

	public static void main(String[] args) {
		// \\w :a-zA-Z0-9_
		//Quantifiers(¼ö·®ÇÑÁ¤)
		
		//x?,x??,x?+ ´Ù°°Àº ÀÇ¹Ì ÀÖ°Å³ª ¾ø°Å³ª 0 or 1
		 
		boolean b="9s".matches("\\d[a-z]?"); //"9","9s" ?¹Ù·Î¾Õ¿¡°ÍÀ» ÀÇ¹Ì s°¡ ÀÖ°Å³ª ¾ø°Å³ª
		System.out.println(b);
		
		//x*, x*?,x*+ : zero or more ¾øÀ»¼öµµ ÀÖ°í ÀÖÀ»¼öµµÀÖ´Âµ¥ ¿©·¯°³°¡ ÀÖÀ»¼öµµ ÀÖ´Ù.
		
		boolean b2="a12323".matches("[aA]*\\d*");//¼ıÀÚ°¡ ¾ø°Å³ª ¿©·¯°³°Å³ª 0ÀÌ»ó
		System.out.println(b2);//ÇØ´ç ¹®ÀÚ¿­ÀÌ Á¤±Ô½Ä¿¡ ¸ÅÄ¡°¡ µÇ´À³Ä ¾ÈµÇ´À³Ä
		
		//x+,x+?,x++ : 1ÀÌ»ó ¹İµå½Ã 1¹ø  ÀÌ»óÀº ÀÖ¾î¾ß ÇÑ´Ù.
		boolean b3="10".matches("\\d*[a-z]+");
		System.out.println(b3);
		
		//x{n} ,x{n}? ,x{n}+ :exactly n times
		
		boolean b4="21Çã7945".matches("\\d{2}[°¡-ÆR]\\d{4}");
		//¼ö·®Á¦ÇÑ ¹İµå½Ã 2°³°¡ ÀÖ¾î¾ß ÇÑ´Ù. ¹İµå½Ã 4°³°¡ ÀÖ¾î¾ß ÇÑ´Ù.
		System.out.println(b4);
		
		//¾î¶°ÇÑ ¾ğ¾îµçÁö Á¤±Ô½ÄÀº Áö¿øÇÑ´Ù.¾à°£¾¿ ¾²´Â°Ô ´Ù¸£´Ù.
		//ÁÖ¹Îµî·Ï¹øÈ£Ã¼Å©
		//x{n,} ,x{n,}?,x{n,}+ :at least n times ÃÖ¼ÒÇÑ ¸î¹øÀÌ»ó
		//x{n,m}, x{n,m},x{n,m}+ :at least n but more than m ÃÖ¼Ò nÀÌ»ómÀÌÇÏ
		String r="01[016789]-\\d{3,4}-\\d{4}";//ÇÚµåÆù ¹øÈ£
		boolean b5="010-2114-8225".matches(r);
		System.out.println(b5);
		
		boolean b6="[abc]".matches("\\[\\w+\\]");
		System.out.println(b6);//¹®ÀÚ¿¡ [ÀÖ´ÂÁö ¾Ë°í½Í´Ù¸é \\[ \\À» ¾Õ¿¡ ºÙ¿©¾ßÇÑ´Ù.
		//ÀÌ¹Ì ÀÇ¹Ì ÀÖ´Â ¹®ÀÚ(.,*,?,+¸¦ Ã£À¸·Á¸é \\¼³Á¤)
		
		//±×·ì 
		boolean b7="aa3bb2et1ze5".matches("([a-z]{2}\\d)+");//()·Î ¹­°Ô µÇ¸é ±×·ìÀÌ¶õ ¼Ò¸®´Ù.
		//Æ¯Á¤ÆĞÅÏÀÌ ¸î¹øµîÀåÇØ¾ßµÈ´Ù...ÀüÃ¼¼³Á¤
		System.out.println(b7);
	
		
		
		//±×·ìÃ³¸®

	}

}
