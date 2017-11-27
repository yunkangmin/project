package annotations;
/*
 * annotation : 원뜻(주석)
 * -프로그램적으로는 직접적인 영향이 있진 않지만,
 * 정보를 제공하는 (컴파일러 혹은 타 시스템)역할을 함
 * 기계가 인식하는 주석
 * @Override컴파일을 할떄 기계에 어떠한 정보를 제공한다.
 * 어노테이션을 직접 만드는 일은 거의 없음.
 * 미리 정해진 것들 몇가지 살펴보면 됨. 
 * 
 */
public @interface Comment {
	String writer();
	String date();
	String about();
	int version()default 1;
	boolean flag()default false;
	//default가 있는 것들은 설정을 안해도 된다.
}
