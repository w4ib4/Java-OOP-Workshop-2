package lvl5workshop2;
class Shape{
	public double getPerimeter() {
		System.out.println("Perimeter");
		return 0;
		
	}
	public double getArea() {
		System.out.println("Area");
		return 0;
		
	}
}
class Circle extends Shape{
	
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
		
	}
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
		
	}
}
public class Q2 {
	public static void main(String[] args) {
		Circle circle = new Circle(3.0);
		
		System.out.println("Circle radius 3");
		System.out.println("Perimeter: " + circle.getPerimeter());
		System.out.println("Area: " + circle.getArea());
		
	}

}
