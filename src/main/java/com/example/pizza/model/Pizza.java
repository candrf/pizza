package com.example.pizza.model;



public class Pizza {
    private Long id;
    private Double price;
    private String crust;
    private String size;
    private String toppings;
    private boolean hasCheese;


    public Pizza(Long id, Double price, String crust, String size, String toppings, boolean hasCheese) {
        this.id = id;
        this.price = price;
        this.crust = crust;
        this.size = size;
        this.toppings = toppings;
        this.hasCheese = hasCheese;
    }

    public Pizza() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public boolean getHasCheese() {
        return hasCheese;
    }

    public void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }
}
