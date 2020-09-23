package snakeLadderUC7;

public class SnkLdrUC7 {
	public static final int noPlay=0;
	public static final int ladder=1;
	public static final int snake=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position_player1 = 0, position_player2 = 0, chance=0;
		System.out.println("Start Position of player 1 is: "+position_player1);
		System.out.println("Start Position of player 2 is: "+position_player2);
		while(position_player1 != 100 && position_player2 != 100) {
			int dice_roll=1 + (int)Math.floor(Math.random() * 10)%6;
			int options= (int)Math.floor(Math.random() * 10)%3;
			switch(options) {
				case ladder:
					if(chance==0) {
						if(position_player1+dice_roll<=100) {
							position_player1+=dice_roll;
							chance=0;
						}
					}
					else {
						if(position_player2+dice_roll<=100) {
							position_player2+=dice_roll;
							chance=1;
						}
					}
					break;
				case snake:
					if(chance==0) {
						if (position_player1 > dice_roll) {
							position_player1-=dice_roll;
							chance=1;
						}
						else {
							position_player1=0;
							chance=1;
						}
					}
					else {
						if (position_player2 > dice_roll) {
							position_player2-=dice_roll;
							chance=0;
						}
						else {
							position_player2=0;
							chance=0;
						}
					}
					break;
				default:
					if(chance==0) {
						position_player1=position_player1;
						chance=1;
					}
					else {
						position_player2=position_player2;
						chance=0;
					}
			}
		}
		System.out.println("Final Position of player 1: "+position_player1);
		System.out.println("Final Position of player 2: "+position_player2);
		if(position_player1 == 100) {
			System.out.println("Player 1 won the game");
		}
		else {
			System.out.println("Player 2 won the game");
		}
	}


}
