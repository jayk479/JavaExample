package work230403;

public class ArcadeGame implements Keypad {

	private int mode;
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		if(mode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		}else if(mode == HARD_MODE) {
			System.out.println("캐릭터가 연속 공격");
		}
	}

	@Override
	public void rightDownButton() {
		if(mode == NORMAL_MODE) {
			System.out.println("캐릭터가 HIT 공격.");
		}else if(mode == HARD_MODE) {
			System.out.println("캐릭터가 Double HIT 공격.");
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
