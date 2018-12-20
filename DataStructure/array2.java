import java.util.Random;// 라이브러리
public class array2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); // 랜덤객체 생성
		int[] data = new int[100]; // 크기가 100인 data 배열 선언
		int sum, i;  // 합을 담을 변수 sum, 반복문에 사용 할 변수 i
		double avg; // 평균을 구할 변수 avg
		
		
		for(i=0;i<100;i++){ // 반복문
			data[i] = rand.nextInt(100)+10; //10~109까지의 수를 생성 
		}
		sum=0; // 합 초기화
		for(i=0;i<100;i++){// 반복문
			sum +=data[i]; // 배열의 값을 더해가며 index 증가 
		}
		avg = (double) sum/data.length; // 모두다 더한 값을 data의 크기로 나눔
		System.out.println("Avg = "+avg+"\n"); // 평균 출력
	}
}
