package work230403;

public class RPGgame implements Keypad{
	
	private int mode;

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if(mode == NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}else if(mode == HARD_MODE){
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if(mode == NORMAL_MODE) {
			System.out.println("캐릭터가일반공격");
		}else if(mode == HARD_MODE){
			System.out.println("캐릭터가 HIT 공격");
		}
	}

	@Override
	public void changeMode() {

		if(mode == NORMAL_MODE) {
			mode = HARD_MODE;
			System.out.println("현재모드 : HARD_MODE");
		}else if(mode == HARD_MODE) {
			mode = NORMAL_MODE;
			System.out.println("현재모드 : NORMAL_MODE");
		}
	}
	
	

}
