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
public class MainClass04 {
	public static void main(String[] args) {
		
		for (int i = 0;  i <7; i++) {     //i - 0 /i - 1
			for (int j = 0; j < 7; j++) { //i :0 j - 0:*, 1*...6*
				                          //i :1 j - 0:*, 1*...6*
				                          //...
				                          //i :6 j - 0:*, 1*...6* 안쪽 for문이 행 위에 for문이 열 
				System.out.print('*');  
			}
			System.out.println(); // 개행 
		}
		
		
		for (int i = 0; i < 7; i++) {
			System.out.print(i+": "); // 앞에 0:, 1: ... 표
			for(int j = 0; j < i+1; j++) { 
				System.out.print("*");
			}
			
			System.out.println();	// 개행
		}
		
		
	}

}
