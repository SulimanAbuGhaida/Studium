package DataStruktur;

import DataStruktur.LinkedListe.Node;

public class LStack<D> {
	
	Node<D> topNode = null;
	
	//lege ein Item auf den Stack
	public void push(D data) {
		
	}

	//nehme daa oberste element aus den Stack
	public D pop() {
		return null;
	}
	
	public D peek() {
		return null;
	}
	
	private class Node<D>{
		private D data;
		private Node<D> nextNode;
		
		public Node(D data){
			this.data= data;
		}
		public Node<D> getNextNode(){
			return nextNode;
		}
		public D getNextData() {
			return this.data;
		}
		
	}
}
