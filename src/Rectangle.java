public class Rectangle {
	public int x;
	public int y;
	public int width;
	public int height;
	public Color color;

	public Rectangle(int x, int y, int width, int height, Color c) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = c;
	}

	public String show() {
		return "{ " + "x: " + this.x + " y: " + this.y + " width: " + this.width + " height: " + this.height + " color:"
				+ (this.color).color.toString() + " }";
	}

}
