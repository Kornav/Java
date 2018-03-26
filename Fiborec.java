import java.util.*;
public class Fiborec { // Fibonacci Recursion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rst;
		for(int i=10;i<=50;i+=10) { // 10단위로 10~50까지 반복
			rst = 0; // 결과값 초기화
			long time1 = System.currentTimeMillis(); // 시작 시간 체크
			rst = f(i); // f(10), f(20), .... f(50) 실행
			long time2 = System.currentTimeMillis(); // 끝 시간 체크
			System.out.println("f("+i+") time diff = "+(time2 - time1)/1000.0+"s\n"+rst); // 걸린 시간과 값 출력 
		}
	}
	public static int f(int n){ // 재귀 함수
		 if (n <= 1) return n; // n이 1보다 작으면 n반환 즉, 1반환
		 else return f(n-1) + f(n-2); // 재귀, 전항과 전전 항을 더함.
	}
}
