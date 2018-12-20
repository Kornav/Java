
public class BinaryTree {
	int left;
	int right;
	
	public int leftSubTree(int bt){
		left = bt*2;
		return left;
	}
	public int rightSubTree(int bt){
		right = bt*2+1;
		return right;
	}
}
