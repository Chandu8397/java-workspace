package generics.demo;

/**
*Author :Mekapothula.Reddy
*Date   :5 Nov 2024
*Time   :11:33:20 am
*Email  :Mekapothula.Reddy@coforge.com
*
* Generic class with 2 parameters - 
*Maps- Stores data in form of key & value pairs - Hashmap, TreeMap
*/

public class Pair<T,U>{
	
	private T first;
	private U second;
	
	public  Pair() {
		this.first= null;
		this.second= null;
	}
	
	public Pair(T first, U second) {    //Generic Constructor
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public U getSecond() {
		return second;
	}

	public void setSecond(U second) {
		this.second = second;
	}
	
}