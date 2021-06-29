package src.org.sim.elineales.Stacks;

public class LinkedStack <E> implements Stack<E> {
	private Node<E> tope;
	
	public LinkedStack()
	{
		this.tope = null;
	}
	
	public void push(E x) 
	{
		this.tope = new Node<E>(x, this.tope);
	}
	public E pop() throws ExceptionIsEmpty
	{
		if(this.isEmpty())
		{
			throw new ExceptionIsEmpty("El inventario esta vacio. \nIntente con otro o recargue la ventana.");
		}
		else
		{
			E aux = this.tope.getData();
			this.tope =  this.tope.getNext();
			return aux;
		}
	}
	public E top() throws ExceptionIsEmpty
	{
		if(this.isEmpty())
		{
			throw new ExceptionIsEmpty("El inventario esta vacio. \nIntente con otro o recargue la ventana.");
		}
		else
		{
			return this.tope.getData();
		}
	}
	public boolean isEmpty()
	{
		return this.tope == null;
	}
	
	public String toString()
	{
		String src = "";
		Node papa = this.tope;
		while (papa != null)
		{
<<<<<<< HEAD
			return "- " + papa.getNext();
		}
		return "";
=======
			return "- " + this.tope;
		}
		return null;
>>>>>>> fffc6d25a3b7aa8a3e16dd566e3edff6d3a37426
	}
	
}
