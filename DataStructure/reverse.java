/////////////////////////////////////
/////	���� 10.					/////
/////			Shift.java		/////
/////////////////////////////////////

public class reverse {
	public void resverse() { //������
		// default
	}
	public LinkedList reverseNode(ListNode head) {
		LinkedList L = new LinkedList(); // ������ ��ü�� ��ȯ�� List�� ������ L
		ListNode origin; // ������ ���
		ListNode copy = null; // ������ ���
		ListNode temp=null; // �ӽó��
		origin = head; // ������ ��忡 head�� �����
		while(origin!=null) { // ������ ��� ������
			temp = origin.link; // ������ ��� �ּҸ� �ӽ� ��忡 �����
			origin.link = copy; // ������ ��� �����ּҿ� copy ��带 �־���
			copy = origin; // copy��忡 ������ ��� ������ �־���
			origin = temp; // ������ ��忡 ���� �ּҿ� ����ִ� ������ �־���
		}
		head = copy; // �������� ����� copy�� �ٽ� head�� �Ű���
		
		System.out.print("(");
		while (head != null) { // head��� 
			if (head.data != null) { 
				System.out.print(head.data); // data ���
				L.addLastNode(head.data); // ��°� ���ÿ� ���ο� ��ȯ�� List�� data �־���
			} else {
				System.out.print(head.value);
			}
			head = head.link;
			if (head != null) {
				System.out.print(", ");
			}

		}
		System.out.println(")");
		return L; // L��ȯ
	}
}
