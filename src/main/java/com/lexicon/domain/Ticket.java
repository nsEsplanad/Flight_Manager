package com.lexicon.domain;

import java.util.Objects;

public class Ticket {
    private String ticketId;
    private TripClass tripClass;
    private Passenger passenger;
    private Seat seat;
    private Food food;
    private double cost;

    private Ticket(){

    }

    private Ticket(Builder builder){
        this.ticketId=Objects.requireNonNull(builder.ticketId,"Ticket Id");
        this.tripClass= Objects.requireNonNull(builder.tripClass, "trip class");
        this.passenger=builder.passenger;
        this.seat=builder.seat;
        this.food=builder.food;
        this.cost=builder.cost;
    }

    public String getTicketId() {
        return ticketId;
    }

    public TripClass getTripClass() {
        return tripClass;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Seat getSeat() {
        return seat;
    }

    public Food getFood(){
        return food;
    }

    public double getCost() {
        return cost;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String ticketId;
        private TripClass tripClass;
        private Passenger passenger;
        private Seat seat;
        private Food food;
        private double cost;

        public Builder withTicketId(String ticketId){
            this.ticketId=ticketId;
            return this;
        }

        public Builder withTicketClass(TripClass tripClass){
            this.tripClass=tripClass;
            return this;
        }

        public Builder withPassenger(Passenger passenger){
            this.passenger=passenger;
            return this;
        }
        public Builder withSeat(Seat seat){
            this.seat=seat;
            return this;
        }

        public Builder withCost(double cost){
            this.cost=cost;
            return this;
        }
        public Builder withFood(Food food){
            this.food=food;
            return this;
        }

        public  Ticket build(){
            return new Ticket(this);
        }
    }
}
