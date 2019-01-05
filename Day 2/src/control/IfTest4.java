package control;

import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("이름: ");
	String name = sc.next();
	// 내가 입력한 것을 숫자로 변환해서 갖고 들어오는 명령이 바로 "nextInt"
	System.out.print("나이: ");
	int age = sc.nextInt();
	System.out.print("혈액형: ");
	String blood = sc.next();
	System.out.print("키: ");
	int height = sc.nextInt();
	System.out.print("몸무게: ");
	double weight = sc.nextDouble();
	System.out.println("내 이름은 " + name + "입니다.");
	System.out.println("내 나이는 " + age + "입니다.");
	System.out.println("내 혈액형은 " + blood + "형 입니다.");
	System.out.println("내 키는 " + height + "cm입니다.");
	System.out.println("내 몸무게는 " + weight + "kg입니다.");
	}

}
