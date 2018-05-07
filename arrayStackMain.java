
public class arrayStackMain {
	public static void main(String arg[]){
		int i;
		arrayStack stack1 = new arrayStack();
		
		
		for(i=0;i<=5;i++){
		 
			stack1.push(i*2);
		}
		
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		stack1.push(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println("Before remove Now Top (Peek) : "+stack1.peek());
		stack1.remove();
		System.out.println("After remove Now Top (Peek) : "+stack1.peek());
		
		
		while(!stack1.empty()){
		
			System.out.println(stack1.pop()+", ");
		}
		
	}
}
