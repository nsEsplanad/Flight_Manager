package com.lexicon.domain;

import java.util.Objects;

public class Passenger {
    private int passengerId;
    private String firstName;
    private String lastName;

    public Passenger(){

    }

    public Passenger(Builder builder){
        this.passengerId= Objects.requireNonNull(builder.passengerId, "passenger Id");
        this.firstName=Objects.requireNonNull(builder.firstName, "firstName");
        this.lastName=Objects.requireNonNull(builder.lastName, "LastName");
    }
    public int getPassengerId(){
        return passengerId;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int passengerId;
        private String firstName;
        private String lastName;

        public  Builder withPassengerId(int passengerId){
            this.passengerId=passengerId;
            return this;
        }
        public  Builder withFirstName(String firstName){
            this.firstName=firstName;
            return this;
        }

        public Builder withLastName(String lastName){
            this.lastName=lastName;
            return this;
        }

        public Passenger build(){
            return new Passenger(this);
        }
    }
}
