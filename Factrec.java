import java.util.*;
public class Factrec { // Factorial Recursion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); // �Է��� ���� ��ü in ����
		int rst; // ����� ���� ����
		System.out.println("f(n) : n�� �Է����ּ���."); // �Է� �ޱ� �� ��¹�
		rst = f(in.nextInt()); // �Է� �ް� �� ���� �Ű������� �޼ҵ� ȣ��
		System.out.println("rst = "+rst); // ��� �� ���
	}
	public static int f(int n){ // ��� �Լ�
		 if (n <= 1) return n; // n�� 1���� ������ n�״�� ���
		 else return n * f(n-1); // n�� �����ְ� �ϳ� ���� �ڱ� �ڽ��� �޼ҵ带 ȣ��
	}
}
