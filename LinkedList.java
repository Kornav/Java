class ListNode{//외부에 선언할 것
		
		String data;
		ListNode link;
		
		public ListNode(){
			data=null;
			link=null;
		}
		public ListNode(String val){
			data=val;
			link=null;
		}
	}

public class LinkedList {	
	public static void main(String[] args) {
			
		ListNode L = new ListNode(); // LinkedList 헤더 노드 생성
		L.data="Kim"; 
		L.link=null;
		// 데이터, 주소 입력
		ListNode p;
		
		ListNode tmpNode = new ListNode(); // 노드 생성
		tmpNode.data="Lee"; 
		tmpNode.link=null;
		// 데이터, 주소 입력
		
		L.link = tmpNode; // 헤더 노드와 연결
		
		L.link.link=new ListNode(); // 다음 노드와 연결과 동시에 노드 생성
		
		L.link.link.data = "Park";
		L.link.link.link = null;
		//데이터, 주소 입력
		
		//삽입하기
		ListNode temp = new ListNode();// 원래의 헤더를 기억할 임시Node 생성
		ListNode realL = new ListNode(); // 새로운 노드의 자료가 들어갈 노드 생성 
		realL.data="Cho"; // 추가될 데이터 입력
		temp=L; // 임시 Node에 헤더 기억
		realL.link=temp;  // 추가될 데이터의 다음 주소를 원래 노드의 헤더와 연결
		L=realL; // 헤더의 값을 추가된 노드로 변경
		
		//출력해보기
		p=L;
		
		
		
		System.out.println("문제1 Cho 삽입)");
		/*while(p!=null){
			System.out.print(p.data);
			p=p.link;
			if(p!=null)
				System.out.print(",");
		} 출력을 위한 문장*/
		Print(L);
		
		System.out.println("문제2 Yoo 삽입)");
		ListNode newNode = new ListNode();
		newNode.data = "Yoo";
		newNode.link=null;
		while(p.link!=null) {
			p=p.link;
		}p.link = newNode;
		p=L;
		Print(p);
		
		System.out.println("문제3 Lee 제거)");
		while(p.link!=null) {
			if(p.link.data=="Lee") {
				p.link=p.link.link;
			}
			p = p.link;
		}p=L;
		Print(p);
		
		System.out.println("문제4 kim대신 song으로 교체)");
		while(p.link!=null) {
			if(p.data == "Kim") {
				p.data = "Song";
			}
			p=p.link;
		}p=L;
		Print(p);
	}
	
	public static void Print(ListNode Chain) {
		ListNode p = Chain;
		System.out.print("(");
		while(p!=null) {
			System.out.print(p.data);
			p=p.link;
			if(p!=null) {
				System.out.print(", ");
			}
			else {
				System.out.println(")");
			}
		}
	}
}
