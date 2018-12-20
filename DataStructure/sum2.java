import java.util.*;
public class sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
				Sum(1000000); // 100만 일 때,
				//Sum(2000000); // 200만 일 때,
				//Sum(3000000); // 300만 일 때,
				//Sum(4000000); // 400만 일 때,
				//Sum(5000000); // 500만 일 때,
				//Sum(6000000); // 600만 일 때,
				//Sum(7000000); // 700만 일 때,
				//Sum(8000000); // 800만 일 때,
				//Sum(9000000); // 900만 일 때,
				//Sum(10000000); // 1000만 일 때,
			}catch(Exception e){
			System.out.println("An exception occurs");
		}
	}
	
	public static void Sum(int n){ // 이중 for문 덧셈을 하는 메소드
		int sum=0; // sum을 초기화
		long start = System.currentTimeMillis(); // 현재 시간을 확인
		System.out.println(new Date()); // 출력
		for(int i=1;i<n;i++){ // n번
			for(int j=1;j<i;j++){ // 0~n번까지 반복하기 위한 for문
				sum += i; // 수를 더해줌
			}
		}
		System.out.println(new Date()); // 끝나느 시간을 출력
		long end = System.currentTimeMillis(); // 끝난 시간
		long diff = end - start; // 걸린시간 = 끝난시간 - 시작시간
		System.out.println("Difference ( n = "+n+" ) : "+diff+"ms"); // 결과 출력문
	}

}
