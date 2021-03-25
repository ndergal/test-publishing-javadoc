package fr.test;

import java.util.Objects;

/**
 * A representation of a point with X,Y coordinates.
 */
public class Point {
    private final int X;
    private final int Y;

    /**
     *
     * @param X
     * @param Y
     */
    public Point(int X,int Y){
        this.X = X;
        this.Y = Y;
    }

    /**
     * @param p1 first point to sum
     * @param p2 second point to sum
     * @return the sum of the two points passed as parameters
     */
    public static Point sum(Point p1, Point p2){
        Objects.requireNonNull(p1);
        Objects.requireNonNull(p2);
        return new Point(p1.X +p2.X, p1.Y+p2.Y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o instanceof Point point){
            return X == point.X && Y == point.Y;
        }

        return false;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }
}
