package control;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			//키보드에서 입력한 것을 갖고 들어온다는 개념
			//복사해서 쓰는 개념이 바로 new라는 키워드
		System.out.print("ID 입력해주세요.>> ");
		int input1 = sc.nextInt();
		System.out.println("당신이 입력한 ID는 " + input1 + "입니다.");
		// 내가 입력한 것을 숫자로 변환해서 갖고 들어오는 명령이 바로 "nextInt"
		System.out.print("PW 입력해주세요.>> ");
		int input2 = sc.nextInt();
		System.out.println("당신이 입력한 PW는 " + input2 + "입니다.");
		if(input1 == 1000 && input2 == 2000) {
			System.out.println("Login Success");
		}else {
			System.out.println("Login Failure");
		}
	}

}
