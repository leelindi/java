package control;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		//컨트롤 + 쉬프트 + o(알파벳 소문자 오)
		Random r = new Random();
		int num = r.nextInt(3);
		int sum = 0;
		System.out.println(num);
		for (int i = 0; i < 10; i++) {
			System.out.println(num);
			sum = sum + num;
		}
		System.out.println(sum);
	}

}
