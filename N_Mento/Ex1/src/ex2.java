import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String join_id=null, sign_id;
		String join_pass=null, sign_pass;
		int choice;
		int count=0;
		
		while (true) {
			System.out.println("======================");
			System.out.println("\t��� ����\n 1.ȸ������\n 2.�α���\n 3.����");
			System.out.println("======================");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("������ ���̵� �Է����ּ���.");
				join_id = in.next();
				System.out.println("��й�ȣ�� �Է����ּ���. (12�ڸ� �̻�)");
				join_pass = in.next();
				if(join_pass.length()<12) {
					System.out.println("12�ڸ��� �ƴմϴ�. ���� �޴��� ���ư��ϴ�.");
					continue;
				}
				break;
			case 2:
				System.out.println("�α��� �Ͻ� ���̵� �Է����ּ��� : ");
				sign_id = in.next();
				System.out.println("�α��� �Ͻ� ��й�ȣ�� �Է����ּ��� : ");
				sign_pass = in.next();
				if(!(join_id.equals(sign_id))|| !(join_pass.equals(sign_pass)) ) {
					System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�. �ٽ� �Է����ּ���");
					continue;
				}
				else {
					System.out.println("�α��� �Ǿ����ϴ�.");
				}
				break;
			case 3:
				System.out.println("���� �մϴ�.");
				return ;
				default :
					System.out.println("�޴� ���� �ٽ� �Է����ּ���.");
					break;
			}
		}
		
	}
}