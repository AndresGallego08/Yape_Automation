package com.herokuapp.bookerrestful.models;

public class DataBooking {
    private String firstname;
    private String lastname;
    private int totalprice;
    private Boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;
    private String checkin;
    private String checkout;


    public void setBookingDates(String checkin, String checkout) {
        this.bookingdates = new BookingDates(checkin, checkout);
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }
}
