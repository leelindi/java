package window2;

public class TV {
   //정적특징(상태)->변수
   //모양, 받침대
   String shape;
   boolean stand;
   
	
   //동적특징(동작)->메소드
   //채널변경하다. TV켜다.
   public void change(int ch) {
	System.out.println(ch + "번호로 채널 변경하다.");
}
   public void trunOn() {
	   System.out.println("TV를 켜다");
   }
	
}

