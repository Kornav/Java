
public class CLinkedList {
	private CListNode head, tail;
	private CListNode temp;
	public void addFirst(int x){ // �Ű����� (x)�� ù��° ���� ����
		CListNode cnewNode=new CListNode(); // ��� ����
		cnewNode.data=x; // x�� ����� data�� ��
		if(head==null){// empty list�� ���,
			head=cnewNode; 
			tail=cnewNode;
			cnewNode.clink=head; // head�� tail ��θ� ������ ���� �ΰ� ���� ����Ʈ�� ����� ���� ���� �ּҸ� head�� ��
		}
		else{ // empty�� �ƴϸ�
			temp=head; // �ӽ� ��忡 head�� �Űܳ���
			cnewNode.clink=temp; // ���� ������ �����ּҸ� �Űܳ� ����Ʈ�� ����Ű�� ��
			head=cnewNode; // ������ ��带 head�� ��������
			tail.clink=head; // ������ ����� ���� ������ �ּҴ� head�� ����Ű�� ��
		}
	}
	public void deleteLast(){ // ������ ���� ����
		if(head==null){ // empty list �� ���,
			System.out.println("Nothing to delete"); // �����Ұ��� ���ٴ� ��¹�
		}
		else if(head==tail){//���Ұ� 1���̸�
			head=null; tail=null; // head�� tail�� null�� ����
		}
		else{ //���Ұ� 2�� Ȥ�� �� �̻� 
			CListNode p, q; // �������� �����带 ����ų ��� �ΰ� ����
			p=null; q=head; // ������带 ����ְ� �����尡 head�� ����Ű�� ��
			while(q!=tail){ // ���� ��尡 tail(������ ��)����
				p=q; q=q.clink; // �������� �����带 �̵�������
			}
			tail=p; // ������ ������带 ����Ű����
			p.clink=head; // ������ ���� �ּҰ� head�� ����Ű�� �� (������ ������)
		}
	}
	public void print(){ // ����Ʈ ��¹�
		CListNode p=head; // p�� head�� ����Ű�� ��
		if(p!=null){ // p�� data������ ������
			while((p!=tail)&&(p!=null)){ // p�� tail(������ ��)�� �ƴϰ� p�� null�� �ƴҶ� ����
				System.out.print(p.data+"->"); // data�� ����ϸ�
				p=p.clink; // p�� ���� �ּҷ� �̵�������
			}
			System.out.print(p.data+"->"); //��������� ��
			p=p.clink;  //������->���ο����̵�
			System.out.println(p.data);
		}
		else { System.out.println("empty list");}
	}
	public int getNoofNode(){ // ������ ���� ���
		CListNode p=head; // ���� ���� p
		int cnt=0; // ������ �� ���� cnt

		while(p!=null){ // p�� null�� �ƴϸ�  
			cnt++; // ������ ������ �÷���
			p = p.clink;// ���� ���� �̵�
			if(p==tail.clink) // p�� tail.clink(head)�� ������
				break;
		}
		if(cnt == 0) { // empty list �� ���,
			System.out.println("empty list");
		}
		
		return cnt; //cnt�� ��ȯ
	}
	public void addLast(int x){ //�������Ḯ��Ʈ �������� �����߰�
		CListNode cnewNode=new CListNode();
		cnewNode.data=x; // x�� ������ ����� data�� ����
		CListNode p; // �������� p
		p = head; // p�� head�� ����Ű�� ��
		if(p==null) { // p�� null�̸�
			addFirst(x); // �������Ḯ��Ʈ ù��°�� �����߰� �޼ҵ带 ȣ��
		}else { // null�� �ƴϸ�,
			while(p!=tail){ //p�� tail(������ ��)�� �ƴ� �� ����,
				p = p.clink; // �������� p�� ��ġ�� �̵�������
			}
			p.clink = cnewNode; // p�� ��ġ ���� �ּҸ� ���� ������ ���� ���� (����)
			tail = cnewNode; // tail(������ ��)�� ���� ������ ���� ����
			cnewNode.clink = head; // ���� ������ ����� �����ּҰ� head�� ����Ű�� ��(�������� ����)
		}
	}
	public CLinkedList(){	//������
	}
}
