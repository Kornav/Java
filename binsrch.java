import java.util.*;
public class binsrch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; // 정렬된 배열 선언
		
		System.out.println("배열에서 찾을 값을 입력하세요."); // 입력을 요구하는 출력문
		System.out.println(f(arr,in.nextInt())+"번째 방에 있습니다."); // 입력받은 값을 매개변수로 메소드 호출, 찾은 값 출력
	}
	public static int f(int[] a,int n){
		int left = 0; // 왼쪽 기준 점을 배열의 시작점으로
		int right = a.length-1; // 오른쪽 기준 점을 배열의 마지막 방으로
		while(left<=right){ // right가 더 작아질때까지 반복
			int mid = (left+right)/2; // mid 위치를 중간으로 선언
			if(a[mid]<n){ // 찾는 수가 가운데 보다 크면
				left = mid+1; // 왼쪽 기준점을 중간 값보다 크게 이동
			}
			else if(a[mid]>n){ // 작거나 같으면
				right = mid-1; // 오른쪽 기준점을 중간값보다 작게 이동
			}
			else{ // left와 right가 같으면, 값을 찾았으면 mid 값 반환
				return mid;
			}
		}
		return -1; // 위에서 반환이 안되고 흐르면 결과 값을 못찾은 것이므로 -1 반환
	}
}
