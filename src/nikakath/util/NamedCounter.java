package nikakath.util;

public class NamedCounter extends Counter {

	String name;

	public NamedCounter(String name, int start) {

		super(start);
		this.name = name;

	} // NamedCounter(String, int)

	public String toString() {

		return this.name + super.toString();

	} // toString()

} // class NamedCounter 
