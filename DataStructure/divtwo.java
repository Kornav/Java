import java.util.*;
public class divtwo { // Fibonacci Recursion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); // 입력을 위한 객체 in 선언
		int rst; // 결과값 변수 선언
		
		System.out.println("n을 입력해주세요 : "); // 입력 받기 전 출력문
		rst = f(in.nextInt()); // 입력 받고 그 값을 매개변수로 메소드 호출
		System.out.println("rst = "+rst); // 결과 값 출력
	}
	
	public static int f(int n){
		int res = 1; // 결과 값 변수 초기화
		for(int i=2;i<=n ;i=i*2) { // n = 2K k번 반복
			 res = (2 * res) +1; // 규칙
		 }
		return res; // 결과 값 반환
		
	}
}
