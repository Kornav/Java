
public class LinkedList {
	private ListNode head;

	public LinkedList() { // 생성자
		//default
	}
	/////////////////////////////////////////
	////	다른 객체로 List를 넘겨주기		/////
	////	위한 head를 찾는 메소드			/////
	////	(Shift, reverse에 사용)		/////
	/////////////////////////////////////////
	
	public ListNode findfirstNode() {
		ListNode p;
		p = head;
		return p;
	}

	/////////////////////////////////////////////
	///// 문제 1-1(문자열).						/////
	/////		 선두 삽입 메소드 				/////
	///// 			addFirstNode()			/////
	/////////////////////////////////////////////
	
	public void addFirstNode(String x) {
		ListNode temp = new ListNode(); // LinkedList 객체 생성
		temp = head; // 임시 List temp에 head를 넣어줌
		ListNode newNode = new ListNode(); // 새로운 List생성
		newNode.data = x; // 새로운 List에 생성할 data 입력
		newNode.link = temp; // 다음 주소를 임시 List를 보게 만들어줌
		head = newNode; // 모두 연결한 newNode를 head로 재설정
	}

	/////////////////////////////////////////////
	///// 문제 1-1(정수형).						/////
	///// 			선두 삽입 메소드 				/////
	/////			 addFirstNode()			/////
	/////////////////////////////////////////////
	
	public void addFirstNode(int x) {
		ListNode temp = new ListNode();
		temp = head;
		ListNode newNode = new ListNode();
		newNode.value = x;
		newNode.link = temp;
		head = newNode;
	} // Overloading

	/////////////////////////////////////////////
	///// 문제 2(출력).						/////
	///// 			출력 메소드 				/////
	/////			 printList()			/////
	/////////////////////////////////////////////
	
	public void printList() {
		ListNode p; // 포인터 변수
		System.out.print("(");
		p = head; // head를 가르킴
		while (p != null) { // p가 null이 아닐 때 까지
			if (p.data != null) { // p.data가 null이 아니면 p.data를
				System.out.print(p.data);
			} else { // p.data가 null 이면 p.value를 출력 (정수형과 문자열 동시에 사용하기위함)
				System.out.print(p.value);
			}
			p = p.link; // p를 p의 다음 주로소 넘겨줌
			if (p != null) {
				System.out.print(", "); // 데이터가 뒤에 더 있으면 ,를 출력
			}

		}
		System.out.println(")");
	}
	
	
	/////////////////////////////////////////////
	///// 문제 3-1(문자열).						/////
	/////		 마지막노드 삽입 메소드 			/////
	///// 			addLastNode()			/////
	/////////////////////////////////////////////
	
	public void addLastNode(String x) {
		ListNode newNode = new ListNode(); // 빵을 찍고
		newNode.data = x;
		newNode.link = null;
		if (head == null) {// 공백리스트
			head = newNode;
			return; // void이므로 return 할 것이 없음
		}
		ListNode p = head; // 첫번째원소의 주소
		while (p.link != null) { // 마지막 원소를 찾는다
			p = p.link;
		}
		p.link = newNode; // 마지막 원소의 링크부분에 새로이 찍은 빵의 주소를 삽입
	}
	
	/////////////////////////////////////////////
	///// 문제 3-2(정수형).						/////
	/////		 마지막노드 삽입 메소드 			/////
	///// 			addLastNode()			/////
	/////////////////////////////////////////////
	
	public void addLastNode(int x) {
		ListNode newNode = new ListNode(); // 빵을 찍고
		newNode.value = x;
		newNode.link = null;
		if (head == null) {// 공백리스트
			head = newNode;
			return; // void이므로 return 할 것이 없음
		}
		ListNode p = head; // 첫번째원소의 주소
		while (p.link != null) { // 마지막 원소를 찾는다
			p = p.link;
		}
		p.link = newNode; // 마지막 원소의 링크부분에 새로이 찍은 빵의 주소를 삽입
	} // Overloading
	
	/////////////////////////////////////////////
	///// 문제 3-2(정수,문자열).					/////
	/////		 마지막노드 삽입 메소드 			/////
	///// 			addLastNode()			/////
	/////////////////////////////////////////////
	
