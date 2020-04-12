package DataStruktur;

import java.util.Comparator;

public class LTree<D extends Comparable<D>> {
	
	private Node<D> root = null;
	
	public void add(D data) {
		Node<D> newNode = new Node<D>(data);
		
		Node<D> currentNode = root;
		Node<D> parentNode = null;
		
		while(currentNode!=null) {
			  parentNode = currentNode;
			if(currentNode.getData().compareTo(newNode.getData())<0) {
				currentNode = currentNode.getLeftNode();
			}else if(currentNode.getData().compareTo(newNode.getData())>0){
				currentNode = currentNode.getRightNode();
			}
		}
		
		if(parentNode.getData().compareTo(data)<0) {
			parentNode.setRightNode(newNode);
			}else if (parentNode.getData().compareTo(data)>0) {
			
				parentNode.setLeftNode(newNode);
			}else System.out.println("same items");
		}
		
	
		
	
	public boolean contains(D data) {
		Node<D> currentNode = new Node<D>(data);
		
		if(root==null) {
			return false;
		}
		if(currentNode ==root) {
			return true;
		}
		do {
			if(currentNode.getData().compareTo(data)<0) {
				currentNode=currentNode.getLeftNode();
			}else if(currentNode.getData().compareTo(data)>0) {
				currentNode= currentNode.getRightNode();
			}else if(currentNode.getData().compareTo(data)==0){
				return true;
			}
		}while(currentNode!=null);
		
		return false;
	}
	
	
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
	
	public int size() {
	int i = 1;
		int getSize(Node root){
			if(root==null){
				return 0;
			}
			 return 1 +  getSize(root.getLeftNode()) + getSize(root.getRightNode());
	}return 0;
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







}
