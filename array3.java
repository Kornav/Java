import java.util.Random; // ���̺귯��
public class array3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); // Random��ü ����
		int[] data = new int[100]; // ũ�Ⱑ 100�� data�迭 ����
		int sum, i,count=0; // ���� ���� ���� sum, �ݺ����� ����� ���� i, ��պ��� ū ���� ������ �� ���� count
		double avg; // ����� ���� ���� avg
		
		
		for(i=0;i<100;i++){ // 
			data[i] = rand.nextInt(100)+10; // 10~109������ ���� ����
		}
		sum=0; // �� �ʱ�ȭ
		for(i=0;i<100;i++){
			sum +=data[i];
		} // �� ���� ���ϴ� �ݺ���
		avg = (double) sum/data.length; // ������ data�� ũ��� ���� ����� ���Ѵ�.
		System.out.println("Avg = "+avg+"\n"); // ��� ���
		for(i=0;i<100;i++){
			if(data[i]>avg){ // ��պ��� ũ��
				count++; // ������ ����
			}
		}
		System.out.println(count+" elements are grater than avg");// ���� ���
	}
}
