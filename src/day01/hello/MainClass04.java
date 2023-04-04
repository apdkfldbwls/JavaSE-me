package day01.hello;
/*
 * [[ 기본 자료]]
 * 2. 문자형(char)
 * 	-전 세계에서 쓰이는 문자 형태 대부분 표현가능
 * 	-홀따옴표'' 값 표현
 * 	-16비트 유니코드 문자를 저장하는 변수
 * 	-0 ~ 65,535
 * 
 * 	- 선언 방법
 * 		char 변수명;
 * 
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		// char 형 변수 선언과 동시에 값 대입하기
		char ch1 = 'A';
		System.out.println("char형 변수 값 : " + ch1);
		
		char ch2 = '김';
		char ch3 = '쀍';
	 
		// 줄복사 : 코멘드 + 옵션 + 뱡향키
		// 줄삭제 : 코멘드 + d
		// 코멘드 + 쉬프드 + w 누르면 위에 나와있는 창을 지울 수 있음 
		
		System.out.println(ch2);
		System.out.println(ch3);
		
		int num = ch1; // char 형 변수 int 형으로 형변환
		System.out.println("대문자 A에 해당하는 숫자코드 : "+ num);
		// 10진수가 숫자 65일 때 문자로는 A, 같은 값인데 출력을 문자로 할거냐 숫자로 할거냐의 차이 
		// ch를 int로 대입하는 것은 문제 없음 
		
		char ch4 = 66;
		System.out.println("숫자 66에 해당하는 문자 : " + ch4);
		
		int num2 = 110;
		char cha5 = (char)num2;
		// int 형을 char 형으로 강제 형변환 
		// int를 ch로 대입하는 것은 문제가 생김(메모리 크기가 ch보다 int가 더 크기 떄문)
		// 따라서 강제 형변환을 해줘야함 (char) 표시 
	}

}
