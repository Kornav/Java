/////////////////////////////////////
/////	���� 9.					/////
/////			Shift.java		/////
/////////////////////////////////////


public class Shift {

	public void Shift() {//������
		// default
	}

	public LinkedList shiftNode(ListNode _head) {
		LinkedList L = new LinkedList(); // ����Ʈ ����
		ListNode pre, cur; // ���� ���� ���� ��带 
		pre = _head; // ���� ��带 �����
		cur = _head.link; // ���� ��带 �����
		while (cur.link != null) { // ����� ������
			pre = cur; // ���� ���� �̵� (�� �� ��� ���� �̵���Ŵ)
			cur = cur.link; // �� ������ �̵���Ŵ
		}
		cur.link = _head; // ������ �� ����� ���� �ּҸ� ù ��带 �־���
		pre.link = null; // ��������� �ּҸ� ������
		_head = cur; // Shift�� List�� _head�� �ٽ� �־���
	
		System.out.print("(");
		while (_head != null) { // _head�� null�� �� ����
			if (_head.data != null) { // data�� null�� �ƴϸ�
				System.out.print(_head.data); // data�� ����ϸ鼭
				L.addLastNode(_head.data); // ���� ��ü�� ��ȯ�� L�� data �־���
			} else {
				System.out.print(_head.value);
			}
			_head = _head.link; // ���� ���� �̵�
			if (_head != null) {
				System.out.print(", ");
			}

		}
		System.out.println(")");
		return L; // ������ ��忡 ��ȯ
	}
}
