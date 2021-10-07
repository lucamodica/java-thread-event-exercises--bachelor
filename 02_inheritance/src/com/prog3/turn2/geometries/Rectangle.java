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

    public void setAttributes(float[] params) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        String[] listFields = describeAttributes();
        //Class c = this.getClass();

        for (int i = 0; i < listFields.length - 21; i++){
            //Field f = c.getField(listFields[i]);
            //f.set(this, params[0]);

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
