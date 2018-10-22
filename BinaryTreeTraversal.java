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
		 * (1) �����ð��� �ߴ� ��� Ʈ���� ��������. BinaryTree ������ ���ϴ� ��ŭ ���� �˴ϴ�.
		 */
		ltree3 = new BinaryTree(new BinaryTree(),"F",new BinaryTree());
		rtree3 = new BinaryTree(new BinaryTree(),"G",new BinaryTree());		
		ltree2 = new BinaryTree(ltree3,"D",rtree3);
		rtree2 = new BinaryTree(new BinaryTree(),"E",new BinaryTree());
		rtree = new BinaryTree(new BinaryTree(),"C",new BinaryTree());
		ltree = new BinaryTree(ltree2,"B",rtree2);
		btree = new BinaryTree(ltree,"A",rtree);

		// inorder traversing
		System.out.println("\n���� ����Ʈ�� ��ȸ :");
		btree.inorder(btree);

		// preorder traversing
		System.out.println("\n���� ����Ʈ�� ��ȸ :");
		btree.preorder(btree);

		// postorder traversing
		System.out.println("\n���� ����Ʈ�� ��ȸ :");
		btree.postorder(btree);

		// Test of ArrayQueue
		BinaryTree pointer;
		System.out.println("\n���� ����Ʈ�� ��ȸ :");

		ArrayQueue Q = new ArrayQueue();
		Q.enqueue(btree);
		/*
		 * (2) ArrayQueue��ü�� �޼ҵ带 �����ؼ� ���� ����Ʈ���� �����Ͻÿ�
		 */
		BinaryTree b; // Q�� data�� �ֱ����� �ӽ� ��ü b

		while (!Q.isEmpty()) { // Q�� ������� ���� �� ���� �ݺ�
			b = (BinaryTree) Q.dequeue(); // ����� ���� ��� ����, Q.dequeue�� ���� Object�� ��ȯ �Ǳ� ������ BinaryTree�� ĳ���� ����.
			if(b.data != null) { // b.data(���� ����� ��)�� null�� �ƴϸ� 
				System.out.print(b.data + " "); // b.data�� ���
				Q.enqueue(b.ltree); // ť�� ���� ����� ltree�� ����
				Q.enqueue(b.rtree); // ť�� ���� ����� rtree�� ����
			}
		}
	}
}
