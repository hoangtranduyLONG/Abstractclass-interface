package resizeable;

import colorable.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square() {
        super(2.3, 1.8);
    }

    public Square(double side) {
        super(side, side);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return getLength();
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return  "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
