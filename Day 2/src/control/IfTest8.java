package control;

import java.util.Scanner;

public class IfTest8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("음식종류를 골라주세요.");
	System.out.println("1)짬뽕, 2)회, 3)라면");
	int food = sc.nextInt();
	if (food == 1) {
		System.out.println("중국집으로 가요.");
	} else if (food == 2){
		System.out.println("일식집으로 가요.");
	} else if (food == 3){
		System.out.println("분식집으로 가요.");
	} else {
		System.out.println("안 먹어요.");
	}
	}
}
