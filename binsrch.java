import java.util.*;
public class binsrch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; // ���ĵ� �迭 ����
		
		System.out.println("�迭���� ã�� ���� �Է��ϼ���."); // �Է��� �䱸�ϴ� ��¹�
		System.out.println(f(arr,in.nextInt())+"��° �濡 �ֽ��ϴ�."); // �Է¹��� ���� �Ű������� �޼ҵ� ȣ��, ã�� �� ���
	}
	public static int f(int[] a,int n){
		int left = 0; // ���� ���� ���� �迭�� ����������
		int right = a.length-1; // ������ ���� ���� �迭�� ������ ������
		while(left<=right){ // right�� �� �۾��������� �ݺ�
			int mid = (left+right)/2; // mid ��ġ�� �߰����� ����
			if(a[mid]<n){ // ã�� ���� ��� ���� ũ��
				left = mid+1; // ���� �������� �߰� ������ ũ�� �̵�
			}
			else if(a[mid]>n){ // �۰ų� ������
				right = mid-1; // ������ �������� �߰������� �۰� �̵�
			}
			else{ // left�� right�� ������, ���� ã������ mid �� ��ȯ
				return mid;
			}
		}
		return -1; // ������ ��ȯ�� �ȵǰ� �帣�� ��� ���� ��ã�� ���̹Ƿ� -1 ��ȯ
	}
}
