package day01.hello;

public class MainClass01 {
	
	
	/*
	 * 
	 * 	주석 - 컴퓨터가 인식하지 않는 영역
	 * 
	 *  여러줄 주석 입니다. 
	 *  코멘드 + 쉬프드 + w 누르면 위에 나와있는 창을 지울 수 있음 
	 * 
	 * 
	 */

	
	// 한줄 주석
	// 자바 코드 시작 class
	
/**
 * 
 * JavaDoc 주석
 * 공신력 있는 주석 
 * 자바 코드에 포함.
 * main()- 자바 처음 실행되는 메소드 
 * 
 * @param args
 */
	// 커맨드 +옵션+ j 누르면 위의 (슬레시, 별 두개 나옴)
public static void main(String[] args) {
	// print 메소드 호출 "안녕하세요~" 출력 
	print(); // 밑에 문장에 있는 print라는 메소드를 호출해 주기 위해 적어줌 
	
}
/**
 * 안녕하세요 출력 메소드 
 */
public static void print() {
	System.out.println("안녕하세요~");
}

}

 
