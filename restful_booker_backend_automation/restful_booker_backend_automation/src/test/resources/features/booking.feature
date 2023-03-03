Feature: consumes booking api to consult, create, delete and update the bookings

  Background:
    Given the user prepares the service


  @CreateBooking
  Scenario: create a booking
    When the user sends data to create a new booking
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds |
      | Jim       | Brown    | 674        | true        | 2018-01-01 | 2019-01-01 | Breakfast       |
    Then the user will get the status code 200


  @GetBookingIds
  Scenario: get booking ids
    When the user consumes the service booking ids
    Then the user will get the status code 200


  @GetBooking
  Scenario: get a specific booking
    Given the user gets the existing booking id
    When the user consumes the service booking with specific id
    Then the user will get the status code 200


  @UpdateBooking
  Scenario: update a booking
    Given the user gets the existing booking id
    When the user sends data to update an existing booking
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds |
      | Andres    | Gallego  | 557        | true        | 2023-03-02 | 2023-03-08 | Breakfast       |
    Then the user will get the status code 200


  @PartialUpdateBooking
  Scenario: partial update booking
    Given the user gets the existing booking id
    When the user sends data to update partially an existing booking
      | firstname | lastname |
      | Camilo    | Mendez   |
    Then the user will get the status code 200


  @DeleteBooking
  Scenario: delete a booking
    Given the user gets the existing booking id
    When the user authorizes delete an existing booking
    Then the user will get the status code 201
