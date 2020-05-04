package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage stage) {
        Stage window = new Stage();
        window.setResizable(false);
        window.setTitle("Elevator Simulation");

        Button btn = new Button("Hello Wolrd !");
        btn.setLayoutX(500);
        btn.setLayoutY(284);
        btn.setMinWidth(144);
        btn.setId("anyID");
        
        Pane panel = new Pane();
        panel.setId("Panel");
        panel.getChildren().setAll(btn);


        Scene scene = new Scene(panel , 1160, 600);
        //scene.getStylesheets().add("pharmacy/style.css");
        //Font.loadFont(Main.class.getResource("Cairo.ttf").toExternalForm(),12);
        window.setScene(scene);
        window.show();
    }
}
