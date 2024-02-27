package baitapjava;

public class Main {
 public static void main(String[] args) {
		       Circle circle = new Circle("blue", true, 4.0);
		        System.out.println("Circle - Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());

		        Rectangle rectangle = new Rectangle("Blue", false, 5.0, 7.0);
		        System.out.println("Rectangle - Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());
		    }
		

	}


