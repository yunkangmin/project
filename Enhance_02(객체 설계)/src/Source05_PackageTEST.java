
import java.awt.List;
//import java.util.List; 다른 패키지 같은 이름 혼동 에러
//어쩔수 없이 풀경로를 써야 한다.

import model.Unit;

public class Source05_PackageTEST {

	public static void main(String[] args) {
		model.Unit u=new model.Unit();
		java.awt.Rectangle r=new java.awt.Rectangle();
		List li;
		java.util.List lii;
		/*앞서 설계해본 Bomb class같이 필요한 객체들을 설계해서 
		객체간 관계를 맺어서 프로그램을 구현하자는게 객체지향방식임.

		실제로 하나의 프로젝트를 진행하다 보면 꽤 많은 객체들이 설계될꺼임
		그 객체들을 의미있게 그룹핑을 할 수 있게 지원하는게 패키지 라는개념

		이때까지 사용했던 default package는 이름없는 패키지(굳이 패키지작업이 필요없을때 사용)

		패키지 작업을 할려면, eclipse상에서 src 우클릭 new package

		패키지를 만들면 폴더가 만들어진다.
		이름 뒤에 model.human model안에 human폴더가 생긴다. 이중폴더

		패키지(클래스 관리해주는 폴더 개념) .을 사용하게 되면 하위 패키지를 만들수 있다.

		#package model
		#package model.human
		#package models.animal

		패키지처리가 되어있는 패키지를 사용하려면, 타 패키지에서는 바로 인식이 안된다.
		같은 패키지라면 상관이 없다.
		타 패키지에서 사용을 하려면 소속을 지정해줘야 함
		일일이 지정하기 때문에 힘들기때문에 그때 사용하는게 import키워드이다.(필수는 아니다.)
		import가 안되는 상황*/
		//클래스가 많이 만들어지는 상황이라면 패키지로 관리하자
		

	}

}
