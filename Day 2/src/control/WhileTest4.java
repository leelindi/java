package control;

public class WhileTest4 {

	public static void main(String[] args) {
		int fact = 1;
		
		for (int i = 2; i <= 5; i++) {
			fact = fact * i;
			
		}
		System.out.println("1부터 20까지 곱한 값은 " + fact);
	}
// 21억이 넘은 값인 경우에는 -값으로 표시됨
}
