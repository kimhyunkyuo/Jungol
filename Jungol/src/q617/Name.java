package q617;

public class Name {
	private String name;
	private int tall;

	// set method
	public Name(String name, int tall) {
		this.name = name;
		this.tall = tall;

		// get method

	}

	public void print() {
		System.out.println(name + " " + tall);
	}
	public int gettall() {
		return tall;
	}
}
