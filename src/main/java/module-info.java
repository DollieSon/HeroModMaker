module dollieson.heromodmaker {
    requires javafx.controls;
    requires javafx.fxml;


    opens dollieson.heromodmaker to javafx.fxml;
    exports dollieson.heromodmaker;
}