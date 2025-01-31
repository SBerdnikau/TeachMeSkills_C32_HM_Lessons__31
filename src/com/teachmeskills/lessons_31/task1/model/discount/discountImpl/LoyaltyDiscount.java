package com.teachmeskills.lessons_31.task1.model.discount.discountImpl;

import com.teachmeskills.lessons_31.task1.model.discount.Discount;

public class LoyaltyDiscount implements Discount {

    private final double discountLoyalty;

    public LoyaltyDiscount(double discountLoyalty) {
        this.discountLoyalty = discountLoyalty;
    }

    @Override
    public double getDiscount(double price) {
        return price - (price * discountLoyalty / 100);
    }
}
