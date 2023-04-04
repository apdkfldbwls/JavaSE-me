package day01.hello;
/*
 * [[ 형변환(Cast) ]]
 *  1. 업캐스팅(프로모션)
 *  	- 표현 범위가 더 큰 데이터형으로 변환하기 
 *  	- 자동으로 된다. 
 *  	- 데이터 손실이 없다. 
 *  2. 다운캐스팅(디모션)
 *  	- 표현 범위가 더 작은 데이터형으로 변환하기
 *  	- 명시적으로 해야한다. 	
 *  	- 데이터 손실이 있을 수 있다.  
 * 
 */
public class MainClass08 {
	public static void main(String[] args) {
		// 업캐스팅 예
		byte ibyte = 10;
		int iInt = ibyte; // 자동으로 형변환이 된다. 
		float iFloat = 10.1f;
				double iDouble = iFloat; // 자동으로 형변환이 된다. 
		
		// 다운캐스팅 예
		iDouble = 10.1234567891234d;
		System.out.println("iDouble" + iDouble);
		float iFloat2 = (float)iDouble; // 큰거( double에서 작은거 float로 바꾸기 위해 형변환 (float)해줌 ) 
		System.out.println("iFloat2 : " + iFloat2);
		
		int iInt2 = (int)iDouble; // double을 int로 바꿔주면 실수가 없어짐 
		System.out.println("iInt2 : " + iInt2);
	}

}
