package day09.mypac;

public class Sister extends Thread {
	public Wallet wallet; // 지갑객체 
	public int money;
	
	public Sister(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public void run() {
		while(true) {
			//지갑(wallet클래스)에서 돈을 인출한다. 
			int returnedMoney = wallet.getMoney();
			if(returnedMoney == 0) // 지갑 잔고 0이면 
				break;             // 반복문 멈춘다. 
			
			money = money + returnedMoney;
		}
		
		System.out.println("Sister 총 재산 : " + money);
	}

}
