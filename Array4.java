public class Array4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10; // ó�� �� �� num
		int[][]a = new int[5][4]; // 5 by 4 2���� �迭 ����

		for(int row=0;row<a.length;row++){ // ���� �� ��ŭ �ݺ�
			for(int col=0;col<a[0].length;col++){ // ���� �� ��ŭ �ݺ�
				a[row][col] = num++; // num�� ������Ű�� ����
			}
		}
		for(int row=0;row<a.length;row++){ // ���� �� ��ŭ �ݺ� 
			for(int col=0;col<a[row].length;col++){ // ���� �� ��ŭ �ݺ�
				System.out.print(a[row][col]+" "); // �ʱ�ȭ �� �迭�� �� Ȯ��
			}
			System.out.println(); // ���� �ٲ�� ����
		}
		
	}
}
