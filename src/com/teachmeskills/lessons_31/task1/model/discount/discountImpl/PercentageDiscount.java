package com.teachmeskills.lessons_31.task1.model.discount.discountImpl;

import com.teachmeskills.lessons_31.task1.model.discount.Discount;

public class PercentageDiscount implements Discount {

    private final double discountPercentage;

    public PercentageDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getDiscount(double price) {
        return price - (price * discountPercentage / 100);
    }
}
