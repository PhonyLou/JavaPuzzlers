package com.learn.decimal;

import java.math.BigDecimal;

public class Change
{
    
    public static void main(String[] args)
    {
        methodOne(2.00, 1.10);
        methodTwo("2.00", "1.10");
    }
    
    private static void methodOne(double first, double second)
    {
        System.out.println(first - second);
    }
    
    private static void methodTwo(String first, String second)
    {
        System.out.println(new BigDecimal(first).subtract(new BigDecimal(second)));
    }
}
