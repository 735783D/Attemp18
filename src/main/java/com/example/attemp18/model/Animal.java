package com.example.attemp18.model;

public abstract class Animal {
    private int id;
    private String breed;
    private int lifespan;
    private String behavior;
    private double price;
    private boolean vaccinated;

    public Animal(int id, String breed, int lifespan, String behavior, double price, boolean vaccinated) {
        this.id = id;
        this.breed = breed;
        this.lifespan = lifespan;
        this.behavior = behavior;
        this.price = price;
        this.vaccinated = vaccinated;
    }

    public int getId() {
        return id;
    }

    public String getBreed() {
        return breed;
    }

    public int getLifespan() {
        return lifespan;
    }

    public String getBehavior() {
        return behavior;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
