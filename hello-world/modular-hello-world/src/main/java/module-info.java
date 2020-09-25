module ainoha.examples.helloworld {
    requires ainoha.core;
    requires javafx.graphics;

    // Allows to JavaFX to has access to FxApp class
    exports com.ainoha.examples.helloworld to javafx.graphics;
    // Allows to Ainoha Framework to has access to controller classes
    exports com.ainoha.examples.helloworld.controllers to ainoha.core;

    // Allows to Ainoha Framework to has access to the FXML files
    opens com.ainoha.examples.helloworld.views to ainoha.core;
}