package homework4.ball_player;

public class TestPlayer {

	public static void main(String[] args) {
		
        Player player = new Player(2, 0.5f, 2.5f);
        System.out.println(player);
        Ball ball = new Ball(7f, 7f, 7);
        System.out.println(ball);
        player.move(5,5);
        player.jump(4);
        System.out.println(player);
        if (player.isNear(ball)) 
        	player.kick(ball);
        System.out.println(ball);
	}

}
