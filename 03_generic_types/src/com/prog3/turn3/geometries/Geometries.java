package com.prog3.turn3.geometries;

import java.util.ArrayList;
import java.util.List;

public class Geometries<T extends Polygon> {
    private List<T> polygons;

    public Geometries() {
        this.polygons = new ArrayList<>();
    }

    public boolean add(T polygon) {
        if (!polygons.contains(polygon)){
            System.out.println("Polygon added!\n");
            return polygons.add(polygon);
        }
        System.out.println("Polygon not added, because already exists in the list.\n");
        return false;
    }

    public int getNumElements() {
        return polygons.size();
    }
    
    public void printAreas(){
        System.out.print("Area list= {");
        for (Polygon p: this.polygons) {
            System.out.print("[" + p.getArea() + "] ");
        }
        System.out.print("}");
    }

    @Override
    public String toString() {
        return "Geometries{\n" +
                "polygons=" + polygons +
                '}';
    }
}
