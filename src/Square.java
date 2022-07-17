public class Square extends Rectangle{

    public Square(String color, int side) {
        super(color, side, side);
    }

    @Override
    public double calculateArea() {
        System.out.println("Calculate method in Square is called.");
        return this.length * this.width;
    }
}