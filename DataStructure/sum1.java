import java.util.*;
public class sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//Sum(1000000); // 100만 일 때,
			//Sum(2000000); // 200만 일 때,
			//Sum(3000000); // 300만 일 때,
			//Sum(4000000); // 400만 일 때,
			//Sum(5000000); // 500만 일 때,
			//Sum(6000000); // 600만 일 때,
			//Sum(7000000); // 700만 일 때,
			//Sum(8000000); // 800만 일 때,
			//Sum(9000000); // 900만 일 때,
			Sum(10000000); // 1000만 일 때,
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
