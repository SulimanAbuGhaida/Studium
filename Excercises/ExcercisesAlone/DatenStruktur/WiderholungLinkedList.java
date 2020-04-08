package DatenStruktur;

public class WiderholungLinkedList {
	
	
	private Node firstNode = null;
	
	
	private void add(String data) {
		Node newNode = new Node(data);
		
		if(firstNode == null) {
			this.firstNode = newNode;
			return;
		}
		
		Node currentNode = firstNode;
		while(currentNode.getNextNode()!=null) {
			currentNode = currentNode.getNextNode();
		}
		currentNode.setNextNode(newNode);
	}
	
	public boolean remove (String data) {
		Node newNode = new Node(data) ;
			
			if(firstNode != null) {
				
				if(firstNode.getData().equals(data)) {
					firstNode=firstNode.getNextNode();
					//return true;
				}
				Node currentNode = firstNode;
				while(!(currentNode.getNextNode().getData().equals(data))) {
					currentNode= currentNode.getNextNode();
				}
				currentNode.setNextNode(currentNode.getNextNode().getNextNode());	
			}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private class Node{
		
		private String data;
		private Node nextNode;
		
		public Node(String data){
			this.data = data;
			this.nextNode = nextNode;
		}
		
		
		public void setNextNode(Node nextNode) {
			this.nextNode= nextNode;
		}
		public Node getNextNode() {
			return nextNode;
		}
		
		public String getData() {
			return data;
		}
		
		
		
		
	
	}

}
