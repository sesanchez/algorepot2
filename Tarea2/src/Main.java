import avlTree.AVLTree;

public class Main {
	
	public static void main(String[] args){
		AVLTree b = new AVLTree();
		b.insert(3);
		b.insert(4);
		b.insert(6);
		b.insert(5);
		b.insert(8);
		b.insert(10);
		b.insert(9);
		b.insert(7);
		b.insert(12);
		System.out.println(b.find(6).toString());
	}
}