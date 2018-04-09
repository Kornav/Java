
public class LinkedList {
	private ListNode head;

	public LinkedList() { // ������
		//default
	}
	/////////////////////////////////////////
	////	�ٸ� ��ü�� List�� �Ѱ��ֱ�		/////
	////	���� head�� ã�� �޼ҵ�			/////
	////	(Shift, reverse�� ���)		/////
	/////////////////////////////////////////
	
	public ListNode findfirstNode() {
		ListNode p;
		p = head;
		return p;
	}

	/////////////////////////////////////////////
	///// ���� 1-1(���ڿ�).						/////
	/////		 ���� ���� �޼ҵ� 				/////
	///// 			addFirstNode()			/////
	/////////////////////////////////////////////
	
	public void addFirstNode(String x) {
		ListNode temp = new ListNode(); // LinkedList ��ü ����
		temp = head; // �ӽ� List temp�� head�� �־���
		ListNode newNode = new ListNode(); // ���ο� List����
		newNode.data = x; // ���ο� List�� ������ data �Է�
		newNode.link = temp; // ���� �ּҸ� �ӽ� List�� ���� �������
		head = newNode; // ��� ������ newNode�� head�� �缳��
	}

	/////////////////////////////////////////////
	///// ���� 1-1(������).						/////
	///// 			���� ���� �޼ҵ� 				/////
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
	///// ���� 2(���).						/////
	///// 			��� �޼ҵ� 				/////
	/////			 printList()			/////
	/////////////////////////////////////////////
	
	public void printList() {
		ListNode p; // ������ ����
		System.out.print("(");
		p = head; // head�� ����Ŵ
		while (p != null) { // p�� null�� �ƴ� �� ����
			if (p.data != null) { // p.data�� null�� �ƴϸ� p.data��
				System.out.print(p.data);
			} else { // p.data�� null �̸� p.value�� ��� (�������� ���ڿ� ���ÿ� ����ϱ�����)
				System.out.print(p.value);
			}
			p = p.link; // p�� p�� ���� �ַμ� �Ѱ���
			if (p != null) {
				System.out.print(", "); // �����Ͱ� �ڿ� �� ������ ,�� ���
			}

		}
		System.out.println(")");
	}
	
	
	/////////////////////////////////////////////
	///// ���� 3-1(���ڿ�).						/////
	/////		 ��������� ���� �޼ҵ� 			/////
	///// 			addLastNode()			/////
	/////////////////////////////////////////////
	
	public void addLastNode(String x) {
		ListNode newNode = new ListNode(); // ���� ���
		newNode.data = x;
		newNode.link = null;
		if (head == null) {// ���鸮��Ʈ
			head = newNode;
			return; // void�̹Ƿ� return �� ���� ����
		}
		ListNode p = head; // ù��°������ �ּ�
		while (p.link != null) { // ������ ���Ҹ� ã�´�
			p = p.link;
		}
		p.link = newNode; // ������ ������ ��ũ�κп� ������ ���� ���� �ּҸ� ����
	}
	
	/////////////////////////////////////////////
	///// ���� 3-2(������).						/////
	/////		 ��������� ���� �޼ҵ� 			/////
	///// 			addLastNode()			/////
	/////////////////////////////////////////////
	
	public void addLastNode(int x) {
		ListNode newNode = new ListNode(); // ���� ���
		newNode.value = x;
		newNode.link = null;
		if (head == null) {// ���鸮��Ʈ
			head = newNode;
			return; // void�̹Ƿ� return �� ���� ����
		}
		ListNode p = head; // ù��°������ �ּ�
		while (p.link != null) { // ������ ���Ҹ� ã�´�
			p = p.link;
		}
		p.link = newNode; // ������ ������ ��ũ�κп� ������ ���� ���� �ּҸ� ����
	} // Overloading
	
	/////////////////////////////////////////////
	///// ���� 3-2(����,���ڿ�).					/////
	/////		 ��������� ���� �޼ҵ� 			/////
	///// 			addLastNode()			/////
	/////////////////////////////////////////////
	
