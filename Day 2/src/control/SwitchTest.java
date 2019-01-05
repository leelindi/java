package control;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("아래 선택지 가운데 좋아하는 스포츠를 선택하세요.");
	System.out.println("수영, 달리기, 코딩");
	System.out.println("-----------------------------------");
	String sports = sc.next();
	switch (sports) {
	case "수영":
		System.out.println("수영장으로 가요.");
		break;
	case "달리기":
		System.out.println("한강공원으로 가요.");
		break;
	case "코딩":
		System.out.println("코리아IT아카데미로 가요.");
		break;
	default:
		System.out.println("집에서 쉬어요.");
	//String에 해당하는 값이므로 숫자와 달리 반드시 "" 쌍따옴표를 기입해야 함! 
	//Char에 해당하는 값이므로 숫자와 달리 반드시 "" 쌍따옴표를 기입해야 함! 
	} 
	}
}
