package com.prog3.turn2.geometries;

public class Rectangle extends Parallelogram {

    public Rectangle(int base, int side) {
        super(base, side);
    }

    public double getPerimeter() {
        return (2 * base) * (2 * height);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (this.getClass() != obj.getClass())) {
            return false;
        }

        return (this.height == ((Rectangle) obj).height)
                && (this.base == ((Rectangle) obj).base);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", numVertices=" + numVertices +
                '}';
    }
}
