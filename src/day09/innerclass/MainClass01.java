package day09.innerclass;
/*
 * [[ 내부 클래스 (InnerClass) ]]
 * 	클래스 내부에 다른 클래스를 선언하는 것을 말한다.
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		new MainClass01.InnerClass().doSomething();
		new InnerClass().doSomething();
	}
	
	static class InnerClass {  // mainclass 안에 innerclass 만들기 
		public void doSomething() {
			System.out.println("무언가를 해요!");
		}
	}

}
