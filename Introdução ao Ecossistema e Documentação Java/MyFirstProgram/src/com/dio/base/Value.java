package com.dio.base;

public class Value {

    private final int totalValue;

    public Value(int totalValue) {
        this.totalValue = totalValue;
    }

    public double calculateFee() {

        if (totalValue > 100) {
            return totalValue * 0.99;
        } else {
            return totalValue;
        }

    }

    public double calculateFeeSwitch() {

        switch (totalValue) {
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99;
            default:
                return totalValue;
        }
    }

    @Override
    public String toString() {
        return "TotalValue = "
                + totalValue;
    }
}