	public void addLastNode(String x, int val) {
		ListNode newNode = new ListNode(); // 빵을 찍고
		newNode.data = x;
		newNode.value = val;
		newNode.link = null;
		if (head == null) {// 공백리스트
			head = newNode;
			return; // void이므로 return 할 것이 없음
		}
		ListNode p = head; // 첫번째원소의 주소
		while (p.link != null) { // 마지막 원소를 찾는다
			p = p.link;
		}
		p.link = newNode; // 마지막 원소의 링크부분에 새로이 찍은 빵의 주소를 삽입
	}// Overloading
	
	/////////////////////////////////////////////
	///// 문제 4(교체).						/////
	/////		 노드 내용 교체 	메소드 			/////
	///// 			replaceNode()			/////
	/////////////////////////////////////////////
	
	public void replaceNode(String x, String y) {
		ListNode p;
		p = head;
		while (p != null) { // p가 null 일 때 까지 
			if (p.data.equals(x)) { // x의 내용과 같으면
				p.data = y; // y로 data내용 교체
			}
			p = p.link; // 다음 노드로 이동
		}
	}
	
	/////////////////////////////////////////////
	///// 문제 5(삭제).						/////
	/////		 마지막 노드 삭제		 			/////
	///// 			deleteLastNode()		/////
	/////////////////////////////////////////////
	
	public void deleteLastNode() {
		ListNode pre, cur;
		pre = head; // 끝 전노드를 기억할 포인터
		cur = pre.link; // 끝까지 돌릴 포인터
		while (cur != null) { // cur이 끝까지 갈때까지
			if (cur.link == null) { // cur이 끝노드에 도착하면
				cur.data = null; // cur의 현재 data는 null로 만듬
				pre.link = null; // 이전 노드의 주소를 끊어줌
			}
			pre = pre.link; // 다음 노드로 이동
			cur = cur.link; // 다음 노드로 이동
		}
	}
	
	/////////////////////////////////////////////
	///// 문제 6(개수).						/////
	/////		 원소의 개수 출력		 			/////
	///// 			getNumberOfNode()		/////
	/////////////////////////////////////////////
	
	public int getNumberOfNode() {
		int cnt = 0; // 원소의 개수를 담을 변수
		ListNode p;
		p = head;
		while (p != null) { // p가 null 일 때 까지
			if (p.data != null || (p.value != 0)) { // data(문자열)나 value(정수)가 존재하면 갯수를 세줌
				cnt++;
			}
			p = p.link; // 다음노드로 이동
		}
		return cnt; // 갯수를 반환
	}
	
	/////////////////////////////////////////////
	///// 문제 7(평균).						/////
	/////		 평균 계산			 			/////
	///// 			Calaverage()			/////
	/////////////////////////////////////////////
	
	public double Calaverage() {
		ListNode p;
		double avg = 0.0; // 평균을 담을 변수
		int count = getNumberOfNode(); // 갯수를 count에 담음 
		p = head;
		while (p != null) { // p가 null 일 때 까지
			avg += p.value; // avg에 합을 구해줌
			p = p.link; // 다음 노드로 이동
		}
		return avg / count; // 평균값 반환 , 합 / 갯수 

	}

	/////////////////////////////////////////////
	///// 문제 8(최댓값).						/////
	/////		 최댓값 계산		 			/////
	///// 			findMax()				/////
	/////////////////////////////////////////////

	public int findMax() {
		int max = 0; // 최댓값을 담을 변수
		ListNode p; 
		p = head;
		while (p != null) { // p가 null일 때 까지
			if (p.value > max) { // p의 값이 max보다 크면 
				max = p.value; // max값을 p의 값으로 함
			}
			p = p.link; // 다음 노드로 이동
		}
		return max; // 최댓값 반환
	}

	/////////////////////////////////////////////
	///// 문제 11(최댓값).						/////
	/////		 최댓값 계산		 			/////
	///// 			findMax()				/////
	/////////////////////////////////////////////
	
	public String scoreName(int val) { // 최대 점수를 매개 변수로 받아와서
		ListNode p;
		String str = ""; // 이름을 담을 변수
		p = head;
		while (p != null) { // p가 null일 때 까지
			if (p.value == val) { // p의 값과 최대 점수와 같으면
				str += p.data + ", "; // 이름을 담아줌
			}
			p = p.link; // 다음 노드로 이동
		}
		return str; // 이름을 담은 문자열 반환
	}
}
