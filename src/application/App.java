package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
 
    public static void main(String[] args) {
            launch(args);
        }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, 1000, 1000, Color.GREY);
        Image icon = new Image("icon.png");


        Text title = new Text();
        title.setText("Algorithm Visualizer");
        title.setFont(Font.font("Verdana",50));
        title.setFill(Color.WHITE);
        title.setY(100);
        title.setX(250);
        root.getChildren().add(title);

        // Setting Parameters of Stage
        stage.setResizable(false);

        stage.getIcons().add(icon);
        stage.setTitle("Algorithm Visualizer");
        stage.setScene(scene);
        stage.show();
    }
}