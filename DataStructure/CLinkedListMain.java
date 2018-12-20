
public class CLinkedListMain {
	public static void main(String args[]){
		System.out.println("CL1=(20,4, 3, 7) 만들기  20->4->3->7->20");
		CLinkedList CL1=new CLinkedList();
		CL1.print(); // Circle Linked List 출력
		CL1.addFirst(7); // 원소 삽입
		CL1.addFirst(3); // 원소 삽입
		CL1.addFirst(4); // 원소 삽입
		CL1.addFirst(20); // 원소 삽입
		CL1.print(); // Circle Linked List 출력
		CL1.deleteLast(); // 마지막 원소 삭제 (7)
		CL1.deleteLast(); // 마지막 원소 삭제 (3)
		CL1.print(); // Circle Linked List 출력
		System.out.println(CL1.getNoofNode()); //갯수 출력해보라
		CL1.deleteLast(); // 마지막 원소 삭제 (4)
		CL1.deleteLast(); // 마지막 원소 삭제 (20)
		CL1.print();
		System.out.println(CL1.getNoofNode()); //갯수 출력해보라
		CL1.print(); // Circle Linked List 출력
		CL1.addLast(6); //마지막에 노드추가
		CL1.print(); // Circle Linked List 출력
		
	}

}
