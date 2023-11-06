package com.stackroute.oops;

/*
 This class is used to store Voter details
 */
public class Voter {

    private String name;
    private int age;
    /* Parameterised constructor */
    public Voter(String name, int age) {
        this.age=age;
        this.name=name;
    }

    /*Getters and Setters*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    /*
       Returns Voter details in a formatted String
    */
    @Override
    public String toString() {
        return "Voter{name='"+name+"', age="+age+"}";
    }

    /*
        Returns the age criteria of voter based on the below criteria
            ADULT : >=18
            UNDERAGE : < 18
     */
    public String getAgeCriteria() {
        if(age>=18)
        {
            return "ADULT";
        }
        else {
            return "UNDERAGE";
        }
    }
}
