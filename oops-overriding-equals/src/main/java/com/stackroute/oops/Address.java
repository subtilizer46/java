package com.stackroute.oops;
import java.util.Objects;
public class Address {

    private String area;
    private String city;

    public Address()
    {
        //default constructor
    }

    public Address(String area, String city)
    {
        this.area=area;
        this.city=city;
    }

    public String getArea()
    {

        return area;
    }

    public void setArea(String area)
    {
        this.area=area;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city=city;
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
        Address address = (Address) obj;
        return Objects.equals(area, address.area) && Objects.equals(city, address.city);
    }
}