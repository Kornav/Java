import java.util.*;
public class Ex4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		char calc;
		int num1,num2,result;
		System.out.println("ù��° ���� �Է����ּ���.");
		num1 = input.nextInt();
		System.out.println("�ι�° ���� �Է����ּ���.");
		num2 = input.nextInt();
		System.out.println("+ : ����\n- : ����\n* : ����\n/ : ������\n������ �����ϼ��� : ");
		calc = input.next().charAt(0);
		
		switch(calc) {
		case '+' :
			System.out.println(num1 + num2);
			break;
		case '-' :
			System.out.println(num1 - num2);
			break;
		case '*' :
			result = num1*num2;
			System.out.println(result);
			break;
		case '/' :
			result = num1/num2;
			System.out.println(result);
			break;
		}
	}
}
