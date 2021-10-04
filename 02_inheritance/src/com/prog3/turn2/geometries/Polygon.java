package com.prog3.turn2.geometries;

import java.lang.reflect.*;

public abstract class Polygon {

    protected int numVertices;

    public Polygon(int numVertices) {
        this.numVertices = numVertices;
    }

    public int getNumVertices(){
        return numVertices;
    }
    public abstract float getArea();
    public abstract String[] describeAttributes() throws ClassNotFoundException;
    public abstract void setAttributes(float[] params) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException;
}
