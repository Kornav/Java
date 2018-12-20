import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("몇단인지 입력하세요 : ");
		n = in.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(n+" x "+i+" = "  + n*i);
		}
	}
}
