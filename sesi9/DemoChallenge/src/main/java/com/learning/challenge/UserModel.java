package com.learning.challenge;

public class UserModel {
    int id;
    private String name, firstName, lastName;

    public UserModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("[").append(id).append("]").append(":").append(firstName).append(":").append(lastName);


        return builder.toString();
    }

}
