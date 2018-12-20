
public class LinkedList2 {
	private ListNode head;
	public LinkedList2(){ //생성자
		
	}
	public void addLastNode(String x){
			ListNode newNode= new ListNode(); //빵을 찍고
			newNode.data=x;
			newNode.link=null;
			if(head==null){//공백리스트
				head=newNode;
				return; // void이므로 return 할 것이 없음
			}
			ListNode p=head; //첫번째원소의 주소
			while(p.link!=null){ //마지막 원소를 찾는다
				p=p.link;
			}
			p.link=newNode; //마지막 원소의 링크부분에 새로이 찍은 빵의 주소를 삽입
	}
	public void printList(){
		ListNode p;
		System.out.print("(");
		p=head;
		while (p!=null){
			System.out.print(p.data);
			p=p.link;
			if(p!=null) {System.out.print(", ");}
		}
		System.out.println(")");
	}
	public void addFirstNode(String x){
		ListNode temp = new ListNode();
		temp = head;
		ListNode newNode = new ListNode();
		newNode.data = x;
		newNode.link = temp;
		head = newNode;
	}
	public int getNumberOfNode(){
		int cnt=0;
		ListNode p;
		p=head;
		while(p!=null){
			if(p.data != null){
				cnt++;
			}
			p = p.link;
		}
		return cnt;
	
	}
	public void replaceNode(String x, String y){
		ListNode p;
		p=head;
		while(p!=null){
			if(p.data.equals(x)){
				p.data = y;
			}
			p = p.link;
		}
	}
	public void deleteLastNode(){
		ListNode pre,cur;
		pre = head;
		cur = pre.link;
		while(cur!=null){
			if(cur.link==null){
				cur.data = null;
				pre.link = null;
			}
			pre = pre.link;
			cur = cur.link;
		}
	}
}
