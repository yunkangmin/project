
public class Source07_Exception {
	public static void main(String[] args) {
		//try - catch 작업이 필요할때 최상위로 catch를 함.(개발자들이 예외처리를 해야할때 Trowable로 함)
		//단점 이 상황별 처리가 불가능함.
		//보완을 해서 그전에 특수하게 처리할 Exception만 별도로 catch
		try {
			
		}catch(IllegalArgumentException e) {//특수 익셉션
			
			
		}
		
		catch(/*Throwable*/Exception e){//에러 익셉션 다잡힌다. Exception으로 하면 Exception만 잡힌다.
			System.out.println(e.getMessage());
		}//최종적으로 Throwable을 잡는다. 혹은 Exception으로
		//에러는 보통 사람들이 신경을 안쓴다.
		catch(Error e) {
			
		}
		//상황별 예외 처리
		//개발단계에서 그냥 Exception으로 하다가 나중에 최종적으로 상황별 Exception으로 나눈다.
	}
}
