package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(10, 30);
		Circle circle = new Circle(5.3, 4.8);
		
		System.out.println("Площа першого прямокутника = " + rect1.area());
		System.out.println("Периметр першого прямокутника = " + rect1.perimeter());
		
		System.out.println("Площа другого прямокутника = " + rect2.area());
		System.out.println("Периметр другого прямокутника = " + rect2.perimeter());
		
		System.out.println("Площа кола = " + Math.round(circle.area()));
		System.out.println("Довжина кола = " + Math.round(circle.length()));

	}

}
