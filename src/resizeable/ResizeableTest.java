package resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle();
        shapes[2] = new Square();

        System.out.println("Các hình:");
        for (Shape i : shapes) {
            System.out.println(i);
            if (i instanceof Rectangle) {
                System.out.println("Diện tích "  + ((Rectangle) i).getArea());
                if (i instanceof Square) {
                    ((Square) i).howToColor();
                }
            }
            else if (i instanceof Circle) {
                System.out.println("Diện tích "  + ((Circle) i).getArea());
            }
            else {
                System.out.println("Lỗi");
            }
        }

        double rd = Math.random()*100;
        System.out.println("Các hình sau khi thay đổi số:" + rd);
        for (Shape i : shapes) {
            System.out.println(i);
            if (i instanceof Rectangle) {
                i.resize(rd);
                System.out.println("Diện tích "  + ((Rectangle) i).getArea());
            }
            else if (i instanceof Circle) {
                i.resize(rd);
                System.out.println("Diện tích "  + ((Circle) i).getArea());
            }
            else {
                System.out.println("Lỗi");
            }
        }
    }
}
