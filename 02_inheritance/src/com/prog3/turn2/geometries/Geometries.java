package com.prog3.turn2.geometries;

import java.util.ArrayList;

public class Geometries {
    private ArrayList<Polygon> polygons;

    public Geometries() {
        this.polygons = new ArrayList<>();
    }

    public void addPolygon(Polygon polygon){
        if (!polygons.contains(polygon)){
            polygons.add(polygon);
        }
    }

    public int countPolygons() {
        return polygons.size();
    }

    @Override
    public String toString() {
        return "Geometries{" +
                "polygons=" + polygons +
                '}';
    }
}
