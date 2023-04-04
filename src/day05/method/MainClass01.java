package day05.method;
/*
 * [[ 메소드(Method) ]]
 * 	어떤 측정 작업을 수행하기 위한 명령문의 집합.
 * 	객체의 기능역할을 한다. 
 * 
 * 메소드 구조
 * 	(접근재어자) (정적) 반환타입 메소드이름(매개변수타입 매개변수명) {  // 선언부
 *		실행할 코드(명령문)   // 구현
 * 
 * 		...
 * 
 * 		return 반환값;
 * }
 * 
 * 오버로딩(Overloading)
 * 		클래스 내에서 같은 이르믈 가진 메소드 여러개 정의하는 것을 말한다. 
 * 		매개변수 개수 또는 타입이 다르면 된다. 
 */

public class MainClass01 {
	public static void main(String[] args) {
		
		hello(); //메소드 호출 
		
        printName("피카츄");
		
		printMember("PIKA", "피카츄", 27);
		
		printMember("PIKA", "피카츄", 27, "주머니괴물");
		
		String[] pokeMon = {"피카츄", "라이츄", "파이리", "꼬부기"};
		printPokemon(pokeMon);
		
		
	}
	
	// 매개변수를 인자라고 함 / 인자 x, 리턴(반환값)x -> 호출시 실행하고 끝나는 메소드 
	public static void hello() {  // public -> 접근제어자 static -> 정적 void-> 반환타입(void는 반환타입이 없다는 뜻)hello -> 메소드이름 
		System.out.println("Hello, World!"); // 반환타입이 없다는 뜻 -> 실행하고 끝남, 어떤 값을 돌려주거나 그런거 없이 (리턴x) 
	}
	// 인자 o 리턴 x -> 인자값을 받아 실행하고 끝나는 메소드 
	public static void printName(String name) { // String name이 메소드(printName)의 매개변수(인자값)/String name = 피카츄 
		System.out.println("이름 : "+ name);     // -> 인자값에 값을 넣어준 것 (인자가 있기떄문에 그래야 실행이 됨)
	}
	
	// 인자 O 여러타입 여러개  리턴 X
		public static void printMember(String id, String name, int age) {// 매개변수는 여러개 넣어도 
			System.out.println("ID : " + id);
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
		}
		
		// 오버로딩(overloading) 메소드
		// 인자 O 여러타입 여러개 리턴 X
		public static void printMember(String id, String name, int age, String job) {
			System.out.println("ID : " + id);
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("직업 : " + job);
		}
		
		// 인자 O 배열 리턴 X
		public static void printPokemon(String[] mons) {
			for(String mon : mons) {
				System.out.println(mon);
			}
		}
	

}
