import java.util.*;
public class sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//Sum(1000000); // 100�� �� ��,
			//Sum(2000000); // 200�� �� ��,
			//Sum(3000000); // 300�� �� ��,
			//Sum(4000000); // 400�� �� ��,
			//Sum(5000000); // 500�� �� ��,
			//Sum(6000000); // 600�� �� ��,
			//Sum(7000000); // 700�� �� ��,
			//Sum(8000000); // 800�� �� ��,
			//Sum(9000000); // 900�� �� ��,
			Sum(10000000); // 1000�� �� ��,
		}catch(Exception e){
			System.out.println("An exception occurs");
		}
	}
	
	public static void Sum(int n){
		int sum=0;
		long start = System.currentTimeMillis();
		System.out.println(new Date());
		for(int i=1;i<n;i++){
			sum += i;
		}
		System.out.println(new Date());
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("Difference ( n = "+n+" ) : "+diff+"ms");
	}

}
