package day06.mypac;

public class HandPhone {
	public String model;
	
	static {
		System.out.println("static 초기화 블럭");
	}

	{
		System.out.println("초기화 블럭"); //생성자보다 먼저 실행(잘 안씀) 
	}
	
	// 생성자 
	public HandPhone() {
		model = "갤럭시s23";
		printModel();
	}
	
	// 생성자 오버로딩
	public HandPhone(String model) {
		this.model = model; //this는 자기자신 클래스를 의미  지역변수 model을 
	//(갈색model) 현재있는 클래스에 멤버변수(파란model)에 넣고 싶을 때 this. 사용  
		printModel();
	}
	
	public void printModel() {
		System.out.println(this.model);
	
	}
	
}
