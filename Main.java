import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        var loader = new FXMLLoader(new File("scene_main/View.fxml").toURI().toURL());
        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Extra Project");
        stage.show();
    }
}