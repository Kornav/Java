class arrayStack {
	int max = 10;
	int stack[] = new int[max];
	private int top;

	public arrayStack() {
		top = -1;
	}

	public void stackOverflow() {
		max += 10; // ������ ũ�⸦ 10����
		System.out.println("Stack size +10");
		int tmpstack[] = new int[max]; // 10���� ��Ų������ tmp�迭 ����
		for(int i=0;i<=top;i++){
			tmpstack[i] = stack[i]; // ���� �Ű���
		}
		stack = tmpstack; // �迭 ��ü�� �Ű���
	}

	void push(int x) {
		top = top + 1; // top�� ��ġ �÷���
		if (top >= max-1) { // top�� max���� ũ��
			System.out.println("Stack Overflow"); // Overflow ��¹�
			this.stackOverflow(); // stasckOverflow() ȣ��
			this.push(x); // ���� push
		}
		else { // �׷��� ������
			stack[top] = x; // stack�� �� �־���
		}
	}

	int peek() {
		if(top < 0){ // top�� 0 ���� ������
			System.out.println("Stack underflow"); // stack�� �ƹ��͵� ���� ���
			return -1;
		}// �׷���������
		return stack[top]; // ���� ���� �ڸ��� �ڷ� return 
	}

	int pop() {
		int y = 0; // y�� �ʱ�ȭ
		if (top < 0) { // top�� 0 ���� ������
			System.out.println("Stack Underflow"); // empty ���
		}
		else { // ������� ������
			y = stack[top]; // y�� stack�� ����
			top = top - 1; // top ��ĭ ������
		}
		return y; // stack �� �� �� return
	}

	void remove() {
		top--; // top ��ĭ ������
	}

	boolean empty() { // ����ִ��� �Ⱥ���ִ��� üũ
		if (top < 0) { // top�� 0���� ������
			return true; // �������
		} else // 0�̰ų� ũ��
			return false; // ������� ����
	}
}
