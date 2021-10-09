package com.prog3.turn3.geometries;

import java.lang.reflect.Field;

public class Triangle extends Polygon{

    private float base;
    private float height;

    public Triangle(int base, int height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public Triangle(float[] attributes) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
        super(3);
        setAttributes(attributes);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float getArea() {
        return (base * height)/2;
    }

    public String[] describeAttributes() throws ClassNotFoundException {
        Field[] fields = Class.forName("com.prog3.turn2.geometries.Triangle").getDeclaredFields();
        String[] listFields = new String[4];
        int i = 0;
        for (Field f: fields) {
            listFields[i] = f.getName();
            i++;
        }
        return listFields;
    }

    public void setAttributes(float[] params) throws ClassNotFoundException{
        String[] listFields = describeAttributes();
        for (int i = 0; i < listFields.length - 2; i++){
            if (listFields[i].equals("base")){
                this.base = params[i];
            }
            else {
                this.height = params[i];
            }
        }
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
                "base=" + base +
                ", height=" + height +
                ", numVertices=" + numVertices +
                ", Area=" + getArea() +
                "}\n";
    }
}
