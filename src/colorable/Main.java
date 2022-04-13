package colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.8, "blue", false);
        shapes[1] = new Rectangle(6.5, 8.9, "yellow", true);
        shapes[2] = new Square(7.9,"white" , true);

        Square square = new Square();

        for (Shape elements : shapes){
            System.out.println(elements.toString());
            if (elements instanceof Square){
                square.howToColor();
            }
        }
    }
}
