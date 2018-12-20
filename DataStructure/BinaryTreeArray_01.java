public class BinaryTreeArray {
	public static void main(String args[]){
		int left;
		int right;
		int bt = 1;
		int current;
		
		String[] stack = new String[30];
		BinaryTree t = new BinaryTree();
		
		stack[bt] = "A";
		left = t.leftSubTree(bt);//2 
		right = t.rightSubTree(bt);//3
		stack[left] = "B";
		stack[right] = "C";
		current = right; // 3
		right = t.rightSubTree(left); // 5
		left = t.leftSubTree(left); // 4
		stack[left] = "D"; // 4
		stack[right] = "E"; // 5
		left = t.leftSubTree(current); // 6
		stack[left] = "F";
		left = t.leftSubTree(right); // 10
		stack[left] = "G";
		right = t.rightSubTree(left);
		stack[right] = "H";
		
		for(int i=0;i<stack.length;i++){
			System.out.println("bt["+i+"]"+stack[i]);
		}
	}
}
