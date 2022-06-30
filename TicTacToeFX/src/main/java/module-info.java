module com.example.tictactoefx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.scripting;


    opens com.example.tictactoefx to javafx.graphics;
    exports com.example.tictactoefx;
}