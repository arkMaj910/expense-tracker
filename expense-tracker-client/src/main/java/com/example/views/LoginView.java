package com.example.views;

import com.example.utils.ViewNavigator;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginView {
    private Label expenseTrackerLabel = new Label("Expense Tracker");
    private TextField usernameField = new TextField();
    private PasswordField passwordField = new PasswordField();
    private Button loginButton = new Button("Login");
    private Label signupLabel = new Label("Don't have an account? Click here");

    public void show(){
        Scene scene = createScene();
        ViewNavigator.switchViews(scene);
    }

    private Scene createScene(){
        VBox vBox = new VBox();
        return new Scene(vBox, 100, 100);
    }
}
