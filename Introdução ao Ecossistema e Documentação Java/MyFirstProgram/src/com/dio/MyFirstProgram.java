package com.dio;

import com.dio.base.Order;
import com.dio.base.Value;

public class MyFirstProgram {
    public static void main(String[] args) {

        Order order = new Order("1234");
        System.out.println(order);

        Value totalValue = new Value(99);
        System.out.println(totalValue);

    }
}
