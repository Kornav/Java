import java.util.Random;
public class RandomEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand1 = new Random();
		int n = rand1.nextInt(1000-100)+100; // 100~999������ ����  ����
		System.out.println("������ ���� : "+n);
	}
}
