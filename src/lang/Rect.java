package lang;

public class Rect {
	private int width;
	private int height;
	
	public Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public final int getWidth() {
		return width;
	}
	
	public final void setWidth(int width) {
		this.width = width;
	}
	public final int getHeight() {
		return height;
	}
	public final void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rect other = (Rect) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
}
