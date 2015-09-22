/**
 * Author: Brandon B.
 * Date: 9-22-15
 */
public class Tester {
    public static void main(String[] args) {
        Circle cir1 = new Circle(5.1); // We've instantiated an object called cir1!
        Circle cir2 = new Circle(20.6); // This is a circle object called cir2!
        System.out.println(cir1.diameter());
        System.out.println(cir2.area());
        cir1.setRadius(40.1);
        System.out.println(cir1.diameter());
    }
}
