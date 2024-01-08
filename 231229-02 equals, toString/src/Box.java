
public class Box {
	private int width;
	private int height;
	private int length;

	public Box(int width, int height, int length) {
		super();
		this.width = width;
		this.height = height;
		this.length = length;
	}

	
	


	@Override
	public String toString() {
		return String.format("가로: %d, 세로: %d, 높이: %d", width, length, height);
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + length;
		result = prime * result + width;
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Box)) {
			return false;
		}
		Box other = (Box) obj;
		if (height != other.height) {
			return false;
		}
		if (length != other.length) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		return true;
	}





	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
