package control;

import java.util.Date;
import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		int year = date.getYear() + 1900;
		System.out.println("이번 달은 " + month + "월입니다 ");
		System.out.println("올해는 " + year + "년입니다");
		switch (month) {
		case 2:
			System.out.println("이번 달의 마지막 날짜는 28입니다");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println("이번 달의 마지막 날짜는 30입니다");
			break;
		default:
			System.out.println("이번 달의 마지막 날짜는 31입니다");
		}
		
		}
}
