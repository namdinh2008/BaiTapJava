import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a label
        Label label = new Label("JavaFX is working!");

        // Place the label in a layout pane
        StackPane root = new StackPane(label);

        // Create a scene with the layout
        Scene scene = new Scene(root, 300, 150);

        // Set up the stage (window)
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
