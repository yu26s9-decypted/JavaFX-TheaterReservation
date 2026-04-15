module com.pluralsight.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.pluralsight.demo to javafx.fxml;
    exports com.pluralsight.demo;
}