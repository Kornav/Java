import java.util.*;
public class Factiter { // Factorial For
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); // 입력을 위한 객체 in 선언
		int rst; // 결과값 변수 선언
		System.out.println("f(n) : n을 입력해주세요."); // 입력 받기 전 출력문
		rst = f(in.nextInt()); // 입력 받고 그 값을 매개변수로 메소드 호출
		System.out.println("rst = "+rst); // 결과 값 출력
	}
	public static int f(int n){ // 재귀 함수
		int rst=1; // 결과 값을 저장할 변수 초기화
		for(int i=1;i<=n;i++){ // n까지 1씩 증가 하며 곱하기 위한 변수
			rst *= i; // 결과값에 1씩 증가한 수를 곱함
		}
		return rst; // 결과 값 반환
	}
}