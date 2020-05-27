import java.lang.Math;

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
		return "{ " + "x: " + this.x + " y: " + this.y + " width: " + this.width + " height: " + this.height + "color:"
				+ this.color.toString() + " }";
	}

	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public void expand(float mx, float my) {
		this.width = Math.round(mx * this.width);
		this.height = Math.round(my * this.height);
	}
}
