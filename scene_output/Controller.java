package scene_output;

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

    @FXML private Button button_close;
    @FXML private Label output_data;

    @FXML
    void initialize() {
        output_data.setText(Global.data);
    }

    @FXML
    void on_close(ActionEvent event) {
        try {
            var loader = new FXMLLoader(new File("scene_main/View.fxml").toURI().toURL());
            Parent root = loader.load();  // cast to Parent
            var stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}