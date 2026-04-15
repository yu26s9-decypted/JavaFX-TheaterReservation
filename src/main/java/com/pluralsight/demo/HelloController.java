package com.pluralsight.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField nameInput;
    @FXML
    private TextField DateInput;
    @FXML
    private TextField TicketNumInput;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome");
    }

    @FXML
    protected void onInputSubmit(){
      String userInput = nameInput.getText();
      String reservationDateInput = DateInput.getText();
      String numOfTicketInput = TicketNumInput.getText();
//    Invokes the method in TheaterReservation
      String formattedName = TheaterReservation.formatName(userInput);
      String formattedDate = TheaterReservation.formatDate(reservationDateInput);
      welcomeText.setText("Welcome, " + formattedName + " You have a reservation on " + formattedDate + " with " + numOfTicketInput + " tickets");

    }
}
