import java.util.*;
public class ElapsedTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			//Thread.sleep(5*1000); 5√  
			//Thread.sleep(10*1000); //10√ 
			Thread.sleep(30*1000); //30√ 
			System.out.println(new Date());
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference : "+diff);
		}catch(Exception e){
			System.out.println("An exception occurs");
		}
	}

}
