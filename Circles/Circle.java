
public class Circle {
	// State variables [aka Instance variables, Instace fields, or Data members]
	public double radius; // pfeffer wants this public but i disagree

	public Circle(double r) { // "The constructor" - lets us specify the radius of a circle
		radius = r;
	}

	public void setRadius(double nr) { // Set a NEW RADIUS! [method]
		radius = nr;
	}

	// This is a method. It performs some action and returns it.
	public double area() { // area method
		double a = Math.PI * Math.pow(radius, 2);
		return a;
	}

	public double circumference() {
		double c =  2 * Math.PI * radius;
		return c;
	}

	public double diameter() {
		double d = radius * 2;
		return d;
	}
}
