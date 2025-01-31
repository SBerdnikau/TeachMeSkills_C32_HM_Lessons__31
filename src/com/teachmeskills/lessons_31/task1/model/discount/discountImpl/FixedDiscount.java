package com.teachmeskills.lessons_31.task1.model.discount.discountImpl;

import com.teachmeskills.lessons_31.task1.model.discount.Discount;

public class FixedDiscount implements Discount {
    private final double discountFixed;

    public FixedDiscount(double discountFixed) {
        this.discountFixed = discountFixed;
    }

    @Override
    public double getDiscount(double price) {
        return price - (price * discountFixed / 100);
    }
}
