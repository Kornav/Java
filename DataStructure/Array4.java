public class Array4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10; // 처음 들어갈 수 num
		int[][]a = new int[5][4]; // 5 by 4 2차원 배열 선언

		for(int row=0;row<a.length;row++){ // 행의 수 만큼 반복
			for(int col=0;col<a[0].length;col++){ // 열의 수 만큼 반복
				a[row][col] = num++; // num을 증가시키며 대입
			}
		}
		for(int row=0;row<a.length;row++){ // 행의 수 만큼 반복 
			for(int col=0;col<a[row].length;col++){ // 열의 수 만큼 반복
				System.out.print(a[row][col]+" "); // 초기화 된 배열의 값 확인
			}
			System.out.println(); // 행이 바뀌면 개행
		}
		
	}
}
