import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		  Scanner scan = new Scanner(System.in);



		//������ �Է¹ް�  
		  System.out.println("Input year : ");
		  year = scan.nextInt();
		  

		//�������� �ƴ��� �Ǵ�!
		  if((year%4) == 0)   // 4�� ������ ������ ��
		  {
		   if((year%100) == 0)   // 4�� ������ �������鼭, 100���� ������ ������ ��
		   {
		    if((year%400) == 0)  // 100���� ������ �������鼭, 400���� ������ ������ ��
		     System.out.println("����"); 
		    else  // 100���� ������ ����������, 400���� ������ �������� ���� ��
		     System.out.println("������ �ƴմϴ�.");
		   }
		   
		   else  // 4�� ������ ����������, 100���� ������ ���������� ���� ��
		    System.out.println("����");
		  }
		  else  // 4�� ������ �������� �ʴ� ���.
		   System.out.println("������ �ƴմϴ�.");
	}
}
