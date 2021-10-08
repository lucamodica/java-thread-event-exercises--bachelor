package com.prog3.turn3.geometries;

import java.util.ArrayList;

public class Geometries {
    private ArrayList<Polygon> polygons;

    public Geometries() {
        this.polygons = new ArrayList<>();
    }

    public void addPolygon(Polygon polygon) {
        if (!polygons.contains(polygon)){
            polygons.add(polygon);
            System.out.println("Polygon added!\n");
        }
        else{
            System.out.println("Polygon not added, because already exists in the list.\n");
        }
    }

    public int countPolygons() {
        return polygons.size();
    }

    @Override
    public String toString() {
        return "Geometries{\n" +
                "polygons=" + polygons +
                '}';
    }
}
