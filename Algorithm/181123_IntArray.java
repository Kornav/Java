
public class IntArray {
	public static java.util.Random random = new java.util.Random();
	
	public static boolean isSorted(int[] a) {
		for(int i=1; i<a.length; i++) {
			if(a[i]<a[i-1])
			return false;
		}return true;
	}
	public static int[] randomInts(int n, int range) {
		int[] a = new int[n];
		if(n<2)
			throw new IllegalArgumentException();
		for(int i=0;i<n;i++) {
			a[i]= random.nextInt(range);
		}
		return a;
	}
	public static void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}System.out.println();
	}
	public static void swap(int[] a, int i, int j) {
		int ai= a[i], aj=a[j];
		if(ai==aj) {
			return;
		}
		int temp=a[i]; 
		a[i] = a[j];
		a[j] = temp;
		// 빈칸을 채우시오: 배열 a의 i번째 원소와 j번째 원소를 바꿈
		// i번째에는 j번째 원소가, j번째에는 i번째 원소가 들어감
	}
}
