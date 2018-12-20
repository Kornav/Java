import java.util.*;
public class TestInsertionSort {
	public TestInsertionSort(){
		int[] a = IntArray.randomInts(20,100);
		IntArray.print(a);
		System.out.println("sorted: "+IntArray.isSorted(a));
		Insertionsort(a);
		IntArray.print(a);
		System.out.println("sorted: "+IntArray.isSorted(a));
	}
	
	void Insertionsort(int a[]){
		for(int i=1;i<a.length;i++){
			int temp = a[i];
			int j=i;
			for(j=i-1; j>=0 && temp<a[j]; j--){
                a[j+1] = a[j];
            }
            a[j+1] = temp;
		}
	}
}
