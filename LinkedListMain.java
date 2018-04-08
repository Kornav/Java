
public class LinkedListMain {
	public static void main(String args[]){
		
		System.out.println("L1=(kim,Lee,Park) 만들기");
		LinkedList2 L1 = new LinkedList2(); // 새로운 리스트 L을 만든다
		L1.addLastNode("Kim");
		L1.addLastNode("Lee");
		L1.addLastNode("Park");
		L1.printList();
		System.out.println("문제1 선두에 Cho를 삽입하라.)");
		L1.addFirstNode("Cho");
		L1.printList();
		System.out.println("문제2 Yoo삽입)");
		L1.addLastNode("Yoo");
		L1.printList();
		System.out.println("문제3 'Kim'대신 'Song'으로 교체)");
		L1.replaceNode("kim", "Song");
		L1.printList();
		System.out.println("문제4 마지막 노드 삭제)");
		L1.deleteLastNode();
		L1.printList();
		System.out.println("문제5 원소의 개수 출력)");
		L1.printList(); 
		System.out.println("Number Of Node : "+L1.getNumberOfNode());
		
		/*System.out.println("L2=(durian, apple, pear, banana, orange) 만들기");
		LinkedList2 L2 = new LinkedList2(); // 새로운 리스트 L을 만든다
		L2.addLastNode("durian");
		L2.addLastNode("apple");
		L2.addLastNode("banana");
		L2.addLastNode("orange");
		L2.printList();*/
		
		System.out.println("L3 = (10,20,30,40) 만들기");
		LinkedList2 L3 = new LinkedList2();
	}
}
