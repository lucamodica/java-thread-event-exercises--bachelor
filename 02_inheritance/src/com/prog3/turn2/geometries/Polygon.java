package com.prog3.turn2.geometries;

public abstract class Polygon {

    protected int numVertices;

    public Polygon(int numVertices) {
        this.numVertices = numVertices;
    }

    public int getNumVertices(){
        return numVertices;
    }
    public abstract float getArea();
    //public abstract String[] describeAttributes();
    //public abstract void setAttributes();
}
