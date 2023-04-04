package day05.method;

public class MainClass02 {
	private static String name; // 전역변수 name 선언 
	
	public static void main(String[] args) {
        setName("잠만보"); // setName = 잠만보 / setName = 전역변수 name
		
		String name = getName();
		
		System.out.println("name : " + name);
		
		int[] nums = {1, 2, 3};
		int resultSum = sum(nums);
		System.out.println(resultSum);
		
		int resultSum2 = sum(1,2,3);
		System.out.println(resultSum2);
		
	}
	
	// 인자 X 리턴 O 
		public static String getName() {
			return MainClass02.name;   // 전연변수 name반환 
		}
		
		public static void setName(String name) { // 갈색 name은 매개변수의 name 파란색 name은 전역변수의 name
			MainClass02.name = name;    // 전역변수 name = setName
		}
		
		// 인자 O 리턴 O
		public static int sum(int[] args) {
			int sum = 0;
			for(int arg : args) {
				sum += arg;
			}
			return sum;
		}
		
		public static int sum(int a, int b, int c) {
			return a + b + c;

}
		
}
