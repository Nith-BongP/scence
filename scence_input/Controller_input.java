import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PleaseProvideControllerClassName {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button_save;

    @FXML
    private TextField textField_input;

    @FXML
    void initialize() {
        assert button_save != null : "fx:id=\"button_save\" was not injected: check your FXML file 'View.fxml'.";
        assert textField_input != null : "fx:id=\"textField_input\" was not injected: check your FXML file 'View.fxml'.";

    }

}
