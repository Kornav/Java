import java.util.*;
public class sumrec { // Fibonacci Recursion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); // 입력을 위한 객체 in 선언
		int rst; // 결과값 변수 선언
		System.out.println("f(n) : n을 입력해주세요."); // 입력 받기 전 출력문
		rst = f(in.nextInt());  // 입력 받고 그 값을 매개변수로 메소드 호출
		System.out.println("rst = "+rst); // 결과 값 출력
	}
	public static int f(int n){ // 재귀 함수
		 if (n <= 1) return n; // n이 1보다 작거나 1이면 n 출력
		 else return n + f(n-1); // n을 더하고 n-1을 넣은 자기 자신의 함수를 다시 호출
	}
}
