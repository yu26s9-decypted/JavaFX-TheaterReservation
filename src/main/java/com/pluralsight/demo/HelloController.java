package com.pluralsight.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
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
    private ComboBox<MovieOptions> movieName;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome");
    }

    @FXML
    protected void onInputSubmit(){
      String userInput = nameInput.getText();
      String reservationDateInput = DateInput.getText();
      String numOfTicketInput = TicketNumInput.getText();
      int parsedTicketAmount = Integer.parseInt(numOfTicketInput);
      String movieChosen = movieName.getSelectionModel().getSelectedItem().toString();
//    Invokes the method in TheaterReservation
      String formattedName = TheaterReservation.formatName(userInput);
      String formattedDate = TheaterReservation.formatDate(reservationDateInput);
      welcomeText.setText("Thank you, " + formattedName  + " You have " + numOfTicketInput + " ticket" + (parsedTicketAmount > 1 ? "s" : "") + " for a reservation on " + formattedDate + " for the movie: " + movieChosen);

    }

    public void initialize(){
        movieName.getItems().add(new MovieOptions("The Minecraft Movie", 12.99));
        movieName.getItems().add(new MovieOptions("Exit 8", 2.79));
        movieName.getItems().add(new MovieOptions("Zootopia", 8.99));
    }
}
