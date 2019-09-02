package com.lexicon.domain;

import java.util.Objects;

public class Seat {
    private int seatNumber;
    private TripClass tripClass;
    private double price;

    private Seat(){

    }

    private Seat(Builder builder){
        this.seatNumber= builder.seatNumber;
        this.tripClass=builder.tripClass;
        this.price=Objects.requireNonNull(builder.price, "Price");
    }
    public int getSeatNumber() {
        return seatNumber;
    }

    public TripClass getTripClass() {
        return tripClass;
    }

    public double getPrice() {
        return price;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private int seatNumber;
        private TripClass tripClass;
        private double price;

        public Builder withSeatNumber(int seatNumber){
            this.seatNumber=seatNumber;
            return this;
        }

        public Builder withTripClass(TripClass tripClass){
            this.tripClass=tripClass;
            return this;
        }

        public Builder withPrice(double price){
            this.price=price;
            return this;
        }

        public Seat build(){
            return new Seat(this);
        }
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber=" + seatNumber +
                ", tripClass=" + tripClass +
                ", price=" + price +
                '}';
    }
}
