/////////////////////////////////////
/////	문제 10.					/////
/////			Shift.java		/////
/////////////////////////////////////

public class reverse {
	public void resverse() { //생성자
		// default
	}
	public LinkedList reverseNode(ListNode head) {
		LinkedList L = new LinkedList(); // 원래의 객체로 반환할 List를 저장할 L
		ListNode origin; // 원래의 노드
		ListNode copy = null; // 복사할 노드
		ListNode temp=null; // 임시노드
		origin = head; // 원래의 노드에 head를 담아줌
		while(origin!=null) { // 원래의 노드 끝까지
			temp = origin.link; // 원래의 노드 주소를 임시 노드에 담아줌
			origin.link = copy; // 원래의 노드 다음주소에 copy 노드를 넣어줌
			copy = origin; // copy노드에 원래의 노드 내용을 넣어줌
			origin = temp; // 원래의 노드에 다음 주소에 들어있던 내용을 넣어줌
		}
		head = copy; // 역순으로 저장된 copy를 다시 head로 옮겨줌
		
		System.out.print("(");
		while (head != null) { // head출력 
			if (head.data != null) { 
				System.out.print(head.data); // data 출력
				L.addLastNode(head.data); // 출력과 동시에 메인에 반환할 List에 data 넣어줌
			} else {
				System.out.print(head.value);
			}
			head = head.link;
			if (head != null) {
				System.out.print(", ");
			}

		}
		System.out.println(")");
		return L; // L반환
	}
}
