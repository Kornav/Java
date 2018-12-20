package level;

class BinaryTreeTraversal {
	public static void main(String args[]) {
		BinaryTree btree;
		BinaryTree ltree;
		BinaryTree rtree;
		BinaryTree ltree2;
		BinaryTree rtree2;
		BinaryTree ltree3;
		BinaryTree rtree3;
		/*
		 * (1) 수업시간에 했던 대로 트리를 만들어보세요. BinaryTree 변수는 원하는 만큼 만들어도 됩니다.
		 */
		ltree3 = new BinaryTree(new BinaryTree(),"F",new BinaryTree());
		rtree3 = new BinaryTree(new BinaryTree(),"G",new BinaryTree());		
		ltree2 = new BinaryTree(ltree3,"D",rtree3);
		rtree2 = new BinaryTree(new BinaryTree(),"E",new BinaryTree());
		rtree = new BinaryTree(new BinaryTree(),"C",new BinaryTree());
		ltree = new BinaryTree(ltree2,"B",rtree2);
		btree = new BinaryTree(ltree,"A",rtree);

		// inorder traversing
		System.out.println("\n중위 이진트리 순회 :");
		btree.inorder(btree);

		// preorder traversing
		System.out.println("\n전위 이진트리 순회 :");
		btree.preorder(btree);

		// postorder traversing
		System.out.println("\n후위 이진트리 순회 :");
		btree.postorder(btree);

		// Test of ArrayQueue
		BinaryTree pointer;
		System.out.println("\n레벨 이진트리 순회 :");

		ArrayQueue Q = new ArrayQueue();
		Q.enqueue(btree);
		/*
		 * (2) ArrayQueue객체의 메소드를 참조해서 레벨 이진트리를 구현하시오
		 */
		BinaryTree b; // Q에 data를 넣기위한 임시 객체 b

		while (!Q.isEmpty()) { // Q가 비어있지 않을 때 까지 반복
			b = (BinaryTree) Q.dequeue(); // 노드의 값을 담기 위함, Q.dequeue의 값이 Object로 반환 되기 때문에 BinaryTree로 캐스팅 해줌.
			if(b.data != null) { // b.data(현재 노드의 값)가 null이 아니면 
				System.out.print(b.data + " "); // b.data를 출력
				Q.enqueue(b.ltree); // 큐에 현재 노드의 ltree를 삽입
				Q.enqueue(b.rtree); // 큐에 현재 노드의 rtree를 삽입
			}
		}
	}
}
