package ua.lviv.lgs;

public class Rectangle {

	private int width;
	private int height;
	
	Rectangle() {
		this.width = 12;
		this.height = 15;
	}
	
	Rectangle (int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int perimeter() {
		return 2 * (width + height);
	}
	
	public int area() {
		return width * height;
	}
}
