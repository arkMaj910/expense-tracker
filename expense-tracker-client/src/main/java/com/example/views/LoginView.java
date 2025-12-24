package com.example.views;

import com.example.utils.Utility;
import com.example.utils.ViewNavigator;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.Objects;

public class LoginView {
    private Label expenseTrackerLabel = new Label("Expense Tracker");
    private TextField usernameField = new TextField();
    private PasswordField passwordField = new PasswordField();
    private Button loginButton = new Button("Login");
    private Label signupLabel = new Label("Don't have an account? Click here");

    public void show() {
        Scene scene = createScene();
        scene.getStylesheets().add(
                Objects.requireNonNull(
                        getClass().getResource("/style.css")
                ).toExternalForm());

        ViewNavigator.switchViews(scene);
    }

    private Scene createScene() {
        VBox mainContainerBox = new VBox();
        mainContainerBox.getStyleClass().add("main-background");

        VBox loginFormBox = new VBox();
        loginFormBox.getChildren().addAll(usernameField, passwordField, loginButton, signupLabel);

        mainContainerBox.getChildren().addAll(expenseTrackerLabel, loginFormBox);
        return new Scene(mainContainerBox, Utility.APP_WIDTH, Utility.APP_HEIGHT);
    }
}
