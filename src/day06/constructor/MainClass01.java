package day06.constructor;

import day06.mypac.HandPhone;

/*
 * [[ 생성자 (Constructor) ]]
 * 	객체를 생성할 때 호출하는 반환값이 없는 메소드. 사실 메소드는 아니다!!
 * 	객체 초기화 목적에 사용.
 * 	클래스명과 동일하다.
 * 	오버로딩 가능하다.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 핸드폰 객체생성
		HandPhone hp = new HandPhone();
		HandPhone hp2 = new HandPhone("아이폰"); // 오버로딩한 것 
		
	//	hp.model = "갤럭시s23";
//		System.out.println(hp.model);
//		System.out.println(hp2.model);
		
		
	}

}
