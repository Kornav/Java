import java.util.Random; // 라이브러리
public class array3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); // Random객체 생성
		int[] data = new int[100]; // 크기가 100인 data배열 선언
		int sum, i,count=0; // 합을 구할 변수 sum, 반복문에 사용할 변수 i, 평균보다 큰 값의 개수를 셀 변수 count
		double avg; // 평균을 담을 변수 avg
		
		
		for(i=0;i<100;i++){ // 
			data[i] = rand.nextInt(100)+10; // 10~109까지의 난수 생성
		}
		sum=0; // 합 초기화
		for(i=0;i<100;i++){
			sum +=data[i];
		} // 총 점을 구하는 반복문
		avg = (double) sum/data.length; // 총점을 data의 크기로 나눠 평균을 구한다.
		System.out.println("Avg = "+avg+"\n"); // 평균 출력
		for(i=0;i<100;i++){
			if(data[i]>avg){ // 평균보다 크면
				count++; // 개수를 증가
			}
		}
		System.out.println(count+" elements are grater than avg");// 개수 출력
	}
}
