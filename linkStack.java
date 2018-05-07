
public class linkStack {
	listNode top;

	public linkStack() {

	} // ������

	void push(int x) { // push
		listNode newNode = new listNode(); // ������
		newNode.data = x; // ��忡 data �� ����
		if (top == null) { // stack empty
			top = newNode;
			top.link = null;
		}
		else {
			newNode.link = top; // �ּҸ� top�� ����Ű�� ��
			top = newNode; // top�� newNode�� �־���
		}
	}

	int pop() { //pop
		int x;
		if (top == null) { // top�� �ƹ��͵� ������
			System.out.println("Stack underflow"); // empty stack
			return -1;
		}
		else { // �׷��� ������
			x = top.data; // x�� top data�� ����
			top = top.link; // top�� top�� �����ּҸ� �־���
			return x; // data�� return
		}
	}
	
	int peek(){ // peek
		if(top == null){ // top�� �ƹ��͵� ������
			System.out.println("Stack underflow"); // empty stack
			return -1;
		}
		else{
			return top.data; // �׷��� ������ ���� �� data return
		}
	}
	void delete(){ // delete
		if(top == null){ // top�� �ƹ��͵� ������
			System.out.println("Empty Stack!"); // empty stack
			return;
		}
		top=top.link; // top�� top�� �����ּ� ( ���� )
	}
}
