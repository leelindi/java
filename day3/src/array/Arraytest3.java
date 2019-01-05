package array;

public class Arraytest3 {

	public static void main(String[] args) {
		int[] n = { 100, 200, 300 };
		System.out.println(n[0]);
		System.out.println(n.length);

		//-----------------------------
		double[] eye = { 0.3, 0.5, 1.5 };
		for (int i = 0; i < eye.length;i++) {
			System.out.println(eye[i]);
		}
		for (double d : eye) {
			System.out.println(d);
		}
		
		//-------------------------------
		
		String[] names = {"김아무개","박아무개","이아무개"};
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println(names);
		
		
		
		
		
	}
}
