
public class CLinkedListMain {
	public static void main(String args[]){
		System.out.println("CL1=(20,4, 3, 7) �����  20->4->3->7->20");
		CLinkedList CL1=new CLinkedList();
		CL1.print(); // Circle Linked List ���
		CL1.addFirst(7); // ���� ����
		CL1.addFirst(3); // ���� ����
		CL1.addFirst(4); // ���� ����
		CL1.addFirst(20); // ���� ����
		CL1.print(); // Circle Linked List ���
		CL1.deleteLast(); // ������ ���� ���� (7)
		CL1.deleteLast(); // ������ ���� ���� (3)
		CL1.print(); // Circle Linked List ���
		System.out.println(CL1.getNoofNode()); //���� ����غ���
		CL1.deleteLast(); // ������ ���� ���� (4)
		CL1.deleteLast(); // ������ ���� ���� (20)
		CL1.print();
		System.out.println(CL1.getNoofNode()); //���� ����غ���
		CL1.print(); // Circle Linked List ���
		CL1.addLast(6); //�������� ����߰�
		CL1.print(); // Circle Linked List ���
		
	}

}
