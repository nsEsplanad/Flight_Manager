package com.lexicon.domain;

import java.util.Objects;

public class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private Airplane airplane;

    private Flight(){

    }

    private Flight(Builder builder){
        this.flightNumber= Objects.requireNonNull(builder.flightNumber, "flight");
        this.source=Objects.requireNonNull(builder.source,"from");
        this.destination=Objects.requireNonNull(builder.destination," To");
        this.airplane=Objects.requireNonNull(builder.airplane," Airplane");

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


    public static Builder builder(){
        return new Builder();
    }

    public final static class Builder{
        private String flightNumber;
        private String source;
        private String destination;
        private Airplane airplane;


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


        public Flight build(){
            return new Flight(this);
        }
    }


}
