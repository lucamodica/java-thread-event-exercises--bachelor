package com.prog3.turn2.geometries;

public class Triangle extends Polygon{

    private int base;
    private int height;

    public Triangle(int numVertices, int base, int height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return (base * height)/2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (this.getClass() != obj.getClass())) {
            return false;
        }

        return (this.height == ((Triangle) obj).height)
                && (this.base == ((Triangle) obj).base);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "numVertices=" + numVertices +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
