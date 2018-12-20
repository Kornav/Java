import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		  Scanner scan = new Scanner(System.in);



		//연도를 입력받고  
		  System.out.println("Input year : ");
		  year = scan.nextInt();
		  

		//윤년인지 아닌지 판단!
		  if((year%4) == 0)   // 4로 나누어 떨어질 때
		  {
		   if((year%100) == 0)   // 4로 나누어 떨어지면서, 100으로 나누어 떨어질 때
		   {
		    if((year%400) == 0)  // 100으로 나누어 떨어지면서, 400으로 나누어 떨어질 때
		     System.out.println("윤년"); 
		    else  // 100으로 나누어 떨어지지마, 400으로 나누어 떨어지지 않을 때
		     System.out.println("윤년이 아닙니다.");
		   }
		   
		   else  // 4로 나누어 떨어지지만, 100으로 나누어 떨어지지는 않을 때
		    System.out.println("윤년");
		  }
		  else  // 4로 나누어 떨어지지 않는 경우.
		   System.out.println("윤년이 아닙니다.");
	}
}
