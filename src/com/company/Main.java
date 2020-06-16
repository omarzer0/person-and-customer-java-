package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Customer customer = new Customer("omar", "bla bla bla", 1234567890, 1, false);
        System.out.print(
                "Customer name is " +
                        customer.getPersonName() + "\n" +
                        "Customer address is  " +
                        customer.getPersonAddress() + "\n" +
                        "Customer telephone number is "+
                        customer.getPersonTelephoneNumber() + "\n" +
                        "Customer customer number is "+
                        customer.getCustomerNumber() + "\n" +
                        "Customer wishes a mailing list  "+
                        customer.isWishMailingList()
        );
    }
}
