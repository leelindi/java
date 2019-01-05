package control;

import java.util.Scanner;

public class IfTest7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하세요: ");
	int number1 = sc.nextInt();
	System.out.print("숫자를 하나 더 입력하세요: ");
	int number2 = sc.nextInt();
	if (number1 > number2) {
		System.out.println("처음 입력하신 숫자 " + number1 + "이 두번째로 입력하신 숫자 " + number2 + "보다 큽니다");
	} else if (number1 == number2) {
		System.out.println("처음 입력하신 숫자 " + number1 + "와 두번째로 입력하신 숫자 " + number2 + "가 같습니다");	
	} else {
		System.out.println("처음 입력하신 숫자 " + number1 + "가 두번째로 입력하신 숫자 " + number2 + "보다 작습니다");
	}
		
	
}
}
