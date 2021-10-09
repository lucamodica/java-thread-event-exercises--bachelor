package com.prog3.turn3.main;

import com.prog3.turn3.geometries.*;
import java.util.Scanner;

public class GeometriesTest {

    //System.out.println("Polygon added!\n");
    //System.out.println("Polygon not added, because already exists in the list.\n");

    public static Polygon createPolygon(){
        int option = 0;
        Polygon p = null;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please select the polygon you want to insert (or press 0 to exit the program): ");
            System.out.println("1 = Parallelogram");
            System.out.println("2 = Rectangle");
            System.out.println("3 = Triangle");
            System.out.println("0 = exit");
            System.out.print("> ");
            option = input.nextInt();

            if (option < 1 || option > 4){
                System.out.println("Invalid choice or typo, please try again.\n");
            }
            else if (option != 0){
                int b, h;
                System.out.print("Now, set the base: ");
                b = input.nextInt();
                System.out.print("To finish, don't forget the height: ");
                h = input.nextInt();
                p = (option == 1) ? new Parallelogram(b, h) : ((option == 2) ? new Rectangle(b, h)
                        : new Triangle(b, h));
            }
        }while (option < 0 || option > 4);

        return p;
    }

    public static void main(String[] args) {

        Geometries<Parallelogram> parallelogramGeometries = new Geometries<>();
        Geometries<Rectangle> rectangleGeometries = new Geometries<>();
        Geometries<Triangle> triangleGeometries = new Geometries<>();

        System.out.println("Welcome to the Geometries management!\n");
        Polygon p;
        do {
            p = createPolygon();
            if (p != null){
                if (p instanceof Parallelogram){
                    parallelogramGeometries.add((Parallelogram) p);
                }
                else if (p instanceof Rectangle){
                    rectangleGeometries.add((Rectangle) p);
                }
                else {
                    triangleGeometries.add((Triangle) p);
                }
            }
        }while (p != null);

        System.out.println("Now let's print the areas lists of all Geometries managers.");
        System.out.print("\nParallelograms: ");
        parallelogramGeometries.printAreas();
        System.out.print("\nRectangle: ");
        rectangleGeometries.printAreas();
        System.out.print("\nTriangle: ");
        triangleGeometries.printAreas();
        System.out.println("\n");
    }
}
