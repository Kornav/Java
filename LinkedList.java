class ListNode{//�ܺο� ������ ��
		
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
			
		ListNode L = new ListNode(); // LinkedList ��� ��� ����
		L.data="Kim"; 
		L.link=null;
		// ������, �ּ� �Է�
		ListNode p;
		
		ListNode tmpNode = new ListNode(); // ��� ����
		tmpNode.data="Lee"; 
		tmpNode.link=null;
		// ������, �ּ� �Է�
		
		L.link = tmpNode; // ��� ���� ����
		
		L.link.link=new ListNode(); // ���� ���� ����� ���ÿ� ��� ����
		
		L.link.link.data = "Park";
		L.link.link.link = null;
		//������, �ּ� �Է�
		
		//�����ϱ�
		ListNode temp = new ListNode();// ������ ����� ����� �ӽ�Node ����
		ListNode realL = new ListNode(); // ���ο� ����� �ڷᰡ �� ��� ���� 
		realL.data="Cho"; // �߰��� ������ �Է�
		temp=L; // �ӽ� Node�� ��� ���
		realL.link=temp;  // �߰��� �������� ���� �ּҸ� ���� ����� ����� ����
		L=realL; // ����� ���� �߰��� ���� ����
		
		//����غ���
		p=L;
		
		
		
		System.out.println("����1 Cho ����)");
		/*while(p!=null){
			System.out.print(p.data);
			p=p.link;
			if(p!=null)
				System.out.print(",");
		} ����� ���� ����*/
		Print(L);
		
		System.out.println("����2 Yoo ����)");
		ListNode newNode = new ListNode();
		newNode.data = "Yoo";
		newNode.link=null;
		while(p.link!=null) {
			p=p.link;
		}p.link = newNode;
		p=L;
		Print(p);
		
		System.out.println("����3 Lee ����)");
		while(p.link!=null) {
			if(p.link.data=="Lee") {
				p.link=p.link.link;
			}
			p = p.link;
		}p=L;
		Print(p);
		
		System.out.println("����4 kim��� song���� ��ü)");
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
