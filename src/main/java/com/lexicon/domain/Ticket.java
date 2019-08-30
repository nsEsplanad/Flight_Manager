package com.lexicon.domain;

import java.util.Objects;

public class Ticket {
    private String ticketId;
    private TripClass tripClass;
    private double cost;

    private Ticket(){

    }

    private Ticket(Builder builder){
        this.ticketId=Objects.requireNonNull(builder.ticketId,"Ticket Id");
        this.tripClass= Objects.requireNonNull(builder.tripClass, "trip class");
        this.cost=Objects.requireNonNull(builder.cost, "Total cost");
    }

    public String getTicketId() {
        return ticketId;
    }

    public TripClass getTripClass() {
        return tripClass;
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
        private double cost;

        public Builder withTicketId(String ticketId){
            this.ticketId=ticketId;
            return this;
        }

        public Builder withTicketClass(TripClass tripClass){
            this.tripClass=tripClass;
            return this;
        }

        public Builder withCost(double cost){
            this.cost=cost;
            return this;
        }

        public  Ticket build(){
            return new Ticket(this);
        }
    }
}
