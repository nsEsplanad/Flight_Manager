package com.lexicon.domain;

import java.util.Objects;

public class Food {
    private int id;
    private String  foodName;
    private double foodPrice;
    private TripClass tripClass;


    public Food(){

    }

    private Food(Builder builder){
        this.id=Objects.requireNonNull(builder.id,"id");
        this.foodName= Objects.requireNonNull(builder.foodName, "foods Name");
        this.foodPrice=Objects.requireNonNull(builder.foodPrice, "Foods price");
        this.tripClass=builder.tripClass;
    }
    public int getId(){
        return id;
    }
    public String getFoodName() {
        return foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public TripClass getTripClass() {
        return tripClass;
    }

    public static Builder builder(){
        return new Builder();
    }


    public static class Builder{
        private int id;
        private String foodName;
        private double foodPrice;
        private TripClass tripClass;

        public Builder withId(int id){
            this.id=id;
            return this;
        }
        public Builder withFoodName(String foodName){
            this.foodName=foodName;
            return this;
        }

        public Builder withFoodPrice(double foodPrice){
            this.foodPrice=foodPrice;
            return this;
        }
        public Builder withTripClass(TripClass tripClass){
            this.tripClass=tripClass;
            return this;
        }

        public  Food build(){
            return new Food(this);
        }

            }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", foodPrice=" + foodPrice +
                ", tripClass=" + tripClass +
                '}';
    }
}
