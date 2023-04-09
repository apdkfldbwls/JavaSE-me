package day09.mypac;

public class MyUtil {
	public String name = "MyUtil";
	public static String staticName = "마이유틸";
	
	//1. 인스턴스 내부클래
	public class HelloPrinter {
		public void printHello() {
			System.out.println(name + "내부 클래스 HelloPrinter 입니다.");
			System.out.println(staticName + "내부 클래스 HelloPrinter 입니다.");
		}
	}

	//2. static 내부 클래스 
	public static class Calculator {
		public void calc(int a, int b) {
			int result = a + b;
			System.out.println("전달 받은 두 정수의 합 : " + result);
//			System.out.println(name + "내부 클래스 HelloPrinter 입니다."); name은 static으로 정의? 하지 않았기떄문에 컴파일 에러 
			System.out.println(staticName + " 내부 클래스 Calculator 입니다. ");
		}
	}
}
