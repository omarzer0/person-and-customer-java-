package com.company;

public class Customer extends Person {
    private int customerNumber;
    private boolean wishMailingList;

    public Customer(String personName, String personAddress, int personTelephoneNumber , int customerNumber ,boolean wishMailingList) {
        super(personName, personAddress, personTelephoneNumber);
        this.customerNumber = customerNumber;
        this.wishMailingList = wishMailingList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isWishMailingList() {
        return wishMailingList;
    }

    public void setWishMailingList(boolean wishMailingList) {
        this.wishMailingList = wishMailingList;
    }
}
