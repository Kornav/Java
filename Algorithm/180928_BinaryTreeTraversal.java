class BinaryTreeTraversal {
	public static void main(String args[]) {
		BinaryTree btree;
		BinaryTree ntree;
		BinaryTree ltree;
		BinaryTree rtree;
		BinaryTree current;
		/*
		 * (1) 수업시간에 했던 대로 트리를 만들어보세요. BinaryTree 변수는 원하는 만큼 만들어도 됩니다.
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
		System.out.println("\n중위 이진트리 순회 :");
		btree.inorder(btree);

		BinaryTree ctree = new BinaryTree();
		System.out.println("\n트리 복사 : ");
		ctree = ctree.copy(btree);
		ctree.inorder(ctree);
		System.out.println();
		
		
		System.out.println("\n새로운 트리 : ntree 중위 순회");
		ntree.inorder(ntree);
		System.out.println();
		System.out.println("\n동등성 결과 btree & ctree");
		System.out.println(btree.equal(btree,ctree));
		System.out.println("\n동등성 결과 btree & ntree");
		System.out.println(btree.equal(btree,ntree));
		System.out.println();
		
		System.out.println("\nbtree isLeaf()");
		System.out.println(btree.isLeaf());
		
		System.out.println("\nbtree contains()");
		System.out.println("A포함? : "+btree.contains("A")); // t
		System.out.println("H포함? : "+btree.contains("H")); // t
		System.out.println("G포함? : "+btree.contains("G")); // t
		System.out.println("K포함? : "+btree.contains("K")); // f
		System.out.println("5포함? : "+btree.contains("5")); // f
	}

}
