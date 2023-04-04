package day01.hello;
/*
 * [[ 기본 자료형 ]]
 *  3. 정수형 
 *  	- 선언하는 방법	
 *  		byte 변수명;
 *  			1byte : -128 ~ 127 
 *  		short 변수명;
 *  			2byte : -32,768 ~ 32,767
 *  		int 변수명;
 *  			4byte : -2,147,483,648 ~ 2, 147, 483,647
 *  		long 변수명; 
 * 				8byte : 매우 길다. 
 *   
 *
 * 
 * 
 */

public class MainClass05 {
	public static void main(String[] args) {
		// 정수형 변수 선언과 동시에 값 대입하기
		byte iByte = 10;
		short iShort = 100;
		int iInt = 1000;
		long iLong = 10000;
		
		// 저장된 값을 문자열로 출력하기 
		System.out.println("Byte 형" + iByte);
		System.out.println("iShort 형" + iShort);
		System.out.println("iInt 형" + iInt);
		System.out.println("iLong  형" + iLong);
		
		iByte = (byte) (iByte + 120); 
		System.out.println(iByte);
		// (iByte + 120) 자체를 int로 인식했기 때문에 (byte)로 형변환을 해줌  
				// 일반 숫자를 쓰면 자바에선 int로 인식을 해줌  
		
		iInt += 10; // iInt = iInt +10
		System.out.println(iInt);
		
		String str = iInt + "10";
		System.out.println(str);
		//str이 문자열이기 때문에 숫자 + 문자 = 문자가 된다. 따라서 값이 101010이 나옴 
		
		
	}

}