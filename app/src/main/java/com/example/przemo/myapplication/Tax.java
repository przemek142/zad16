package com.example.przemo.myapplication;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tax {


    public String calculateTax(String stringIncome) {
        BigDecimal tax, income;
        try {
            income = new BigDecimal(stringIncome.replace(",", "."));
        }catch (NumberFormatException e){
            return "---";
        }
        final BigDecimal taxBorder = BigDecimal.valueOf(85528.50);

        if (income.compareTo(taxBorder) < 0 ){
            BigDecimal taxRate = BigDecimal.valueOf(0.18);
            tax = (income.multiply(taxRate)).subtract(BigDecimal.valueOf(556.02));

        } else {
            BigDecimal taxRate = BigDecimal.valueOf(0.32);
            tax = ((income.subtract(BigDecimal.valueOf(85528))).multiply(taxRate)).add(BigDecimal.valueOf(14839.02));
        }



        if (tax.compareTo(BigDecimal.valueOf(0)) < 0)
            tax = BigDecimal.valueOf(0);

        BigDecimal roundedTax = tax.setScale(1, RoundingMode.HALF_UP);
        BigDecimal superMfRounding = roundedTax.setScale(0, RoundingMode.HALF_UP);

        return superMfRounding.toString() + " zł";
    }


}
