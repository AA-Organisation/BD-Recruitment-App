package com.asheckhove.privacy.model;

import java.util.Date;

/**
 * User: Asheck
 * Date: 3/7/2022
 * Time: 6:06 PM
 */
public class User {

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    private String username;
    private String firstName;
    private String lastName;
    private int id;
    private String location;
    private Date dateOfBirth;

    public User(String username, String firstName, String lastName, int id, String location, Date dateOfBirth) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.location = location;
        this.dateOfBirth = dateOfBirth;
    }

    public User(){

    };

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
