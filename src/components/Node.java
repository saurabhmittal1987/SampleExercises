package components;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private String id;
	private final List<Node> children = new ArrayList<>();
	private final Node parent;

	public Node(Node parent) {
		this.parent = parent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Node> getChildren() {
		return children;
	}

	public Node getParent() {
		return parent;
	}

	public Node addChild(String id) {
		Node node = new Node(this);
		node.setId(id);
		this.getChildren().add(node);
		return node;
	}

	public void printTree(String appender) {
		System.out.println(appender + this.getId());
		for (Node each : this.getChildren()) {
			printTree(appender + appender);
		}
	}
}
