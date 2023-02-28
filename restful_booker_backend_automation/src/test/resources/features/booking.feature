Feature: consume booking services

  Background:
    Given the user prepares the service

  @GetBookingIds
  Scenario: get booking ids
    When the user consumes the service booking ids
    Then the user will get the code 200

  @CreateBooking
  Scenario: create a booking
    When the user sends data to create a new booking
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds |
      | Jim       | Brown    | 674        | true        | 2018-01-01 | 2019-01-01 | Breakfast       |
    Then the user will get the code 200