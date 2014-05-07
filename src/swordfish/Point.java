package swordfish;

public class Point {

    public int x;
    public int y;

    @Override
    public int hashCode() {
        return (x + 31) * y;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Point point = (Point) object;

        if (x != point.x) {
            return false;
        } else if (y != point.y) {
            return false;
        }

        return true;

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plus(Point point) {
        this.x += point.x;
        this.y += point.y;
    }
}
