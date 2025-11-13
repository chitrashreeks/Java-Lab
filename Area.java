abstract class Shape {
int a, b;

// Abstract method
abstract void printArea();
}

// Rectangle class
class Rectangle extends Shape {
Rectangle(int length, int breadth) {
a = length;
b = breadth;
}

void printArea() {
System.out.println("Area of Rectangle: " + (a * b));
}
}

// Triangle class
class Triangle extends Shape {
Triangle(int base, int height) {
a = base;
b = height;
}

void printArea() {
System.out.println("Area of Triangle: " + (0.5 * a * b));
}
}

// Circle class
class Circle extends Shape {
Circle(int radius) {
a = radius;
}

void printArea() {
System.out.println("Area of Circle: " + (Math.PI * a * a));
}
}

// Main class
public class Area {
public static void main(String[] args) {
Rectangle r = new Rectangle(10, 5);
Triangle t = new Triangle(8, 6);
Circle c = new Circle(4);

r.printArea();
t.printArea();
c.printArea();
}
}
