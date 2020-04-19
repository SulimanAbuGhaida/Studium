package DataStruktur;

import java.util.Comparator;


public class LTree<D extends Comparable<D>> {
	
	private Node<D> root = null;
	
// this is add-Methos with iterative from Suliman
//	public void add(D data) {
//		Node<D> newNode = new Node<D>(data);
//		
//		Node<D> currentNode = root;
//		Node<D> parentNode = null;
//		
//		while(currentNode!=null) {
//			  parentNode = currentNode;
//			  if(currentNode.getData().compareTo(newNode.getData())==0) {
//				  System.out.println("same items!");
//			  }
//			  else if(currentNode.getData().compareTo(newNode.getData())<0) {
//				currentNode = currentNode.getLeftNode();
//			}else if(currentNode.getData().compareTo(newNode.getData())>0){
//				currentNode = currentNode.getRightNode();
//			}
//		}
//		
//		if(parentNode.getData().compareTo(data)<0) {
//			parentNode.setRightNode(newNode);
//			}else 
//			
//				parentNode.setLeftNode(newNode);
//			
//		}
	
	//this is add Method with Rekusion from Berg-Neels
	public void add(D data) {
		if(data == null) {
			return;
		}
		if(root == null) {
			root = new Node<D>(data);
			return;
		}
			//start rekusrion
			add(root, data);
		
		}
	
	public void add(Node<D> currentNode ,D data) {
		System.out.println("Rekosion start an Element: "+ currentNode.getData());
		int comparETO = (currentNode.getData().compareTo(data));
		
		if(comparETO> 0) {
			if(currentNode.getLeftNode() != null) {
				add(currentNode.getLeftNode(), data);
			}else {
				currentNode.setLeftNode(new Node<D> (data));
				//size++;
			}
		}
		if(comparETO<0) {
			if(currentNode!=null) {
			add(currentNode.getRightNode(), data);
		}else {
			currentNode.setRightNode(new Node<D> (data));
			//size ++;
		}
		}
		System.out.println("Rekosion Ende an Element: "+ currentNode.getData());
	}
	

//   contains with itrative Method from Suliman
//	public boolean contains(D data) {
//		Node<D> currentNode = new Node<D>(data);
//		
//		if(root==null) {
//			return false;
//		}
//		if(currentNode ==root) {
//			return true;
//		}
//		do {
//			if(currentNode.getData().compareTo(data)<0) {
//				currentNode=currentNode.getLeftNode();
//			}else if(currentNode.getData().compareTo(data)>0) {
//				currentNode= currentNode.getRightNode();
//			}else if(currentNode.getData().compareTo(data)==0){
//				return true;
//			}
//		}while(currentNode!=null);
//		
//		return false;
//	}
	
	//contains with Rekusion from the doctor
	public boolean contains (D data) {
		return contains(root, data);	
	}
	
	public boolean contains(Node<D> currentNode ,D data) {
		if (currentNode== null)
			return false;
			if (currentNode.equals(data)) {
				return true;
			}
			if(((Comparable)currentNode.getData()).compareTo(data)<0) {
				return contains(currentNode.getRightNode(), data);
			}else {
				return contains(currentNode.getLeftNode(),data);		
	}}
	

	
	public D find(D data) {
		
		if(root==null) {
			return null;
		}
		Node<D> currentNode = root;
		while(currentNode!=null) {
			if(currentNode.getData().equals(data)) {
				return currentNode.getData();
			}else if(currentNode.getData().compareTo(data)>0) {
				currentNode =currentNode.getRightNode();
			}else {
				currentNode = currentNode.getLeftNode();
			}
		}
		return currentNode.getData();
	}
	
//	public int size() {
//	int i = 1;
//		int getSize(Node<D> root){
//			if(root==null){
//				return 0;
//			}
//			 return 1 +  getSize(root.getLeftNode()) + getSize(root.getRightNode());
//	}return 0;
//	}
	
	
	
	public void printInOrder() {
		if(root==null) {
		return;
		}else{
			System.out.println("InOrderAufgabe");
			printInOrder(root);
		}
	}
	
	public void printInOrder(Node<D> currentNode) {
		if(currentNode.getLeftNode()!= null) {
			printInOrder(currentNode.getLeftNode());
		}
		System.out.println(currentNode.getData());
		
		if(currentNode.getRightNode()!= null) {
			printInOrder(currentNode.getRightNode());
		}
		System.out.println(currentNode.getData());		
	}
	
	public void printPreOrder() {
		if(root ==null) {
			return;
		}else {
			printPreOrder(root);
		}
	}
	
	public void printPreOrder(Node<D> currentNode) {
		System.out.println(currentNode.getData());
		if(currentNode.getLeftNode()!= null) {
			printInOrder(currentNode.getLeftNode());
		}
		if(currentNode.getRightNode()!=null) {
			printInOrder(currentNode.getRightNode());
		}
	}
	
	
	public void printPostOrder() {
		if(root== null) {
			return;
		}
		printPostOrder(root);
	}
	public void printPostOrder(Node<D> currentNode) {
		if(currentNode.getLeftNode()!=null) {
			printPostOrder(currentNode.getLeftNode());
		}
		if(currentNode.getRightNode()!=null) {
			printPostOrder(currentNode.getRightNode());
		}
		System.out.println(currentNode.getData());
	}
	
	
	
	
	
	class Node<D>{
		private D data;
		private Node<D> leftNode;
		private Node<D> rightNode;
		
		
		private Node(D data) {
			this.data = data;
		};
		
		public D getData() {
			return this.data;
		}
		public void setLeftNode(Node<D> leftNode) {
			this.leftNode = leftNode;
		}
		public Node<D> getLeftNode(){
			return leftNode;
		}
		
		public void setRightNode(Node<D> rightNode) {
			this.rightNode=rightNode;
		}
		public Node<D> getRightNode(){
			return rightNode;
		}
	}





	public Integer size() {
		// TODO Auto-generated method stub
		return null;
	}







}
