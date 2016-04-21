package alibaba;

/**
 * Author:Young
 * Class Comment:2015秋季招聘附加题2
 * 大意，插入一个二叉树，求二叉树最大节点和最小节点的绝对值
 * Date: 2016年4月20日下午4:32:52
 */
public class BinaryTree {
	public static void main(String[] args) {
		int[] in = {3,6,8,9,2,12,-88,22};
		BinaryTree bt = new BinaryTree();
		Node n = bt.new Node(in[0]);
		for(int i = 1; i < in.length; i++)
			bt.insert(n,in[i]);
		System.out.println(bt.find_min(n));
		System.out.println(bt.find_max(n));
		
	}
	public int find_min(Node n){
		if(n == null)
			return 0;
		else{
			if(n.left != null)
				return find_min(n.left);
			else{
				int i = n.getValue();
				return i > 0 ? i : -i;
			}
		}
	}
	public int find_max(Node n){
		if(n == null)
			return 0;
		else{
			if(n.right != null)
				return find_max(n.right);
			else{
				int i = n.getValue();
				return i > 0 ? i : -i;
			}
		}
	}
	public void insert(Node n, int i){
		if(n == null)
			System.out.println("树为空");
		else{
			if(i <= n.getValue()){
				if(n.left == null){
					n.left = new Node(i);
					return;
				} else
					insert(n.left, i);
			} else{
				if(n.right == null){
					n.right = new Node(i);
					return;
				}else
					insert(n.right, i);
			}
		}
	}

	public class Node{
		private int value;
		private Node left;
		private Node right;
		public Node(int value){
			this.value = value;
		}
		public Node(){
			
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
	}
}
