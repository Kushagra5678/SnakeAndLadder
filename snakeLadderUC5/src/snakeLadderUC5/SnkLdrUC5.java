package snakeLadderUC5;

public class SnkLdrUC5 {
	public static final int noPlay=0;
	public static final int ladder=1;
	public static final int snake=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position = 0;
		System.out.println("Start Position is: "+position);
		while(position != 100) {
			int dice_roll=1 + (int)Math.floor(Math.random() * 10)%6;
			int options= (int)Math.floor(Math.random() * 10)%3;
			switch(options) {
				case ladder:
					if(position+dice_roll<=100)
						position+=dice_roll;
					break;
				case snake:
					if (position > dice_roll)
						position-=dice_roll;
					else
						position=0;
					break;
				default:
					position=position;
			}
		}
		System.out.println("Final Position: "+position);
		System.out.println("Player Won the Game");
	}
}
