import java.util.Random; // Random 라이브러리
public class array1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[100]; // 크기가 100인 data 배열 선언
		int max , i; // 최대값을 저장할 변수 max, 반복문에 사용 할 변수  i
		Random rand = new Random(); // Random 객체 rand 생성
		for(i=0;i<100;i++){ // 반복문 index0 ~ index99까지 반복
			data[i] = rand.nextInt(100)+10; // 10~109까지의 숫자를 무작위 생성하여 data에 대입
		}
		max = data[0]; // 제일 첫 원소를 제일 큰값으로 대입
		
		for(i=1;i<100;i++){ // 반복문 index1~index99까지 반복
			if (data[i]>max){ // max의 값보다 data[i]의 값이 크면
				max = data[i]; // 최고 값은 data
			}
		}
		System.out.println("Max = "+max+"\n"); // 최고 값 출력
	}
}
