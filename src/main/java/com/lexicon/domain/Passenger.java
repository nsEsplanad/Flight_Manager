package com.lexicon.domain;

public class Passenger {
    private String firstName;
    private String lastName;

    public Passenger(){

    }

    public Passenger(Builder builder){
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
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
        private String firstName;
        private String lastName;

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
