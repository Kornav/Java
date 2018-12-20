
public class TestBubbleSort {
	public TestBubbleSort(){
		int[] a = IntArray.randomInts(20,100);
		IntArray.print(a);
		System.out.println("sorted: "+IntArray.isSorted(a));
		Bubblesort(a);
		IntArray.print(a);
		System.out.println("sorted: "+IntArray.isSorted(a));
	}
	void Bubblesort(int[] a){
		for(int i=a.length-1; i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
