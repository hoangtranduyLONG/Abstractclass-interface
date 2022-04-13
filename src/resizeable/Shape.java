package resizeable;

public abstract class Shape implements Resizeable{
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (filled) {
            return  "A Shape with " + this.color + " and filled";
        }
        else {
            return  "A Shape with " + this.color + " and not filled";
        }
    }
}
