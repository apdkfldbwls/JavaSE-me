package day03.loop;
/*
 *  2. do ~ while()문
 *   while문과 비슷하지만, 최소 한번은 실행된다.
 * 
 *  do{
 *  	반복 수행할 코드
 *  } while(조건문);
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		int count = 0;
		do {
			System.out.println(count);
			count++;
		} while(count < 100); //만약 조건이 while(false);면 while문일 경우 false면 실행 자체가 되지 않는데 
		// do ~while문은 한 번은 실행됨 결과값은 0(아마)
		
		
	}

}
