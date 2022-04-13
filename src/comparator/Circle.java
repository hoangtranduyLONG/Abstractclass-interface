package comparator;

public class Circle {
    private static int count = 0;
    private int id = count;
    private final static double PI = 3.14;
    private double radius;
    private String color;
    private boolean filled;

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    public Circle() {
        count++;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
        count++;
    }

    public int getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Hình số " + getId();
    }
}