	public void addLastNode(String x, int val) {
		ListNode newNode = new ListNode(); // ���� ���
		newNode.data = x;
		newNode.value = val;
		newNode.link = null;
		if (head == null) {// ���鸮��Ʈ
			head = newNode;
			return; // void�̹Ƿ� return �� ���� ����
		}
		ListNode p = head; // ù��°������ �ּ�
		while (p.link != null) { // ������ ���Ҹ� ã�´�
			p = p.link;
		}
		p.link = newNode; // ������ ������ ��ũ�κп� ������ ���� ���� �ּҸ� ����
	}// Overloading
	
	/////////////////////////////////////////////
	///// ���� 4(��ü).						/////
	/////		 ��� ���� ��ü 	�޼ҵ� 			/////
	///// 			replaceNode()			/////
	/////////////////////////////////////////////
	
	public void replaceNode(String x, String y) {
		ListNode p;
		p = head;
		while (p != null) { // p�� null �� �� ���� 
			if (p.data.equals(x)) { // x�� ����� ������
				p.data = y; // y�� data���� ��ü
			}
			p = p.link; // ���� ���� �̵�
		}
	}
	
	/////////////////////////////////////////////
	///// ���� 5(����).						/////
	/////		 ������ ��� ����		 			/////
	///// 			deleteLastNode()		/////
	/////////////////////////////////////////////
	
	public void deleteLastNode() {
		ListNode pre, cur;
		pre = head; // �� ����带 ����� ������
		cur = pre.link; // ������ ���� ������
		while (cur != null) { // cur�� ������ ��������
			if (cur.link == null) { // cur�� ����忡 �����ϸ�
				cur.data = null; // cur�� ���� data�� null�� ����
				pre.link = null; // ���� ����� �ּҸ� ������
			}
			pre = pre.link; // ���� ���� �̵�
			cur = cur.link; // ���� ���� �̵�
		}
	}
	
	/////////////////////////////////////////////
	///// ���� 6(����).						/////
	/////		 ������ ���� ���		 			/////
	///// 			getNumberOfNode()		/////
	/////////////////////////////////////////////
	
	public int getNumberOfNode() {
		int cnt = 0; // ������ ������ ���� ����
		ListNode p;
		p = head;
		while (p != null) { // p�� null �� �� ����
			if (p.data != null || (p.value != 0)) { // data(���ڿ�)�� value(����)�� �����ϸ� ������ ����
				cnt++;
			}
			p = p.link; // �������� �̵�
		}
		return cnt; // ������ ��ȯ
	}
	
	/////////////////////////////////////////////
	///// ���� 7(���).						/////
	/////		 ��� ���			 			/////
	///// 			Calaverage()			/////
	/////////////////////////////////////////////
	
	public double Calaverage() {
		ListNode p;
		double avg = 0.0; // ����� ���� ����
		int count = getNumberOfNode(); // ������ count�� ���� 
		p = head;
		while (p != null) { // p�� null �� �� ����
			avg += p.value; // avg�� ���� ������
			p = p.link; // ���� ���� �̵�
		}
		return avg / count; // ��հ� ��ȯ , �� / ���� 

	}

	/////////////////////////////////////////////
	///// ���� 8(�ִ�).						/////
	/////		 �ִ� ���		 			/////
	///// 			findMax()				/////
	/////////////////////////////////////////////

	public int findMax() {
		int max = 0; // �ִ��� ���� ����
		ListNode p; 
		p = head;
		while (p != null) { // p�� null�� �� ����
			if (p.value > max) { // p�� ���� max���� ũ�� 
				max = p.value; // max���� p�� ������ ��
			}
			p = p.link; // ���� ���� �̵�
		}
		return max; // �ִ� ��ȯ
	}

	/////////////////////////////////////////////
	///// ���� 11(�ִ�).						/////
	/////		 �ִ� ���		 			/////
	///// 			findMax()				/////
	/////////////////////////////////////////////
	
	public String scoreName(int val) { // �ִ� ������ �Ű� ������ �޾ƿͼ�
		ListNode p;
		String str = ""; // �̸��� ���� ����
		p = head;
		while (p != null) { // p�� null�� �� ����
			if (p.value == val) { // p�� ���� �ִ� ������ ������
				str += p.data + ", "; // �̸��� �����
			}
			p = p.link; // ���� ���� �̵�
		}
		return str; // �̸��� ���� ���ڿ� ��ȯ
	}
}
