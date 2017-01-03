package mypackage;

import components.Node;

public class TreeImplementation {

	public static void main(String[] args) {
		Node treeRootNode = new Node(null);
		treeRootNode.setId("root");
		// add child to root node
		Node childNode = treeRootNode.addChild("child-1");
		// add child to the child node created above
		childNode.addChild("child-11");
		childNode.addChild("child-12");
		childNode.addChild("child-13");
		// add child to root node
		Node child2 = treeRootNode.addChild("child-2");
		// add child to the child node created above
		child2.addChild("child-21");

		treeRootNode.printTree(" ");

	}

	
}
