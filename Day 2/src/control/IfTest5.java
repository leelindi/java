package control;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("내가 태어난 연도는>> ");
	int year = sc.nextInt();
	int age = 2018 - year + 1;
	if (age >= 19) {
		System.out.println("올해 당신의 나이는 " + age + "살이며, 성인입니다.");
		
	}else {
		System.out.println("올해 당신의 나이는 " + age + "살이며, 미성년자입니다.");

	}

}
}
