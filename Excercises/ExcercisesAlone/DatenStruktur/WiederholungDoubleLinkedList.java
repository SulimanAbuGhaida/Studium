package DatenStruktur;



public class WiederholungDoubleLinkedList<D> {
	
	private Node<D> firstNode = null;
	private Node<D> lastNode = null;
	
	public void add(D data) {
		Node<D> newNode = new Node<D>(data);
		
		if(this.firstNode==null && this.lastNode==null) {
			this.firstNode = newNode;
			this.lastNode = newNode;
		}else {
			this.lastNode.setNextData(newNode);
			newNode.setPrevNode(this.lastNode);
			this.lastNode= newNode;
		}
		}
		public void addFirst(D data) {
			Node<D> newNode = new Node<D>(data);
			if(this.firstNode==null && this.lastNode==null) {
				this.firstNode=newNode;
				this.lastNode=newNode;
			}else {
				this.firstNode.setPrevNode(newNode);
				newNode.setNextData(firstNode);
				firstNode=newNode;
			}
		}
		
			public boolean remove(D data) {
				
				if(!(firstNode==null && lastNode==null)) {

					Node<D> currentNode = this.firstNode;
					do {
						if(currentNode.getData().equals(data)) {
							if(currentNode==firstNode) {
								currentNode.getNextNode().setPrevNode(null);
								this.firstNode = currentNode.getNextNode();
							}
							if(currentNode ==lastNode) {
								currentNode.getPrevNode().setNextNode(null);
								this.lastNode= currentNode.getPrevNode();
								return true;
							}
							
							currentNode.getPrevNode().setNextNode(currentNode.getNextNode());
							currentNode.getNextNode().setPrevNode(currentNode.getPrevNode());
							return true;
						}
						
					
					
					if(firstNode.getData().equals(data)) {
						firstNode.setNextNode(null);
					}
				
					currentNode = currentNode.getNextNode();
					}while(currentNode.getNextNode()!=null);
				}
				return false;
			}
			
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 private class Node<D>{
	 
	private D data;;
	private Node<D> prevNode;
	private Node<D> nextNode;
	
	public Node(D data) {
			this.data= data;
			prevNode = null;
			nextNode = null;
		}
	
	public D getData() {
		return data;
	}
	public void setNextNode(Node<D> nextData) {
		this.nextNode=nextNode;
	}
	public Node getNextNode() {
		return nextNode;	
	}
	 public void setPrevNode(Node<D> prevNode) {
		 this.prevNode= prevNode;
	 }
	 public Node<D> getPrevNode(){
		 return prevNode;
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
	}


