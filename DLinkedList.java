
public class DLinkedList {
	private DListNode head;

	public DLinkedList() {
	}

	public void insertFirst(String x) {
		DListNode newNode = new DListNode(x);
		if (head == null) { // ���� ����Ʈ�� ���Ҿ���
			head = newNode; // head�� ���� ������ ���ҷ� �־���
			return; // �ƹ��͵� �������� �ʰ� DLinedList()�� ����
		}
		// null�� �ƴϸ�
		newNode.rlink = head; // ���� ������ ������ �ּҸ� ���� ����Ʈ�� ���������� ���ش� 
		head.llink = newNode; // ��������Ʈ�� ������ �����ּҸ� ���� ������ ���� ���ش�.
		head = newNode; // �������� �Ű��ش�.
	}
	
	public void deleteLast() { // ������ ���� ����
		DListNode pre, cur; // ������ ���� ���� ���� �����带 ����
		pre = head; // ������带 ����������
		cur = pre.rlink; // �����带 ��������� �������� ���ش�.
		while (cur.rlink != null) { // ������ ����� �������� null �϶� ����
			pre = pre.rlink; // ������� �̵�
			cur = cur.rlink; // ������ �̵�
		}
		pre.rlink = null; // ��������� ������ �ּҸ� null�� ����
	}

	public int findData(String z) { // Z�� �� ��° ������������ ��ȯ�ϴ� �޼ҵ�
		int cnt = 0; // ���° �ִ��� �� ����
		DListNode p; // ���� ����
		p = head; // p�� head�� ����Ű�� ����
		while (p!=null) { // p�� null�� �� ����
			cnt++; // cnt�� �÷���
			if(z.equals(p.data)) { // ã�� �����͸� ã����
				break; // ����
			}
			p = p.rlink; // ���� ���� �̵�
		}
		return cnt; // cnt�� ��ȯ
	}

	public void deleteNode(String y) { // ��� ����
		DListNode p; // �������� p
		p = head; // p�� head�� ������ ����
		if(p == null) { // p�� null�̸�
			System.out.println("empty list"); // �� ����Ʈ ���
		}
		else if(y.equals(head.data)) { // y�� head�� data�̸�
			p = p.rlink; // �ѹ� �Ű��� ��
			head = p; // head�� �Ű��� p����Ʈ�� �־���
		}
		else { 
			while(p!=null) { // p�� null�� �ƴ� �� ����
				if(y.equals(p.data)){ // p.data�� ������ ���� ������
					p.llink.rlink = p.rlink; // ������ ����� ���ʳ���� �����ʳ��� ������ ����� ������ ���
					break; // �ݺ�������
				}
				p = p.rlink; // ���� ���� �̵�
			}			
		}
		
	}

	public void printList() { // ��¹�
		DListNode p; // ��������
		p = head; // ���������� head�� ����Ű����
		System.out.print("(");
		while (p != null) { // p�� null �϶� ����
			System.out.print(p.data); // p.data�� ���
			p = p.rlink; // ���� ���� �̵�
			if (p != null) {
				System.out.print(", ");
			}
		}
		System.out.println(")");
	}
}
