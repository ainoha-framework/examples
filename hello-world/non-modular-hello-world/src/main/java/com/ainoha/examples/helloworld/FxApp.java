package com.ainoha.examples.helloworld;

import com.ainoha.core.ApplicationContext;
import com.ainoha.core.ViewLoader;
import com.ainoha.core.annotation.FxApplication;
import com.ainoha.examples.helloworld.controllers.ViewMainController;
import javafx.application.Application;
import javafx.stage.Stage;

@FxApplication
public class FxApp extends Application implements ViewLoader {

    public static void main(String[] args) {
        ApplicationContext.startApplication(FxApp.class, args);
    }

    @Override
    public void start(Stage stage) {
        view(ViewMainController.class)
                .stage(stage)
                .show();
    }
}
