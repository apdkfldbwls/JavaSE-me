package day03.operator;
/*
 *  2. 증감연산자
 * 	 ++ : 1씩 증가시킨다.
 * 	 -- : 1씩 감소시킨다.
 * 
 */

public class MainClass02 {
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println(num);	// 1
		num++;	// 증감연산자 1증감
		System.out.println(num);	// 2
		System.out.println(++num);	// 3
		System.out.println(num++);	// 3 (++가 뒤에 있으면 그 다음 코드에 결과값이 +1됨)
		System.out.println(num);	// 4
		
		
		// 0 ~ 99 까지 출력하는 반복문(for)
		for(int i = 0; i < 100; i++) {
			System.out.println(i); // i가 100이 나올때까지 반복
			// 코드 실행 순서 (1) int i = 0;, (2) i<100, (3) syso(i), (4) i++
		}
		
		int num2 = 0;
		num2 = num2 - 1;
		System.out.println(num2);
		num2--;
		System.out.println(num2);
		
		
		
	}
	

}
