package com.teachmeskills.lessons_31.task1;

import com.teachmeskills.lessons_31.task1.model.discount.discountImpl.FixedDiscount;
import com.teachmeskills.lessons_31.task1.model.discount.discountImpl.LoyaltyDiscount;
import com.teachmeskills.lessons_31.task1.model.discount.discountImpl.PercentageDiscount;
import com.teachmeskills.lessons_31.task1.model.discount.strategy.PriceCalculator;

/**
 * 1. Study the Strategy pattern. Create an application for calculating prices for goods
 * using various discount strategies. For example, implement:
 * Fixed discount
 * Percentage discount
 * Discount for regular customers
 * Implement a class with the ability to select a strategy and apply it when calculating the cost.
 * Demonstrate the result of applying different strategies in Main.
 *
 */
public class Main {
    public static void main(String[] args) {
        double originalPrice = 350;
        double fixedDiscount = 10;
        double percentageDiscount = 15;
        double loyaltyDiscount = 20;

        PriceCalculator calculator = new PriceCalculator();
        calculator.setDiscount(new FixedDiscount(fixedDiscount));
        double fixedDiscountPrice = calculator.calculateDiscount(originalPrice);
        System.out.println("Price after fixed discount: " + fixedDiscountPrice + " rub");

        calculator.setDiscount(new PercentageDiscount(percentageDiscount));
        double percentageDiscountedPrice = calculator.calculateDiscount(originalPrice);
        System.out.println("Price after percentage discount: " + percentageDiscountedPrice + " rub");

        calculator.setDiscount(new LoyaltyDiscount(loyaltyDiscount));
        double loyaltyDiscountedPrice = calculator.calculateDiscount(originalPrice);
        System.out.println("Price after discount for regular customers: " + loyaltyDiscountedPrice + " rub");
    }
}
