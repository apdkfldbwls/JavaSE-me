package day03.loop;

/*
*
**
***
****
*****
******
*******
반복문 조건문 연습
 주말숙제 2중for문 코드 분석하기 
 
2번
   *
  **
 ***
****
3번
   *
  ***
 *****
******* 
  
4번
   *
  ***
 *****
*******
 *****
  ***
   *
   
 */
public class MainClass07 {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			System.out.print(i + ":");
			for (int j = 0; j < 7; j++) {
				if (i < 3 - j || j - i > 3 || i - j > 3 || i + j > 9)  {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(); // 개행 
		}
		
		for (int i = 0; i < 7; i++) {
			System.out.print(i + ":");
			for (int j = 0; j < 7; j++) {
				if (i < 3-j) {            // i가  열, j가 행 
				System.out.print(" ");
				} else if (j - i >3) {
					System.out.print(" ");
				}else if (i - j > 3) {
					System.out.print(" ");
				} else if (i + j > 9) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(); // 개행 	
				
	}
		
		

	}
}
