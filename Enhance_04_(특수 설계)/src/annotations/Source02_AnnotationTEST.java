package annotations;

public class Source02_AnnotationTEST {
    @SuppressWarnings({"deprecation","unused","null"})
    //밑줄이 안뜬다.
	public static void main(String[] args) {
    	int a;
		Piece p=null;//이건 100프로 널인걸 아니까 경고가 뜬다.
		Piece p1=Math.random()>0.5?null:new Bishop(2,2,1);
		//100프로 널인지 알수없어서 경고가 안뜬다.
		//이 객체의 Deprecated메소드를 사용할때 경고가 뜸 밑줄이 뜬다.
		//프로그램에 영향이 있진않다.
		//경고가 뜸.
		p.isAttackableTo(null);
	}

}
