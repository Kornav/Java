
public class DLinkedListMain {
	public static void main(String args[]){
		DLinkedList L=new DLinkedList();
		L.insertFirst("Kim"); // ���� ����
		L.insertFirst("Choi"); // ���� ����
		L.insertFirst("Lee"); // ���� ����
		L.insertFirst("Park"); // ���� ����
		L.deleteNode("Lee"); // ���� ����
		L.insertFirst("Yoo"); // ���� ����
		L.insertFirst("Hong"); // ���� ����
		L.deleteLast(); // ������ ���� ����(kim)
		System.out.println("���� ��� ���");
		L.printList(); // ����Ʈ ���
		System.out.println("FindData()"); 
		System.out.println("Choi ��ġ : "+L.findData("Choi")); // ����� ��ġ ã��
		System.out.println("deleteLast()");
		L.deleteLast(); // ������ ���� ����(Choi)
		L.printList(); // ����Ʈ ���
		System.out.println("deleteNode()");
		System.out.println("�����Ͻ� �̸��� �Է��ϼ���.");
		L.deleteNode(""); // �Ű������� ���� ��� ����
		L.printList(); // ����Ʈ ���
	}
}
    