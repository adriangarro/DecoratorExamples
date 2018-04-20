package com.DSWTEC.CoffeePackage;

/*
 * Decorator WithAmaretto mixes amaretto into coffee.
 */
public class WithAmaretto extends CoffeeDecorator {

    public WithAmaretto(Coffee c) {
        super(c);
        Double prevCost = c.getCost();
        String prevIngredients = c.getIngredients();
        setCost(prevCost + 2.0);
        setIngredients(prevIngredients + ", Amaretto");
    }

    @Override
    public void setCost(Double cost) { super.setCost(cost); }

    @Override
    public Double getCost() { return super.getCost(); }

    @Override
    public void setIngredients(String ingredients) { super.setIngredients(ingredients); }

    @Override
    public String getIngredients() { return super.getIngredients(); }
}