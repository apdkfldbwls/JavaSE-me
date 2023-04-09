package day09.mypac;

public class Wallet {
	
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000; //자기자신 클래스에 멤버변수 의미 
	}
	
	// Thread safe 메소드 
//	public synchronized int getMoney() {  // synchronized를 쓰면 동시에 접근하는 것을 막아줌 
//		if(totalMoney == 0) {
//			return 0;
//		}
//		
//		totalMoney = totalMoney -1;
//		
//		System.out.println("현재 지갑의 금액 : " + totalMoney);
//		return 1;
//	}
	
	public synchronized int getMoney() {  // synchronized를 쓰면 동시에 접근하는 것을 막아줌 
		if(totalMoney == 0) {
			return 0;
		}
		
		synchronized (this) {  //동기화 블럭 
			totalMoney = totalMoney -1;
		}
		
		
		System.out.println("현재 지갑의 금액 : " + totalMoney);
		return 1;

   }
}
