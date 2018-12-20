
public class linkStack {
	listNode top;

	public linkStack() {

	} // 생성자

	void push(int x) { // push
		listNode newNode = new listNode(); // 노드생성
		newNode.data = x; // 노드에 data 값 대입
		if (top == null) { // stack empty
			top = newNode;
			top.link = null;
		}
		else {
			newNode.link = top; // 주소를 top을 가르키게 함
			top = newNode; // top에 newNode를 넣어줌
		}
	}

	int pop() { //pop
		int x;
		if (top == null) { // top에 아무것도 없으면
			System.out.println("Stack underflow"); // empty stack
			return -1;
		}
		else { // 그렇지 않으면
			x = top.data; // x에 top data를 대입
			top = top.link; // top에 top의 다음주소를 넣어줌
			return x; // data값 return
		}
	}
	
	int peek(){ // peek
		if(top == null){ // top에 아무것도 없으면
			System.out.println("Stack underflow"); // empty stack
			return -1;
		}
		else{
			return top.data; // 그렇지 않으면 제일 위 data return
		}
	}
	void delete(){ // delete
		if(top == null){ // top에 아무것도 없으면
			System.out.println("Empty Stack!"); // empty stack
			return;
		}
		top=top.link; // top은 top의 다음주소 ( 제거 )
	}
}
