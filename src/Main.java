public class Main {
    public static void main(String[] args) {
        Circle circles = new Circle("red", 6);
        System.out.println("Area of Circle-->  " + circles.calculateArea());  // additional Print Messages
        System.out.println("Perimeter of Circle-->  " + circles.calculatePerimeter());
        circles.renderer.draw();
        circles.renderer.draw("This is a Circle");

        Triangle triangles = new Triangle("orange", 12, 7);
        System.out.println("Area of Triangle-->  " + triangles.calculateArea());  // additional Print Messages
        System.out.println("Perimeter of Triangle-->  " + triangles.calculatePerimeter());
        triangles.renderer.draw();
        triangles.renderer.draw("This is a Triangle");

        Rectangle rectangles = new Rectangle("green", 2, 3 );
        System.out.println("Area of Rectangle-->  " + rectangles.calculateArea());  // additional Print Messages
        System.out.println("Perimeter of Rectangle-->  " + rectangles.calculatePerimeter());
        rectangles.renderer.draw();
        rectangles.renderer.draw("This is a Rectangle");

        Square squares = new Square("blue", 5);
        System.out.println("Area of Square-->  " + squares.calculateArea());  // additional Print Messages
        squares.renderer.draw("Square is a Sub class of Rectangle");  // // additional Print Message for child class


        //Shape s = new Square("blue", 5);

        //((Square) s).test();

    }
}
