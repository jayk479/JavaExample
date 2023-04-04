package work230403;

public class GameExample {

	public static void main(String[] args) {
		Keypad key = new RPGgame();
		
		//System.out.println("RPGgame실행");
		key.leftUpButton();
		key.rightUpButton(); 
		key.changeMode(); 
		key.rightUpButton(); 
		key.rightDownButton();
		key.leftDownButton();
		key.changeMode();
		key.rightDownButton();
		
		System.out.println("--------------");
		//System.out.println("ArcadeGame실행");
		key = new ArcadeGame();
		key.leftUpButton();
		key.rightUpButton();
		key.leftDownButton();
		key.changeMode();
		key.rightUpButton();
		key.leftUpButton();
		key.rightDownButton();
	}

}
