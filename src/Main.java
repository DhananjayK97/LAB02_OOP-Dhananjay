public class Main {
    public static void main(String[] args) {
        Circle circles = new Circle("red", 6);
        System.out.println(circles.calculateArea());
        circles.renderer.draw();
        circles.renderer.draw("This is a Triangle");

        Triangle triangles = new Triangle("orange", 12, 7);
        System.out.println(triangles.calculateArea());
        System.out.println(triangles.calculatePerimeter());
        triangles.renderer.draw();
        triangles.renderer.draw("This is a Triangle");

        Rectangle rectangles = new Rectangle("green", 2, 3 );
        System.out.println(rectangles.calculateArea());
        System.out.println(rectangles.calculatePerimeter());
        rectangles.renderer.draw();
        rectangles.renderer.draw("This is a rectangle");

        Square squares = new Square("blue", 5);
        System.out.println(squares.calculateArea());


        //Shape s = new Square("blue", 5);

        //((Square) s).test();

    }
}