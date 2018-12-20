
public class CLinkedList {
	private CListNode head, tail;
	private CListNode temp;
	public void addFirst(int x){ // 매개변수 (x)로 첫번째 원소 삽입
		CListNode cnewNode=new CListNode(); // 노드 생성
		cnewNode.data=x; // x를 노드의 data로 줌
		if(head==null){// empty list일 경우,
			head=cnewNode; 
			tail=cnewNode;
			cnewNode.clink=head; // head와 tail 모두를 생성된 노드로 두고 원형 리스트를 만들기 위해 다음 주소를 head로 줌
		}
		else{ // empty가 아니면
			temp=head; // 임시 노드에 head를 옮겨놓고
			cnewNode.clink=temp; // 새로 생성된 다음주소를 옮겨논 리스트로 가르키게 함
			head=cnewNode; // 생성된 노드를 head로 정의해줌
			tail.clink=head; // 원형을 만들기 위해 마지막 주소는 head를 가르키게 함
		}
	}
	public void deleteLast(){ // 마지막 원소 삭제
		if(head==null){ // empty list 일 경우,
			System.out.println("Nothing to delete"); // 삭제할것이 없다는 출력문
		}
		else if(head==tail){//원소가 1개이면
			head=null; tail=null; // head와 tail을 null로 해줌
		}
		else{ //원소가 2개 혹은 그 이상 
			CListNode p, q; // 이전노드와 현재노드를 가르킬 노드 두개 생성
			p=null; q=head; // 이전노드를 비워주고 현재노드가 head를 가르키게 함
			while(q!=tail){ // 현재 노드가 tail(원소의 끝)까지
				p=q; q=q.clink; // 이전노드와 현재노드를 이동시켜줌
			}
			tail=p; // 꼬리는 이전노드를 가르키게함
			p.clink=head; // 꼬리의 다음 주소가 head를 가르키게 함 (연결을 끊어줌)
		}
	}
	public void print(){ // 리스트 출력문
		CListNode p=head; // p가 head를 가르키게 함
		if(p!=null){ // p가 data끝까지 가도록
			while((p!=tail)&&(p!=null)){ // p가 tail(원소의 끝)이 아니고 p가 null이 아닐때 까지
				System.out.print(p.data+"->"); // data를 출력하며
				p=p.clink; // p를 다음 주소로 이동시켜줌
			}
			System.out.print(p.data+"->"); //여기까지가 끝
			p=p.clink;  //마지막->선두원소이동
			System.out.println(p.data);
		}
		else { System.out.println("empty list");}
	}
	public int getNoofNode(){ // 원소의 개수 출력
		CListNode p=head; // 참조 변수 p
		int cnt=0; // 개수를 셀 변수 cnt

		while(p!=null){ // p가 null이 아니면  
			cnt++; // 원소의 개수를 늘려줌
			p = p.clink;// 다음 노드로 이동
			if(p==tail.clink) // p가 tail.clink(head)와 같으면
				break;
		}
		if(cnt == 0) { // empty list 일 경우,
			System.out.println("empty list");
		}
		
		return cnt; //cnt를 반환
	}
	public void addLast(int x){ //원형연결리스트 마지막에 원소추가
		CListNode cnewNode=new CListNode();
		cnewNode.data=x; // x를 생성된 노드의 data로 해줌
		CListNode p; // 참조변수 p
		p = head; // p는 head를 가르키게 함
		if(p==null) { // p가 null이면
			addFirst(x); // 원형연결리스트 첫번째에 원소추가 메소드를 호출
		}else { // null이 아니면,
			while(p!=tail){ //p가 tail(원소의 끝)이 아닐 때 까지,
				p = p.clink; // 참조변수 p의 위치를 이동시켜줌
			}
			p.clink = cnewNode; // p의 위치 다음 주소를 새로 생성된 노드로 해줌 (연결)
			tail = cnewNode; // tail(원소의 끝)을 새로 생성된 노드로 해줌
			cnewNode.clink = head; // 새로 생성된 노드의 다음주소가 head를 가르키게 함(원형으로 연결)
		}
	}
	public CLinkedList(){	//생성자
	}
}
