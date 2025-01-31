package com.teachmeskills.lessons_31.task1.model.discount.strategy;

import com.teachmeskills.lessons_31.task1.model.discount.Discount;

public class PriceCalculator {
    private Discount discount;

    public void setDiscount(Discount discount){
        this.discount = discount;
    }

    public double calculateDiscount(double price) {
        if(discount == null){
            return price;
        }
        return discount.getDiscount(price);
    }
}
