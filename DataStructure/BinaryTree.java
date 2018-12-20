class BinaryTree {
	BinaryTree ltree;
	// BinaryTree btree;
	Object data;
	BinaryTree rtree;

	public BinaryTree() {
		ltree = null;
		data = null;
		rtree = null;
		// ������
	}

	public BinaryTree(BinaryTree ltree, Object data, BinaryTree rtree) {
		this.ltree = ltree;
		this.data = data;
		this.rtree = rtree;
		// ������
	}

	public boolean isEmpty(BinaryTree btree) {
		if (btree == null)
			return true;
		else
			return false;
		// ��������˻�
	} // End of isEmpty

	public BinaryTree leftSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true)
			return null;
		else
			return btree.ltree;
		// ���� ���� ��ȯ
	} // End of leftSubTree

	public BinaryTree rightSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true)
			return null;
		else
			return btree.rtree;
		// ������ ���� ��ȯ
	} // End of rightSubTree

	public Object rootData(BinaryTree btree) {
		if (isEmpty(btree) == true)
			return null;
		else
			return btree.data;
		// ��Ʈ ����Ÿ ��ȯ
	} // End of rootData

	public void inorder(BinaryTree btree) {
		if (btree.data == null)
			return;

		inorder(btree.ltree);
		System.out.print(btree.data + " ");
		inorder(btree.rtree);
	} // End of inorder

	public void preorder(BinaryTree btree) {
		if (btree.data == null)
			return;

		System.out.print(btree.data + " ");
		preorder(btree.ltree);
		preorder(btree.rtree);
	} // End of Preorder

	public void postorder(BinaryTree btree) {
		if (btree.data == null)
			return;

		postorder(btree.ltree);
		postorder(btree.rtree);
		System.out.print(btree.data + " ");
	} // End of PostOrder
	/********************************
	 *  		Ʈ�� ����				*
	 * ******************************/
	
	public BinaryTree copy(BinaryTree btree) {
		BinaryTree Stree;
		BinaryTree ltree;
		BinaryTree rtree;

		Stree = new BinaryTree();

		if (btree.data != null) {
			ltree = copy(btree.ltree);
			rtree = copy(btree.rtree);
			Stree = new BinaryTree(ltree, btree.data, rtree);
		}
		return Stree;
	}
	/********************************
	 *  		��� ��				*
	 * ******************************/
	public Boolean equal(BinaryTree btree, BinaryTree ctree) {
		boolean ans = false;
		if ((btree.data == null) && (ctree.data == null)) {
			ans = true;
		}else if((btree.data != null) && (ctree.data != null)){
			if(btree.data == ctree.data) {
				ans = equal(btree.ltree,ctree.ltree);
			}
			if(ans) {
				ans = equal(btree.rtree,ctree.rtree);
			}
		}
		return ans;
	}
	/********************************
	 *  		�ܸ���� ���� Ȯ��			*
	 * ******************************/
	public boolean isLeaf() {
		return ltree == null && rtree == null;
	}
	
	/********************************
	 *  		���� ���� ����			*
	 * ******************************/
	
	public boolean contains(Object object) {
		if (this.data == object)  return true; 
		if (this.ltree != null && this.ltree.contains(object))
			return true;
		if (this.rtree != null && this.rtree.contains(object))
			return true;
		return false;
	}
	
} // End of Class BinaryTree
