package com.hamzakh.builder.exercice;

import java.util.List;

public class Pizza {
    private String size;
    private String crust;
    private List<String> topping;

    Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.topping = builder.topping;
    }

    public String getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public List<String> getTopping() {
        return topping;
    }

    public static class PizzaBuilder {
        String size;
        String crust;
        List<String> topping;

        public PizzaBuilder withSize(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder withCrust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder withToppings(List<String> topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}


