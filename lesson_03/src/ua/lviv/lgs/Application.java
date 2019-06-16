package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(10, 30);
		Circle circle = new Circle(5.3, 4.8);
		
		System.out.println("����� ������� ������������ = " + rect1.area());
		System.out.println("�������� ������� ������������ = " + rect1.perimeter());
		
		System.out.println("����� ������� ������������ = " + rect2.area());
		System.out.println("�������� ������� ������������ = " + rect2.perimeter());
		
		System.out.println("����� ���� = " + Math.round(circle.area()));
		System.out.println("������� ���� = " + Math.round(circle.length()));

	}

}
