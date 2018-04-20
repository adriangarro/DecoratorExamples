package com.DSWTEC.CoffeePackage;

/*
 * Decorator WithMilk mixes milk into coffee.
 * */
public class WithMilk extends CoffeeDecorator {

    public WithMilk(Coffee c) {
        super(c);
        Double prevCost = c.getCost();
        String prevIngredients = c.getIngredients();
        setCost(prevCost + 0.5);
        setIngredients(prevIngredients + ", Milk");
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
