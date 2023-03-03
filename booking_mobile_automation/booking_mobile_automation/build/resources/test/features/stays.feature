Feature:I as a user need to create an account to add products to the cart

  Scenario: Create Register
    Given the user is on the stays page
    When he enters the reservation information
      | destination | checkInDate   | checkOutDate  | firstName | lastName | email          | country  | mobilePhone |
      | Cusco       | 04 abril 2023 | 08 abril 2023 | Andres    | Gallego  | test@gmail.com | Colombia | 3213213221  |
    Then he will see the reservation information