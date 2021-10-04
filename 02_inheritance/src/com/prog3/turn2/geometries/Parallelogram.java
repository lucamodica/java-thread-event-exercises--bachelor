package com.prog3.turn2.geometries;

import java.lang.reflect.Field;

public class Parallelogram extends Polygon {
    protected float base;
    protected float height;

    public Parallelogram(int base, int height) {
        super(4);
        this.base = base;
        this.height = height;
    }

    public Parallelogram(float[] attributes) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
        super(4);
        setAttributes(attributes);
    }

    @Override
    public float getArea() {
        return base * height;
    }

    public String[] describeAttributes() throws ClassNotFoundException {
        Field[] fields = Class.forName("com.prog3.turn2.geometries.Parallelogram").getDeclaredFields();
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

        return (this.height == ((Parallelogram) obj).height)
                && (this.base == ((Parallelogram) obj).base);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "base=" + base +
                ", height=" + height +
                ", numVertices=" + numVertices +
                ", Area=" + getArea() +
                "}\n";
    }
}
