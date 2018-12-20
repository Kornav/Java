import java.util.*;
public class Fibiter { // Fibonacci For
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
		int sum = 0; // 결과 값
		int n1 = 1; // 첫번째항
		int n2 = 1; // 두번째항
		for(int i=3; i<=n;i++){
			sum = n1+n2; // 다음항은 전항 + 전전항
			n1 = n2; // 전전항의 위치 -> 전항의 위치로 당김
			n2 = sum; // 전항의 위치 -> 다음항의 위치로 당김
		}
		if(n>2){ // 두번째 항 보다 크면
			return sum; // sum 그대로 리턴
		}
		else{ // 두번 째 항 보다 작으면 
			return 1; // 1 반환
		}
	}
}

// 1 1 2 3 5 8 13 21