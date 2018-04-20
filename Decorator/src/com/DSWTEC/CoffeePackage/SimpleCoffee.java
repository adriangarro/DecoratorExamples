package com.DSWTEC.CoffeePackage;

/*
 * Simple coffee without any extra ingredients.
 */
public class SimpleCoffee implements Coffee {

    private Double cost;
    private String ingredients;

    public SimpleCoffee() {
        this.cost = 1.0;
        this.ingredients = "Coffee";
    }

    @Override
    public void setCost(Double cost) { this.cost = cost; }

    @Override
    public Double getCost() { return this.cost;  /* Cost in U.S.A Dollars */ }

    @Override
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }

    @Override
    public String getIngredients() { return this.ingredients; }

    @Override
    public void attributes() {
        System.out.println(
                "Cost: "
                        + this.cost
                        + "; Ingredients: "
                        + this.ingredients
        );
    }
}
