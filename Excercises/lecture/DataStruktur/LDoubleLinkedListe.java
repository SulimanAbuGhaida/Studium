package DataStruktur;

public class LDoubleLinkedListe<D> {
	
	private Node<D> firstNode = null;
    private Node<D> lastNode = null;
    
    public void add(D data) {
    	
    	Node<D> newNode = new Node<D>(data);
    	
    	if(firstNode ==null && lastNode ==null) {
    		firstNode = newNode;
    		lastNode = newNode;
    	}else {
    		this.lastNode.setNaxtNode(newNode);;
    		newNode.setPrevNode(this.lastNode);
    		this.lastNode= newNode;
    	}
    }
    public void addFirst(D data) {
    	Node<D> newNode = new Node<D>(data);
    	if(firstNode == null && lastNode ==null) {
    		firstNode = newNode;
    		lastNode = newNode;
    	}else {
    		this.firstNode.setPrevNode(newNode);
    		newNode.setNaxtNode(firstNode);
    		this.firstNode = newNode;
    	}
    }
    public boolean remove(D data) {
    	Node<D> currentNode = new Node<D>(data);
    	
    	if(this.firstNode==null && this.lastNode==null) {
    		return false;
    	}
    		do {
    			if(currentNode.getData().equals(data)){
    				if(currentNode == firstNode) {
    					currentNode.getNextNode().setPrevNode(null);
    					 this.firstNode =currentNode.getNextNode() ;
    				}else if(currentNode ==lastNode) {
    					currentNode.prevNode.setNaxtNode(null);
    					this.lastNode = currentNode.getPrevNode();
    				}
    				currentNode.getPrevNode().setNaxtNode(currentNode.getNextNode());
    				currentNode.getNextNode().setPrevNode(currentNode.getPrevNode());
    			}
    			currentNode = currentNode.getNextNode();
    		}while(currentNode.nextNode != null);
			return true;
    	}
    
    
    public boolean contains(D data) {
    	return false;
    }
    
    @Override
    public String toString() {
    	return"Ausgabe komplette Liste";
    }
    
	
private class Node<D>{
	private Node<D> prevNode;
	private Node<D> nextNode;
	private D data;
	
	public Node(D data) {
		this.data=data;
		prevNode = null;
		nextNode = null;
		}
	
	public D getData() {
		return this.data = data;
		
	}
	public void setNaxtNode(Node<D> nextNode) {
		this.nextNode = nextNode;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setPrevNode(Node<D> PrevNode) {
		this.prevNode = PrevNode;
	}
	public Node getPrevNode() {
		return prevNode;
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
