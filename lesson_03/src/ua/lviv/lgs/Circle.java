package ua.lviv.lgs;

public class Circle {
	
	private double radius;
	private double diameter;
	
	Circle(double r, double d) {
		this.radius = r;
		this.diameter = d;
	}
	
	public double area() {
		return Math.PI*diameter*diameter/4;
	}
	
	public double length() {
		return 2*Math.PI*radius;
	}

}
