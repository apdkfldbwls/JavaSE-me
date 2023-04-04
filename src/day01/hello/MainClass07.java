package day01.hello;

import java.math.BigDecimal;

/*
 * [[ 실수 사용 ]]
 *  ! 부동소수점 오차
 *   		컴퓨터가 실수 계산을 잘 못해요!!
 * 	
 *  부동소수점 예외처리 필수 !! PG !!
 *  
 *  
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		
		float f = 0.0f;
		for(int i = 0; i < 100; i++) { // for는 반복문 ( 코드를 반복해줌 i = 0 변수 선언,i 가 0 보다 작으면 0이 될때까지 코드가 게속 반복됨 
			// i++는 한번 반복될때마다 i에다가 +1씩 해줌 i가 100이 될때까지 계속 반복  /f += 0.1f 코드를 100번 실행하라는 뜻 
			// 실행코드 반복 
			f += 0.1f; // f = f + 0.1 
			// f = 0.0f 는 f는 0이라는 뜻, 따라서 f = 0.1 은 0 + 0.1 이다. 0.1을 100번 더하는 것인데 0.1을 100번 더하면 10이 나와야 하는데 10.00002가나옴 이게 부동소수 오차의 문제 
		}
		
		System.out.println(f);
		

		double d  = 0.0d;
		for(int i = 0; i < 100; i++) { // 반복문
			// 실행코드 반복
			d += 0.1d; // d = d + 0.1
		}
		System.out.println(d);
		
		BigDecimal bd = new BigDecimal(0.0);
		for(int i = 0; i < 100; i++) {   //반복문
			// 실행코드 반복 
			bd = bd.add(new BigDecimal(0.1));
		}
		System.out.println(bd);
		
	}


}
