package control;

public class WhileTest2 {

	public static void main(String[] args) {
		int sum = 0;
		//변수값
		//아무 값도 안 넣었을 때가 있고(쓰레기 값이라고 부름. 예전에 그 공간을 사용했던 값이 임의로 들어갈 수 있음), 초깃값을 0으로 넣어줬을 때, 변경된 값이 들어갔을 때 
		for (int i = 1; i <= 1000; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 1000까지의 합은 " + sum);
	}
	

}
