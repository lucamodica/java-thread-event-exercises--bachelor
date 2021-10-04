package com.prog3.turn2.main;
import com.prog3.turn2.geometries.*;

import java.util.Scanner;

public class MainPolygon {

    public static void main(String[] args) {
        Polygon p;
        Geometries g = new Geometries();
        int option = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please insert a plygon type you wish to insert (or type 0 to exit)");
            System.out.println("1 = Parallelogram");
            System.out.println("2 = Rectangle");
            System.out.println("3 = Triangle");
            System.out.println("(type 0 to exit the program)");
            System.out.print("> ");
            option = input.nextInt();

            if (option != 0){
                switch (option){
                    case 1:
                        p = new Parallelogram(2,3);
                        g.addPolygon(p);

                }
            }


        }while (option != 0);
    }
}
