package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle rootNote;

    public void graphs(ActionEvent e) {
        System.out.println("Graphs button was clicked");
        if (rootNote.getFill().equals(Color.BLACK)) {
            rootNote.setFill(Color.RED);
        } else {
            rootNote.setFill(Color.BLACK);
        }
    }
}
