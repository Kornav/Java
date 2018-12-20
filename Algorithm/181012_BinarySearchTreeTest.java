
public class BinarySearchTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree T = new BinaryTree();
		T.insert("S");
		T.insert("J");
		T.insert("B");
		T.insert("D");
		T.insert("U");
		T.insert("M");
		T.insert("R");
		T.insert("Q");
		T.insert("A");
		T.insert("G");
		T.insert("E");
		// 구축된 BST를 프린트
		System.out.println(" The Tree is:");
		T.printBST();
		System.out.println();
		
		T.deleteKey("A");
		T.printBST();
		System.out.println();
		
		T.deleteKey("B");
		T.printBST();
		System.out.println();
		
		System.out.println("Find the root of the Tree is : ");
		BinaryTree F = T.find("S");
		System.out.println(F.data);
		
		System.out.println("Search For \"R\" ");
		BinaryTree N = T.find("R");
		System.out.println("Key of node found = " + N.data);
		System.out.println();

		System.out.println("Search For \"C\" ");
		BinaryTree C = T.find("C");
		if (C != null) {
			System.out.println("Key of node found = " + C.data);
		} else {
			System.out.println("Node that was found = null");
		}
		System.out.println();

	}
}
