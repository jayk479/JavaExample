package work230404;

import java.util.Scanner;

public class StringGame {
	String game;
	char alp;
	
	String[] gameVocas = {"Orange", "Game", "Phone", "Smart"};
	
	int gameRd;
	String gameVoca;
	Scanner sc = new Scanner(System.in);
	
	
	public void setCharData() {
		gameRd = (int)(Math.random()*4);
		gameVoca = gameVocas[gameRd];
//		System.out.println(gameRd);
//		System.out.println(gameVoca);
		
		System.out.println("문자 입력> ");
		for (int i = 0; i < gameVoca.length(); i++) {
			alp = sc.nextLine().charAt(0);
			if(gameVocas[gameRd].contains(String.valueOf(alp))) {
				game += alp;
				//대소문자구분없이하고싶음ㅇㅇ
				//중복값제거어떻게함?
//				for (int j = 0; j < game.length(); j++) {
//					if(game.contains(String.valueOf(alp))) {
//						System.out.println("중복");
//						j--;
//					}
//				}
				System.out.println("문자열을 구성하는 문자");
			}else {
				 System.out.println("문자열을 구성하는 문자가 아닙니다.");
			}
			System.out.println("현재까지 확인된 문자들은 다음과 같습니다.");
			for (int j = 4; j < game.length(); j++) {
				//처음부터 틀린 스펠링이면 어떻게 함?
				System.out.print(game.charAt(j)+" ");
			}
		}
		System.out.println();
	}
	

	public void setStrData() {
		System.out.println("현재까지 확인된 문자들은 다음과 같습니다.");
		for (int j = 4; j < game.length(); j++) {
			System.out.print(game.charAt(j)+" ");
		}
		System.out.println();
		System.out.print("입력값 ");
		String guess = sc.nextLine();
		String ox = "";
		for (int i = 0; i < gameVoca.length(); i++) {
			if(gameVoca.length() == guess.length()) {
				if(gameVoca.contains(String.valueOf(guess.charAt(i)))) {
					ox += "O";
				}else {
					ox += "X";
				}
			}else {
				System.out.println("입력된 문자열의 길이가 정답과 다릅니다.");
			}
		}
		for (int i = 0; i < ox.length(); i++) {
			System.out.print(ox.charAt(i) + " ");
		}
		System.out.println();
	}		
		
	
	
	public void showCharData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for (int j = 4; j < game.length(); j++) {
			System.out.print(game.charAt(j)+" ");
		}
		System.out.println();
		System.out.println("입력 값>> ");
		String answer = sc.nextLine();
		if(answer.equals(gameVoca)) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("정답아님");
		}
	}
	
	public void init() {
		System.out.println("새 게임");
		game = "";
		setCharData();
	}
}
