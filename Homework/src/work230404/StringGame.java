package work230404;

import java.util.Scanner;

public class StringGame {
	String game;
	char alp;
	
	String[] gameVocas = {"Orange", "Game", "Phone", "Smart"};
	int gameRd = (int)(Math.random()*4);
	String gameVoca = gameVocas[gameRd];
	
	Scanner sc = new Scanner(System.in);
	
	public void setCharData() {
		System.out.println("문자 입력> ");
		alp = sc.nextLine().charAt(0);
		for (int j = 0; j < gameVoca(gameRd).length(); j++) {
			
		}
		if(alp == gameVocas[gameRd].charAt(i)) {
			System.out.println("문자열을 구성하는 문자입니다.");
		}else{
			System.out.println("문자열을 구성하는 문자가 아닙니다.");
		}
		
	}
	
	public void setStrData() {
		
	}
	
	public void showCharData() {
		
		
	}
	
	public void init() {
		
		
	}
}
