package com.company;

public class Person {
    private String personName;
    private String personAddress;
    private int personTelephoneNumber;

    public Person(String personName, String personAddress, int personTelephoneNumber) {
        this.personName = personName;
        this.personAddress = personAddress;
        this.personTelephoneNumber = personTelephoneNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public int getPersonTelephoneNumber() {
        return personTelephoneNumber;
    }

    public void setPersonTelephoneNumber(int personTelephoneNumber) {
        this.personTelephoneNumber = personTelephoneNumber;
    }
}
