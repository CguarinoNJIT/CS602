module com.hw7 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.hw7 to javafx.fxml;
    exports com.hw7;
}
