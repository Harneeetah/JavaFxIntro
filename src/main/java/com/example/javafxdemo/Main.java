package com.example.javafxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
          Parent root =  FXMLLoader.load(getClass().getResource("hello.fxml"));

       // GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
  //      root.setVgap(10);
    //    root.setHgap(10);

      //  Label greeting = new Label("Welcome to JavaFx!!");
       // greeting.setTextFill(Color.GREEN);
       // greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD,70));
       // root.getChildren().add(greeting);

        primaryStage.setTitle("Hello! Javafx!!");
       primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}