package comparable;

public class Circle {
    private final static double PI = 3.14;
    private double radius;
    private String color;
    private boolean filled;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
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
}
