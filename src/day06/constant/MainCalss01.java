package day06.constant;

/*
 * [[ 상수 ]]
 * 	처음 할당된 값이 변경되지 않는디ㅏ.
 * 	final 예약어 사용.
 * 	보통 대문자로 선언한다. 
 * 	보통 전역변수로 사
 *
 */
public class MainCalss01 {
	static final double PI = 3.14159;
	
	public static void main(String[] args) {
		       // 원의 반지름
				int r = 10;
				
				// 원의 넓이
				// PI = 3.14; 상수변경 불가 (컴파일에러)
				double area = PI * r * r;
				System.out.println("원의 넓이 : " + area);
				
				
				area = 0; //0으로 초기
				area = Math.PI * Math.pow(r, 2);
				System.out.println("원의 넓이 : " + area);
	}

}
