package com.lexicon.domain;

import java.util.Objects;

public class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private Airplane airplane;
    private TripClass tripClass;

    private Flight(){

    }

    private Flight(Builder builder){
        this.flightNumber= Objects.requireNonNull(builder.flightNumber, "flight");
        this.source=Objects.requireNonNull(builder.source,"from");
        this.destination=Objects.requireNonNull(builder.destination," To");
        this.airplane=Objects.requireNonNull(builder.airplane," Airplane");
        this.tripClass=Objects.requireNonNull(builder.tripClass, "Trip Class");
    }
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public TripClass getTripClass() {
        return tripClass;
    }

    public static Builder builder(){
        return new Builder();
    }

    public final static class Builder{
        private String flightNumber;
        private String source;
        private String destination;
        private Airplane airplane;
        private TripClass tripClass;

        public Builder withFlightNumber(String flightNumber){
            this.flightNumber=flightNumber;
            return this;
        }

        public Builder withSource(String source){
            this.source=source;
            return this;
        }

        public Builder withDestination(String destination){
            this.destination=destination;
            return this;
        }

        public Builder withAirplane(Airplane airplane){
            this.airplane=airplane;
            return this;
        }

        public Builder withTripClass(TripClass tripClass){
            this.tripClass=tripClass;
            return this;
        }

        public Flight build(){
            return new Flight(this);
        }
    }


}
