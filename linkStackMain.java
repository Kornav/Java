

public class linkStackMain {
	public static void main(String args[]){
		linkStack stack2=new linkStack();
		stack2.push(10);
		stack2.push(20);
		stack2.push(30);
		System.out.println("Before delete Now Top (Peek) : "+stack2.peek());
		stack2.delete();
		System.out.println("After delete Now Top (Peek) : "+stack2.peek());
		stack2.push(30);
		
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
	}
}
