import java.util.*;
public class Factiter { // Factorial For
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); // �Է��� ���� ��ü in ����
		int rst; // ����� ���� ����
		System.out.println("f(n) : n�� �Է����ּ���."); // �Է� �ޱ� �� ��¹�
		rst = f(in.nextInt()); // �Է� �ް� �� ���� �Ű������� �޼ҵ� ȣ��
		System.out.println("rst = "+rst); // ��� �� ���
	}
	public static int f(int n){ // ��� �Լ�
		int rst=1; // ��� ���� ������ ���� �ʱ�ȭ
		for(int i=1;i<=n;i++){ // n���� 1�� ���� �ϸ� ���ϱ� ���� ����
			rst *= i; // ������� 1�� ������ ���� ����
		}
		return rst; // ��� �� ��ȯ
	}
}