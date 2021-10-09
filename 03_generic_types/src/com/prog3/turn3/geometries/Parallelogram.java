package com.prog3.turn3.geometries;

import java.lang.reflect.Field;

public class Parallelogram extends Polygon {
    private float base;
    private float height;

    public Parallelogram(int base, int height) {
        super(4);
        this.base = base;
        this.height = height;
    }

    public Parallelogram(float[] attributes) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
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
