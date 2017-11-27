
public class Source14 {

	public static void main(String[] args) {
		//2차원 평면이 있음 -5<= x,y <=5
		int tx=4;
		int ty=3;
		//폭탄이 떨어진 좌표 tx,ty /유효거리는 정사각형이고 
		//피해범위는 폭탄이 떨어진 지점으로부터 반경2이하
		//영향을 받는 좌표들 출력
		/**/	for(int n=-2;n<=2;n++) {
			int vx=tx+n;
			for(int r=-2;r<=2;r++) {
				//int vx=tx+r;
				int vy=ty+r;
				System.out.println(vx+" "+vy);
			}
		}
		/*for(int cx=tx-2;cx<=tx+2;cx++) {
			for(int cy=ty-2;cy<=ty+2;cy++) {
				if(cx>=-5&&cx<=5&&cy>=-5&&cy<=5)
					System.out.println(cx+" "+cy);
			}
		}*/
		/*for(int cx=tx-2>=-5?tx-2:-5;cx<=(tx+2<=5?tx+2:5);cx++) {
		for(int cy=ty-2>=-5?ty-2:-5;cy<=(ty+2<=5?ty+2:5);cy++) {
				System.out.println(cx+" "+cy);
 			}
		}*/
		//피해범위가2라면 0까지 포함해서 총25개이다.
	}//오목도 비슷하다
}


