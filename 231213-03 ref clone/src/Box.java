
public class Box {
	private int size;
	private Toy toy;
	public Box(int size, Toy toy) {
		this.size = size;
		this.toy = toy;
	}
	public int getSize() {
		return size;
	}
	public Toy getToy() {
		return toy;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setToy(Toy toy) {
		this.toy = toy;
	}

}
