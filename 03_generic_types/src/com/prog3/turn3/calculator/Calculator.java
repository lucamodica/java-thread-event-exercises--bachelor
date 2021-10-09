package com.prog3.turn3.calculator;

import java.util.Collections;
import java.util.List;

public class Calculator {

    public static void print(List<? extends Number> nums){
        System.out.println(nums);
    }
    
    public static double sum(List<? extends Number> nums){
        double sum = 0;
        for (Number num : nums) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static double max(List<? extends Number> nums){
        Collections.sort((List<Double>) nums);
        return nums.get(nums.size() - 1).doubleValue();
    }
}
