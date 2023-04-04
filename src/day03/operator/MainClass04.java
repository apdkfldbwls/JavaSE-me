package day03.operator;
/*
 * 4. 논리 연산자
 * 	&& : And 조건, 교집합 개념, 양쪽 모두 true 일때만 true
 *  || : Or 조건, 합집합 개념, 어느 한쪽이 true 이면 true
 *  !  : Not 조건, 여집합 개념, 논리값을 반전 시킨다.
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		boolean result = true && false;
		System.out.println("&& : " + result);
		
		result = true || false;
		System.out.println("|| : " + result);
		
		result = !false;
		System.out.println("! : " + result);
		
		if(10<20 || 5==4 || 1==0) {
			System.out.println("조건 중 하나이상 항 true 입니다."); // if문 안에 true가 있으면 코드가 실
		}
		
		
		String order = "영화예매";
		
		if(order.equals("식품") // equals는 == 이랑 같은 의미 "식품, 영화예매, 의류랑 order이 같은 글자인지 비교하는 것 
				|| order.equals("영화예매")
				|| order.equals("의류")
				) {
			System.out.println("식품/영화예매/의류 카테고리에서 주문하였습니다.");
		} else {
			System.out.println("식품/영화예매/의류 외 카테고리에서 주문하였습니다.");
		}
		
		
		result = true || false || false || false;
		System.out.println(result);
		
		result = !(true && true && true) || false;
		System.out.println(result);
		
		
		
	}

}
