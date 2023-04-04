package day03.conditional;
/*
 * switch ~ case 문 (if문이랑 비슷)
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		
		int num = 1;
		switch(num) {
		case 0 : 
			System.out.println("0 입니다.");
			break; // 조건문이 해당된다면 break가 없으면 밑에도 쭉 다 실행
		case 1 : 
			System.out.println("1 입니다.");
			break;
		case 2 : 
			System.out.println("2 입니다.");
			break;
		case 3 : 
			System.out.println("3 입니다.");
			break;
		default : // default는 if문에서 else와 같다. 위의 조건들이 맞지 않으면 default에서 실행 
			System.out.println("0 ~ 3 이 아닙니다.");
			break;
		}
		 
		
		
	}

}
