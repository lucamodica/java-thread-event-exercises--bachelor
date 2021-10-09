package com.prog3.turn3.geometries;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Rectangle extends Polygon {
    private float base;
    private float height;

    public Rectangle(int base, int height) {
        super(4);
        this.base = base;
        this.height = height;
    }

    public Rectangle(float[] attributes) throws ClassNotFoundException{
        super(4);
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

    public float getArea() {
        return base * height;
    }

    public double getPerimeter() {
        return (2 * base) * (2 * height);
    }

    public String[] describeAttributes() throws ClassNotFoundException {
        Field[] fields = Class.forName("com.prog3.turn2.geometries.Rectangle").getDeclaredFields();
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
        for (int i = 0; i < listFields.length - 21; i++){
            System.out.println(listFields[i]);
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

        return (this.height == ((Rectangle) obj).height)
                && (this.base == ((Rectangle) obj).base);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", numVertices=" + numVertices +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                "}\n";
    }
}
