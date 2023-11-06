package com.stackroute.oops;
import java.util.Objects;
public class Customer {

    private int customerId;
    private String name;
    private String email;
    private Address address;

    public Customer()
    {
        //default Constructor
    }

    public Customer(int customerId, String name, String email, Address address)
    {
        this.customerId=customerId;
        this.name=name;
        this.email=email;
        this.address=address;
    }

    public int getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(int customerId)
    {
        this.customerId=customerId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address=address;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer customer = (Customer) obj;
        return customerId == customer.customerId &&
                Objects.equals(name, customer.name) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(address, customer.address);
    }
}