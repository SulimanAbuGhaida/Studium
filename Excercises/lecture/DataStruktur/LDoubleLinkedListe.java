package DataStruktur;

import lecture.datastructures.DoubleLinkedList.Node;

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
    
    
    private Node<D> findNode(D data){
    	
    	if(firstNode!=null) {
    		
    		Node<D> currentNode = firstNode;
    		do {
    			if(currentNode.getData().equals(data)) {
    				return currentNode;
    			}
    			currentNode = currentNode.getNextNode();
    		}while(currentNode.getNextNode()!=null);
    	}
    	
    	
    	return null;
    }
    
    
    public boolean contains(D data) {
 	Node<D> currentNode = new Node<D>(data);
    	
    	if(this.firstNode==null && this.lastNode==null) {
    		return false;
    	}
    	if(currentNode == firstNode) {
			return true;	
			}
    		do {
    			currentNode = currentNode.getNextNode();{
    			if(currentNode.getData().equals(data))
    				return true;
    			}
    			
    		}while(currentNode.nextNode != null);
			return false;
    	}
    
//   @Override
//    public String toString() {
//     	if(this.firstNode==null && this.lastNode==null) {
//    		return "null";
//    	}
//     	Node<D> currentNode = new Node<D>(firstNode.getData());
//     	
//     	do { System.out.println(currentNode.getData().toString());
//     	currentNode = currentNode.getNextNode();	
//     	}while(currentNode.nextNode !=null);
//     	return "done!";
//    }
    
    @Override
    public String toString() {
        if(firstNode == null){
            return "Empty List";
        }

        return toString(firstNode);
    }

    private String toString(Node<D> node){
        String ausgabe = "";
        ausgabe = ausgabe + node.getData() + "\n";

        if(node.getNextNode() != null) {
            ausgabe = ausgabe + toString(node.getNextNode());
        }

        return ausgabe;
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
