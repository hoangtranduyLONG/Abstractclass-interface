package comparable;

public class ComparableCircle  extends Circle implements Comparable<ComparableCircle>{
    static int count = 0;
    private final int id = count;
    public ComparableCircle() {
        count++;
    }

    public int getId() {
        return id;
    }

    public ComparableCircle(double radius) {
        super(radius);
        count++;
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
        count++;
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "Hình số " + getId();
    }
}
