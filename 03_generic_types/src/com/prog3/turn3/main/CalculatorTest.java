package com.prog3.turn3.main;

import com.prog3.turn3.calculator.Calculator;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CalculatorTest {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(8);
        intList.add(2);
        intList.add(12);
        System.out.print("\nElements in the Integer list: ");
        Calculator.print(intList);
        System.out.println("Sum of all of them: " + Calculator.sum(intList));
        System.out.println("Max value: " + Calculator.max(intList) + "\n\n");


        DecimalFormat df = new DecimalFormat("#.##");
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(3.3);
        doubleList.add(8.8);
        doubleList.add(12.12);
        doubleList.add(2.2);
        System.out.print("Elements in the Double list: ");
        Calculator.print(doubleList);
        System.out.println("Sum of all of them: " + df.format(Calculator.sum(doubleList)));
        System.out.println("Max value: " + Calculator.max(doubleList) + "\n\n");
    }
}
