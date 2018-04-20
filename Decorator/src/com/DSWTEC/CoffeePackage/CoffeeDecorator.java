package com.DSWTEC.CoffeePackage;

public abstract class CoffeeDecorator implements Coffee {

    private final Coffee decoratedCoffee;

    CoffeeDecorator(Coffee c) { this.decoratedCoffee = c; }

    @Override
    public void setCost(Double cost) { decoratedCoffee.setCost(cost); }

    @Override
    public Double getCost() { return decoratedCoffee.getCost(); }

    @Override
    public void setIngredients(String ingredients) { decoratedCoffee.setIngredients(ingredients); }

    @Override
    public String getIngredients() { return decoratedCoffee.getIngredients(); }

    @Override
    public void attributes() { decoratedCoffee.attributes(); }

}
