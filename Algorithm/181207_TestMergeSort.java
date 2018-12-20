
public class TestMergeSort {
	public TestMergeSort(){
		int[] a = IntArray.randomInts(20,100);
		IntArray.print(a);
		System.out.println("sorted : " + IntArray.isSorted(a));
		Mergesort(a, 0, a.length-1);
		IntArray.print(a);
		System.out.println("sorted : " + IntArray.isSorted(a));
	}
	
	void Mergesort(int[] a, int p, int q){
		int r;
		if(p < q){
			r = (p+q)/2;
			Mergesort(a, p, r);
			Mergesort(a, r+1, q);
			merge(a, p, r, q); // 배열 a 시작값 p 중간값 r 끝값 q
		}
	}
	void merge(int[] a, int p, int m, int q){
		int i, j, k, t;
		
		int[] sorted = new int[a.length];
		i = p;
		j = m+1;
		k = p;
		while( i<= m && j<= q){
			if(a[i] <= a[j]){
				sorted[k] = a[i++];
			}
			else{
				sorted[k] = a[j++];
			}
			k++;
		}
		
		if(i>m){
			for(t = j; t <= q; t++, k++){
				sorted[k] = a[t];
			}
		}
		else{
			for(t = i; t<=m; t++, k++){
				sorted[k] = a[t];
			}
		}
		
		for(t = p; t<= q; t++){
			a[t] = sorted[t];
		}
	}
}
