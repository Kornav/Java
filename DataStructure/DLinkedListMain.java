
public class DLinkedListMain {
	public static void main(String args[]){
		DLinkedList L=new DLinkedList();
		L.insertFirst("Kim"); // 원소 삽입
		L.insertFirst("Choi"); // 원소 삽입
		L.insertFirst("Lee"); // 원소 삽입
		L.insertFirst("Park"); // 원소 삽입
		L.deleteNode("Lee"); // 원소 삽입
		L.insertFirst("Yoo"); // 원소 삽입
		L.insertFirst("Hong"); // 원소 삽입
		L.deleteLast(); // 마지막 원소 삭제(kim)
		System.out.println("현재 노드 출력");
		L.printList(); // 리스트 출력
		System.out.println("FindData()"); 
		System.out.println("Choi 위치 : "+L.findData("Choi")); // 노드의 위치 찾기
		System.out.println("deleteLast()");
		L.deleteLast(); // 마지막 원소 삭제(Choi)
		L.printList(); // 리스트 출력
		System.out.println("deleteNode()");
		System.out.println("삭제하실 이름을 입력하세요.");
		L.deleteNode(""); // 매개변수로 받은 노드 삭제
		L.printList(); // 리스트 출력
	}
}
    