import java.util.Date;
public class prod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			/*int n=10000;
			for(int i=0;i<10;i++){
				Prod(n);
				n+=10000;
			}
			n을 늘려가며 함수를 호출하려 했지만 
			그렇게 할시 처음값만 100ms 이하로 나오고 
			나머지는 0ms로 나와서 하나하나 일일이 했습니다.
			*/
			//Prod(100000); // 10만 일 때,
			//Prod(200000); // 20만 일 때,
			//Prod(300000); // 30만 일 때,
			//Prod(400000); // 40만 일 때,
			//Prod(500000); // 50만 일 때,
			//Prod(600000); // 60만 일 때,
			//Prod(700000); // 70만 일 때,
			//Prod(800000); // 80만 일 때,
			//Prod(900000); // 90만 일 때,
			Prod(1000000); // 100만 일 때,
			
			
			}catch(Exception e){
			System.out.println("An exception occurs");
		}
	}
	
	public static void Prod(int n){
		int prod = 1; // 초기값은 1로 설정
		int x = 1; // x는 원래 2를 n번 곱해주어야해서 2이지만 오버플로우 때문에 1로 설정
		long start = System.currentTimeMillis(); // 시작 시간 체크
		System.out.println(new Date()); // 시간 출력
		for(int i=1;i<=n;i++){ // n번 곱하기 위한 반복문
				prod *= x; // 1을 계속 곱해준다.
		}
		System.out.println(new Date()); // 작업 마무리 시간 출력
		long end = System.currentTimeMillis(); // 마무리 시간 체크
		long diff = end - start; // 걸린시간 = 끝난 시간 - 시작 시간
		System.out.println("Difference ( n = "+n+" ) : "+diff+"ms"); // 걸린시간 출력
	}

}
