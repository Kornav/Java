import java.util.Date;
public class prod4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//Prod(100000); // 10만 일 때,
			//Prod(200000); // 20만 일 때,
			//Prod(300000); // 30만 일 때,
			//Prod(400000); // 40만 일 때,
			//Prod(500000); // 50만 일 때,
			//Prod(600000); // 60만 일 때,
			//Prod(700000); // 70만 일 때,
			//Prod(800000); // 80만 일 때,
			//Prod(900000); // 90만 일 때,
			Prod(10000000); // 100만 일 때,
			}catch(Exception e){
				System.out.println("An exception occurs");
		}
	}
	
	public static void Prod(int n){
		int prod = 1; // 초기값 설정 1
		long start = System.currentTimeMillis(); // 시작 시간 체크
		System.out.println(new Date()); // 시간 출력
		for(int i=1;i<=n;i++){ // n번 반복하기 위한  반복문
			prod *= prod; // 2^1*2^1 = 2^2 / 2^2*2^2 = 2^4 제곱을 표현하기 위해 계속 곱해나감.
		}
		System.out.println(new Date()); // 끝난시간 출력
		long end = System.currentTimeMillis(); // 끝난시간 체크
		long diff = end - start; // 걸린시간 = 끝난시간 - 시작시간
		System.out.println("Difference ( n = "+n+" ) : "+diff+"ms"); // 걸린시간 출력
	}
}
