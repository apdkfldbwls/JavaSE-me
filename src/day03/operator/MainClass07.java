package day03.operator;
/*
 * 8. 삼항 연산자(조건문과 비슷)
 * 	조건식 ? 조건식이 참일경우 : 조건식이 거짓일 경우
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		int num = 10;
		String result = num > 0 ? "num은 양수" : "num은 음수"; //  : 기준으로 true이면 앞이 반환 false이면 뒤가 반
		System.out.println(result + " 입니다.");
		
		
		
		if(num > 0) {
			result = "num은 양수";
		}else {
			result = "num은 음수";
		}
		System.out.println(result + " 입니다.");
	}

}
