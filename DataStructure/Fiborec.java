import java.util.*;
public class Fiborec { // Fibonacci Recursion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rst;
		for(int i=10;i<=50;i+=10) { // 10������ 10~50���� �ݺ�
			rst = 0; // ����� �ʱ�ȭ
			long time1 = System.currentTimeMillis(); // ���� �ð� üũ
			rst = f(i); // f(10), f(20), .... f(50) ����
			long time2 = System.currentTimeMillis(); // �� �ð� üũ
			System.out.println("f("+i+") time diff = "+(time2 - time1)/1000.0+"s\n"+rst); // �ɸ� �ð��� �� ��� 
		}
	}
	public static int f(int n){ // ��� �Լ�
		 if (n <= 1) return n; // n�� 1���� ������ n��ȯ ��, 1��ȯ
		 else return f(n-1) + f(n-2); // ���, ���װ� ���� ���� ����.
	}
}
