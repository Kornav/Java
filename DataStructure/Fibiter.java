import java.util.*;
public class Fibiter { // Fibonacci For
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
		int sum = 0; // ��� ��
		int n1 = 1; // ù��°��
		int n2 = 1; // �ι�°��
		for(int i=3; i<=n;i++){
			sum = n1+n2; // �������� ���� + ������
			n1 = n2; // �������� ��ġ -> ������ ��ġ�� ���
			n2 = sum; // ������ ��ġ -> �������� ��ġ�� ���
		}
		if(n>2){ // �ι�° �� ���� ũ��
			return sum; // sum �״�� ����
		}
		else{ // �ι� ° �� ���� ������ 
			return 1; // 1 ��ȯ
		}
	}
}

// 1 1 2 3 5 8 13 21