import java.util.Random;// ���̺귯��
public class array2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); // ������ü ����
		int[] data = new int[100]; // ũ�Ⱑ 100�� data �迭 ����
		int sum, i;  // ���� ���� ���� sum, �ݺ����� ��� �� ���� i
		double avg; // ����� ���� ���� avg
		
		
		for(i=0;i<100;i++){ // �ݺ���
			data[i] = rand.nextInt(100)+10; //10~109������ ���� ���� 
		}
		sum=0; // �� �ʱ�ȭ
		for(i=0;i<100;i++){// �ݺ���
			sum +=data[i]; // �迭�� ���� ���ذ��� index ���� 
		}
		avg = (double) sum/data.length; // ��δ� ���� ���� data�� ũ��� ����
		System.out.println("Avg = "+avg+"\n"); // ��� ���
	}
}
