/////////////////////////////////////
/////	문제 9.					/////
/////			Shift.java		/////
/////////////////////////////////////


public class Shift {

	public void Shift() {//생성자
		// default
	}

	public LinkedList shiftNode(ListNode _head) {
		LinkedList L = new LinkedList(); // 리스트 생성
		ListNode pre, cur; // 이전 노드와 다음 노드를 
		pre = _head; // 이전 노드를 담아줌
		cur = _head.link; // 다음 노드를 담아줌
		while (cur.link != null) { // 노드의 끝까지
			pre = cur; // 다음 노드로 이동 (끝 전 노드 까지 이동시킴)
			cur = cur.link; // 끝 노드까지 이동시킴
		}
		cur.link = _head; // 끝까지 간 노드의 다음 주소를 첫 노드를 넣어줌
		pre.link = null; // 이전노드의 주소를 끊어줌
		_head = cur; // Shift한 List를 _head로 다시 넣어줌
	
		System.out.print("(");
		while (_head != null) { // _head가 null일 때 까지
			if (_head.data != null) { // data가 null이 아니면
				System.out.print(_head.data); // data를 출력하면서
				L.addLastNode(_head.data); // 원래 객체로 반환할 L에 data 넣어줌
			} else {
				System.out.print(_head.value);
			}
			_head = _head.link; // 다음 노드로 이동
			if (_head != null) {
				System.out.print(", ");
			}

		}
		System.out.println(")");
		return L; // 원래의 노드에 반환
	}
}
