
public class TestQuickSort {
	public TestQuickSort(){
		int[] a = IntArray.randomInts(20,100);
		IntArray.print(a);
		System.out.println("sorted : " + IntArray.isSorted(a));
		Quicksort(a, 0, a.length-1);
		IntArray.print(a);
		System.out.println("sorted : " + IntArray.isSorted(a));
	}
	void Quicksort(int[] a, int p, int q){
		int r;
		if(p < q){
			r = partition(a, p, q);
			Quicksort(a, p, r-1);
			Quicksort(a, r+1, q);
		}
	}
	
	int partition(int[] a, int p, int q){
		int x = a[q];
		int i = p-1;
		for(int j=p;j <= q-1;j++){
			if(a[j] <= x){
				IntArray.swap(a, ++i, j);
			}
		}
		IntArray.swap(a, i+1, q);
		
		return i+1;
	}
}
