import java.util.Random; // Random ���̺귯��
public class array1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[100]; // ũ�Ⱑ 100�� data �迭 ����
		int max , i; // �ִ밪�� ������ ���� max, �ݺ����� ��� �� ����  i
		Random rand = new Random(); // Random ��ü rand ����
		for(i=0;i<100;i++){ // �ݺ��� index0 ~ index99���� �ݺ�
			data[i] = rand.nextInt(100)+10; // 10~109������ ���ڸ� ������ �����Ͽ� data�� ����
		}
		max = data[0]; // ���� ù ���Ҹ� ���� ū������ ����
		
		for(i=1;i<100;i++){ // �ݺ��� index1~index99���� �ݺ�
			if (data[i]>max){ // max�� ������ data[i]�� ���� ũ��
				max = data[i]; // �ְ� ���� data
			}
		}
		System.out.println("Max = "+max+"\n"); // �ְ� �� ���
	}
}
