package resizeable;

public class Rectangle extends Shape{
    private double width, length;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width*length;
    }

    public double getParameter() {
        return (width+length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + this.width + " and length= " + this.length + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setLength(this.width*percent);
        setLength(this.length*percent);
    }
}
