package day01.hello;

public class MainClass02 {
	/*
	 * 변수란?
	 * 	메모리 공간에 붙여진 이름. 
	 *	Java 프로그램에 사용되는 모든 값을 메모리 공간에 저장. 
	 *
	 *	메모리 공간에 이름을 붙여 접근 가능
	 *
	 * 변수 선언 및 초기화 
	 *	자료형 변수명 = 값;
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// 정수형 변수 선언하고 값 대입하기. 
		int numInt = 10;
		
		// 실수형 변수 선언하고 값 대입하기. 
		double numDouble = 10.1;
		
		// 문자열 변수 선언하고 값 대입하기. 
		String str = "Hello";
		
		System.out.println(numInt);
		System.out.println(numDouble);
		System.out.println(str);
	}
}
