package DataStruktur;

public class LinkedListe {
	
	private Node firstNode =null;
	
	public void add(String data) {
		Node newNode = new Node(data);
		
		if(firstNode==null) {
			firstNode = newNode;
		}
		
		Node currentNode = new Node(data);
		while(currentNode.getNextNode()!=null) {
			
			currentNode= currentNode.getNextNode();	
		}
		currentNode.setNextNode(newNode);
	}
	
	public boolean remove(String data) {
		
		if(firstNode == null) {
			return false;
		}
		
		if(firstNode.getData().equals(data)) {
			firstNode = firstNode.getNextNode();
			return true;
		}
		Node currentNode = new Node(data);
		while(!currentNode.getNextNode().equals(data)) {
			currentNode= currentNode.getNextNode();
		}
		currentNode.setNextNode(currentNode.getNextNode().getNextNode());
		return true;
	}

	public class Node{
		private String data;
		private Node nextNode;
		
	
	public Node (String data) {
		this.data = data;
		this.nextNode = null;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node getNextNode() {
		return this.nextNode;
	}
	
	public String getData() {
		return data;
	}
	}
	
	
}
