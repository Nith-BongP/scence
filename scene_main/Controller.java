package scene_main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;

import global.Global;

public class Controller {

    @FXML private Button input_bt;
    @FXML private Button output_bt;
    @FXML private Label label_data;

    @FXML
    void initialize() {
        label_data.setText("Data: " + Global.data);
    }

    @FXML
    void on_go_input(ActionEvent event) {
        try {
            var loader = new FXMLLoader(new File("scene_input/View.fxml").toURI().toURL());
            Parent root = loader.load();  // cast to Parent
            var stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void on_go_output(ActionEvent event) {
        try {
            var loader = new FXMLLoader(new File("scene_output/View.fxml").toURI().toURL());
            Parent root = loader.load();  // cast to Parent
            var stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}