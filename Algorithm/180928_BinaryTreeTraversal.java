class BinaryTreeTraversal {
	public static void main(String args[]) {
		BinaryTree btree;
		BinaryTree ntree;
		BinaryTree ltree;
		BinaryTree rtree;
		BinaryTree current;
		/*
		 * (1) �����ð��� �ߴ� ��� Ʈ���� ��������. BinaryTree ������ ���ϴ� ��ŭ ���� �˴ϴ�.
		 */
		rtree = new BinaryTree(new BinaryTree(), "H", new BinaryTree());
		btree = new BinaryTree(new BinaryTree(), "G", rtree);

		ltree = btree;
		btree = new BinaryTree(ltree, "E", new BinaryTree());

		ltree = new BinaryTree(new BinaryTree(), "D", new BinaryTree());
		rtree = btree;
		btree = new BinaryTree(ltree, "B", rtree);

		ltree = new BinaryTree(new BinaryTree(),"F",new BinaryTree());
		current = new BinaryTree(ltree, "C",new BinaryTree());
		
		ltree = btree;
		rtree = current;
		btree = new BinaryTree(ltree, "A", rtree);
		
		rtree = new BinaryTree(new BinaryTree(), "H", new BinaryTree());
		ntree = new BinaryTree(new BinaryTree(), "G", rtree);
		
		ltree = ntree;
		ntree = new BinaryTree(ltree, "C", new BinaryTree());
		ltree = new BinaryTree(new BinaryTree(), "B", new BinaryTree());
		rtree = ntree;
		ntree = new BinaryTree(ltree, "A", rtree);
		// inorder traversing
		System.out.println("\n���� ����Ʈ�� ��ȸ :");
		btree.inorder(btree);

		BinaryTree ctree = new BinaryTree();
		System.out.println("\nƮ�� ���� : ");
		ctree = ctree.copy(btree);
		ctree.inorder(ctree);
		System.out.println();
		
		
		System.out.println("\n���ο� Ʈ�� : ntree ���� ��ȸ");
		ntree.inorder(ntree);
		System.out.println();
		System.out.println("\n��� ��� btree & ctree");
		System.out.println(btree.equal(btree,ctree));
		System.out.println("\n��� ��� btree & ntree");
		System.out.println(btree.equal(btree,ntree));
		System.out.println();
		
		System.out.println("\nbtree isLeaf()");
		System.out.println(btree.isLeaf());
		
		System.out.println("\nbtree contains()");
		System.out.println("A����? : "+btree.contains("A")); // t
		System.out.println("H����? : "+btree.contains("H")); // t
		System.out.println("G����? : "+btree.contains("G")); // t
		System.out.println("K����? : "+btree.contains("K")); // f
		System.out.println("5����? : "+btree.contains("5")); // f
	}

}
