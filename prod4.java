import java.util.Date;
public class prod4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//Prod(100000); // 10�� �� ��,
			//Prod(200000); // 20�� �� ��,
			//Prod(300000); // 30�� �� ��,
			//Prod(400000); // 40�� �� ��,
			//Prod(500000); // 50�� �� ��,
			//Prod(600000); // 60�� �� ��,
			//Prod(700000); // 70�� �� ��,
			//Prod(800000); // 80�� �� ��,
			//Prod(900000); // 90�� �� ��,
			Prod(10000000); // 100�� �� ��,
			}catch(Exception e){
				System.out.println("An exception occurs");
		}
	}
	
	public static void Prod(int n){
		int prod = 1; // �ʱⰪ ���� 1
		long start = System.currentTimeMillis(); // ���� �ð� üũ
		System.out.println(new Date()); // �ð� ���
		for(int i=1;i<=n;i++){ // n�� �ݺ��ϱ� ����  �ݺ���
			prod *= prod; // 2^1*2^1 = 2^2 / 2^2*2^2 = 2^4 ������ ǥ���ϱ� ���� ��� ���س���.
		}
		System.out.println(new Date()); // �����ð� ���
		long end = System.currentTimeMillis(); // �����ð� üũ
		long diff = end - start; // �ɸ��ð� = �����ð� - ���۽ð�
		System.out.println("Difference ( n = "+n+" ) : "+diff+"ms"); // �ɸ��ð� ���
	}
}
