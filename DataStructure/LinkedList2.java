
public class LinkedList2 {
	private ListNode head;
	public LinkedList2(){ //������
		
	}
	public void addLastNode(String x){
			ListNode newNode= new ListNode(); //���� ���
			newNode.data=x;
			newNode.link=null;
			if(head==null){//���鸮��Ʈ
				head=newNode;
				return; // void�̹Ƿ� return �� ���� ����
			}
			ListNode p=head; //ù��°������ �ּ�
			while(p.link!=null){ //������ ���Ҹ� ã�´�
				p=p.link;
			}
			p.link=newNode; //������ ������ ��ũ�κп� ������ ���� ���� �ּҸ� ����
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
