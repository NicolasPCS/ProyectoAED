package org.sim;

public class ListLinked <T> implements TDAList <T> {
	private Node <T> first;
	private int count;
	
	public ListLinked() {
		this.first = null;
		this.count = 0;
	}
	
	public boolean isEmptyList() {
		return this.first == null;	
	}
	
	public int length() {
		return this.count;	
	}
	
	public void destroyList() {
		while(this.first != null)
			this.first = this.first.getNext();
		this.count = 0;
	}
	
	public int search(T x) {
		Node <T> aux = this.first;
		for(int i = 0; aux != null; aux = aux.getNext(), i++)
			if(aux.getData().equals(x))
				return i;
		return -1;			
	}
	
	public void insertLast(T x) {
		if(this.isEmptyList())
			this.insertFirst(x);
		else {
			Node <T> lastNode = getLastNode();
			lastNode.setNext(new Node <T> (x));
			this.count++;
		}
	}
	
	//PreCondition: List is not empty
	private Node <T> getLastNode(){
		Node <T> aux = this.first;
		while(aux.getNext() != null)
			aux = aux.getNext();
		return aux;
	}
	
	public void insertFirst(T x) {
		this.first = new Node <T> (x, this.first);
		this.count++;
	}
	
	public void remove(T x) {
		if(first==null)
            System.out.println("The List Is Empty");
        else{
            Node<T> current = first;
            Node<T> previous = current.getNext() ;
            while(current!=null && !current.getData().equals(x)){
                previous=current;
                current=current.getNext();
            }
            if(current == first && current.getData().equals(x)){
                first = first.getNext();
            }else if(current != null)
                previous.setNext(current.getNext());
        }

        count--;
		
	}
	
	public int ocurrencias(T x) {
		Node <T> aux = this.first;
		for(int i = 0; aux != null; aux = aux.getNext(), i++)
			if(aux.getData().equals(x))
				return i;
		return -1;
		
	}
	
	public String toString() {
		String str = "";
		Node <T> aux = this.first;
		for(int i = 0; aux != null; aux = aux.getNext(), i++)
			str += "["+i+"] = " +aux.getData()+"\n";
		return str;
		
	}
}
