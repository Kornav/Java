
public class LinkedListMain {
	public static void main(String args[]){
		
		System.out.println("L1=(kim,Lee,Park) �����");
		LinkedList2 L1 = new LinkedList2(); // ���ο� ����Ʈ L�� �����
		L1.addLastNode("Kim");
		L1.addLastNode("Lee");
		L1.addLastNode("Park");
		L1.printList();
		System.out.println("����1 ���ο� Cho�� �����϶�.)");
		L1.addFirstNode("Cho");
		L1.printList();
		System.out.println("����2 Yoo����)");
		L1.addLastNode("Yoo");
		L1.printList();
		System.out.println("����3 'Kim'��� 'Song'���� ��ü)");
		L1.replaceNode("kim", "Song");
		L1.printList();
		System.out.println("����4 ������ ��� ����)");
		L1.deleteLastNode();
		L1.printList();
		System.out.println("����5 ������ ���� ���)");
		L1.printList(); 
		System.out.println("Number Of Node : "+L1.getNumberOfNode());
		
		/*System.out.println("L2=(durian, apple, pear, banana, orange) �����");
		LinkedList2 L2 = new LinkedList2(); // ���ο� ����Ʈ L�� �����
		L2.addLastNode("durian");
		L2.addLastNode("apple");
		L2.addLastNode("banana");
		L2.addLastNode("orange");
		L2.printList();*/
		
		System.out.println("L3 = (10,20,30,40) �����");
		LinkedList2 L3 = new LinkedList2();
	}
}
