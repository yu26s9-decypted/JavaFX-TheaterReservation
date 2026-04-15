package com.pluralsight.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class MovieController {
    @FXML
    private ComboBox <MovieOptions> movieName;

    public void initialize(){
        movieName.getItems().add(new MovieOptions("The Minecraft Movie", 12.99));
        movieName.getItems().add(new MovieOptions("Exit 8", 2.79));
        movieName.getItems().add(new MovieOptions("Zootopia", 8.99));
    }
}
