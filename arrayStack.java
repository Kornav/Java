class arrayStack {
	int max = 10;
	int stack[] = new int[max];
	private int top;

	public arrayStack() {
		top = -1;
	}

	public void stackOverflow() {
		max += 10; // 스택의 크기를 10증가
		System.out.println("Stack size +10");
		int tmpstack[] = new int[max]; // 10증가 시킨것으로 tmp배열 선언
		for(int i=0;i<=top;i++){
			tmpstack[i] = stack[i]; // 값을 옮겨줌
		}
		stack = tmpstack; // 배열 자체를 옮겨줌
	}

	void push(int x) {
		top = top + 1; // top의 위치 올려줌
		if (top >= max-1) { // top이 max보다 크면
			System.out.println("Stack Overflow"); // Overflow 출력문
			this.stackOverflow(); // stasckOverflow() 호출
			this.push(x); // 다음 push
		}
		else { // 그렇지 않으면
			stack[top] = x; // stack에 값 넣어줌
		}
	}

	int peek() {
		if(top < 0){ // top이 0 보다 작으면
			System.out.println("Stack underflow"); // stack에 아무것도 없음 출력
			return -1;
		}// 그렇지않으면
		return stack[top]; // 가장 위에 자리한 자료 return 
	}

	int pop() {
		int y = 0; // y값 초기화
		if (top < 0) { // top이 0 보다 작으면
			System.out.println("Stack Underflow"); // empty 출력
		}
		else { // 비어있지 않으면
			y = stack[top]; // y에 stack값 대입
			top = top - 1; // top 한칸 내려줌
		}
		return y; // stack 맨 위 값 return
	}

	void remove() {
		top--; // top 한칸 내려줌
	}

	boolean empty() { // 비어있는지 안비어있는지 체크
		if (top < 0) { // top이 0보다 작으면
			return true; // 비어있음
		} else // 0이거나 크면
			return false; // 비어있지 않음
	}
}
