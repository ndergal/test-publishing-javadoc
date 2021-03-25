package fr.test;

import java.util.Objects;

public record PointR(int x, int y) {

    @Override
    public String toString() {
        return "PointR{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o instanceof PointR pointR) {
            return x == pointR.x && y == pointR.y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
