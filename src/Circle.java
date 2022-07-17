public class Circle implements IShape {

    int radius;
    final double PI = 3.14;
    String color;

    Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return this.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 *PI*this.radius;
    }


}