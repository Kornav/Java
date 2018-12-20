import java.util.*;
public class Ex4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		char calc;
		int num1,num2,result;
		System.out.println("첫번째 수를 입력해주세요.");
		num1 = input.nextInt();
		System.out.println("두번째 수를 입력해주세요.");
		num2 = input.nextInt();
		System.out.println("+ : 덧셈\n- : 뺄셈\n* : 곱셈\n/ : 나눗셈\n연산을 선택하세요 : ");
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
