import java.util.*;
public class divtwo { // Fibonacci Recursion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); // �Է��� ���� ��ü in ����
		int rst; // ����� ���� ����
		
		System.out.println("n�� �Է����ּ��� : "); // �Է� �ޱ� �� ��¹�
		rst = f(in.nextInt()); // �Է� �ް� �� ���� �Ű������� �޼ҵ� ȣ��
		System.out.println("rst = "+rst); // ��� �� ���
	}
	
	public static int f(int n){
		int res = 1; // ��� �� ���� �ʱ�ȭ
		for(int i=2;i<=n ;i=i*2) { // n = 2K k�� �ݺ�
			 res = (2 * res) +1; // ��Ģ
		 }
		return res; // ��� �� ��ȯ
		
	}
}
