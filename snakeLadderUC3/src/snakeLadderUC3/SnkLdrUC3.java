package snakeLadderUC3;

public class SnkLdrUC3 {
	public static final int noPlay=0;
	public static final int ladder=1;
	public static final int snake=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int next_position = 0;
		System.out.println("Start Position is: "+next_position);
		int dice_roll=1 + (int)Math.floor(Math.random() * 10)%6;
		int options= (int)Math.floor(Math.random() * 10)%3;
		switch(options) {
		case ladder:
			next_position+=dice_roll;
			break;
		case snake:
			next_position-=dice_roll;
			break;
		default:
			next_position=next_position;
		}
		System.out.println("Next Position is: "+next_position);
	}

}
