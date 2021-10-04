package com.prog3.turn2.geometries;

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

    public void setAttributes(float[] params) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        String[] listFields = describeAttributes();
        Class c = this.getClass();

        for (int i = 0; i < listFields.length; i++){
            Field f = c.getField(listFields[i]);
            f.set(this, params[0]);
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
