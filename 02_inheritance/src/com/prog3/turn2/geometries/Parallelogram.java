package com.prog3.turn2.geometries;

public class Parallelogram extends Polygon {
    protected float base;
    protected float height;

    public Parallelogram(int base, int height) {
        super(4);
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return base * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (this.getClass() != obj.getClass())) {
            return false;
        }

        return (this.height == ((Parallelogram) obj).height)
                && (this.base == ((Parallelogram) obj).base);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "base=" + base +
                ", height=" + height +
                ", numVertices=" + numVertices +
                '}';
    }
}
