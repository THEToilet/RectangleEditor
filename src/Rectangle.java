import java.lang.Math;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public String show() {
		return "{ " + "x: " + this.x + " y: " + this.y + " width: " + this.width + " height: " + this.height + " }";
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
