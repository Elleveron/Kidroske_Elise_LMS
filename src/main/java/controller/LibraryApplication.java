package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LibraryApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LibraryApplication.class.getResource("/view/library-management-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 625, 725);

        try {
            scene.getStylesheets().add(getClass().getResource("/styles/library-management.css").toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }

        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}