import java.util.Random;
public class RandomEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand1 = new Random();
		int n = rand1.nextInt(1000-100)+100; // 100~999까지의 난수  생성
		System.out.println("생성된 난수 : "+n);
	}
}
