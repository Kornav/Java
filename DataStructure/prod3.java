import java.util.Date;
public class prod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			/*int n=10000;
			for(int i=0;i<10;i++){
				Prod(n);
				n+=10000;
			}
			n�� �÷����� �Լ��� ȣ���Ϸ� ������ 
			�׷��� �ҽ� ó������ 100ms ���Ϸ� ������ 
			�������� 0ms�� ���ͼ� �ϳ��ϳ� ������ �߽��ϴ�.
			*/
			//Prod(100000); // 10�� �� ��,
			//Prod(200000); // 20�� �� ��,
			//Prod(300000); // 30�� �� ��,
			//Prod(400000); // 40�� �� ��,
			//Prod(500000); // 50�� �� ��,
			//Prod(600000); // 60�� �� ��,
			//Prod(700000); // 70�� �� ��,
			//Prod(800000); // 80�� �� ��,
			//Prod(900000); // 90�� �� ��,
			Prod(1000000); // 100�� �� ��,
			
			
			}catch(Exception e){
			System.out.println("An exception occurs");
		}
	}
	
	public static void Prod(int n){
		int prod = 1; // �ʱⰪ�� 1�� ����
		int x = 1; // x�� ���� 2�� n�� �����־���ؼ� 2������ �����÷ο� ������ 1�� ����
		long start = System.currentTimeMillis(); // ���� �ð� üũ
		System.out.println(new Date()); // �ð� ���
		for(int i=1;i<=n;i++){ // n�� ���ϱ� ���� �ݺ���
				prod *= x; // 1�� ��� �����ش�.
		}
		System.out.println(new Date()); // �۾� ������ �ð� ���
		long end = System.currentTimeMillis(); // ������ �ð� üũ
		long diff = end - start; // �ɸ��ð� = ���� �ð� - ���� �ð�
		System.out.println("Difference ( n = "+n+" ) : "+diff+"ms"); // �ɸ��ð� ���
	}

}
