package org.sim.elineales.Listas;

public interface TDAList <T> {
	boolean isEmptyList();
	int length();
	void destroyList();
	int search(T x);
<<<<<<< HEAD
	/* T search(int x); */
=======
	T search(int x);
>>>>>>> 7e86d69c3738232ab8d4e0ca822cf32cf633c8de
	void insertLast(T x);
	void insertFirst(T x);
	void remove(T x);
	String toString();
}
