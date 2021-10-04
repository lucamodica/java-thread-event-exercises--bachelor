package com.prog3.turn2.geometries;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Rectangle extends Parallelogram {

    public Rectangle(int base, int height) {
        super(base, height);
    }

    public Rectangle(float[] attributes) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
        super(attributes);
    }

    public double getPerimeter() {
        return (2 * base) * (2 * height);
    }

    @Override
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
