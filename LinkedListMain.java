
public class LinkedListMain {
	public static void main(String args[]) {
		
		/////////////////////////////////////////
		////	���� 1 ~ 6 ��					/////
		/////////////////////////////////////////
		
		System.out.println("L1=(kim,Lee,Park) �����");
		LinkedList L1 = new LinkedList(); // ���ο� ����Ʈ L�� �����
		L1.addLastNode("Kim");
		L1.addLastNode("Lee");
		L1.addLastNode("Park");
		L1.printList();
		System.out.println("����1 ���ο� Cho�� �����϶�.)"); // ���� 1��
		L1.addFirstNode("Cho");
		System.out.println("����:2 ���)");
		L1.printList();
		System.out.println("����3 Yoo����)");
		L1.addLastNode("Yoo");
		L1.printList();
		System.out.println("����4 'Kim'��� 'Song'���� ��ü)");
		L1.replaceNode("kim", "Song");
		L1.printList();
		System.out.println("����5 ������ ��� ����)");
		L1.deleteLastNode();
		L1.printList();
		System.out.println("����6 ������ ���� ���)");
		L1.printList();
		System.out.println("Number Of Node : " + L1.getNumberOfNode());

		/////////////////////////////////////////
		////	���� �ִ� List					/////
		/////////////////////////////////////////
		
		System.out.println("L2=(durian, apple, pear, banana, orange) �����");
		LinkedList L2 = new LinkedList(); // ���ο� ����Ʈ L�� �����
		L2.addLastNode("durian");
		L2.addLastNode("apple");
		L2.addLastNode("banana");
		L2.addLastNode("orange");
		L2.printList();
		
		/////////////////////////////////////////
		////	������ ���� �����				///// 
		////	��հ� ����� List				/////
		/////////////////////////////////////////

		System.out.println("L3 = (10,20,30,40) �����");
		LinkedList L3 = new LinkedList();
		L3.addFirstNode(10);
		L3.addLastNode(20);
		L3.addLastNode(30);
		L3.addLastNode(40);
		L3.printList();
		System.out.println("��� : " + L3.Calaverage());

		/////////////////////////////////////////
		////	������ ���� �����				///// 
		////	�ִ� ����� List				/////
		/////////////////////////////////////////
		
		LinkedList L4 = new LinkedList();
		L4.addFirstNode(20);
		L4.addLastNode(10);
		L4.addLastNode(40);
		L4.addLastNode(30);
		L4.printList();
		System.out.println("Max : " + L4.findMax());
		
		/////////////////////////////////////
		/////	���� 9.					/////
		/////			Shift.java		/////
		/////////////////////////////////////

		
		System.out.println("L5=(kim, Lee, Park, Yoo) �����");
		LinkedList L5 = new LinkedList(); // ���ο� ����Ʈ L�� �����
		L5.addLastNode("kim");
		L5.addLastNode("Lee");
		L5.addLastNode("Park");
		L5.addLastNode("Yoo");
		
		System.out.println("=== Shift ===");
		Shift sh = new Shift();
		L5 = sh.shiftNode(L5.findfirstNode());
		
		L5.printList();
		
		
		/////////////////////////////////////
		/////	���� 10.					/////
		/////			Shift.java		/////
		/////////////////////////////////////

		System.out.println("=== reverse ===");
		reverse re = new reverse();
		L5 = re.reverseNode(L5.findfirstNode());
		
		L5.printList();

		
		/////////////////////////////////////
		/////	���� 11.					/////
		/////			Assignments		/////
		/////////////////////////////////////

		
		System.out.println("=== Assignments ===\nL6 �����");
		LinkedList L6 = new LinkedList();
		
		L6.addLastNode("ȫ�浿",50);
		L6.addLastNode("����",100);
		L6.addLastNode("��ö��",85);
		L6.addLastNode("�迵��",95);
		L6.addLastNode("Ȳ����",100); // Make Linked List
		
		System.out.println("�л� ���� ��� : "+L6.Calaverage()); // Calaverage()
		System.out.println("�л��� ���� ���� ������ ���� �л� �̸� : "+L6.scoreName(L6.findMax())); // Find Student Name of Max Score
		
	}
}
