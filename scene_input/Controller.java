package scene_input;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;

import global.Global;

public class Controller {

    @FXML private Button button_save;

    @FXML private TextField textField_input;

    @FXML
    void initialize() {
        textField_input.setText(Global.data);
    }

    @FXML
    void on_save(ActionEvent event) {
    try {
        Global.data = textField_input.getText();

        System.out.println("Working dir: " + System.getProperty("user.dir"));
        System.out.println("File exists: " + new File("scene_main/View.fxml").exists());

        var loader = new FXMLLoader(new File("scene_main/View.fxml").toURI().toURL());
        Parent root = loader.load();
        var stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.getScene().setRoot(root);

    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}