package com.booking.certificacion.models;

public class ReservationData {

    private String destination;
    private String checkInDate;
    private String checkOutDate;
    private String room;
    private String adults;
    private String children;
    private String childAge;
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private String mobilePhone;

    public ReservationData(String destination, String checkInDate, String checkOutDate, String room, String adults,
                           String children, String childAge, String firstName, String lastName, String email, String country, String mobilePhone) {
        this.destination = destination;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room = room;
        this.adults = adults;
        this.children = children;
        this.childAge = childAge;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.mobilePhone = mobilePhone;
    }

    public String getDestination() {
        return destination;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public String getRoom() {
        return room;
    }

    public String getAdults() {
        return adults;
    }

    public String getChildren() {
        return children;
    }

    public String getChildAge() {
        return childAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }
}
