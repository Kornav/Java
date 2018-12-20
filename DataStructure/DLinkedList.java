
public class DLinkedList {
	private DListNode head;

	public DLinkedList() {
	}

	public void insertFirst(String x) {
		DListNode newNode = new DListNode(x);
		if (head == null) { // 현재 리스트에 원소없음
			head = newNode; // head를 새로 생성한 원소로 넣어줌
			return; // 아무것도 돌려주지 않고 DLinedList()를 끝냄
		}
		// null이 아니면
		newNode.rlink = head; // 새로 생성된 오른쪽 주소를 원래 리스트의 시작점으로 해준다 
		head.llink = newNode; // 원래리스트의 시작점 왼쪽주소를 새로 생성된 노드로 해준다.
		head = newNode; // 시작점을 옮겨준다.
	}
	
	public void deleteLast() { // 마지막 원소 삭제
		DListNode pre, cur; // 삭제를 위해 이전 노드와 현재노드를 선언
		pre = head; // 이전노드를 시작점으로
		cur = pre.rlink; // 현재노드를 이전노드의 다음으로 해준다.
		while (cur.rlink != null) { // 현재의 노드의 오른쪽이 null 일때 까지
			pre = pre.rlink; // 이전노드 이동
			cur = cur.rlink; // 현재노드 이동
		}
		pre.rlink = null; // 이전노드의 오른쪽 주소를 null로 만듬
	}

	public int findData(String z) { // Z가 몇 번째 데이터인지를 반환하는 메소드
		int cnt = 0; // 몇번째 있는지 셀 변수
		DListNode p; // 참조 변수
		p = head; // p가 head를 가르키게 해줌
		while (p!=null) { // p가 null일 때 까지
			cnt++; // cnt를 올려줌
			if(z.equals(p.data)) { // 찾는 데이터를 찾으면
				break; // 나감
			}
			p = p.rlink; // 다음 노드로 이동
		}
		return cnt; // cnt를 반환
	}

	public void deleteNode(String y) { // 노드 삭제
		DListNode p; // 참조변수 p
		p = head; // p가 head를 가르케 해줌
		if(p == null) { // p가 null이면
			System.out.println("empty list"); // 빈 리스트 출력
		}
		else if(y.equals(head.data)) { // y가 head의 data이면
			p = p.rlink; // 한번 옮겨준 후
			head = p; // head에 옮겨준 p리스트를 넣어줌
		}
		else { 
			while(p!=null) { // p가 null이 아닐 때 까지
				if(y.equals(p.data)){ // p.data가 삭제할 노드와 같으면
					p.llink.rlink = p.rlink; // 삭제할 노드의 왼쪽노드의 오른쪽노드는 삭제할 노드의 오른쪽 노드
					break; // 반복문나감
				}
				p = p.rlink; // 다음 노드로 이동
			}			
		}
		
	}

	public void printList() { // 출력문
		DListNode p; // 참조변수
		p = head; // 참조변수가 head를 가르키게함
		System.out.print("(");
		while (p != null) { // p가 null 일때 까지
			System.out.print(p.data); // p.data를 출력
			p = p.rlink; // 다음 노드로 이동
			if (p != null) {
				System.out.print(", ");
			}
		}
		System.out.println(")");
	}
}
