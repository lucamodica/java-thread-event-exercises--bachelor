package com.prog3.turn2.main;
import com.prog3.turn2.geometries.*;

import java.util.Scanner;

public class MainPolygon {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Polygon p;
        Geometries g = new Geometries();
        int option = 0;
        float[] params = {3, 2};
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please insert a plygon type you wish to insert (or type 0 to exit)");
            System.out.println("1 = Parallelogram");
            System.out.println("2 = Rectangle");
            System.out.println("3 = Triangle");
            System.out.println("(type 0 to exit the program)");
            System.out.print("> ");
            option = input.nextInt();

            if (option != 0) {
                switch (option) {
                    //Add a parallelogram
                    case 1:
                        p = new Parallelogram(params);
                        g.addPolygon(p);
                        break;
                    //Add a rectangle
                    case 2:
                        p = new Rectangle(params);
                        g.addPolygon(p);
                        break;
                    //Add a triangle
                    case 3:
                        p = new Triangle(params);
                        g.addPolygon(p);
                        break;
                    //Polygon not unrecognised
                    default:
                        System.out.println("Option not recognised.\n");
                }
            }
        }while (option != 0);

        System.out.println("\nPoligoni aggiunti (in totale sono " + g.countPolygons() + "): \n");
        System.out.println(g);
    }
}
