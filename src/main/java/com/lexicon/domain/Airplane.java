package com.lexicon.domain;

import java.util.Objects;

public class Airplane {
    private String airlineName;
    private String  airplaneName;

    private Airplane(){

    }

    private Airplane(Builder builder){
        this.airlineName = Objects.requireNonNull(builder.airlineName, "airline");
        this.airplaneName=Objects.requireNonNull(builder.airplaneName, "airplane");
    }
    public String getAirlineName() {
        return airlineName;
    }

    public String getAirplaneName() {
        return airplaneName;
    }


    public static Builder builder(){
        return new Builder();
    }
    public final static class Builder{
        private String airlineName;
        private String  airplaneName;

        public Builder withAirlineName(String airlineName){
            this.airlineName=airlineName;
            return this;
        }

        public Builder withAirplaneName(String airplaneName){
            this.airplaneName=airplaneName;
            return this;
        }

        public Airplane build(){
            return new Airplane(this);
        }
    }
}
