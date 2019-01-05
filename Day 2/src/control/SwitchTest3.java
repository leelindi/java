package control;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		int year = date.getYear() + 1900;
		System.out.println("이번 달은 " + month + "월입니다 ");
		System.out.println("올해는 " + year + "년입니다");
		switch (month) {
		case 11: case 12: case 1: case 2:
			System.out.println("지금 계절은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println("지금 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("지금 계절은 여름입니다.");
			break;
		default:
			System.out.println("지금 계절은 가을입니다.");
		}
		
		}
}
