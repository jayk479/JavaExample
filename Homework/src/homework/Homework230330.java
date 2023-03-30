package homework;

import java.util.Scanner;

public class Homework230330 {

	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		Product[] products = null;
		
		while(true) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.print("메뉴 선택> ");
			String selectNo = sc.nextLine();
			if(selectNo.equals("1")) {
				System.out.println("상품 수 입력> ");
				count = Integer.parseInt(sc.nextLine());
			}else if(selectNo.equals("2")) {
				products = new Product[count];
				for (int i = 0; i < products.length; i++) {
					// 상품 및 가격입력
					products[i] = new Product();
					System.out.println("상품명 입력");
					products[i].productName = sc.nextLine();
					System.out.println("가격 입력");
					products[i].price = Integer.parseInt(sc.nextLine());
				}
			}else if(selectNo.equals("3")) {
				// 제품별과 가격 조회
				// 3) 제품별 가격을 출력하세요.
				//	출력예시, "상품명 : 가격"
				for (int i = 0; i < products.length; i++) {
					System.out.println(products[i].productName + " : " + products[i].price);
				}
				
			}else if(selectNo.equals("4")) {
				// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				
//				int max = 0;
//				for (int i = 0; i < products.length; i++) {
//					if(max < products[i].price) {
//						max = products[i].price;
//					}
//				}
//				System.out.println("최고가격 : " + max);
				
			}else if(selectNo.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("다시 입력>");
			}
			
		}
		
		

	}

}
