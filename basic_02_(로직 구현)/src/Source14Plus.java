
public class Source14Plus {

	public static void main(String[] args) {
		//목적지까지 남은 거리 : 6
		//두 유저가 주사위를 (1-6) 굴려서 전진을 하는데
		//A=>B=>A=>B
		//A:5가 나올떄, 이길확률
		//둘중에하나라도 거리가 남아있을면 시도는 해야한다.
		
			int aleft=6;//A의 남은 거리
			int bleft=6;//B의 남은 거리
			int win=0;//이기는 경우
			int lose=0;//지는 경우
			do {
				aleft-=5;
				for(int b=1;b<=6;b++) {
					if(bleft-b<=0) {
						lose++;
					}else {
						win++;
					}
				}
			}while(aleft>0||bleft>=0);
		}
	}


