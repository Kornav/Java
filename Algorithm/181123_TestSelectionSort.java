
public class TestSelectionSort {
	public TestSelectionSort() {
		int [] a = IntArray.randomInts(20,100);
		IntArray.print(a);
		System.out.println("sorted: "+IntArray.isSorted(a));
		Selectionsort(a);
		IntArray.print(a);
		System.out.println("sorted: "+IntArray.isSorted(a));
	}
	void Selectionsort(int[] a) {
		int i, j, min;
		for(i=0; i<a.length-1;i++) {
			for(j=i+1,min=i;j<a.length;j++) {
				if(a[j]<a[min]) min=j;
			}//a[i], ..., a[n-1] 중에서 가장 작은 원소 a[j]를  선택
			IntArray.swap(a, min, i);//a[j]를  a[i]와 교환;
		}
	}
}
