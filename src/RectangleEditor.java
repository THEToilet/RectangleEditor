package EIEV3.src;

public class RectangleEditor {

	static public void main(String[] args) {
		DrawFrame frm = new DrawFrame("Rectangle Editor");
		frm.setVisible(true);
		System.out.printf("Hello %s! This is the Rectangle Editor\n", System.getProperty("user.name"));
		System.out.printf("Please Type in commands\n");
		Command.Start(frm);
	}
}
