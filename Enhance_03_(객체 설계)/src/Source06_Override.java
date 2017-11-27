import java.awt.*;
import java.awt.event.*;
//Override 시켜서 객체를 설계했을 때 최종적인 메소드가 작동된다는걸 이용한 awt
//계열의 클래스들.
class CustomWindowAdapter extends WindowAdapter{
//ctrl+space //오버라이드할수 있는 메소드들이 뜬다.
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("widowClosing");
		//더블클릭복사
		//오버라이딩 한것만 이용할수 있다.
	}
}
public class Source06_Override {
	public static void main(String[] args) {
		Frame f=new Frame();
		System.out.println("객체생성");
		
		f.setVisible(true);//창이 하나 뜬다.x버튼을 누르면,
		//frame객체가 가지고 있는 Windowadapter의 객체의 어떤 특정
		//메소드를 호출함.
		//System.out.println(객체)==>객체의 toString()을 사용해서
		///출력이 일어나는것과 비슷
		//WindowAdapter를 바꿔서 설정하면 , x버튼눌렀을때 해야할일을 지정
		//할 수 있음.설정을 안하면 아무일도 안일어남.
		//toString()을 오버라이드 하면. 출력패턴을 바꿀 수 있는것 같이
		//콘솔에서 수동으로 네모를 눌러서 꺼야된다.
		CustomWindowAdapter cwa=new CustomWindowAdapter();
		WindowAdapter wa=cwa;//부모클래스
		WindowListener wl=wa;//부모클래스으로 형변환
		WindowListener wll=new CustomWindowAdapter();
		cwa.windowClosing(null);//매개변수에 null을 설정한건 크게 신경안써도 됨.
		//wll.windowClosing(null);
		f.addWindowListener(cwa);//애를 호출을 하면 알아서 windowClosing
		//호출한다.
		//위에서 CustomWindowAdapter에 extends를 때면. 29번째 라인에서 컴파일 실패
		//가 뜸
		//객체 형 변환?
	}
}
