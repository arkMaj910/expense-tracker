package com.example.utils;

/*
* ViewNavigator is a utility class which will manage the navigation between different scenes within the same
* stage(window). Provides methods to set the main stage and switch between different views(scenes).
* */

import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewNavigator {
    private static Stage mainStage;

    public static void setMainStage(Stage stage){
        mainStage = stage;
    }

    public static void switchViews(Scene scene){
        if(mainStage != null){
            mainStage.setScene(scene);
            mainStage.show();
        }
    }
}
