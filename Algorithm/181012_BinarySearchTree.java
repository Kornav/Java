// Start of Binary Tree
class BinaryTree {
	BinaryTree llink;
	BinaryTree btree;
	Object data;
	BinaryTree rlink;

	public BinaryTree() {
		llink = null;
		data = null;
		rlink = null;
		// ������
	}

	public BinaryTree(Object data) {
		this.llink = null;
		this.data = data;
		this.rlink = null;
		// ������
	}

	public BinaryTree(BinaryTree llink, Object data, BinaryTree rlink) {
		this.llink = llink;
		this.data = data;
		this.rlink = rlink;
		// ������
	}

	public boolean isEmpty(BinaryTree btree) {
		if (btree == null) {
			return true;
		} else {
			return false;
		}
		// ��������˻�
	}

	public BinaryTree leftSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.llink;
		}
		// ���� ���� ��ȯ
	}

	public BinaryTree rightSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.rlink;
		}
		// ������ ���� ��ȯ
	}

	public Object rootData(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.data;
		}
		// ��Ʈ ����Ÿ ��ȯ
	}

	public void inorder(BinaryTree btree) {
		if (btree == null)
			return;

		inorder(btree.llink);
		System.out.print(btree.data + " ");
		inorder(btree.rlink);
	} // End of inorder

	public void preorder(BinaryTree btree) {
		if (btree == null)
			return;

		System.out.print(btree.data + " ");
		preorder(btree.llink);
		preorder(btree.rlink);

	} // End of Preorder

	public void postorder(BinaryTree btree) {
		if (btree == null)
			return;

		postorder(btree.llink);
		postorder(btree.rlink);
		System.out.print(btree.data + " ");
	} // end of inorder

	// ////////////////////////////////////////////////////////////////
	// ���� Ž��Ʈ�� //
	// ////////////////////////////////////////////////////////////////
	private BinaryTree insertKey(BinaryTree T, String x) {
		// �������Ͻ� �ֻ��� ��忡 ����
		if (isEmpty(T)) {
			T = new BinaryTree(x);// ��ĭ25: ����, ������ ��ũ�� null�� �����ʹ� x�� ����Ʈ�� ����
			return T;// ��ĭ26: ����Ʈ�� ��ȯ
		}
		// �Էµ� ���ڿ��� data���� ������ ���� ��ũ�� ����
		else if (x.compareTo((String) T.data) < 0) {
			T.llink = insertKey(T.llink, x);// ��ĭ27: ���� ��ũ�� �ٽ� insertKey�� ����Ͽ� ��ȯ�� ����
			return T;
		}
		// �Էµ� ���ڿ��� data���� ũ�� ������ ��ũ�� ����
		else if (x.compareTo((String) T.data) > 0) {
			T.rlink = insertKey(T.rlink, x);; // ��ĭ28: ������ ��ũ�� �ٽ� insertKey�� ����Ͽ� ��ȯ�� ����
			return T;
		} else {
			return T;
		}
	}

	public void insert(String x) {
		btree = insertKey(btree, x);
	}
	
	public void deleteKey(String key){
		BinaryTree current = btree;
		BinaryTree parent = current;
		
		while(current.data != key){
			if(current == null) // Ű ���� ���� ��� ����(������ ��尡 ���� ���)
				return;
			parent = current; // parent�� current ����
			if(key.compareTo((String)current.data)<0){ // key���� ��Ʈ���� ���� ���
				current = current.llink; //��ĭ(1)  //  current�� ���� ���� ����Ʈ���� ����
			}
			else{ // key���� ��Ʈ���� ū ���
				current = current.rlink; //��ĭ(2)  //  current�� ���� ������ ����Ʈ���� ����
			}
		}
		
		// ������ Ű ����  ã�� �� �ڽ��� ���� ��
		if(current.llink == null && current.rlink == null){
			if(current == btree) // Ʈ�� ����
				btree = null;
		
			else if(current == parent.llink){
				parent.llink = null;//��ĭ(3)
				current.data = null;
			}
			else{
				parent.rlink = null;//��ĭ(4)
				current.data = null;
			}
		}
		
		//������ Ű ���� ã�� �� �ڽ��� �ϳ��̸鼭 �����ڽĸ� ����
		else if(current.rlink == null){
			if(current == btree)
				btree = current.llink;
			else if(current == parent.llink){
				 parent.llink = current.llink;// ��ĭ (5)
			}
			else{
				parent.rlink = current.llink;// ��ĭ (6)
			}
		}
		
		//������ Ű ���� ã�� �� �ڽ��� �ϳ��̸鼭 �������ڽĸ� ����
		else if(current.llink == null){
			if(current == btree)
				btree = current.rlink;
			else if(current == parent.llink){
				parent.llink = current.rlink;// ��ĭ (7)
			}
			else{
				parent.rlink = current.rlink;// ��ĭ (8)
			}
		}
		
		// ������ Ű ����  ã�� �� �ڽ��� ���� ��
		else{
			BinaryTree Min = MinNode(current);
			if(current == btree)
				btree = Min;
			else if(current == parent.llink){
				parent.llink = Min;// ��ĭ(9)
			}
			else{
				parent.rlink = Min;// ��ĭ(10)
			}
			Min.llink = current.llink;
		}
	}
	
	private BinaryTree MinNode(BinaryTree deleteTree){ // �����ʿ��� ���� ����
		BinaryTree MinParent = null;
		BinaryTree Min = null;
		BinaryTree current = deleteTree.llink;
		while(current != null){
			MinParent = Min; // ��ĭ (11)
			Min = current;
			current = current.llink;
		}
		if(Min != deleteTree.rlink){
			 MinParent = Min.rlink; // ��ĭ(12)
			 Min = deleteTree.rlink;
		}
		return Min;
	}
	
	public BinaryTree find(String x) {
		BinaryTree T = btree;
		int result;

		while (T != null) {
			// �񱳸� �ؼ� data���� �������� ���� ��ũ�� �i�ư�.
			if ((result = x.compareTo((String) T.data)) < 0) {
				T=T.llink; //��ĭ29: ���� ��ũ �Ѿư�
			}
			// �񱳸� �ؼ� data�� �����Ƿ� �˻��� data�� ��ȯ��.
			else if (result == 0) {
				return T;
			}
			// �񱳸� �ؼ� data���� ŭ���� ������ ��ũ�� �i�ư�.
			else {
				T=T.rlink; //��ĭ30: ������ ��ũ �Ѿư�
			}
		}
		return T;
	}
	
	public void printNode(BinaryTree T){
		if(T!=null){
			System.out.print("(");
			printNode(T.llink);
			System.out.print(T.data);
			printNode(T.rlink);
			System.out.print(")");
		}
		
	}
	
	public void printBST(){
		printNode(btree);
		System.out.println();
	}
} // end of BinaryTree class
