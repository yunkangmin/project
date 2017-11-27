
public class Source06_Exception {
	public static void main(String[] args) {
		/*
		 * 
		 * Exception도 객체고, 상속계층도가 존재함.
		 * catch잡을때, 그룹으로 잡을수 있음.
		 * IndexOutOfBoundsException
		 * 			-StringIndexOutOfBoundsException  / String 관련객체에서 터짐
		 * 			-ArrayIndexOutOfBoundsException   / Array 관련해서 터짐
		 * 
		 * 
		 * 
		 */
		try {
			if(Math.random()>0.5) {
			char c="java".charAt(9);  //StringIndexOutOfBoundsException  스트링배열의 없는인덱스를 접근할때  "java".substring(0,6)
			}else {
				char[] car="java".toCharArray();//ArrayIndexOutOfBoundsException  배열의 없는 칸을 접근할때
			
			System.out.println(car[8]);
			}
		}catch(StringIndexOutOfBoundsException| ArrayIndexOutOfBoundsException e ){
			System.out.println(e.toString()+" / "+e.getMessage());
		}
		//============================================================================================
		System.out.println("==============================================================================");
		try {
			if(Math.random()>0.5) {
				char c="java".charAt(9);  //StringIndexOutOfBoundsException
				}else {
					char[] car="java".toCharArray();//ArrayIndexOutOfBoundsException
				
				System.out.println(car[8]);
				}
			
		}catch(IndexOutOfBoundsException e ){//부모타입으로 잡을수 있다.
			System.out.println(e.toString()+" / "+e.getMessage());
		}/*catch(StringIndexOutOfBoundsException e) {
		//이미 위에서 잡았다. 위에가 StringIndexOutOfBoundsException이고 아래가 IndexOutOfBoundsException는 가능 (위에서 못잡는 익셉션이 있을경우가 있기때문)
			
			
			
		}*/
		IndexOutOfBoundsException e1=new StringIndexOutOfBoundsException();
		IndexOutOfBoundsException e2=new ArrayIndexOutOfBoundsException();
		//위에서 부모(그룹)으로 잡고 아래서 하위그룹으로 잡는것은 불가
		//그룹으로 잡는거 가능, 그룹으로 잡기전에는 해당 소속의 익셉션을 따로 처리가 가능(역으론 안됨)
		//그래서, Source07에서... 가장 많이 사용되는 형태를 보자.
		
	}
}
