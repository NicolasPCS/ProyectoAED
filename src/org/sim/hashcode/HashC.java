package org.sim.hashcode;
import java.util.*;
import java.math.*;
public class HashC<E extends Comparable <E>>{
	protected class Element{
		int mark;
		Register<E> reg;
		public Element(int mark, Register<E> reg) {
			this.mark = mark;
			this.reg = reg;
		}
	}
	//protected ArrayList<Element> table;
	protected ArrayList<LinkedList<Element>> table;
	protected int m;

	public HashC(int n) {
		this.m = n;
		this.table = new ArrayList<LinkedList<Element>> (m);
		
		for(int i = 0; i<m;i++) {
			LinkedList<Element> a = new LinkedList<Element>();
			a.add(new Element(0,null));
			if(i == 0)
				this.table.add(a);
			else {
				this.table.add(a);
			}
		}
		for(int i = 0; i<m;i++)
			this.table.get(i).add(new Element(0,null));
	}
	private int functionHash(int key) {
		return key%m;
	}

	public void insertarEncadenamiento(int key,E reg) {
		int dressHash = functionHash(key);
		if(table.get(dressHash).getFirst().reg==null) {
			Element aux = new Element(1,new Register<E>(key,reg));
			table.get(dressHash).set(0,aux);
		}
		else if(table.get(dressHash).get(0).reg.equals(new Register<E>(key,reg))) {
			System.out.println("elemento duplicado");
		}
		else {
			Element aux = new Element(1,new Register<E>(key,reg));
			table.get(dressHash).add(aux);
		}
	}

	public String toString() {
		String s = "D.Real\tD.Hash\tRegister\n";
		for(int i = 0;i<m;i++) {
			s+= i + "-->\t";
			if(table.get(i).get(0).mark == 1) {
				s+= functionHash(table.get(i).get(0).reg.key)+"\t"+ table.get(i).get(0).reg;
				if(table.get(i).size()>=2) {
					for(int i1 = 1; i1 < table.get(i).size();i1++) {
						if(table.get(i).get(i1).mark == 1)
							s+= "\t"+ "-->\t"+table.get(i).get(i1).reg;
					}
				}
				s+="\n";
			}
			else
				s+= "empty\n";
		}
		return s;
	}
}
