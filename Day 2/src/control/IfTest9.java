package control;

import java.util.Scanner;

public class IfTest9 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("음식종류를 골라주세요.");
	System.out.println("1)짬뽕, 2)회, 3)라면");
	int food = sc.nextInt();
	switch (food) {
	case 1:
		System.out.println("중국집으로 가요.");
		break;
	case 2:
		System.out.println("일식집으로 가요.");
		break;
	case 3:
		System.out.println("분식집으로 가요.");
		break;
	default:
		System.out.println("안 먹어요.");
	//if, else if, else에서 else에 해당하는 것이 바로 "default"
	//switch는 if랑 달리 해당하는 값이 나와도 그 다음으로 계속 넘어가므로 반드시 "break;"를 한줄 씩 추가해 주어야 함 
	} 
	}
}
